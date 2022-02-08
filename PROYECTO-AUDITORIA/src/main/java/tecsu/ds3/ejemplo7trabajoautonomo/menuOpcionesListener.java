/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecsu.ds3.ejemplo7trabajoautonomo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author PC-BLESS
 */
public class menuOpcionesListener implements ActionListener {
    private Contenedor contenedor;
    public menuOpcionesListener(Contenedor contenedor){
        this.contenedor = contenedor;
    }
    
    
    public void actionPerformed(ActionEvent e) {
        String num = this.contenedor.formulario.numero.getText();
        int numC = Integer.parseInt(num);
        
        if(this.contenedor.suma == e.getSource()){
            numC++;
            this.contenedor.formulario.numero.setText(Integer.toString(numC));
        }
    }
}
