package ru.job4j.oop.lambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Convert {
    public List<Integer> convertToList(Integer[][] numbers) {
        return Stream.of(numbers).flatMap(Stream::of).collect(Collectors.toList());
    }
}
