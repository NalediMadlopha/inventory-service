package za.co.ditorosystems.inventoryservice.service;

import lombok.NonNull;
import org.springframework.http.ResponseEntity;
import za.co.ditorosystems.inventoryservice.dto.ProductRequest;
import za.co.ditorosystems.inventoryservice.dto.Response;

public interface ProductService {
    ResponseEntity<Response> save(@NonNull final ProductRequest productRequest);

    ResponseEntity<Response> update(@NonNull final ProductRequest productRequest);

    ResponseEntity<Response> delete(@NonNull final ProductRequest productRequest);

    ResponseEntity<Response> getProductById(@NonNull final Long id);

    ResponseEntity<Response> getAllProducts();
}
