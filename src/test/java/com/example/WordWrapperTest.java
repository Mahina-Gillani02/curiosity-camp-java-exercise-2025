package com.example;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class WordWrapperTest {
    @Test
    public void shouldAddBreakLines() {
        String text = "ab";
        int columnLength = 1;
        WordWrapper wordWrapper = new WordWrapper();
        String result = wordWrapper.wrap(text, columnLength);

        assert(result).equals("a\nb");
    }
}
