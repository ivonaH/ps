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
import javax.swing.JTextField;
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
    //text field
    JTextField txtFieldA;
    JTextField txtFieldB;
    JTextField txtFieldC;
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
        //text field
        txtFieldA=new JTextField();
        txtFieldB=new JTextField();
        txtFieldC=new JTextField();
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
       //text field
       txtFieldA.setBounds(115,30,100,20);
       txtFieldB.setBounds(115,60,100,20);
       txtFieldC.setBounds(115,90,100,20);
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
        //text field
        container.add(txtFieldA);
        container.add(txtFieldB);
        container.add(txtFieldC);
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
        a=Double.parseDouble(txtFieldA.getText());
        b=Double.parseDouble(txtFieldB.getText());
        c=Math.saberi(a,b);
        txtFieldC.setText(c+"");
    }
    
    private void btnOduzmiActionPerformed(ActionEvent e) {
        double a,b,c;
        a=Double.parseDouble(txtFieldA.getText());
        b=Double.parseDouble(txtFieldB.getText());
        c=Math.oduzmi(a,b);
        txtFieldC.setText(c+"");  
    }
      
    
}
