/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecsu.ds3.ejemplo7trabajoautonomo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author PC-BLESS
 */
public class Formulario extends JPanel implements ActionListener{
    public JLabel numero;
    public JButton suma;
    public JButton resta;
    public JButton doble;
    public Formulario(){
        super();
        this.numero = new JLabel("0");
        this.suma =new JButton("Suma 1");
        this.resta =new JButton("Resta 1");
        this.doble =new JButton("Doble");
        this.suma.addActionListener(this);
        this.resta.addActionListener(this);
        this.doble.addActionListener(this);
        add(this.numero);
        add(this.suma);
        add(this.resta);
        add(this.doble);
        setVisible(true);
        setLayout(new FlowLayout());
    }
    
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == this.suma){
            String num = this.numero.getText();
            int numC = Integer.parseInt(num);
            numC++;
            this.numero.setText(Integer.toString(numC));   
        }
         if (e.getSource() == this.resta){
            String num = this.numero.getText();
            int numC = Integer.parseInt(num);
            numC--;
            this.numero.setText(Integer.toString(numC));  
            if (numC == 0){
                this.resta.setVisible(false);
            }
        }
         if (e.getSource() == this.doble){
            String num = this.numero.getText();
            int numC = Integer.parseInt(num);
            numC = numC*2;
            this.numero.setText(Integer.toString(numC));   
        }   
    }
}
