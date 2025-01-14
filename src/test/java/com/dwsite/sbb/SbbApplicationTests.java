package com.dwsite.sbb;

import com.dwsite.sbb.question.QuestionService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbbApplicationTests {

    @Autowired
    private QuestionService questionService;

    @Test
    @DisplayName("대량 데이터 생성")
    void testJpa() {

        for (int i = 1; i <= 300; i++) {
            String subject = String.format("테스트 데이터입니다:[&03d]", i);
            String content = "내용무";
            this.questionService.create(subject, content);
        }


    }

}
