package com.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordWrapperTest {
    @Test
    public void shouldAddBreakLines() {
        String text = "ab";
        int columnLength = 1;
        WordWrapper wordWrapper = new WordWrapper();
        wordWrapper.wrap(text, columnLength);
    }
}
