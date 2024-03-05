package com.test.smartbi.manager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class AiManagerTest {

    @Resource
    private AiManager aiManager;

    @Test
    void doChat() {
//        String answer = aiManager.doChat("邓紫棋");
//        System.out.println(answer);
    }
}