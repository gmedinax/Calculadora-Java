/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Model;
import View.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

/**
 *
 * @author giselle
 */
public class Controller implements ActionListener, KeyListener {
    private View View;
    private Model Model;
    private String Pantallita="";

    public Controller(View View, Model Model) {
        this.View = View;
        this.Model = Model;
        this.View.btnNum0.addActionListener(this);
        this.View.btnNum1.addActionListener(this);
        this.View.btnNum2.addActionListener(this);
        this.View.btnNum3.addActionListener(this);
        this.View.btnNum4.addActionListener(this);
        this.View.btnNum5.addActionListener(this);
        this.View.btnNum6.addActionListener(this);
        this.View.btnNum7.addActionListener(this);
        this.View.btnNum8.addActionListener(this);
        this.View.btnNum9.addActionListener(this);
        this.View.btnPuntito.addActionListener(this);
        this.View.btnSuma.addActionListener(this);
        this.View.btnResta.addActionListener(this);
        this.View.btnMult.addActionListener(this);
        this.View.btnDiv.addActionListener(this);
        this.View.btnRes.addActionListener(this);
        this.View.btnInv.addActionListener(this);
        this.View.btnAC.addActionListener(this);
        this.View.btnPorc.addActionListener(this);
        this.View.btnPi.addActionListener(this);
        this.View.btnP2.addActionListener(this);
        this.View.btnP3.addActionListener(this);
        this.View.btnPY.addActionListener(this);
        this.View.btnR2.addActionListener(this);
        this.View.btnLog10.addActionListener(this);
        this.View.btnLog.addActionListener(this);
        this.View.btnCos.addActionListener(this);
        this.View.btnSin.addActionListener(this);
        this.View.btnTan.addActionListener(this);
        this.View.btnCosh.addActionListener(this);
        this.View.btnSinh.addActionListener(this);
        this.View.btnTanh.addActionListener(this);
        this.View.rdbtnON.addActionListener(this);
        this.View.rdbtnOFF.addActionListener(this);
        this.View.rdbtnB.addActionListener(this);
        this.View.rdbtnC.addActionListener(this);
        this.View.rdbtnT.addActionListener(this);
        this.View.btnGroupO.add(this.View.rdbtnON);
        this.View.btnGroupO.add(this.View.rdbtnOFF);
        this.View.btnGroupC.add(this.View.rdbtnB);
        this.View.btnGroupC.add(this.View.rdbtnC);
        this.View.btnGroupC.add(this.View.rdbtnT);
        this.View.CajitaTexto.addKeyListener(this);
        this.View.Etiquetita.addKeyListener(this);
        this.View.rdbtnT.addKeyListener(this);
    }
    
    public void Iniciar(){
       this.View.setTitle("Calculadora Básica");
       this.View.setLocationRelativeTo(null);
    }
    
    public void Activado(){
        this.View.rdbtnON.setEnabled(true);
        this.View.btnNum0.setEnabled(true);
        this.View.btnNum1.setEnabled(true);
        this.View.btnNum2.setEnabled(true);
        this.View.btnNum3.setEnabled(true);
        this.View.btnNum4.setEnabled(true);
        this.View.btnNum5.setEnabled(true);
        this.View.btnNum6.setEnabled(true);
        this.View.btnNum7.setEnabled(true);
        this.View.btnNum8.setEnabled(true);
        this.View.btnNum9.setEnabled(true);
        this.View.btnPuntito.setEnabled(true);
        this.View.btnSuma.setEnabled(true);
        this.View.btnResta.setEnabled(true);
        this.View.btnMult.setEnabled(true);
        this.View.btnDiv.setEnabled(true);
        this.View.btnRes.setEnabled(true);
        this.View.btnInv.setEnabled(true);
        this.View.btnAC.setEnabled(true);
        this.View.btnPorc.setEnabled(true);
        this.View.btnPi.setEnabled(true);
        this.View.btnP2.setEnabled(true);
        this.View.btnP3.setEnabled(true);
        this.View.btnPY.setEnabled(true);
        this.View.btnR2.setEnabled(true);
        this.View.btnLog10.setEnabled(true);
        this.View.btnLog.setEnabled(true);
        this.View.btnCos.setEnabled(true);
        this.View.btnSin.setEnabled(true);
        this.View.btnTan.setEnabled(true);
        this.View.btnCosh.setEnabled(true);
        this.View.btnSinh.setEnabled(true);
        this.View.btnTanh.setEnabled(true);
        this.View.rdbtnOFF.setEnabled(true);
        this.View.rdbtnB.setEnabled(true);
        this.View.rdbtnC.setEnabled(true);
        this.View.rdbtnT.setEnabled(true);
        this.View.cCientific.setEnabled(true);
    }
    
