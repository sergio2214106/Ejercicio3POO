package Vista;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


public class PanelEntradaDatos extends JPanel
{
        //----------------------
        //-------Atributos------
        //----------------------
        private JLabel lX;
        private JLabel lImage;
        private JTextField tfX;
        private JTextField tfY;
        private ImageIcon iImage;


        //----------------------
        //---------Metodos------
        //----------------------   


        /*Método Constructor*/
        public PanelEntradaDatos() 
    
        {

        //Crear y agregar imagen

        iImage= new ImageIcon(getClass().getResource("mayor.png"));
        lImage= new JLabel (iImage);
        lImage.setBounds(5, 20, 100, 100);
        this.add(lImage);


        //Crear y agregar etiqueta X
        lX= new JLabel("X = ");
        lX.setBounds(170, 70, 40, 20);
        this.add(lX);
        //Crear y agregar Caja de texto X
        tfX= new JTextField();
        tfX.setBounds(200, 70, 120, 20);
        this.add(tfX);


        //definir contenedor del panel

        this.setLayout(null);
        this.setBackground(Color.GRAY);

        //Borde y tituo al panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de entrada") ;
        borde.setTitleColor(Color.WHITE);
        this.setBorder(borde);

        }

        //Métodos de acceso  a la informacion

        public String gettfX()
        {
            return tfX.getText();
        }
        public String getTfY()
        {
            return tfY.getText();
        }

        //Metodo Borrar cajas de texto

        public void borrar()
        {
            tfX.setText("");
        }


}
