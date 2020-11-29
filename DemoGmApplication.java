package com.example.demoGM;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@SpringBootApplication
public class DemoGmApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoGmApplication.class, args);
		RestTemplateBuilder rtb = new RestTemplateBuilder();
		Service service = new Service(rtb);
		User[] userList = service.getUsers();

		for(User user : userList) {
			System.out.println(user.name+"\n"+user.id);
			Album[] userAlbums = service.getUsersAlbum(user.id);
			for(Album album : userAlbums) {
				System.out.println("\t"+album.title);
			}
			System.out.println("------------------------");

		}
	}





}
