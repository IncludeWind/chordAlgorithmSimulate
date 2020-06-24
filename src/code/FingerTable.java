package code;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class FingerTable  {
    private List<Finger> fingers;
    public int tableLength;

    public FingerTable(Node node) {


//
//
//        this.setJTableColumnsWidth(this, 200,40,60);


//        String col[] = {"start/end","node ID"};
//        String data[][] = new String [3][2] ;
//        data[0] = new String[]{"1","2"};
//        data[1] = new String[]{"1","2"};
//        data[2] = new String[]{"1","2"};

        this.tableLength = (int)(Math.log(Chord.NUMBER_LIMIT) / Math.log(2));
        this.fingers = new ArrayList<>();
        for (int i = 0; i < tableLength; i++) {
            int start = (node.nid + (int)Math.pow(2, i)) % Chord.NUMBER_LIMIT;
            fingers.add(new Finger(start, null));
        }





        //DefaultTableModel model1 = (DefaultTableModel) this.getModel();
//        DefaultTableModel model1 = new DefaultTableModel(data, col);
//
//        this.setModel(model1);

    }

//    public static void setJTableColumnsWidth(JTable table, int tablePreferredWidth,
//                                             double... percentages) {
//        double total = 0;
//        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
//            total += percentages[i];
//        }
//
//        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
//            TableColumn column = table.getColumnModel().getColumn(i);
//            column.setPreferredWidth((int)
//                    (tablePreferredWidth * (percentages[i] / total)));
//        }
//    }


    public int getNumOfFingers() {
        return tableLength;
    }
    /**
     * @param i
     * @return the ith finger
     */
    public Finger getFinger(int i) {
        return fingers.get(i);
    }
}
