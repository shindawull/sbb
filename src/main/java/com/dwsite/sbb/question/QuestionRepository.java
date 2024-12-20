package com.dwsite.sbb.question;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    // JPA 가 제공하는 CRUD 작업을 처리하는 메서드들을 이미 내장
    // 기본적으로 제공하지않아서 추가.
    Question findBySubject(String subject);

    Question findBySubjectAndContent(String subject, String content);

    List<Question> findBySubjectLike(String subject);

    Page<Question> findAll(Pageable pageable);
}
