package com.sparta.hanghaeboard.repository;


import com.sparta.hanghaeboard.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByOrderByModifiedAtDesc();
    List<Comment> findAllByBoard_IdOrderByModifiedAtDesc(Long board_id);
}
