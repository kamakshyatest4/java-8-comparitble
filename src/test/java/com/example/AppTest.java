package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void patternMatchingWorksOnJdk18Preview() {
        assertEquals("short string: hi", App.describe("hi"));
        assertEquals("long string: hellooo", App.describe("hellooo"));
        assertEquals("small int: 3", App.describe(3));
        assertEquals("big int: 11", App.describe(11));
    }
}
