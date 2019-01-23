package com.hongghe.dubboconsumer.message;

import lombok.Builder;
import lombok.Data;

/**
 * @author: hongghe @date: 2019-01-22 16:59
 */
@Data
@Builder(builderClassName = "Builder", toBuilder = true)
public class HelloRequest {
    private final String key;
    private final String message;
}
