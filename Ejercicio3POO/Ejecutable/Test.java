package Ejecutable;

import Controlador.Controlador;
import Modelo.Numero3Digitos;
import Vista.VentanaPrincipal;

public class Test 
{

    public static void main(String[] args)
    
    {
        VentanaPrincipal miVentana= new VentanaPrincipal();
        Numero3Digitos miModelo= new Numero3Digitos(0);
        Controlador miControlador = new Controlador(miVentana, miModelo);
    }
    
}