    public void Desactivado(){
        this.View.rdbtnON.setEnabled(true);
        this.View.btnNum0.setEnabled(false);
        this.View.btnNum1.setEnabled(false);
        this.View.btnNum2.setEnabled(false);
        this.View.btnNum3.setEnabled(false);
        this.View.btnNum4.setEnabled(false);
        this.View.btnNum5.setEnabled(false);
        this.View.btnNum6.setEnabled(false);
        this.View.btnNum7.setEnabled(false);
        this.View.btnNum8.setEnabled(false);
        this.View.btnNum9.setEnabled(false);
        this.View.btnPuntito.setEnabled(false);
        this.View.btnSuma.setEnabled(false);
        this.View.btnResta.setEnabled(false);
        this.View.btnMult.setEnabled(false);
        this.View.btnDiv.setEnabled(false);
        this.View.btnRes.setEnabled(false);
        this.View.btnInv.setEnabled(false);
        this.View.btnAC.setEnabled(false);
        this.View.btnPorc.setEnabled(false);
        this.View.btnPi.setEnabled(false);
        this.View.btnP2.setEnabled(false);
        this.View.btnP3.setEnabled(false);
        this.View.btnPY.setEnabled(false);
        this.View.btnR2.setEnabled(false);
        this.View.btnLog10.setEnabled(false);
        this.View.btnLog.setEnabled(false);
        this.View.btnCos.setEnabled(false);
        this.View.btnSin.setEnabled(false);
        this.View.btnTan.setEnabled(false);
        this.View.btnCosh.setEnabled(false);
        this.View.btnSinh.setEnabled(false);
        this.View.btnTanh.setEnabled(false);
        this.View.rdbtnOFF.setEnabled(false);
        this.View.rdbtnB.setEnabled(false);
        this.View.rdbtnC.setEnabled(false);
        this.View.rdbtnT.setEnabled(false);
        this.View.cCientific.setEnabled(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String botoncito=e.getActionCommand();
        try{
            switch (botoncito){
                case "0": 
                case "1": 
                case "2": 
                case "3": 
                case "4": 
                case "5": 
                case "6": 
                case "7": 
                case "8": 
                case "9": 
                case ".":
                    Pantallita+=botoncito;
                    this.View.CajitaTexto.setText(Pantallita);
                    break;
                case "+": case "-": case "*": case "/": case "^y":
                    this.Model.setNum1(Double.parseDouble(this.View.CajitaTexto.getText()));
                    this.Model.setBotoncito(botoncito);
                    this.Pantallita="";
                    this.View.CajitaTexto.setText(Pantallita);
                    break;
                case "AC":
                    this.Model.setNum1(0.0);
                    this.Model.setNum2(0.0);
                    this.Model.setResultado(0.0);
                    this.Model.setBotoncito("");
                    this.Pantallita="";
                    this.View.CajitaTexto.setText(Pantallita);
                    this.View.Etiquetita.setText(Pantallita);
                    break;
                case "+/-":
                    this.Model.setNum1(Double.parseDouble(this.View.CajitaTexto.getText()));
                    this.Model.Inverso();
                    this.View.CajitaTexto.setText(String.valueOf(this.Model.getResultado()));
                    break;
                
                case "ON":
                    Activado();
                    break;
                    
                case "OFF":
                    Desactivado();
                    break;
                    
                case "%":
                    this.Model.setNum1(Double.parseDouble(this.View.CajitaTexto.getText()));
                    this.Model.Porcentaje();
                    this.View.CajitaTexto.setText(String.valueOf(this.Model.getResultado()));
                    break;
                    
                case "R2":
                    this.Model.setNum1(Double.parseDouble(this.View.CajitaTexto.getText()));
                    this.Model.RaizCuadrada();
                    this.View.CajitaTexto.setText(String.valueOf(this.Model.getResultado()));
                    break;
                
                case "^2":
                    this.Model.setNum1(Double.parseDouble(this.View.CajitaTexto.getText()));
                    this.Model.PotenciaDos();
                    this.View.CajitaTexto.setText(String.valueOf(this.Model.getResultado()));
                    break;
                    
                case "^3":
                    this.Model.setNum1(Double.parseDouble(this.View.CajitaTexto.getText()));
                    this.Model.PotenciaTres();
                    this.View.CajitaTexto.setText(String.valueOf(this.Model.getResultado()));
                    break;
                    
                case "pi":
                    this.Model.setNum1(3.141592653589793);
                    this.View.CajitaTexto.setText(String.valueOf(this.Model.getNum1()));
                    break;
                    
                case "log10":
                    this.Model.setNum1(Double.parseDouble(this.View.CajitaTexto.getText()));
                    this.Model.log10();
                    this.View.CajitaTexto.setText(String.valueOf(this.Model.getResultado()));
                    break;
                    
                case "log":
                    this.Model.setNum1(Double.parseDouble(this.View.CajitaTexto.getText()));
                    this.Model.log();
                    this.View.CajitaTexto.setText(String.valueOf(this.Model.getResultado()));
                    break;
                    
                case "sin":
                    this.Model.setNum1(Double.parseDouble(this.View.CajitaTexto.getText()));
                    this.Model.sin();
                    this.View.CajitaTexto.setText(String.valueOf(this.Model.getResultado()));
                    break;
                    
                case "cos":
                    this.Model.setNum1(Double.parseDouble(this.View.CajitaTexto.getText()));
                    this.Model.cos();
                    this.View.CajitaTexto.setText(String.valueOf(this.Model.getResultado()));
                    break;
                
                case "tan":
                    this.Model.setNum1(Double.parseDouble(this.View.CajitaTexto.getText()));
                    this.Model.tan();
                    this.View.CajitaTexto.setText(String.valueOf(this.Model.getResultado()));
                    break;
                
                case "sinh":
                    this.Model.setNum1(Double.parseDouble(this.View.CajitaTexto.getText()));
                    this.Model.sinh();
                    this.View.CajitaTexto.setText(String.valueOf(this.Model.getResultado()));
                    break;
                
                case "cosh":
                    this.Model.setNum1(Double.parseDouble(this.View.CajitaTexto.getText()));
                    this.Model.cosh();
                    this.View.CajitaTexto.setText(String.valueOf(this.Model.getResultado()));
                    break;
                
                case "tanh":
                    this.Model.setNum1(Double.parseDouble(this.View.CajitaTexto.getText()));
                    this.Model.tanh();
                    this.View.CajitaTexto.setText(String.valueOf(this.Model.getResultado()));
                    break;
                    
                case "B":
                    this.View.setSize(265,450);
                    this.View.setTitle("Calculadora Básica");
                    this.View.cCientific.setVisible(false);
                    break;
                    
                case "C":
                    this.View.setSize(400, 450);
                    this.View.setTitle("Calculadora Científica");
                    this.View.cCientific.setVisible(true);
                    break;
                    
                case "T":
                    this.View.setSize(265,450);
                    this.View.setTitle("Calculadora Básica");
                    this.View.cCientific.setVisible(false);
                    break;
               
                case "=":
                    if("".equals(this.Model.getBotoncito())||!"".equals(this.View.CajitaTexto.getText())){
                        this.Model.setNum2(Double.parseDouble(this.View.CajitaTexto.getText()));
                        switch(this.Model.getBotoncito()){
                            case "+":
                                this.Model.Suma();
                                this.View.CajitaTexto.setText(String.valueOf(this.Model.getResultado()));
                                break;
                            case "-":
                                this.Model.Resta();
                                this.View.CajitaTexto.setText(String.valueOf(this.Model.getResultado()));
                                break;
                            case "*":
                                this.Model.Mult();
                                this.View.CajitaTexto.setText(String.valueOf(this.Model.getResultado()));
                                break;
                            case "/":
                                this.Model.Div();
                                this.View.CajitaTexto.setText(String.valueOf(this.Model.getResultado()));
                                break;
                            case "^y":
                                this.Model.Potencia();
                                this.View.CajitaTexto.setText(String.valueOf(this.Model.getResultado()));
                                break;
                            
                        }
                    }
                    else{
                        this.View.CajitaTexto.setText("0.0");
                    }
                    break;
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Opción inválida, favor de verificar");
        }
    }

    
    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public void keyPressed(KeyEvent key) {
      try{
          String teclita=String.valueOf(key.getKeyChar());
          String teclitaAux="";
          switch(teclita){
              case ".":
                  break;
                  
              case "0": case "1": case"2": case "3": case "4": case "5": case "6": case"7": case"8": case"9":
                  Pantallita+=teclita;
                  this.View.Etiquetita.setText(Pantallita);
                  break;
                  
              case "+": case "-": case "*": case "/": case "^":
                  this.Model.setNum1(Double.parseDouble(this.View.Etiquetita.getText()));
                  this.Model.setTeclita(teclita);
                  this.Model.setTeclitaAux(teclita);
                  this.Pantallita="";
                  this.View.CajitaTexto.setText(Pantallita);
                  this.View.Etiquetita.setText(teclita);
                  break;
                  
              case "!":
                  this.Model.setNum1(Double.parseDouble(this.View.Etiquetita.getText()));
                  this.Model.RaizCuadrada();
                  this.View.CajitaTexto.setText(String.valueOf(this.Model.getResultado()));
                  this.Pantallita="";
                  this.View.Etiquetita.setText(Pantallita);
                  break;
                  
              case"%":
                  this.Model.setNum1(Double.parseDouble(this.View.Etiquetita.getText()));
                  this.Model.Porcentaje();
                  this.View.CajitaTexto.setText(String.valueOf(this.Model.getResultado()));
                  this.Pantallita="";
                  this.View.Etiquetita.setText(Pantallita);
                  break;
                  
              case "?":
                  this.Model.setNum1(3.141592653589793);
                  this.View.Etiquetita.setText(String.valueOf(this.Model.getNum1()));
                  this.Pantallita="";
                  this.View.CajitaTexto.setText(Pantallita);
                  break;
                  
                      
                  
              case "\n":
                  if("".equals(this.Model.getTeclita())||!"".equals(this.View.Etiquetita.getText())){
                      this.Model.setNum2(Double.parseDouble(this.View.Etiquetita.getText()));
                      switch(this.Model.getTeclitaAux()){
                          case "+":
                              this.Model.Suma();
                                this.View.CajitaTexto.setText(String.valueOf(this.Model.getResultado()));
                                this.Pantallita="";
                                this.View.Etiquetita.setText(Pantallita);
                                break;
                            case "-":
                                this.Model.Resta();
                                this.View.CajitaTexto.setText(String.valueOf(this.Model.getResultado()));
                                this.Pantallita="";
                                this.View.Etiquetita.setText(Pantallita);
                                break;
                            case "*":
                                this.Model.Mult();
                                this.View.CajitaTexto.setText(String.valueOf(this.Model.getResultado()));
                                this.Pantallita="";
                                this.View.Etiquetita.setText(Pantallita);
                                break;
                            case "/":
                                this.Model.Div();
                                this.View.CajitaTexto.setText(String.valueOf(this.Model.getResultado()));
                                this.Pantallita="";
                                this.View.Etiquetita.setText(Pantallita);
                                break;
                            case "^":
                                this.Model.Potencia();
                                this.View.CajitaTexto.setText(String.valueOf(this.Model.getResultado()));
                                this.Pantallita="";
                                this.View.Etiquetita.setText(Pantallita);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null,"Opción inválida, favor de verificar");
                                break;
                        }
                    }
                    else{
                        this.View.CajitaTexto.setText("0.0");
                    }
                    break;
          }
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,"Opción inválida, favor de verificar");
      }
        
    } 
    
}
