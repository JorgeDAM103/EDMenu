/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.menu.principal;

import java.util.Scanner;

/**
 *
 * @author DAM111
 */
public class EDMenuPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce una opcion");
        System.out.println("1.- CALCULADORA 2.- JUEGO BOTELLA 3.- PAR IMPAR 4.- 5.- SALIR");
        int opcionmenuprincipal=teclado.nextInt();
        
        do{
            switch(opcionmenuprincipal){
                case 1: //CALCULADORA (JORGE)
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
                    break;
                case 2: //JUEGO RELLENAR BOTELLA (ROMAN)
                    break;
                case 3: //JUEGO PAR O IMPAR (EDU)
                    break;
                case 4: // (ALEX)
                    break;
                    
                    
                case 5: //SALIR
                    break;
        
    }
             System.out.println("Introduce una opcion");
             System.out.println("1.- CALCULADORA 2.- JUEGO BOTELLA 3.- PAR IMPAR 4.- 5.- SALIR");
             opcionmenuprincipal=teclado.nextInt();
        }while(opcionmenuprincipal!=5);

    }
    
}
