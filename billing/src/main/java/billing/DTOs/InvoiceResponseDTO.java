package billing.DTOs;

import billing.Models.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor @NoArgsConstructor
public class InvoiceResponseDTO {

    private String id;
    private Date date;
    private BigDecimal amount;
    private Customer customer ;
}
