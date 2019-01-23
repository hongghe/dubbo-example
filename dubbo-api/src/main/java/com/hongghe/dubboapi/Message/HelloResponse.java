package com.hongghe.dubboapi.Message;

import lombok.Builder;
import lombok.Data;

/**
 * @author: hongghe @date: 2019-01-23 19:50
 */
@Data
@Builder(builderClassName = "Builder", toBuilder = true)
public class HelloResponse {
    private String key;
    private String message;
}
