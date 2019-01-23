package com.hongghe.dubboapi.Message;

import lombok.Builder;
import lombok.Data;

/**
 * @author: hongghe @date: 2019-01-23 19:49
 */
@Data
@Builder(builderClassName = "Builder", toBuilder = true)
public class HelloRequest {
    private String key;
    private String message;
}
