package sml.instructions;

import sml.Instruction;
import sml.Machine;
import sml.LabelBridge;

/**
 * Example instruction for the SML machine
 */
public class BnzInstruction extends Instruction {
    private final int register1;
    public String labelToJumpTo;


    public BnzInstruction(String label, int i1, String labelToJumpTo) {
        super(label, "bnz");
        register1 = i1;
        this.labelToJumpTo = labelToJumpTo;
    }

    @Override
    public void execute(Machine m) {
        var value1 = m.registers().register(register1);
        if (value1 != 0){
            LabelBridge labelBridge = new LabelBridge(m.labels());
            int index = labelBridge.indexOf(labelToJumpTo);
            if (index != -1) {
                m.pc(index);
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + " will jump to label " + labelToJumpTo + " if register " + register1 + " is zero";
    }
}
