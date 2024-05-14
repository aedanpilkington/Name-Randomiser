package com.example.namerandomiser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Names {
    private static final List<String> NAMES = new ArrayList<>();

    static {
        NAMES.add("Mia");
        NAMES.add("Cait");
        NAMES.add("James");
    }

    public static List<String> getNames() {
        return Collections.unmodifiableList(NAMES);
    }
}