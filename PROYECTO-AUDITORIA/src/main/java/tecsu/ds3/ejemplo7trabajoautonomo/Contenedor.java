/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecsu.ds3.ejemplo7trabajoautonomo;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**J
 *
 * @author PC-BLESS
 */
public class Contenedor extends JFrame {

    private JMenuBar menuPrincipalC;
    private JMenu opcion1;
    private JMenu opcion2;
    JMenuItem suma;
    private JMenuItem resta;
    private JMenuItem doble;
    private JMenuItem salir;
    public Formulario formulario;
    public Contenedor (String titulo){
        super(titulo);
        this.menuPrincipalC = new JMenuBar();
        this.opcion1 = new JMenu("OPERACIONES MATEMÁTICAS");
        this.opcion2 = new JMenu("OPCIONES");
        this.suma = new JMenuItem("SUMA");
        this.suma.addActionListener(new menuOpcionesListener(this));
        this.resta = new JMenuItem("RESTA");
        this.resta.addActionListener(new menuOpcionesListener(this));
        this.doble = new JMenuItem("DOBLE");
        this.doble.addActionListener(new menuOpcionesListener(this));
        this.salir = new JMenuItem("SALIR");
        this.salir.addActionListener(new menuOpcionesListener(this));
        this.menuPrincipalC.add(opcion1);
        this.opcion1.add(suma);
        this.opcion1.add(resta);
        this.opcion1.add(doble);
        this.menuPrincipalC.add(opcion2);
        this.opcion2.add(salir);
        this.setJMenuBar(menuPrincipalC);
        formulario = new Formulario();
        add(formulario);
        setVisible(true);
        setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        Contenedor contenedor = new Contenedor("FORMULARIO VANESSA");
        
    }
    
}
