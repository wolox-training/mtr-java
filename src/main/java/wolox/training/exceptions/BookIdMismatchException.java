package wolox.training.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import wolox.training.constants.ExceptionConstants;

@ResponseStatus(code = HttpStatus.NOT_ACCEPTABLE, reason = ExceptionConstants.BOOK_ID_MISMATCH)
public class BookIdMismatchException extends RuntimeException {

  public BookIdMismatchException() {
    super(ExceptionConstants.BOOK_ID_MISMATCH, new Exception());
  }
}
