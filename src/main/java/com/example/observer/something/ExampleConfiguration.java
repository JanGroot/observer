package com.example.observer.something;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ExampleConfiguration {

    @Bean
    Map<String, SomeThing> someBean() {
        final HashMap<String, SomeThing> stringSomeThingHashMap = new HashMap<>();
        stringSomeThingHashMap.put("1", new SomeThing("spring", "boot"));
        return stringSomeThingHashMap;
    }
}
