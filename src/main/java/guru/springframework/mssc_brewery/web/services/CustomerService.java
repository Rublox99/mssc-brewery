package guru.springframework.mssc_brewery.web.services;

import guru.springframework.mssc_brewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    public CustomerDto getCustomerById(UUID customerId);
}
