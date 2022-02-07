package com.ahsan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication 
{
	
	public static void addData(String data)
	{
		System.out.println(data);
	}

	public static void main(String[] args) {
		SpringApplication.run(GitDemoApplication.class, args);
		
		addData("This spring Boot project is getting pushed to github");
		
	}

}
