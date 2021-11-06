package billing.Mapper;

import billing.DTOs.InvoiceRequestDTO;
import billing.DTOs.InvoiceResponseDTO;
import billing.Entities.Invoice;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InvoiceMapper {
    Invoice fromInvoiceDto(InvoiceRequestDTO invoiceRequestDTO);
    InvoiceResponseDTO fromInvoice(Invoice invoice);
}
