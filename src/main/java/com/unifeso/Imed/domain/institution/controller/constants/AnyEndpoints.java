package com.unifeso.Imed.domain.institution.controller.constants;

import org.springframework.stereotype.Component;

@Component
public class AnyEndpoints {
    public static final String ANY = "/any";
    public static final String GET = "/get";
    public static final String GET_BY_ID = "/get/{id}";
    public static final String PUT = "/put/{id}";
    public static final String POST = "/post";
    public static final String DELETE = "/delete/{id}";
}
