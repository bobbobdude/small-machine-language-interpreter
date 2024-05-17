package sml;

/**
 * This class represents the mechanism for accessing a label 
 * given that there is restricted access to the class
 *
 * @author KLM and xxx
 */

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import static lombok.AccessLevel.PUBLIC;

@EqualsAndHashCode
@ToString
@AllArgsConstructor(access = PUBLIC)

public class LabelBridge {
    // TODO
    private final Labels labels;

    public Labels getLabels() {
        return labels;
    }

    public int indexOf(String label) {
        return labels.indexOf(label);
    }

    public int addLabel(String label) {
        return labels.addLabel(label);
    }
    public void reset(){
        labels.reset();
    }

}
