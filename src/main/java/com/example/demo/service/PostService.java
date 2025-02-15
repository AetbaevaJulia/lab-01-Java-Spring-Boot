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
    private Post postFirst = new Post("То получаешь не совсем то, что хочешь; то получаешь, а уже не хочешь; а то и вовсе не знаешь, чего хочешь на самом деле. © Нюша", new Date());
    private Post postSecond = new Post("Очень трудно жить, думая о каждой ошибке, которую ты совершил, поэтому всё плохое забываешь, а помнишь только хорошее — очень удобно, но от себя не уйдёшь. © Кар-Карыч", new Date());
    private Post postThird = new Post("Да хаос нас окружает постоянно! Весь мир, как почта. Мало того, что мы шлём не то и не тем, так это ещё и не доходит. © Бараш", new Date());
    private List<Post> posts = new ArrayList<>();

    public PostService(){
        posts.add(postFirst);
        posts.add(postSecond);
        posts.add(postThird);
    }

    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }

    public List<Post> listAllPosts(){
        return posts;
    }
}
