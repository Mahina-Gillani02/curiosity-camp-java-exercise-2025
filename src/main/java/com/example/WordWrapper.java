package com.example;

public class WordWrapper {

    public String wrap(String text, int columnLength) {
        if (text.matches(".*[^a-zA-Z\\s].*")){
            return "Text contains numbers and/or special characters";
        }

        if (text.length() <= columnLength) {
            return text;
        }

        if (columnLength <= 0) {
            throw new IllegalArgumentException("Invalid column length");
        }

        int index = text.lastIndexOf(" ", columnLength);
        if (index == -1) {
            index = columnLength;
        }
        String wrappedText = text.substring(0, index).trim();
        String remainingText = text.substring(index).trim();
        return wrappedText + "\n" + this.wrap(remainingText, columnLength);
    }
}
