package de.nilspreusker.pingservicejava;

public class EmploeeNotFoundException extends RuntimeException {
    public EmploeeNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
