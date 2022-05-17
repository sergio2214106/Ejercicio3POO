package Controlador;

import java.awt.event.ActionListener;

import Modelo.Numero3Digitos;
import Vista.VentanaPrincipal;

import java.awt.event.ActionEvent;

public class Controlador implements ActionListener
{
        
    
        //----------------------
        //-------Atributos------
        //----------------------

        private VentanaPrincipal vista;
        private Numero3Digitos modelo;

        //----------------------
        //---------Metodos------
        //---------------------- 
        
        /*Metodo Constructor*/
        public Controlador(VentanaPrincipal pvista, Numero3Digitos pmodelo)
        {
            this.vista = pvista;
            this.modelo= pmodelo;
            this.vista.miPanelOperaciones.btHallar.addActionListener(this);
            this.vista.miPanelOperaciones.btBorrar.addActionListener(this);
            this.vista.miPanelOperaciones.btSalir.addActionListener(this);
        }
        
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            // Identificar el comando generado [hallar, borrar, salir]

            String comando = ae.getActionCommand();


            if(comando.equals("salir"))
            {
                System.exit(0);
            }
            if(comando.equals("borrar"))
            {
                this.vista.miPanelEntradaDatos.borrar();
                this.vista.miPanelResultados.borrar();
            }
            if(comando.equals("hallar"))
            {
                modelo.setX(Integer.parseInt(vista.miPanelEntradaDatos.gettfX()));
                modelo.hallarNumeroDigitos();
                vista.miPanelResultados.mostrarResultado(modelo.getYDigitos());
                if (modelo.getYDigitos()<1 ||modelo.getYDigitos()>3)
                {
                    this.vista.miPanelResultados.error();
                }
            }
        }
    
}
