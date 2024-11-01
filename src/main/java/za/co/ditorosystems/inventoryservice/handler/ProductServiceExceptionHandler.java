package za.co.ditorosystems.inventoryservice.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import za.co.ditorosystems.inventoryservice.common.Status;
import za.co.ditorosystems.inventoryservice.dto.Response;
import za.co.ditorosystems.inventoryservice.exception.ProductServiceBusinessException;

@RestControllerAdvice
public class ProductServiceExceptionHandler {
    @ExceptionHandler(ProductServiceBusinessException.class)
    public ResponseEntity<Response> handleProductServiceBusinessException(ProductServiceBusinessException exception) {
        Response response = Response.builder()
                .status(Status.FAILED)
                .message(exception.getMessage())
                .build();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
    }
}
