package com.user_feedback.repository;

import com.user_feedback.entity.AdminFeedBack;
import com.user_feedback.entity.FeedBack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminFeedBackRepo extends JpaRepository<FeedBack,Integer> {
}
