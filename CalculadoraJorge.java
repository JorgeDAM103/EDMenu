/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorajorge;

import java.util.Scanner;

/**
 *
 * @author DAM103
 */
public class CalculadoraJorge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Has elegido la opción de Calculadora");
        int opc, aux, res ,num;
        do{
            System.out.println("*********Calculadora*********");
            System.out.println("1. Suma  2.Resta  3.Multiplicación    4. Division    5.Salir");
            opc=sc.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Suma");
                    System.out.println("Indica el numero con el que quieres calcular");
                    num=sc.nextInt();
                    System.out.println("¿Que numero quieres sumarle?");
                    aux=sc.nextInt();
                    res=num+aux;
                    System.out.println("Resultado:"+num+"+"+aux+"="+res);
                    break;
                case 2:
                    System.out.println("Resta");
                    System.out.println("Indica el numero con el que quieres calcular");
                    num=sc.nextInt();
                    System.out.println("¿Que numero quieres restarle?");
                    aux=sc.nextInt();
                    res=num-aux;
                    System.out.println("Resultado:"+num+"-"+aux+"="+res);
                    break;
                case 3:
                    System.out.println("Multiplicación");
                    System.out.println("Indica el numero con el que quieres calcular");
                    num=sc.nextInt();
                    System.out.println("¿Que numero quieres multiplicarle?");
                    aux=sc.nextInt();
                    res=num*aux;
                    System.out.println("Resultado:"+num+"*"+aux+"="+res);
                    break;
                case 4:
                    System.out.println("División");
                    System.out.println("Indica el numero con el que quieres calcular");
                    num=sc.nextInt();
                    System.out.println("¿Qué numero quieres dividirle?");
                    aux=sc.nextInt();
                    res=num/aux;
                    System.out.println("Resultado:"+num+"/"+aux+"="+res);
                    break;
            }
        }while(opc!=5);
        System.out.println("Bye!");
    }
    
}
