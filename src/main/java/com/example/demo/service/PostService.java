package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts(){
        List<String> posts = Arrays.asList("То получаешь не совсем то, что хочешь; то получаешь, а уже не хочешь; а то и вовсе не знаешь, чего хочешь на самом деле. © Нюша",
                "Очень трудно жить, думая о каждой ошибке, которую ты совершил, поэтому всё плохое забываешь, а помнишь только хорошее — очень удобно, но от себя не уйдёшь. © Кар-Карыч",
                "❝ Да хаос нас окружает постоянно! Весь мир, как почта. Мало того, что мы шлём не то и не тем, так это ещё и не доходит. © Бараш");
        List<Post> listAllPosts = Arrays.asList(new Post(posts.get(0)), new Post(posts.get(1)), new Post(posts.get(2)));
        return listAllPosts;
    }
}
