package com.unifeso.Imed.interceptor;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode
@Builder
public class ErrorDTO {
    private String code;
    private String message;
}
