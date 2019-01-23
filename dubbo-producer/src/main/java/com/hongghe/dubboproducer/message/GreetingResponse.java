package com.hongghe.dubboproducer.message;

import lombok.Builder;
import lombok.Data;

/**
 * @author: hongghe @date: 2019-01-22 16:55
 */
@Data
@Builder(builderClassName = "Builder", toBuilder = true)
public class GreetingResponse {
    private final String key;
    private final String message;
}
