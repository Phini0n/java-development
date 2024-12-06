package com.pluralsight.NortwindTradersSpringBoot;

import com.pluralsight.NortwindTradersSpringBoot.model.Product;
import com.pluralsight.NortwindTradersSpringBoot.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class NortwindTradersSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(NortwindApplication.class, args);
	}
}
