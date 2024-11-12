package com.user_feedback.service;

import com.user_feedback.entity.AdminFeedBack;
import com.user_feedback.entity.FeedBack;
import com.user_feedback.repository.AdminFeedBackRepo;
import com.user_feedback.repository.FeedBackRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminFeedBackService {
    @Autowired
    private AdminFeedBackRepo adminFeedBackRepo;
    @Autowired
    private FeedBackRepo feedBackRepo;
    public FeedBack add(FeedBack FeedBack){
     return    adminFeedBackRepo.save(FeedBack);
    }
    public FeedBack getById(int id , FeedBack adminFeedBack){
        return  adminFeedBackRepo.findById(id).get();
    }
    public List<FeedBack> fetchAll(){
      return   adminFeedBackRepo.findAll();
    }
    public String  deleteFeedBack(int id ){
       adminFeedBackRepo.deleteById(id);
       return  " Data SuccessFully deleted  ";
    }

}
