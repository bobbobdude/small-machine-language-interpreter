package sml.instructions;

import sml.Instruction;
import sml.Machine;

/**
 * Example instruction for the SML machine
 */
public class LinInstruction extends Instruction {
    private final int result;
    private final int valueToBeSaved;

    public LinInstruction(String label, int i1, int value) {
        super(label, "lin");
        result = i1;
        this.valueToBeSaved = value;
    }

    @Override
    public void execute(Machine m) {
        m.registers().register(result, valueToBeSaved);
    }

    @Override
    public String toString() {
        return super.toString() + " store in register " + result + " the integer value " + valueToBeSaved;
    }
}
