package customer;

import customer.DTOs.CustomerRequestDTO;
import customer.Services.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerService customerService) {
        return args -> {
            customerService.save(new CustomerRequestDTO("C01", "ENSET", "enset.com"));
            customerService.save(new CustomerRequestDTO("C02", "BTS", "bts.com"));
        };
    }
}