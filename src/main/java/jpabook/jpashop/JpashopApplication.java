package jpabook.jpashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args) {	//LOMBOK TEST
		Hello hello;
		hello = new Hello();
		hello.setData("hello");
		hello.getData();

		SpringApplication.run(JpashopApplication.class, args);
	}
}
