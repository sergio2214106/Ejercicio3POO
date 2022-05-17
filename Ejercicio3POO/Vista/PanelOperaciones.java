package Vista;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones  extends JPanel
{
        
    
        //----------------------
        //-------Atributos------
        //----------------------
        public JButton btHallar; 
        public JButton btBorrar;
        public JButton btSalir;
        //----------------------
        //---------Metodos------
        //----------------------   


        /* Metodo Constructor*/

        public PanelOperaciones() 
    
        {
            //definir contenedor del panel
            this.setLayout(null);
            this.setBackground(Color.GRAY);

            //Crear y agregar boton de Hallar
            btHallar= new JButton("[Hallar]");
            btHallar.setBounds(45, 40, 100, 20);
            this.add(btHallar);
            btHallar.setActionCommand("hallar");

            //Crear y agregar boton de Borrar
            btBorrar= new JButton("[Borrar]");
            btBorrar.setBounds(190, 40, 100, 20);
            this.add(btBorrar);
            btBorrar.setActionCommand("borrar");
            //Crear y agregar boton de Salir
            btSalir= new JButton("[Salir]");
            btSalir.setBounds(335, 40, 100, 20);
            this.add(btSalir);
            btSalir.setActionCommand("salir");
            //Borde y tituo al panel
            TitledBorder borde = BorderFactory.createTitledBorder("Panel Operaciones") ;
            borde.setTitleColor(Color.WHITE);
            this.setBorder(borde);



    }
}


