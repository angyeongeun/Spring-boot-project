// main class

package com.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication //스프링부트의 자동 설정, 스프링 bean 읽기와 생성을 모두 자동으로 설정.
public class Application {
        public static void main(String[] args){
            SpringApplication.run(Application.class, args);
        }

}
