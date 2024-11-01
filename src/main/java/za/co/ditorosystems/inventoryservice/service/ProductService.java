package za.co.ditorosystems.inventoryservice.service;

import lombok.NonNull;
import org.springframework.http.ResponseEntity;
import za.co.ditorosystems.inventoryservice.dto.ProductRequest;
import za.co.ditorosystems.inventoryservice.dto.Response;

public interface ProductService {
    ResponseEntity<Response> saveProduct(@NonNull final ProductRequest productRequest);

    ResponseEntity<Response> updateProduct(@NonNull final ProductRequest productRequest);

    ResponseEntity<Response> deleteProduct(@NonNull final ProductRequest productRequest);

    ResponseEntity<Response> getProductById(@NonNull final Long id);

    ResponseEntity<Response> getAllProducts();
}
