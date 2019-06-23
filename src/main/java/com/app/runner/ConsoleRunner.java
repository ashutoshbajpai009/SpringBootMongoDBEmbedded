package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.app.document.Product;
import com.app.repo.ProductRepository;

public class ConsoleRunner implements CommandLineRunner {
	@Autowired
	private ProductRepository repo;
	@Override
	public void run(String... args) throws Exception {

		repo.deleteAll();
		
		repo.save(new Product(1,"A",2.3));
		repo.save(new Product(2,"B",3.3));
		repo.save(new Product(3,"C",4.3));
		repo.save(new Product(4,"D",5.3));
		System.out.println("======================================================================================");
		
		repo.findAll().forEach(System.out::println);
	}

}
