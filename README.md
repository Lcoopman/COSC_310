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
Synonym recognition 
  -This feature allows the program to recognize synonyms used by the user. For example the user may use the words “common” or “ordinary”, to the program these words have the same meaning. Synonym recognition helps the program flow more naturally with the user. 
No match responder
  -No match responded is a (catch) feature that prints automated responses when the program does not recognize the user's input. For example the user enters the number “5” instead of spelling “five” the program will not be able to recognize this and will return a catch statement. 
Profanity filter
  -Profanity filter is a feature that recognizes when the user has entered any profanity. The program will then remind the user to stop using profanity. This feature is used to help keep the chatbot kid friendly and help with overall flow. A sample example of a reply from the chatbot when profanity is entered is “Please do not swear!”.
Spell check
	-Spell check is a feature used to attempt any spelling mistakes that the user enters. This feature assumes that the user got the first letter of the word correct, but will change further characters. This feature is important to make sure the user is entering accurate information. An example of this feature is if the user enters “helli”. In this case the program would correct the world to “hello”. 
PorterStemmer
  -PorterStemmer is a feature used to transform an (entered) word into its root form. This feature is needed so that the word entered can meet the expectations of the program. An example of this feature is when the user enters a word like “connections” or “connected” . Using porterStemmers the word would then be indexed as the base word “connect”. 
GUI
	-The graphical user interface for our program was designed to be used by anyone and allow for fast and efficient conversations. It allows the user to enter a question and press “enter” to receive an answer. 

# Resources Used:
https://github.com/boyter/java-spelling-corrector/blob/master/src/com/boyter/SpellingCorrector/SpellingCorrector.java
