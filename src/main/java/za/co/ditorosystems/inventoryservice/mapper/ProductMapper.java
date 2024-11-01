package za.co.ditorosystems.inventoryservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import za.co.ditorosystems.inventoryservice.dto.ProductRequest;
import za.co.ditorosystems.inventoryservice.dto.ProductResponse;
import za.co.ditorosystems.inventoryservice.model.Product;

@Mapper
public interface ProductMapper {
    ProductMapper MAPPER = Mappers.getMapper(ProductMapper.class);

    Product toProduct(ProductRequest productRequest);

    ProductResponse toProductResponse(Product product);
}
