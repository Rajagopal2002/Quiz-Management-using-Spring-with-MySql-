package com.raj.quizApp.controller;


import com.raj.quizApp.Question;
import com.raj.quizApp.service.QuestionService;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;
    @GetMapping("allQuestions")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();

    }
    @GetMapping("category/{category}")
    public List<Question>getQuestionsByCategory(@PathVariable String category){
        return questionService.getQuestionsByCategory(category);

    }
    public String addQuestion(@RequestBody Question  question){
        questionService.addQuestion(question);
        return "success";
    }
}
