package com.kmr.batch.poc.batchpoc.config;

import com.kmr.batch.poc.batchpoc.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {


    @Override
    public Customer process(Customer item) throws Exception {
        return item;
    }
}
