package com.mycompany.cap4_ejepropuesto;
import java.util.Scanner;
public class Cap4_ejePropuesto {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        String nombre;
        int SalBasH,NumTraM,SalMen;
        
        System.out.println("DAME EL NOMBRE DEL EMPLEADO");
        nombre = entrada.nextLine();
        System.out.println("DAME EL SALARIO BASICO POR HORA");
        SalBasH = entrada.nextInt();
        System.out.println("DAME EL NUMERO DE HORAS TRABAJADAS EN EL MES");
        NumTraM = entrada.nextInt();
        
        SalMen = SalBasH * NumTraM;
        if (SalMen>450000){
            System.out.println(nombre + ": $" + SalMen);
        }else{
            System.out.println(nombre);
        }
        
    }
}
