package com.github.sroigmas.spring.cloud.stream.kafka.binder;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;

//@Component
public class SpringCloudStreamConsumer {

  @StreamListener(Processor.INPUT)
  public void consume(String data) {
    System.out.println(data);
  }
}
