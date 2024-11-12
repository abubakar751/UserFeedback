package com.user_feedback.service;

import com.user_feedback.entity.AdminFeedBack;
import com.user_feedback.entity.FeedBack;
import com.user_feedback.repository.FeedBackRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FeedBackService {
    @Autowired
    private FeedBackRepo feedBackRepo;
    public FeedBack saveFeedBack(FeedBack feedBack){
     return    feedBackRepo.save(feedBack);
    }
    public  FeedBack updateFeedBack(int id,FeedBack feedBack){
        FeedBack  byId = (feedBackRepo.findById(id)).orElseThrow(() -> new RuntimeException("Expense not found"));
        byId.setDescription(feedBack.getDescription());
        return  feedBackRepo.save(byId);
    }
    public FeedBack getById(int id) {
        return feedBackRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Feedback not found with id: " + id));
    }


    public List<FeedBack> fetchAll() {
        return feedBackRepo.findAll();
    }


    public String deleteFeedBack(int id) {
        Optional<FeedBack> feedback = feedBackRepo.findById(id);
        if (feedback.isPresent()) {
            feedBackRepo.deleteById(id);
            return "Feedback deleted successfully";
        } else {
            throw new RuntimeException("Feedback not found with id: " + id);
        }
    }

}
