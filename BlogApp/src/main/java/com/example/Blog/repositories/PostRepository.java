package com.example.Blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Blog.entities.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
