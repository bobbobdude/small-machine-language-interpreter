package sml.instructions;

import sml.Instruction;
import sml.Machine;

/**
 * Example instruction for the SML machine
 */
public class OutInstruction extends Instruction {
    private final int registerToBePrinted;
    private int valueOfRegister;

    public OutInstruction(String label, int registerToBePrinted) {
        super(label, "out");
        this.registerToBePrinted = registerToBePrinted;
    }

    @Override
    public void execute(Machine m) {
        valueOfRegister = m.registers().register(registerToBePrinted);
        System.out.println(valueOfRegister);
    }

    @Override
    public String toString() {
        return super.toString() + " prints out the value that is stored in the register " + registerToBePrinted;
    }
}
