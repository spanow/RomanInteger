package exception;

import lombok.Getter;

import java.util.List;

public class InvalidOperationException extends RuntimeException {

  @Getter
  private ErrorCodes errorCode;

  public InvalidOperationException(String message) {
    super(message);
  }

  public InvalidOperationException(String message, Throwable cause) {
    super(message, cause);
  }

  public InvalidOperationException(String message, Throwable cause, ErrorCodes errorCode) {
    super(message, cause);
    this.errorCode = errorCode;
  }

  public InvalidOperationException(String message, ErrorCodes errorCode) {
    super(message);
    this.errorCode = errorCode;
  }

  public InvalidOperationException(String message, ErrorCodes romanIsNotValid, List<String> errors) {
  }
}
