package com.igromov.simpleanagram;

import java.util.List;
import java.util.Random;

public abstract class AbstractDictionary implements Dictionary {

    private final Random random;

    public AbstractDictionary() {
        random = new Random();
    }

    public abstract List<String> getAll();

    @Override
    public final String next() {
        List<String> all = getAll();
        if (all.isEmpty()) {
            return "";
        } else {
            return all.get(random.nextInt(all.size()));
        }
    }
}
