package org.estore.estore.exception;

public class ItemOutOfStockException extends RuntimeException {
    public ItemOutOfStockException(String message) {
        super(message);
    }
}
