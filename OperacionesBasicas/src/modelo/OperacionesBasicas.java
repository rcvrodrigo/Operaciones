
package modelo;

public class OperacionesBasicas {

    private int num1;
    private int num2;

    public OperacionesBasicas() {
    }
    
    public OperacionesBasicas(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
   
    public int Sumar() {
        if (this.num1 == 0 || this.num2 == 0)
        {
             return 0;
        }else 
          {
            return this.num1+this.num2;
          }
        }
    
    public int Restar() {
        if (this.num1 < this.num2)
        {
             return 0;
        }else 
          {
            return this.num1-this.num2;
          }
    }
    
    public int Multiplicar() {
        if (this.num2 == 0)
        {
             return 1;
        }else 
          {
            return this.num1*this.num2;
          }
    }
    
    public int Dividir() {
         if (this.num2 == 0)
        {
             return 0;
        }else 
          {
            return this.num1/this.num2;
          }        
    }
}
