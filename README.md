# DXC_Encoder
This is the question attempted for DXC interview. The question asked for encoding and decoding the text.

As the question asked for OOP concepts, I have adopted using Inheritance, Encapsulation, Abstraction, and Polymorphism.

Below is the UML Diagram.
UML Class Diagram Design
![image](https://user-images.githubusercontent.com/11598446/199240222-3572e445-c865-48ea-a3dc-3dbe0fc1b1f1.png)

1) Main Class -> The driver class that runs the program
2) Letter Class -> Stores the letter character
3) Alphabet Class -> Stores the alphabet character. It inherits the Letter which is the parent
4) Number Class -> Stores the number character. It inherits the Letter which is the parent
5) SpecialSymbol Class -> Stores the special symbol character. It inherits the Letter which is the parent.
6) ReferenceTable Class -> The reference table represents the tables that stores the lists of Reference Row
7) ReferenceRows Class -> The reference rows stores all the Letter objects. Each ReferenceRows tied to a single ReferenceTable.

How to run?
1) Clone the project.
2) Go to the folder and run *.java on your terminal to compile
3) Lastly, java Main to run the project
