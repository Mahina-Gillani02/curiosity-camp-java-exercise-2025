package com.example;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WordWrapperTest {

    private final WordWrapper wordWrapper = new WordWrapper();

    @Test
    public void shouldAddBreakLines() {
        //given
        String text = "ab";
        int columnLength = 1;

        //when
        String result = wordWrapper.wrap(text, columnLength);

        //then
        assertThat(result).isEqualTo("a\nb");
    }

    @Test
    public void textShouldNotHaveNumbersOrSpecialCharacters() {
        //given
        String text = "This is a te5t str1ng with numbers!";
        int columnLength = 10;

        //when
        String result = wordWrapper.wrap(text, columnLength);

        //then
        assertThat(result).isEqualTo("Text contains numbers and/or special characters");
    }

    @Test
    public void shouldThrowAnErrorWhenInvalidColumnLengthProvided() {
        //given
        String text = "This is a test string";
        int columnLength = -1;

        //when
        Exception exception = assertThrows(Exception.class, () -> wordWrapper.wrap(text,columnLength));

        //then
        assertThat(exception.getMessage()).isEqualTo("Invalid column length");
    }

    @Test
    public void shouldNotBreakWords() {
        //given
        String text = "The quick brown fox jumped over the fence";
        int columnLength = 10;

        //when
        String result = wordWrapper.wrap(text, columnLength);

        //then
        assertThat(result).isEqualTo("The quick\nbrown fox\njumped\nover the\nfence");
    }
}
