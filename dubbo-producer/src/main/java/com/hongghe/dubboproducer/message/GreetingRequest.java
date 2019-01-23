package com.hongghe.dubboproducer.message;

import lombok.Builder;
import lombok.Data;

/**
 * @author: hongghe @date: 2019-01-22 16:54
 */
@Data
@Builder(builderClassName = "Builder", toBuilder = true)
public class GreetingRequest {
    private final String key;
    private final String message;
}
