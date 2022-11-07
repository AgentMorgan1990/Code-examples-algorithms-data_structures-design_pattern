package ru.education.algorithms.sort_exercise_1;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum BrandName {

    LENUVO(0),
    ASOS(1),
    MAC_NOTE(2),
    ESER(3),
    XAMIOU(4);


    private final int id;

    private final static Map<Integer, BrandName> LOOKUP_BY_ID = Stream
            .of(BrandName.values())
            .collect(Collectors.toMap(BrandName::getId, Function.identity()));

    public static BrandName getById(final int id) {

        return LOOKUP_BY_ID.get(id);
    }

    BrandName(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
