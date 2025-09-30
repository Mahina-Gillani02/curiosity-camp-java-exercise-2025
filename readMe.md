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

1. Navigate to the *Word Wrapper* class in *src/word.wrapper.ts* .
   Here you will find an empty `wrap()` method which takes two values, `text` and `columnLength`.
   You will be adding your code in here as you work through the exercises in order to make your tests pass.
2. Navigate to the Word Mapper test file in *test/unit/word-wrapper.test.ts* .
   This file contains all the tests that are required to pass. These are known as unit tests.
3. Press the run button on line 4 of the Word Mapper test file, all of your tests should fail
4. Work through exercise 1 and run the first test, your test should pass, if it fails your logic may be incorrect
5. Work through the rest of the exercises while running your previous tests to ensure you haven't broken existing logic

## Tasks
Implement the following logic to the `wrap()` class
1. Given a string and a maximum column length, add a line break where the string exceeds the maximum length

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

2. Now adapt the code to ensure the line breaks do not break words

Input:

```
text: 'The quick brown fox jumped over the fence'
columnLength: 10
```
Output:
```
The quick
brown fox
jumped
over the
fence
```
3. Add regular expression (Regex) to make sure the text does not contain any numbers or special characters

Input:

```
text: 'This is a te5t str1ng with numbers!'
columnLength: 10
```
Output:
```
Text contains numbers and/or special characters
```

4. Throw an error when an invalid column length is passed into the method

Input:

```
text: 'This is a te5t str1ng with numbers!'
columnLength: -1
```
Output:
```
Invalid column length
```

Word Wrap Exercise

Tasks:
1) Given a string and a maximum column length, add a line break to the string the necessary times in order for the string to not exceed the column length.
2) Insert line break without breaking the words
3) Regex to validate the string e.g. no numbers or special characters
4) Throw error if column length is invalid

## Hints and Tips

Useful string methods:

```
split()
substring()

```
