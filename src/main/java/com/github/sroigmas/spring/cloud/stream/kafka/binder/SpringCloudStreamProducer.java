package com.github.sroigmas.spring.cloud.stream.kafka.binder;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class SpringCloudStreamProducer {

  @StreamListener(Processor.INPUT)
  @SendTo(Processor.OUTPUT)
  public String produce(String data) {
    return "Output: " + data;
  }
}
