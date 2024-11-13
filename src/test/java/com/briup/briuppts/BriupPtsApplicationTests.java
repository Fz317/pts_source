package com.briup.briuppts;

import com.briup.briuppts.mapper.ext.DiseaseExtendMapper;
import com.briup.briuppts.service.DiseaseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BriupPtsApplicationTests {
    @Autowired
    DiseaseExtendMapper diseaseExtendMapper;
    @Test
    void contextLoads() {
        diseaseExtendMapper.selectDiseasedAnimal(null,null);
    }

}
