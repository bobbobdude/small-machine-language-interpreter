
# SML Interpreter

This assignment allowed me to practice using
subclasses,
modifying existing code,
testing,
dependency injection,
and using reflection in Java.

In this assignment, I wrote an interpreter for a simple machine language — SML.

The general form of machine language instruction used is:

    label instruction register-list

label - is the label for the line. Other instructions might “jump” to that label.

instruction - is the actual instruction. In SML, instructions include adding, multiplying, storing and retrieving integers and conditionally branching to other labels (like an if statement).

register-list - is the list of registers that the instruction manipulates.
Registers are simple integers, storage areas in computer memory, much like variables. SML has 32 registers numbered 0, 1, …, 31.

The instructions of a program are executed in order (starting with the first one) unless the order is changed by the execution of a bnz instruction.
Execution of a program terminates when its last instruction has been executed (and provided that instruction does not change the order of execution).

My interpreter:

1. Reads the file name containing the program from the command line (via String[] args and the Main class).

2. Reads the program from the file and translates it into the internal form.

3. Prints the program out.

4. Executes the program.

5. Prints the final values of the registers.
