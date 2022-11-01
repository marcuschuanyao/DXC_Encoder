# DXC_Encoder
This is the question attempted for DXC interview. The question asked for encoding and decoding the text.

As the question asked for OOP concepts, I have adopted using Inheritance, Encapsulation, Abstraction, and Polymorphism.

Below is the UML Diagram.
UML Class Diagram Design
![image](https://user-images.githubusercontent.com/11598446/199301485-50102ef7-481e-4213-b674-bba3e8ac259c.png)


1) Main Class -> The driver class that runs the program
2) Letter Class -> Stores the letter character
3) Alphabet Class -> Stores the alphabet character. It inherits the Letter which is the parent
4) Number Class -> Stores the number character. It inherits the Letter which is the parent
5) SpecialSymbol Class -> Stores the special symbol character. It inherits the Letter which is the parent.
6) ReferenceTable Class -> The reference table represents the tables that stores the lists of Reference Row

How it works?

The program uses two main hashmap to record the Character and offset characters, followed by offset characters and Character. When you run the encode method, the program will loop through each character and find the offset character in the hashmap. Once, it find the value in the hashmap, it will append it to the text. The same logic goes to the decode method.

How to run?
1) Clone the project.
2) Go to the folder and run "*.java" (exclude the quotes) on your terminal to compile
3) Lastly, "java Main" exclude the quotes to run the project

How to test different test cases?
1) Go to the Main.java
2) Look for line 9 and 10, and change the one circled in red.
![image](https://user-images.githubusercontent.com/11598446/199300445-15ed5d76-4c24-4067-9ef5-6b69b4cbcd2d.png)
