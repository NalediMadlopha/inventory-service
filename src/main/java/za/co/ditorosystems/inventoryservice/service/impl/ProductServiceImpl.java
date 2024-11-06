package za.co.ditorosystems.inventoryservice.service.impl;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import za.co.ditorosystems.inventoryservice.common.Status;
import za.co.ditorosystems.inventoryservice.dto.ProductRequest;
import za.co.ditorosystems.inventoryservice.dto.ProductResponse;
import za.co.ditorosystems.inventoryservice.dto.Response;
import za.co.ditorosystems.inventoryservice.exception.ProductServiceBusinessException;
import za.co.ditorosystems.inventoryservice.mapper.ProductMapper;
import za.co.ditorosystems.inventoryservice.model.Product;
import za.co.ditorosystems.inventoryservice.repository.ProductRepository;
import za.co.ditorosystems.inventoryservice.service.ProductService;

@Slf4j
@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public ResponseEntity<Response> save(@NonNull final ProductRequest productRequest) {
        log.info("ProductServiceImpl.save: Saving product {}", productRequest);
        Response<Object> response;

        try {
            Product product = ProductMapper.MAPPER.toProduct(productRequest);
            ProductResponse productResponse = ProductMapper.MAPPER.toProductResponse(productRepository.save(product));
            response = Response.builder()
                    .status(Status.SUCCESSFUL)
                    .data(productResponse)
                    .message("Product saved successfully")
                    .build();
            log.info("ProductServiceImpl.save: Successfully saved product {}", productResponse);
        } catch (Exception ex) {
            log.error("ProductServiceImpl.save: Error saving product", ex);
            throw new ProductServiceBusinessException("Error saving product");
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @Override
    public ResponseEntity<Response> update(@NonNull final ProductRequest productRequest) {
        return null;
    }

    @Override
    public ResponseEntity<Response> delete(@NonNull final ProductRequest productRequest) {
        return null;
    }

    @Override
    public ResponseEntity<Response> getProductById(@NonNull final Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Response> getAllProducts() {
        return null;
    }

}
