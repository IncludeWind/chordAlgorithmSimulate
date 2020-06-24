package code;


import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import static code.UIChord.chord;


public class subUI extends JFrame {


    //init tables
    private JTable table0 = new JTable();
    private JTable table1 = new JTable();
    private JTable table2 = new JTable();
    private JTable table3 = new JTable();
    private JTable table4 = new JTable();
    private JTable table5 = new JTable();
    private JTable table6 = new JTable();
    private JTable table7 = new JTable();


    //init panels
    JPanel panel = new JPanel();

    private JPanel pan0 = new JPanel();
    private JPanel pan1 = new JPanel();
    private JPanel pan2 = new JPanel();
    private JPanel pan3 = new JPanel();
    private JPanel pan4 = new JPanel();
    private JPanel pan5 = new JPanel();
    private JPanel pan6 = new JPanel();
    private JPanel pan7 = new JPanel();

    public subUI (){



        Node nodeRing [] = chord.getNodeRing();



//        chord.join(node3,node1);
//        chord.join(node7,node1);
//        chord.join(node2,node1);
//        chord.join(node5,node1);
//        chord.join(node4,node1);
//        chord.join(node0,node1);
//        chord.join(node6,node1);


        //table0

        table0.setPreferredSize(new Dimension(200,200));

        JTableHeader header0 =  table0.getTableHeader();
        header0.setPreferredSize(new Dimension(header0.getWidth(), 20));
        header0.setFont(new Font("times new roman", Font.PLAIN, 18));

        if(nodeRing[0]!=null){
            FingerTable ft0 = nodeRing[0].fingerTable;
            String col0[] = {"start/end","node ID"};
            String data0[][] = new String [ft0.getNumOfFingers()][2] ;

            for (int i = 0; i < ft0.getNumOfFingers(); i++) {
                data0[i][0] = Integer.toString(ft0.getFinger(i).getStart());//get the node of finger[i].start
                data0[i][1] = Integer.toString(ft0.getFinger(i).getNode().nid);
                //System.out.println(ft.getFinger(i).getNode().nid);
            }
            DefaultTableModel model0 = new DefaultTableModel(data0, col0);
            table0.setModel(model0);
        }




        //table1

        table1.setPreferredSize(new Dimension(200,200));

        JTableHeader header1 =  table1.getTableHeader();
        header1.setPreferredSize(new Dimension(header1.getWidth(), 20));
        header1.setFont(new Font("times new roman", Font.PLAIN, 18));

        if(nodeRing[1] != null){
            FingerTable ft1 = nodeRing[1].fingerTable;
            String col1[] = {"start/end","node ID"};
            String data1[][] = new String [ft1.getNumOfFingers()][2] ;

            for (int i = 0; i < ft1.getNumOfFingers(); i++) {
                data1[i][0] = Integer.toString(ft1.getFinger(i).getStart());//get the node of finger[i].start
                data1[i][1] = Integer.toString(ft1.getFinger(i).getNode().nid);
                //System.out.println(ft.getFinger(i).getNode().nid);
            }
            DefaultTableModel model1 = new DefaultTableModel(data1, col1);
            table1.setModel(model1);
        }



        //table2
        table2.setPreferredSize(new Dimension(200,200));

        JTableHeader header2 =  table2.getTableHeader();
        header2.setPreferredSize(new Dimension(header2.getWidth(), 20));
        header2.setFont(new Font("times new roman", Font.PLAIN, 18));

        if(nodeRing[2] != null){
            FingerTable ft2 = nodeRing[2].fingerTable;
            String col2[] = {"start/end","node ID"};
            String data2[][] = new String [ft2.getNumOfFingers()][2] ;

            for (int i = 0; i < ft2.getNumOfFingers(); i++) {
                data2[i][0] = Integer.toString(ft2.getFinger(i).getStart());//get the node of finger[i].start
                data2[i][1] = Integer.toString(ft2.getFinger(i ).getNode().nid);
                //System.out.println(ft.getFinger(i).getNode().nid);
            }
            DefaultTableModel model2 = new DefaultTableModel(data2, col2);
            table2.setModel(model2);
        }




        //table3
        table3.setPreferredSize(new Dimension(200,200));

        JTableHeader header3 =  table3.getTableHeader();
        header3.setPreferredSize(new Dimension(header3.getWidth(), 20));
        header3.setFont(new Font("times new roman", Font.PLAIN, 18));

        if(nodeRing[3] != null){
            FingerTable ft3 = nodeRing[3].fingerTable;
            String col3[] = {"start/end","node ID"};
            String data3[][] = new String [ft3.getNumOfFingers()][2] ;

            for (int i = 0; i < ft3.getNumOfFingers(); i++) {
                data3[i][0] = Integer.toString(ft3.getFinger(i).getStart());//get the node of finger[i].start
                data3[i][1] = Integer.toString(ft3.getFinger(i ).getNode().nid);
                //System.out.println(ft.getFinger(i).getNode().nid);
            }
            DefaultTableModel model3 = new DefaultTableModel(data3, col3);
            table3.setModel(model3);
        }




        //table4
        table4.setPreferredSize(new Dimension(200,200));

        JTableHeader header4 =  table4.getTableHeader();
        header4.setPreferredSize(new Dimension(header4.getWidth(), 20));
        header4.setFont(new Font("times new roman", Font.PLAIN, 18));


        if(nodeRing[4]!=null){
            FingerTable ft4 = nodeRing[4].fingerTable;
            String col4[] = {"start/end","node ID"};
            String data4[][] = new String [ft4.getNumOfFingers()][2] ;

            for (int i = 0; i < ft4.getNumOfFingers(); i++) {
                data4[i][0] = Integer.toString(ft4.getFinger(i).getStart());//get the node of finger[i].start
                data4[i][1] = Integer.toString(ft4.getFinger(i).getNode().nid);
                //System.out.println(ft.getFinger(i).getNode().nid);
            }
            DefaultTableModel model4 = new DefaultTableModel(data4, col4);
            table4.setModel(model4);
        }



        //table5
        table5.setPreferredSize(new Dimension(200,200));

        JTableHeader header5 =  table5.getTableHeader();
        header5.setPreferredSize(new Dimension(header5.getWidth(), 20));
        header5.setFont(new Font("times new roman", Font.PLAIN, 18));


        if(nodeRing[5] != null){
            FingerTable ft5 = nodeRing[5].fingerTable;
            String col5[] = {"start/end","node ID"};
            String data5[][] = new String [ft5.getNumOfFingers()][2] ;

            for (int i = 0; i < ft5.getNumOfFingers(); i++) {
                data5[i][0] = Integer.toString(ft5.getFinger(i).getStart());//get the node of finger[i].start
                data5[i][1] = Integer.toString(ft5.getFinger(i ).getNode().nid);
                //System.out.println(ft.getFinger(i).getNode().nid);
            }
            DefaultTableModel model5 = new DefaultTableModel(data5, col5);
            table5.setModel(model5);
        }




        //table6
        table6.setPreferredSize(new Dimension(200,200));

        JTableHeader header6 =  table6.getTableHeader();
        header6.setPreferredSize(new Dimension(header6.getWidth(), 20));
        header6.setFont(new Font("times new roman", Font.PLAIN, 18));

        if(nodeRing[6] != null){
            FingerTable ft6 = nodeRing[6].fingerTable;
            String col6[] = {"start/end","node ID"};
            String data6[][] = new String [ft6.getNumOfFingers()][2] ;

            for (int i = 0; i < ft6.getNumOfFingers(); i++) {
                data6[i][0] = Integer.toString(ft6.getFinger(i).getStart());//get the node of finger[i].start
                data6[i][1] = Integer.toString(ft6.getFinger(i ).getNode().nid);
                //System.out.println(ft.getFinger(i).getNode().nid);
            }
            DefaultTableModel model6 = new DefaultTableModel(data6, col6);
            table6.setModel(model6);
        }




        //table7
        table7.setPreferredSize(new Dimension(200,200));

        JTableHeader header7 =  table7.getTableHeader();
        header7.setPreferredSize(new Dimension(header7.getWidth(), 20));
        header7.setFont(new Font("times new roman", Font.PLAIN, 18));

        if(nodeRing[7]!=null){
            FingerTable ft7 = nodeRing[7].fingerTable;
            String col7[] = {"start/end","node ID"};
            String data7[][] = new String [ft7.getNumOfFingers()][2] ;

            for (int i = 0; i < ft7.getNumOfFingers(); i++) {
                data7[i][0] = Integer.toString(ft7.getFinger(i).getStart());//get the node of finger[i].start
                data7[i][1] = Integer.toString(ft7.getFinger(i ).getNode().nid);
                //System.out.println(ft.getFinger(i).getNode().nid);
            }
            DefaultTableModel model7 = new DefaultTableModel(data7, col7);
            table7.setModel(model7);
        }


        //set panel format
        panel.setLayout(new FlowLayout());
        panel.setPreferredSize(new Dimension(1000, 450));
        panel.setBorder (BorderFactory.createTitledBorder (BorderFactory.createEtchedBorder (),
                "Finger Table",
                TitledBorder.CENTER,
                TitledBorder.TOP));


        pan0.setLayout(new BorderLayout());
        pan0.setPreferredSize(new Dimension(200,200));
        pan0.setBorder (BorderFactory.createTitledBorder (BorderFactory.createEtchedBorder (),
                "Finger Table 0",
                TitledBorder.CENTER,
                TitledBorder.TOP));

        pan1.setLayout(new BorderLayout());
        pan1.setPreferredSize(new Dimension(200,200));
        pan1.setBorder (BorderFactory.createTitledBorder (BorderFactory.createEtchedBorder (),
                "Finger Table 1" ,
                TitledBorder.CENTER,
                TitledBorder.TOP));

        pan2.setLayout(new BorderLayout());
        pan2.setPreferredSize(new Dimension(200,200));
        pan2.setBorder (BorderFactory.createTitledBorder (BorderFactory.createEtchedBorder (),
                "Finger Table 2",
                TitledBorder.CENTER,
                TitledBorder.TOP));

        pan3.setLayout(new BorderLayout());
        pan3.setPreferredSize(new Dimension(200,200));
        pan3.setBorder (BorderFactory.createTitledBorder (BorderFactory.createEtchedBorder (),
                "Finger Table 3",
                TitledBorder.CENTER,
                TitledBorder.TOP));

        pan4.setLayout(new BorderLayout());
        pan4.setPreferredSize(new Dimension(200,200));
        pan4.setBorder (BorderFactory.createTitledBorder (BorderFactory.createEtchedBorder (),
                "Finger Table 4",
                TitledBorder.CENTER,
                TitledBorder.TOP));

        pan5.setLayout(new BorderLayout());
        pan5.setPreferredSize(new Dimension(200,200));
        pan5.setBorder (BorderFactory.createTitledBorder (BorderFactory.createEtchedBorder (),
                "Finger Table 5",
                TitledBorder.CENTER,
                TitledBorder.TOP));

        pan6.setLayout(new BorderLayout());
        pan6.setPreferredSize(new Dimension(200,200));
        pan6.setBorder (BorderFactory.createTitledBorder (BorderFactory.createEtchedBorder (),
                "Finger Table 6",
                TitledBorder.CENTER,
                TitledBorder.TOP));

        pan7.setLayout(new BorderLayout());
        pan7.setPreferredSize(new Dimension(200,200));
        pan7.setBorder (BorderFactory.createTitledBorder (BorderFactory.createEtchedBorder (),
                "Finger Table 7",
                TitledBorder.CENTER,
                TitledBorder.TOP));


        //adding table to panel
        setContentPane(panel);
        pan0.add(new JScrollPane(table0));
        pan1.add(new JScrollPane(table1));
        pan2.add(new JScrollPane(table2));
        pan3.add(new JScrollPane(table3));
        pan4.add(new JScrollPane(table4));
        pan5.add(new JScrollPane(table5));
        pan6.add(new JScrollPane(table6));
        pan7.add(new JScrollPane(table7));


        //add panel to root panel
        panel.add(pan0);
        panel.add(pan1);
        panel.add(pan2);
        panel.add(pan3);
        panel.add(pan4);
        panel.add(pan5);
        panel.add(pan6);
        panel.add(pan7);




        //setLocationRelativeTo(null);

        setSize(500,500);
        setLocation(300,400);
        pack();

        setVisible(true);



    }


}
