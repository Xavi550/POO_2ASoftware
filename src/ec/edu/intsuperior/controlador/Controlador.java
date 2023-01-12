/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.modelo.Cliente;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author xavi
 */
public class Controlador {
    
    public void menu(){
        Scanner leer = new Scanner (System.in);
        int op=0;
        Cliente c1 = new Cliente();
        
        do {  
            System.out.println("Bienvenidos al sistema de facturacion\n"
                + "Que deseas hacer........\n"
                + "1 - Mostrar Cliente\n"
                + "2 - Registrar Proveedor\n"
                + "3 - Registrar Producto\n"
                + "Salir"); 
            op = leer.nextInt();
            switch(op){
                case 1:
                    
                System.out.println("Ingrese la cedula");
                c1.setCedula(leer.next());
                break;
            case 2: 
                System.out.println("La cedula del Cliente" + c1.getCedula());
                
                break;
            case 3:
               
                break;
            case 4:
               
                break;
            case 5:
                
                break;
            case 6:
               
                break;
            case 7:
                
                break;
            case 12:
                JOptionPane.showMessageDialog(null,"Gracias por utilizar el servicio de facturacion");
                break;
        
        }
            
        } while (op != 12);
    
       
    }
    
}
