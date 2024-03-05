package com.test.smartbi.mapper;

import com.test.smartbi.model.entity.Chart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
* @author wilzsn
* @description 针对表【chart(帖子)】的数据库操作Mapper
* @createDate 2024-03-02 11:39:54
* @Entity com.yupi.springbootinit.model.entity.Chart
*/
public interface ChartMapper extends BaseMapper<Chart> {
    /**
     * 表示返回的是一个由多个map组成的集合，每个map代表了一行查询结果
     * 并将其封装成了一组键值对形式的对象。其中，String类型代表了键的类型为字符串
     */
    List<Map<String, Object>> queryChartDate(String querySql);
}




