/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.form;

import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import math.Math;

/**
 *
 * @author Ivona
 */
public class FMath extends JFrame{

    //labele
    JLabel labelA;
    JLabel labelB;
    JLabel labelC;
    //text area
    JTextArea txtAreaA;
    JTextArea txtAreaB;
    JTextArea txtAreaC;
    //dugmici
    JButton btnSaberi;
    JButton btnOduzmi;
    
    
   public FMath(){
        initComponents();
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        
        //labele
        labelA=new JLabel("a:");
        labelB=new JLabel("b:");
        labelC=new JLabel("c:");
        //text area
        txtAreaA=new JTextArea();
        txtAreaB=new JTextArea();
        txtAreaC=new JTextArea();
        //dugmici
        btnSaberi=new JButton("Saberi");
        btnOduzmi=new JButton("Oduzmi");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,250);
        setTitle("Saberi/oduzmi");
        
        //labele
       labelA.setBounds(80, 30, 40, 20);
       labelB.setBounds(80,60,40,20);
       labelC.setBounds(80,90,40,20);
       //text area
       txtAreaA.setBounds(115,30,100,20);
       txtAreaB.setBounds(115,60,100,20);
       txtAreaC.setBounds(115,90,100,20);
       //dugmici
       btnSaberi.setBounds(30,150,100,20);
       btnOduzmi.setBounds(150,150,100,20);
        
       //container
        Container container=getContentPane();
        container.setLayout(null);
        //labele
        container.add(labelA);
        container.add(labelB);
        container.add(labelC);
        //text area
        container.add(txtAreaA);
        container.add(txtAreaB);
        container.add(txtAreaC);
        //dugmici
        container.add(btnSaberi);
        container.add(btnOduzmi);
        
        
          btnSaberi.addActionListener((ActionEvent e) -> {
              btnSaberiActionPerformed(e);
        });
          
          btnOduzmi.addActionListener((ActionEvent e) -> {
              btnOduzmiActionPerformed(e);
        });

         
    }
    
    private void btnSaberiActionPerformed(ActionEvent e) {
        double a,b,c;
        a=Double.parseDouble(txtAreaA.getText());
        b=Double.parseDouble(txtAreaB.getText());
        c=Math.saberi(a,b);
        txtAreaC.setText(c+"");
    }
    
    private void btnOduzmiActionPerformed(ActionEvent e) {
        double a,b,c;
        a=Double.parseDouble(txtAreaA.getText());
        b=Double.parseDouble(txtAreaB.getText());
        c=Math.oduzmi(a,b);
        txtAreaC.setText(c+"");  
    }
      
    
}
