package Vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
        //----------------------
        //-------Atributos------
        //----------------------

        public PanelEntradaDatos miPanelEntradaDatos;
        public PanelOperaciones miPanelOperaciones;
        public PanelResultados miPanelResultados;
        //----------------------
        //---------Metodos------
        //----------------------


        /*Método Constructor*/
        public VentanaPrincipal()
        {
            //Contenedor de la ventana
                this.setLayout(null);


            //Crear y agregar panel de entrada
            miPanelEntradaDatos = new PanelEntradaDatos();
            miPanelEntradaDatos.setBounds(5,5,480,150);
            this.add(miPanelEntradaDatos);
            
            //Crear y agregar panel de operaciones
            miPanelOperaciones = new PanelOperaciones();
            miPanelOperaciones.setBounds(5,160,480,100);
            this.add(miPanelOperaciones);

            //Crear y agregar panel de resultados
            miPanelResultados = new PanelResultados();
            miPanelResultados.setBounds(5,265,480,200);
            this.add(miPanelResultados);


            //CaracteristiCas de la ventana
            this.setTitle("Numero 3 digitos");
            this.setSize(500,500);
            //this.setLocation(100, 100);
            this.setLocationRelativeTo(null);
            this.setResizable(false);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setVisible(true);


        }
}