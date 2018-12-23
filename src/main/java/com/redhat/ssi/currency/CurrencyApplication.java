package com.redhat.ssi.currency;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CurrencyApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurrencyApplication.class, args);
    }
    
   /* @Bean
    CommandLineRunner init(CurrencyRepository currencyRepository) {

        return args -> {

        	for (Currency currency : currencyRepository.findAll()) {
    			System.out.println(currency.getCurrencyCode());
    		}
        };

    }*/

}