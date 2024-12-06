package com.pluralsight.NortwindTradersSpringBoot;

import com.pluralsight.NortwindTradersSpringBoot.dao.ProductDao;
import com.pluralsight.NortwindTradersSpringBoot.dao.SimpleProductDao;
import com.pluralsight.NortwindTradersSpringBoot.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class NortwindTradersSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(NortwindTradersSpringBootApplication.class, args);
	}

}
