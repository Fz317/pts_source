package com.briup.briuppts.service;

import com.briup.briuppts.entity.QuarantineRegistration;
import com.github.pagehelper.PageInfo;

import java.util.List;


/**
 * 检疫记录模块业务功能
 */
public interface QuarantineRegistrationService {

    /**
     * 查询检疫登记记录，带分页，带条件
     * @param bQualified 是否合格
     * @param grMechanism 检疫机构的名称
     * @param pageNum 当前第几页
     * @param pageSize 每页多少条
     * @return PageInfo<QuarantineRegistration>
     */
    PageInfo<QuarantineRegistration> findAllByPage(String bQualified,
                                                   String grMechanism,
                                                   Integer pageNum,
                                                   Integer pageSize);

    /**
     * 保存/更新检疫登记信息
     * @param qr
     */
    public void saveOrUpdate(QuarantineRegistration qr);

    /**
     * 根据id删除单挑检疫记录
     * @param id
     */
    public void removerById(Integer id);

    /**
     * 根据ids批量删除检疫记录
     * @param ids
     */
    public void removerBatch(List<Integer> ids);
}
