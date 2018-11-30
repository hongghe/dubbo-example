package com.hongghe.dubboproducer.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(builderClassName = "Builder", toBuilder = true)
public class Person {

    /**
     * 名字
     */
    private final String name;

    /**
     * 年龄
     */
    private final Integer age;
}