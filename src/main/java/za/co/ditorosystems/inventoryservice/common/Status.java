package za.co.ditorosystems.inventoryservice.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {
    FAILED("FAILED"),
    SUCCESSFUL("SUCCESSFUL"),
    IN_PROGRESS("IN_PROGRESS");

    private final String label;
}
