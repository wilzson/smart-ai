package com.test.smartbi.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;

@SpringBootTest
class ChartMapperTest {

    @Resource
    private ChartMapper chartMapper;


    @Test
    void queryChartDataMaps() {
        String charId = "";
        String querySql = String.format("select * from char_%s", charId);
        List<Map<String, Object>> resultData = chartMapper.queryChartDate(querySql);
        System.out.println(resultData);
    }
}