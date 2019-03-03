package com.abhishek.controller;

import com.abhishek.model.Post;
import com.abhishek.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class PostController {

  @Autowired
  private PostService postService;

  @RequestMapping("posts")
  public String getUserPosts(Model model){

    List<Post> posts = postService.getOnePost();
    model.addAttribute("userPost", posts);
    return "posts";
  }
}
