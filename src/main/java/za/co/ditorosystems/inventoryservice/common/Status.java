package za.co.ditorosystems.inventoryservice.common;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Status {
    SUCCESSFUL("SUCCESSFUL"),
    FAILED("FAILED"),
    IN_PROGRESS("IN_PROGRESS");

    private String label;
}
