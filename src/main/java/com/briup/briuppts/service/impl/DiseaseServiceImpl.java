package com.briup.briuppts.service.impl;

import com.briup.briuppts.entity.DiseaseRecord;
import com.briup.briuppts.entity.ManagerAnimal;
import com.briup.briuppts.entity.ManagerDisease;
import com.briup.briuppts.entity.ManagerDiseaseExample;
import com.briup.briuppts.entity.ext.DiseaseRecordExt;
import com.briup.briuppts.exception.ServiceException;
import com.briup.briuppts.mapper.DiseaseRecordMapper;
import com.briup.briuppts.mapper.ManagerAnimalMapper;
import com.briup.briuppts.mapper.ManagerDiseaseMapper;
import com.briup.briuppts.mapper.ext.DiseaseExtendMapper;
import com.briup.briuppts.result.ResultCode;
import com.briup.briuppts.service.DiseaseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @BelongsProject: briup-pts
 * @BelongsPackage: com.briup.briuppts.service.impl
 * @Author: Fz
 * @CreateTime: 2024-11-06  10:26
 * @Description: TODO
 * @Version: 1.0
 */
@Service
public class DiseaseServiceImpl implements DiseaseService {
    @Autowired
    private ManagerAnimalMapper animalMapper;
    //注意：额外新增 治疗记录Mapper接口
    @Autowired
    private DiseaseRecordMapper dRecordMapper;
    @Autowired
    ManagerDiseaseMapper managerDiseaseMapper;
    @Autowired
    DiseaseExtendMapper dRecordExtMapper;
    @Override
    public List<ManagerDisease> findAllDiseases() {
        ManagerDiseaseExample managerDiseaseExample = new ManagerDiseaseExample();
        List<ManagerDisease> managerDiseases = managerDiseaseMapper.selectByExample(managerDiseaseExample);
        return managerDiseases;
    }
    @Override
    public PageInfo<DiseaseRecordExt> findByPage(Integer pageNum,
                                                 Integer pageSize,
                                                 String drStatus,
                                                 Integer drDId) {
        PageHelper.startPage(pageNum, pageSize);
        List<DiseaseRecordExt> diseaseRecordExts = dRecordExtMapper.selectDiseasedAnimal(drStatus, drDId);
        PageInfo pageInfo = new PageInfo(diseaseRecordExts);
        return pageInfo;
    }
    @Override
    public void saveOrUpdate(DiseaseRecord record) {
        String animalId = record.getDrAnimalId();
        if (!StringUtils.hasText(animalId) ||
                !StringUtils.hasText(record.getDrDesc())) {
            throw new ServiceException(ResultCode.PARAM_IS_EMPTY);
        }
        ManagerAnimal animalFromDB = animalMapper.selectByAAnimalId(animalId);
        if (animalFromDB == null)
            throw new ServiceException(ResultCode.FAIL);
        if(!"养殖中".equals(animalFromDB.getAStatus())){
            throw new
                    ServiceException(ResultCode.ANIMAL_IS_NOT_IN_BREEDING);
        }
        int result;
        Integer drId = record.getDrId();
        String drStatus = record.getDrStatus();
        if (drId != null) {
            if (dRecordMapper.selectByPrimaryKey(drId) == null)
                throw new ServiceException(ResultCode.DATA_IS_EMPTY);
            result = dRecordMapper.updateByPrimaryKey(record);
        } else {
            if (!StringUtils.hasText(drStatus)) {
                record.setDrStatus("未治疗");
            }
            result = dRecordMapper.insert(record);
        }
        if (result == 0) {
            throw new ServiceException(ResultCode.FAIL);
        }
        String healthy = "健康";
        if (!"已治疗".equals(drStatus)) {
            healthy = "生病";
        }
        if (animalMapper.updateByPrimary(healthy, animalId)
                == 0) {
            throw new ServiceException(ResultCode.FAIL);
        }
    }

    @Override
    public void deleteById(Integer id) {
        dRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIdAll(List<Integer> ids) {
        for(Integer i:ids){
            dRecordMapper.deleteByPrimaryKey(i);
        }
    }
}
