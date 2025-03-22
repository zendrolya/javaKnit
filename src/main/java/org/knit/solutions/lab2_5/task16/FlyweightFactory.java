package org.knit.solutions.lab2_5.task16;

import java.util.HashMap;
import java.util.Map;

class FlyweightFactory {
    private final Map<String, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        if (!flyweights.containsKey(key)) {
            // flyweights.put(key, new Character(1, "", 1));
        }
        return flyweights.get(key);
    }
}