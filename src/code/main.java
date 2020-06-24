package code;

import javax.swing.*;

public class main {

    Chord chord = Chord.getInstance();

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                UIChord UIChord = new UIChord();
                UIChord.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                UIChord.setVisible(true);
            }
        });

    }
}
