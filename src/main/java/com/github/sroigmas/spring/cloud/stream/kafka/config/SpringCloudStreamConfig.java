package com.github.sroigmas.spring.cloud.stream.kafka.config;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.context.annotation.Configuration;

@Configuration // Optional
@EnableBinding(Processor.class)
//@EnableBinding(Sink.class)
//@EnableBinding(Source.class)
public class SpringCloudStreamConfig {

}
