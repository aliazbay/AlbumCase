package com.example.demoGM;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

public class Service {

    private final RestTemplate restTemplate;

    public Service(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public User[] getUsers() {
        String url = "https://jsonplaceholder.typicode.com/users";
        return this.restTemplate.getForObject(url, User[].class);
    }

    public Album[] getAllAlbums() {
        String url = "https://jsonplaceholder.typicode.com/albums";
        return this.restTemplate.getForObject(url, Album[].class);
    }

    public Album[] getUsersAlbum(int userId) {
        String url = "https://jsonplaceholder.typicode.com/albums?userId="+userId;
        return this.restTemplate.getForObject(url, Album[].class);
    }




}
