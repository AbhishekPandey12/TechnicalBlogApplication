package com.abhishek.service;

import com.abhishek.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

  public PostService(){
    System.out.println("** PostService **");
  }

  public List<Post> getAllPosts(){

    List<Post> posts = new ArrayList<>();

    Post post1 = new Post();
    post1.setTitle("Post 1");
    post1.setBody("Body 1");
    post1.setDate(new Date());

    Post post2 = new Post();
    post2.setTitle("Post 2");
    post2.setBody("Body 2");
    post2.setDate(new Date());

    Post post3 = new Post();
    post3.setTitle("Post 3");
    post3.setBody("Body 3");
    post3.setDate(new Date());

    posts.add(post1);
    posts.add(post2);
    posts.add(post3);

    return posts;
  }

}
