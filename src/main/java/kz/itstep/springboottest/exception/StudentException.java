package kz.itstep.springboottest.exception;

public class StudentException extends RuntimeException {
    public StudentException(String message) {
        super(message);
    }
}
