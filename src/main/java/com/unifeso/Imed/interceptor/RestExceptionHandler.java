//package com.unifeso.Imed.interceptor;
//
//import com.unifeso.Imed.domain.nomeDaFeature.exception.SpecificException;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//
//import static com.unifeso.Imed.interceptor.ErrorEnum.GENERIC_ERROR;
//import static com.unifeso.Imed.interceptor.ErrorEnum.SPECIFIC_ERROR;
//
//@RestControllerAdvice
//public class RestExceptionHandler extends ResponseEntityExceptionHandler {
//
//    @ExceptionHandler({ Throwable.class })
//    public ResponseEntity<ErrorDTO> handleGenericError(Exception ex) {
//        return ResponseEntity.internalServerError().body(GENERIC_ERROR.getErrorDTO());
//    }
//
//    @ExceptionHandler({ SpecificException.class })
//    public ResponseEntity<ErrorDTO> handleSpecificError(Exception ex) {
//        return ResponseEntity.internalServerError().body(SPECIFIC_ERROR.getErrorDTO());
//    }
//
//}
