package za.co.ditorosystems.inventoryservice.exception;

public class ProductServiceBusinessException extends RuntimeException {
    public ProductServiceBusinessException(String message) {
        super(message);
    }
}
