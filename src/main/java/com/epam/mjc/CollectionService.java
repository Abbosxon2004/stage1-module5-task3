package com.epam.mjc;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
    }

    public Optional<Integer> findMax(List<Integer> list) {
        return list.stream().max(Comparator.comparing(x->x));
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        return list
                .stream()
                .flatMap(list1 -> list1.stream())
                .min(Comparator.comparing(x->x));
    }

    public Integer sum(List<Integer> list) {
        return list.stream().reduce(0,(subtotal,element)->subtotal+element);
    }
}
