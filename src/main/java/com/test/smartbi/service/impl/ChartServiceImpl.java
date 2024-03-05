package com.test.smartbi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.smartbi.model.entity.Chart;
import com.test.smartbi.service.ChartService;
import com.test.smartbi.mapper.ChartMapper;
import org.springframework.stereotype.Service;

/**
* @author wilzsn
* @description 针对表【chart(帖子)】的数据库操作Service实现
* @createDate 2024-03-02 11:39:54
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService{

}




