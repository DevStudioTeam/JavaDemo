package com.igromov.simpleanagram;

import java.util.Arrays;
import java.util.List;

public class SimpleDictionary extends AbstractDictionary {

    private static final List<String> DICT = Arrays.asList(new String[]{
        "cat",
        "dog",
        "apple",
        "orange"
    });

    @Override
    public List<String> getAll() {
        return DICT;
    }

}
