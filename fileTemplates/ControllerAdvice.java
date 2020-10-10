#if ($PACKAGE_NAME && $PACKAGE_NAME != "")package $PACKAGE_NAME;#end

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class $NAME {

  @ResponseBody
  @ExceptionHandler(X)
  @ResponseStatus(Y)
  String employeeNotFoundHandler(X ex) {
    return ex.getMessage();
  }
}
