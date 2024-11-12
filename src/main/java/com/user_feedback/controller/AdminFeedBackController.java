package com.user_feedback.controller;

import com.user_feedback.entity.AdminFeedBack;
import com.user_feedback.entity.FeedBack;
import com.user_feedback.service.AdminFeedBackService;
import com.user_feedback.service.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:3000")
public class AdminFeedBackController {

    @Autowired
    private FeedBackService feedBService;
    @PostMapping("/add")
    public FeedBack addFeedBack(@RequestBody FeedBack feedBack) {
        return feedBService.saveFeedBack(feedBack);
    }

    @GetMapping("/getById/{id}")
    public FeedBack getById(@PathVariable int id, @RequestBody FeedBack feedBack) {
        return feedBService.getById(id);
    }

    @GetMapping("/fetchAll")
    public List<FeedBack> getAll() {
        return feedBService.fetchAll();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable int id) {
        return feedBService.deleteFeedBack(id);
    }
    @PutMapping("/update/{id}")
    public FeedBack updateData(@PathVariable int id,@RequestBody FeedBack adminFeedBack ){
     return    feedBService.updateFeedBack(id,adminFeedBack);
    }

}
