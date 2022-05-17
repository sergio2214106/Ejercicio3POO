package Modelo;


public class Numero3Digitos 
{
        //----------------------
        //-------Atributos------
        //----------------------

        private int x;
        private int yDigitos;


        //----------------------
        //---------Metodos------
        //----------------------    

        /* Método Contructor*/
        public Numero3Digitos(int pX)
        {
            this.x= pX;
            this.yDigitos= 0;
        }

            public void setX(int x)
            {
                this.x= x;
            }
            public int getX()
            {
                return x;
            }
            public void setYDigitos(int y)
            {
                this.yDigitos= y;
            }
            public int getYDigitos()
            {
                return yDigitos;
            }


            public void hallarNumeroDigitos()
            {
                if(x>=0 && x<10)
                {
                    yDigitos= 1;
                }
                if(x>=10 && x<100)
                {
                    yDigitos=2;
                }
                if(x>=100 && x<1000)
                {
                    yDigitos=3;
                }
                if(x>=1000 ||  x<0)
                {
                    yDigitos=4;
                }
            }
        

}