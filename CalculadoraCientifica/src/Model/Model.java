/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JOptionPane;

/**
 *
 * @author giselle
 */
public class Model {
     private double Resultado;
     private double Num1;
     private double Num2;
     private String Botoncito;
     private String Teclita;
     private String TeclitaAux;

    public Model() {
        this.Resultado=0.0;
        this.Num1=0.0;
        this.Num2=0.0;
        this.Botoncito="";
        this.Teclita="";
    }

    public Model(double Resultado, double Num1, double Num2, String Botoncito) {
        this.Resultado = Resultado;
        this.Num1 = Num1;
        this.Num2 = Num2;
    }
    
    public double getNum1() {
        return Num1;
    }

    public double getNum2() {
        return Num2;
    }

    public String getBotoncito() {
        return Botoncito;
    }

    public String getTeclita() {
        return Teclita;
    }

    public void setTeclita(String Teclita) {
        this.Teclita = Teclita;
    }

    public String getTeclitaAux() {
        return TeclitaAux;
    }

    public void setTeclitaAux(String Teclita2) {
        this.TeclitaAux = Teclita2;
    }
    
    
    
    public double getResultado(){
        return Resultado;
    }

    public void setResultado(double Resultado) {
        this.Resultado = Resultado;
    }

    public void setNum1(double Num1) {
        this.Num1 = Num1;
    }

    public void setNum2(double Num2) {
        this.Num2 = Num2;
    }

    public void setBotoncito(String Botoncito) {
        this.Botoncito = Botoncito;
    }
 
    public void Suma(){
        try{
            this.setResultado(this.getNum1()+this.getNum2()); 
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Verifique los números de entrada");
        }
        
    }
    
    public void Resta(){
        try{
            this.setResultado(this.getNum1()-this.getNum2()); 
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Verifique los números de entrada");
        }
    }
    
     public void Mult(){
        try{
            this.setResultado(this.getNum1()*this.getNum2()); 
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Verifique los números de entrada");
        } 
    }
     
     public void Div(){
         try{
            this.setResultado(this.getNum1()/this.getNum2()); 
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Verifique los números de entrada");
        }
    }
     
     public void Inverso(){
         this.setResultado(this.Num1*(-1));
     }
    
     public void RaizCuadrada(){
         this.setResultado(Math.sqrt(this.Num1));
     }
     
     public void log10(){
         this.setResultado(Math.log10(this.Num1));
     }
     
     public void log(){
         this.setResultado(Math.log(this.Num1));
     }
     
     public void PotenciaDos(){
         this.setResultado(Math.pow(this.Num1, 2));
     }
     
     public void PotenciaTres(){
         this.setResultado(Math.pow(this.Num1, 3));
     }
    
     public void Potencia(){
         this.setResultado(Math.pow(this.getNum1(), this.getNum2()));
     }
     
     public void sin(){
         this.setResultado(Math.sin(this.Num1));
     }
     
     public void cos(){
         this.setResultado(Math.cos(this.Num1));
     }
     
     public void tan(){
         this.setResultado(Math.tan(this.Num1));
     }
     
      public void sinh(){
          this.setResultado(Math.sinh(this.Num1));
     }
     
     public void cosh(){
         this.setResultado(Math.cosh(this.Num1));
     }
     
     public void tanh(){
         this.setResultado(Math.tanh(this.Num1));
     }
     
     public void Porcentaje(){
        this.setResultado(this.Num1*(0.1)); 
     }
}
