# TDD Exercise

### What is pairing?
Pairing is a way of working we use here at Autotrader,
it involves 2 developers working on a problem. One developer will be on the
keyboard "driving" the solution whereas the other will play the role of the "navigator".
Developers can switch roles during a pairing session to play both roles.
Pairing allows developers to bounce ideas off one another in order to come up with
a high quality solution, along with learning from one another (general coding knowledge/coding style etc).

### What is TDD?
Test Driven Development (TDD) is how we develop our code here at Autotrader.
The process involves writing a test for a piece of logic that has not been implemented
(known as a failing test), then writing minimal code
in order to make the test pass. The code can then be refactored all while keeping
the tests green, ensuring that the refactoring, allowing you to  build up your code
more confidently without breaking existing logic.

## Instructions

1. Navigate to the **Word Wrapper** class in *src/main/java/com.example/WordWrapper*.
   Here you will find an empty `wrap()` method which takes two values, `text` and `columnLength`.
   You will be adding your code in here as you work through the exercises in order to make your tests pass.
2. Navigate to the **WordMapperTest** in *src/test/java/com.example/WordWrapperTest*.
   This file contains all the tests that are required to pass. These are known as unit tests.
3. Press the run button on line 8 in **WordMapperTest**, all of your tests should fail
4. Work through exercise 1 and run the first test, your test should pass, if it fails your logic may be incorrect
5. Work through the rest of the exercises while running your previous tests to ensure you haven't broken existing logic

## Tasks
Implement the following logic to the `wrap()` class

1. Throw an error when an invalid column length is passed into the method

Input:

```
text: 'This is a test string'
columnLength: -1
```
Output:
```
Invalid column length
```
2. Add regular expression (Regex) to make sure the text does not contain any numbers or special characters

Input:

```
text: 'This is a te5t str1ng with numbers!'
columnLength: 10
```
Output:
```
Text contains numbers and/or special characters
```

3. Replace the spaces within the string with a line break

Input:

```
text: 'The quick brown fox jumped over the fence'
columnLength: 1
```
Output:
```
The
quick
brown
fox
jumped
over
the
fence
```

4. Given a string and a maximum column length, add a line break where the string exceeds the maximum length

Input:

```
text: 'ab'
columnLength: 1
```
Output:
```
a
b
```

## Hints and Tips

Link to String methods: https://www.w3schools.com/java/java_ref_string.asp

Link to StringBuilder methods: https://www.geeksforgeeks.org/java/stringbuilder-class-in-java-with-examples/

Link to Regex: https://regex101.com/

Link to Recursion: https://www.w3schools.com/java/java_recursion.asp
