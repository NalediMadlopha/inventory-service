package za.co.ditorosystems.inventoryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.ditorosystems.inventoryservice.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
