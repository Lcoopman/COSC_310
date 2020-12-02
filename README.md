# COSC310 Project

__Members:__

Ryan Dobi<br>Jace Lai<br>Miguel Villarreal<br>Leif Coopman<br>Hudson Bishop<br>Denise Khoo

# Overview

Our project is a rule-based chatbot that enjoys conversing with you about hockey and basketball. It is able to carry out dialogue with the user for at least 30 turns.

## How to Use

For now, our program can only be used within an IDE for Java programs. The chatbot can be used through the main `ChatBot` class with the user interacting directly with the program through the IDE. 

# Structure

The chatbot accepts text-based inputs from the user and matches it to the most probable question in its repertoire (`questions.txt`). It then returns a corresponding randomly selected canned response from `responses.txt` to simulate conversation.

`Chatbot.java` is the main program that executes our chatbot. It processes text files `questions.txt`, `responses.txt`, and `profanity.txt` and initializes a Responder instance from `Responder.java` to handle the matching of user input to a suitable response.

# Limitations

- Unable to handle incorrect spellings (Eg. "hockye" isn't assumed to be the same as "hockey")
- Doesn't utilize AI to generate "truly intelligent" responses (Eg. Unable to discuss topics outside the scope of keywords in `questions.txt`, Unable to understand humour or sarcasm)
- Only handles pure text (ie. No links, images, emojis etc.)

# Program Features


# Resources Used:
https://github.com/boyter/java-spelling-corrector/blob/master/src/com/boyter/SpellingCorrector/SpellingCorrector.java
