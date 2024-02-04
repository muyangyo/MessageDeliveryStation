package com.muyang.mq.common.network.request_args;

import lombok.Data;

import java.io.Serializable;

@Data
public class QueueBindRequestArguments extends BasicRequestArguments implements Serializable {
    private String queueName;
    private String exchangeName;
    private String bindingKey;
}
