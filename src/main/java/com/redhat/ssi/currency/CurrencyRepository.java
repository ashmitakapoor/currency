package com.redhat.ssi.currency;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;


// No need implementation, just one interface, and you have CRUD, thanks Spring Data
public interface CurrencyRepository extends MongoRepository<Currency, String> {
	
	//@Query(value = "{}", fields = "{currencyame: 0}")
	List<Currency> findAll();
}
