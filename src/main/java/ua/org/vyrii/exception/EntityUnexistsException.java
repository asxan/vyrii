package ua.org.vyrii.exception;

public class EntityUnexistsException extends RuntimeException {

    public EntityUnexistsException(String msg) {
        super(msg);
    }
}
