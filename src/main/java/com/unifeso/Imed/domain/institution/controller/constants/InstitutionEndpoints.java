package com.unifeso.Imed.domain.institution.controller.constants;

import org.springframework.stereotype.Component;

@Component
public class InstitutionEndpoints {
    public static final String INSTITUTION = "/institution";
    public static final String GET_ALL = "/all";
    public static final String GET_BY_ID = "/{id}";
    public static final String PUT = "/update/{id}";
    public static final String POST = "/post";
    public static final String DELETE = "/delete/{id}";
    public static final String IMAGE = "/image";
}
