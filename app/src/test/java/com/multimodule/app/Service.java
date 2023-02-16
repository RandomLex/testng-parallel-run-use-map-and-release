package com.multimodule.app;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Service {
    private static Map<String, Dto> map = initMap();

    public static void printMap() {
        System.out.println("---Finished---");
        map.values().forEach(System.out::println);
    }

    public synchronized static Dto getDto() {
        Dto dto = map.values().stream()
                .filter(dto1 -> !dto1.isUsed())
                .findFirst().get();
        dto.setUsed(true);
        Thread.currentThread().setName(dto.getKey());
        return dto;
    }

    public synchronized static void releaseDto(String key) {
        map.get(key).setUsed(false);
    }

    private static Map<String, Dto> initMap() {
        map = new HashMap<>();
        map.put("1", new Dto("1", "11", false));
        map.put("2", new Dto("2", "22", false));
        return map;
    }
}
