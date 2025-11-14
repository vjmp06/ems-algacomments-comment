package com.algaworks.algacomments.comment;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@SpringBootApplication
public class CommentApplication {

	static void main(String[] args) {
		SpringApplication.run(CommentApplication.class, args);
	}

}
