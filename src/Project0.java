import javax.swing.*;

public class Project0 {

    public static void main(String[] args) {
        TestMe();
    }

    public static void LetterChecker(String sentence) {
        //declare counters
        int upperE = 0, lowerE = 0;
        //For loop to iterate through sentence and update the counters if charAt find letter.
        for (int start = 0; start <= sentence.length() - 1; start++) {
            if (sentence.charAt(start) == 'E') {
                upperE += 1;
            } else if (sentence.charAt(start) == 'e') {
                lowerE += 1;
            }
        }
        //output result with if not 0 otherwise state no e's found.
        if (upperE != 0 || lowerE != 0) {
            JOptionPane.showMessageDialog(null, "Number of lower cases e's: " + lowerE + "\n" +
                    "Number of upper case e's: " + upperE);
        } else {
            JOptionPane.showMessageDialog(null, "The sentence provided has neither upper case or lower case e's."); // output if no e's found.
        }
    }

    public static void TestMe() {
        // ask user for sentence.
        String sentence = JOptionPane.showInputDialog(null, "Please enter a sentence.");
        // continue as long as sentence is not stop.
        while (!sentence.equalsIgnoreCase("stop")) {
            LetterChecker(sentence);
            //prompt user for another sentence.
            sentence = JOptionPane.showInputDialog(null, "Please enter a sentence.");
        }
    }
}
