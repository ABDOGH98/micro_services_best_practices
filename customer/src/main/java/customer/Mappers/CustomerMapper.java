package customer.Mappers;

import customer.DTOs.CustomerRequestDTO;
import customer.DTOs.CustomerResponseDTO;
import customer.Entities.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface CustomerMapper {
    CustomerResponseDTO customerToCustomerResponseDto(Customer customer);
    Customer customerRequestDtoToCustomer(CustomerRequestDTO customerRequestDTO);
}
