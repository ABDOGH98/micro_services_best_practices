package billing;

import billing.DTOs.InvoiceRequestDTO;
import billing.Services.InvoiceService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
@EnableFeignClients
public class BillingApplication {

    public static void main(String[] args) {
        SpringApplication.run(BillingApplication.class, args);
    }

    @Bean
    CommandLineRunner start(InvoiceService invoiceService){
        return args -> {
            invoiceService.save(new InvoiceRequestDTO(BigDecimal.valueOf(20000),"C01"));
            invoiceService.save(new InvoiceRequestDTO(BigDecimal.valueOf(9000),"C01"));
            invoiceService.save(new InvoiceRequestDTO(BigDecimal.valueOf(7000),"C02"));
        };
    }

}
