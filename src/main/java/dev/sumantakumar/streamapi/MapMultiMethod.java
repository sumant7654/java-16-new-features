package dev.sumantakumar.streamapi;

import java.util.List;
import java.util.function.Consumer;

public class MapMultiMethod {
    public static void main(String[] args) {
        List<String> list = List.of("Sumanta", "Kumar", "Sahoo");

        List<String> newList = list.stream().mapMulti((String name, Consumer<String> emitter) -> {
            emitter.accept(name);

            emitter.accept(name.toUpperCase());

            emitter.accept(name.toLowerCase());
        }).toList();

        newList.forEach(System.out::println);
    }


}
