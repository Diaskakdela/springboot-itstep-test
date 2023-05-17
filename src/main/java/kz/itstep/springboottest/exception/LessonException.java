package kz.itstep.springboottest.exception;

public class LessonException extends RuntimeException{
    public LessonException(String message) {
        super(message);
    }
}
