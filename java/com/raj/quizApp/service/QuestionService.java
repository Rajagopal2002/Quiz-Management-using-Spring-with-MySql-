package com.raj.quizApp.service;


import com.raj.quizApp.Question;
import com.raj.quizApp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class QuestionService {

    @Autowired
    QuestionDao questionDao;

    public List<Question> getQuestionsByCategory(String category) {
        return questionDao.findBycategory(category);
    }

    public  List<Question> getAllQuestions() {
        return questionDao.findAll();


    }

    public void addQuestion(Question question) {
    }
}
