import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderView extends JPanel{

    JTextArea orderText;
    JLabel orderTotal;
    JCheckBox selectedCheckBox;
    JCheckBox CHamburger;
    JCheckBox CChicken;
    JCheckBox CPop;
    JCheckBox CFries;
    JCheckBox CCombo1;
    JCheckBox CCombo2;
    JButton Badd;
    JButton Bclear;
    public OrderView() {
        CHamburger = new JCheckBox();
        CChicken = new JCheckBox();
        CPop = new JCheckBox();
        CFries = new JCheckBox();
        CCombo1 = new JCheckBox();
        CCombo2 = new JCheckBox();
        selectedCheckBox = new JCheckBox();
        Badd = new JButton();
        Bclear = new JButton();

        setLayout(new BorderLayout());
        orderText = new JTextArea(10,20);
        orderTotal = new JLabel();
        add(orderText, BorderLayout.NORTH);
        CHamburger.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedCheckBox = CHamburger;
            }
        });

        CChicken.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedCheckBox = CChicken;
            }
        });

        CPop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedCheckBox = CPop;
            }
        });

        CFries.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedCheckBox = CFries;
            }
        });

        CCombo1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedCheckBox = CCombo1;
            }
        });

        CCombo2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedCheckBox = CCombo2;
            }
        });

        Badd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        Bclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        //OrderController.add
        //OrderController.Clear

        CHamburger.setText("Hamburger");
        CChicken.setText("Chicken Sandwich");
        CPop.setText("Pop");
        CFries.setText("Fries");
        CCombo1.setText("Combo #1");
        CCombo2.setText("Combo #2");

        Badd.setText("Add");
        Bclear.setText("Clear");

        JPanel panel1 = new JPanel();
        add(panel1, BorderLayout.CENTER);
        panel1.add(CHamburger);
        panel1.add(CChicken);
        panel1.add(CPop);
        panel1.add(CFries);
        panel1.add(CCombo1);
        panel1.add(CCombo2);

        JPanel panel2 = new JPanel();
        add(panel2, BorderLayout.SOUTH);
        panel2.add(Badd);
        panel2.add(Bclear);


    }
}
