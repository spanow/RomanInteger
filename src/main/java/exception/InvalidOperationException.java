package exception;

import lombok.Getter;

import java.util.List;

public class InvalidOperationException extends RuntimeException {

    @Getter
    private ErrorCodes errorCode;


    public InvalidOperationException(String message, ErrorCodes errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public InvalidOperationException(String message, ErrorCodes romanIsNotValid, List<String> errors) {
    }
}
