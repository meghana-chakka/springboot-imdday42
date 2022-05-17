package com.jobiak.springbootimd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import com.jobiak.springbootimd.model.Customer;
import com.jobiak.springbootimd.repository.CustomerRepo;
import java.util.List;
import java.util.Optional;
@Component
public class MyCommandLineClass implements CommandLineRunner {

	@Autowired
	CustomerRepo repo;
	
	@Autowired
	Customer cust;

	@Override
	public void run(String...args)throws Exception {
		
		cust.setAccno(1L);
		cust.setName("Erica");
		cust.setBalance(5472);
		repo.save(cust);
		
		
		/*
		  Customer c1 =new Customer();
		  c1.setAccno(111L); c1.setName("Nobitha");c1.setBalance(50000); 
		  repo.save(c1);
		
		  Customer c2 =new Customer();
		  c2.setAccno(112L); c2.setName("DekiSuki"); c2.setBalance(67000); 
		  repo.save(c2);
		  
		  Customer c3 =new Customer(); 
		  c3.setAccno(113L); c3.setName("Chinchan"); c3.setBalance(52000); 
		  repo.save(c3);
		  
		  Customer c4 =new Customer();
		  c4.setAccno(114L); c4.setName("Bheem");c4.setBalance(95000); 
		  repo.save(c4);
		  
		  Optional<Customer>cust =repo.findById(112L);
		  if(cust.isPresent()) {
			  System.out.println(cust.get());
		 }
		 List<Customer>list =repo.findAll();
		 for(Customer c:list) {
			 System.out.println(c);
		 }
		 
		 */
	}
}

@Configuration
class CustomerConfiguration{
	@Bean
	public Customer createCustomer() {
		return new Customer();
	}
}