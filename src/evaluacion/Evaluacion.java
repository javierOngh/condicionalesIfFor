/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion;
import static com.sun.corba.se.impl.orbutil.CorbaResourceUtil.getText;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.awt.AWTEvent;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.lang.Integer;
import java.lang.String;
import java.util.Scanner;

/**
 *
 * @author APRENDIZ
 */
public class Evaluacion {
    
    
    
    
    
    public class nombre extends Evaluacion{
    
    }
     /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int edad;
        
        int salario;
        boolean si=true;
        boolean no=false;
        String distancia;
        String curso;
        String menor;
        int hijos;
        int edadhijos=0;
        int hijo = 0;
        int hmenor = 0;
        
        
     String nombre = JOptionPane.showInputDialog(null, " Ingrese su nombre ");
     edad = Integer.parseInt(JOptionPane.showInputDialog(" Usuario "+nombre+ " ingrese su edad"));
     salario = Integer.parseInt(JOptionPane.showInputDialog(" Usuario "+nombre+ " ingrese su salario"));
     distancia = JOptionPane.showInputDialog(" Usuario "+nombre+ "¿Vive Ud a mas de 50 Km?");
     hijos = Integer.parseInt(JOptionPane.showInputDialog(" Usuario "+nombre+ " ¿Cuantos hijos tiene? "+""));
     
     if(hijos>0){
         
         hijo =hijos;
         for (int i=1; i<=hijo; i++){
         edadhijos = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese la edad del hijo No "+i+ " edad "+""));
         
         if (edadhijos<20){
             hmenor= edadhijos;
         }
     }
     }
      if ((edad<50) && (salario>100000) && (hijos>3) ){
             JOptionPane.showMessageDialog(null, " Bienvenido a la U. El estudiante "+nombre+" tiene Beca!");
      }
      if ((edad<50) && (salario<100000) && (si==true) ){
             JOptionPane.showMessageDialog(null," Bienvenido a la U. El estudiante "+nombre+ " tiene Beca!");
         }
        if ((edad>50) && (hijos>=3)){ 
             curso = JOptionPane.showInputDialog(" Usuario "+nombre+ "¿Su(s) Hij(@)s estan en menor grado que 6°?");
             if(si==true){
               JOptionPane.showMessageDialog(null," Bienvenido a la U. El estudiante "+nombre+ " tiene Beca!");  
             }
                     }
        if ((edad>50) &&(hmenor<20)&&(hijos>2)) {                
                JOptionPane.showMessageDialog(null," Bienvenido a la U. El estudiante "+nombre+ " tiene Media Beca!");
                }           
                 }
        }
        // TODO code application logic here
    
    

