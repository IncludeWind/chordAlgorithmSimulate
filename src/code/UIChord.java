package code;

import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UIChord extends JFrame {

    private JPanel rootPanel;
    private JButton addNodeButton;
    private JButton deleteNodeButton;
    private JButton searchButton;
    private MyPanel mainPanel = new MyPanel(this);
    private JPanel topPanel = new JPanel();
    private JPanel rightPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    static Chord chord = Chord.getInstance();

    public UIChord() throws HeadlessException {


        final String TITLE = "main frame";

        // 设置窗口关闭按钮的默认操作(点击关闭时退出进程)
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // 把窗口位置设置到屏幕的中心
        setLocationRelativeTo(null);


        setTitle(TITLE);

        //Node node0 = new Node(0);


        //mainPanel.

        mainPanel.setBackground(Color.white);
        add(rootPanel);
        rootPanel.add(mainPanel, BorderLayout.CENTER);
        rootPanel.add(topPanel, BorderLayout.NORTH);
        setSize(800, 800);


        //init chord
//        JButton bt = new JButton("start");
//        topPanel.add(bt);
//        bt.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                SwingUtilities.invokeLater(new Runnable() {
//                    @Override
//                    public void run() {
//                        //chord.join(node0,null);
//                        for(int i = 0; i<chord.getCurNumOfNode(); i++){
//                            mainPanel.paint(i);
//                        }
//                    }
//                });
//            }
//        });

        //jump to finger table
        JButton toFingerTable = new JButton("open finger table");
        topPanel.add(toFingerTable);
        toFingerTable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {

                        subUI sub = new subUI();

                        for(int i = 0; i<chord.getCurNumOfNode(); i++){

                            mainPanel.paint(i);
                        }

                    }
                });
            }
        });


        //delete node
        deleteNodeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        int id = Integer.parseInt(textField1.getText());

                        if(chord.getNodeRing()[id]!=null){
                            chord.leave(chord.getNodeRing()[id]);

                            subUI sub = new subUI();
                            mainPanel.delete(id);
                            Node[] curRing = chord.getNodeRing();
                            for(int i = 0; i < curRing.length; i++) {
                                Node cur = curRing[i];
                                if (cur != null) {
                                    mainPanel.paint(cur.nid);
                                }
                            }

                        }else{
                            JOptionPane.showMessageDialog(null,"node does not exist");
                        }



                    }
                });
            }
        });


        //search node by nid
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {

                        String input = textField2.getText();

                        Node node = chord.lookup(chord.getNodeRing()[0],Integer.parseInt(input));

                        //mainPanel.mark(node.nid);



                        JOptionPane.showMessageDialog(null,"The search result is node: "+node.nid);


                    }
                });
            }
        });


        //add node to chord
        addNodeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                String input = textField3.getText();
                if(Integer.parseInt(input)>7||Integer.parseInt(input)<0)
                    JOptionPane.showMessageDialog(null,"invalid input");
                else{

                    Node[] ring = chord.getNodeRing();
                    Node exist = null;
                    for (int i = 0; i < ring.length; i++) {
                        if(ring[i] != null) {
                            exist = ring[i];
                        }
                    }
                    chord.join(new Node(Integer.parseInt(input)), exist);


                    mainPanel.paint(Integer.parseInt(input));
                    subUI sub = new subUI();

                }

            }
        });
    }


    public static class MyPanel extends JPanel {


        private UIChord frame;


        public MyPanel(UIChord frame) {
            super();
            this.frame = frame;
            this.setBackground(java.awt.Color.white);
        }

        public void paint (int nid){

            Graphics g = getGraphics();

            if(nid == 0){
                drawRectAdd0(g);
            }else if(nid == 1){
                drawRectAdd1(g);
            }else if(nid == 2){
                drawRectAdd2(g);
            }else if(nid == 3){
                drawRectAdd3(g);
            }else if(nid == 4){
                drawRectAdd4(g);
            }else if(nid == 5){
                drawRectAdd5(g);
            }else if(nid == 6){
                drawRectAdd6(g);
            }else if(nid == 7){
                drawRectAdd7(g);
            }else{
                JOptionPane.showMessageDialog(null,"invalid input");
            }

            drawArc(g);


        }


        public void mark (int nid){

            Graphics g = getGraphics();

            if(nid == 0){
                drawRectAdd0S(g);
            }else if(nid == 1){
                drawRectAdd1S(g);
            }else if(nid == 2){
                drawRectAdd2S(g);
            }else if(nid == 3){
                drawRectAdd3S(g);
            }else if(nid == 4){
                drawRectAdd4S(g);
            }else if(nid == 5){
                drawRectAdd5S(g);
            }else if(nid == 6){
                drawRectAdd6S(g);
            }else if(nid == 7){
                drawRectAdd7S(g);
            }else{
                JOptionPane.showMessageDialog(null,"invalid input");
            }

            drawArc(g);


        }

        public void delete(int nid){

            Graphics g = getGraphics();

            if(nid == 0){
                drawRectDel0(g);
            }else if(nid == 1){
                drawRectAdd1(g);
            }

            if(nid == 0){
                drawRectDel0(g);
            }else if(nid == 1){
                drawRectDel1(g);
            }else if(nid == 2){
                drawRectDel2(g);
            }else if(nid == 3){
                drawRectDel3(g);
            }else if(nid == 4){
                drawRectDel4(g);
            }else if(nid == 5){
                drawRectDel5(g);
            }else if(nid == 6){
                drawRectDel6(g);
            }else if(nid == 7){
                drawRectDel7(g);
            }else{
                JOptionPane.showMessageDialog(null,"invalid input");
            }

            drawArc(g);
        }



        @Override
        public void paintComponent(Graphics g) {

            super.paintComponent(g);
            setBackground(Color.white);

            //draw the arc
            //drawArc(g);

        }


        /**
         * draw node
         */

        private void drawRectAdd0S(Graphics g) {

            Graphics2D g2d = (Graphics2D) g.create();

            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.RED);

            g2d.fillRoundRect(470, 120, 20, 20, 20, 20);

            g2d.dispose();
        }



        //special mark
        private void drawRectAdd1S(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.RED);
            g2d.fillRoundRect(570, 310, 20, 20, 20, 20);
            g2d.dispose();
        }

        private void drawRectAdd2S(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.RED);
            g2d.fillRoundRect(528, 460, 20, 20, 20, 20);
            g2d.dispose();
        }

        private void drawRectAdd3S(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.RED);
            g2d.fillRoundRect(420, 550, 20, 20, 20, 20);
            g2d.dispose();
        }

        private void drawRectAdd4S(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.RED);
            g2d.fillRoundRect(250, 558, 20, 20, 20, 20);
            g2d.dispose();
        }

        private void drawRectAdd5S(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.RED);
            g2d.fillRoundRect(118, 465, 20, 20, 20, 20);
            g2d.dispose();
        }

        private void drawRectAdd6S(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.RED);
            g2d.fillRoundRect(72, 300, 20, 20, 20, 20);
            g2d.dispose();
        }

        private void drawRectAdd7S(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.RED);
            g2d.fillRoundRect(180, 115, 20, 20, 20, 20);
            g2d.dispose();
        }



        //draw node
        private void drawRectAdd0(Graphics g) {

            Graphics2D g2d = (Graphics2D) g.create();

            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.gray);

            g2d.fillRoundRect(470, 120, 20, 20, 20, 20);

            g2d.dispose();
        }
        private void drawRectAdd1(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.gray);
            g2d.fillRoundRect(570, 310, 20, 20, 20, 20);
            g2d.dispose();
        }

        private void drawRectAdd2(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.gray);
            g2d.fillRoundRect(528, 460, 20, 20, 20, 20);
            g2d.dispose();
        }

        private void drawRectAdd3(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.gray);
            g2d.fillRoundRect(420, 550, 20, 20, 20, 20);
            g2d.dispose();
        }

        private void drawRectAdd4(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.gray);
            g2d.fillRoundRect(250, 558, 20, 20, 20, 20);
            g2d.dispose();
        }

        private void drawRectAdd5(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.gray);
            g2d.fillRoundRect(118, 465, 20, 20, 20, 20);
            g2d.dispose();
        }

        private void drawRectAdd6(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.gray);
            g2d.fillRoundRect(72, 300, 20, 20, 20, 20);
            g2d.dispose();
        }

        private void drawRectAdd7(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.gray);
            g2d.fillRoundRect(180, 115, 20, 20, 20, 20);
            g2d.dispose();
        }

        /**
         * draw Chord
         */
        private void drawArc(Graphics g) {

            Graphics2D g2d = (Graphics2D) g.create();

            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.RED);


            g2d.drawArc(80, 80, 500, 500, 0, 360);

            g2d.setColor(Color.GRAY);


            g2d.dispose();
        }


        private void drawRectDel0(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.white);
            g2d.fillRoundRect(470, 120, 20, 20, 20, 20);
            g2d.dispose();
        }

        private void drawRectDel1(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.white);
            g2d.fillRoundRect(570, 310, 20, 20, 20, 20);
            g2d.dispose();
        }

        private void drawRectDel2(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.white);
            g2d.fillRoundRect(528, 460, 20, 20, 20, 20);
            g2d.dispose();
        }


        private void drawRectDel3(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.white);
            g2d.fillRoundRect(420, 550, 20, 20, 20, 20);
            g2d.dispose();
        }


        private void drawRectDel4(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.white);
            g2d.fillRoundRect(250, 558, 20, 20, 20, 20);
            g2d.dispose();
        }


        private void drawRectDel5(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.white);
            g2d.fillRoundRect(118, 465, 20, 20, 20, 20);
            g2d.dispose();
        }


        private void drawRectDel6(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.white);
            g2d.fillRoundRect(72, 300, 20, 20, 20, 20);
            g2d.dispose();
        }


        private void drawRectDel7(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.white);
            g2d.fillRoundRect(180, 115, 20, 20, 20, 20);
            g2d.dispose();
        }
    }
}