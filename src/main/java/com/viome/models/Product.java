package com.viome.models;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Product {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String description;
}
