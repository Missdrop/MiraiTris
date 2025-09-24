package cn.naipu.MiraiTris;

import javax.swing.*;

public class JFrame extends javax.swing.JFrame {
    public JFrame() {
        initComponents();
    }

    private void initComponents() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("MiraiTris");
        //setResizable(true);
        setSize(400,200);
        JLabel jl = new JLabel("这是使用JFrame类创建的窗口");
        getContentPane().add(jl);
        setVisible(true);

    }

}
