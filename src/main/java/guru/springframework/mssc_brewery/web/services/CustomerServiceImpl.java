package guru.springframework.mssc_brewery.web.services;

import guru.springframework.mssc_brewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId){
        return CustomerDto.builder().id(UUID.randomUUID())
                .customerName("Customer #1")
                .build();
    }
}
