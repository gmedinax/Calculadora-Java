/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracientifica;
import Model.Model;
import View.View;
import Controller.Controller;
import java.awt.Dimension;
/**
 *
 * @author giselle
 */
public class CalculadoraCientifica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        View Vista= new View();
        Model Modelo=new Model();
        Controller Controlador=new Controller(Vista,Modelo);
        Controlador.Iniciar();
        Vista.setSize(new Dimension (265,450));
        Vista.cCientific.setVisible(false);
        Vista.setVisible(true);
    }
    
}
