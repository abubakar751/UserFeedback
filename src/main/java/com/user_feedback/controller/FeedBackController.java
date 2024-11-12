package com.user_feedback.controller;

import com.user_feedback.entity.FeedBack;
import com.user_feedback.service.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/feedback")
public class FeedBackController {
    @Autowired
    private FeedBackService feedBackService;
    @PostMapping("/add")
    public FeedBack addFeedBack(@RequestBody FeedBack feedBack){
     return  feedBackService.saveFeedBack(feedBack);
    }
    @PutMapping("/update/{id}")
    public FeedBack updateFeedBack(@PathVariable int id,@RequestBody FeedBack feedBack){
      return   feedBackService.updateFeedBack(id,feedBack);
    }

}
