package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    private Post postFirst = new Post(0L, "То получаешь не совсем то, что хочешь; то получаешь, а уже не хочешь; а то и вовсе не знаешь, чего хочешь на самом деле. © Нюша", new Date(), 1);
    private Post postSecond = new Post(1L,"Очень трудно жить, думая о каждой ошибке, которую ты совершил, поэтому всё плохое забываешь, а помнишь только хорошее — очень удобно, но от себя не уйдёшь. © Кар-Карыч", new Date(), 2);
    private Post postThird = new Post(2L,"Да хаос нас окружает постоянно! Весь мир, как почта. Мало того, что мы шлём не то и не тем, так это ещё и не доходит. © Бараш", new Date(), 4);
    private List<Post> posts = new ArrayList<>();

    public PostService(){
        posts.add(postFirst);
        posts.add(postSecond);
        posts.add(postThird);
    }

    public void create(String text) {
        Long idPost = (long)posts.size();
        posts.add(new Post(idPost, text, new Date(), 0));
    }

    public List<Post> listAllPosts(){
        return posts;
    }
}
