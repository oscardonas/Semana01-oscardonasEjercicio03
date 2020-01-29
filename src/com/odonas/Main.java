package com.odonas;

import javax.swing.text.rtf.RTFEditorKit;
import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.print("Ingrese la cadena de caracteres a transformar: ");
        Scanner entrada = new Scanner(System.in);
        String cadena = entrada.nextLine();

        System.out.println(" ");
        System.out.println("La cadena de caracteres original es     : " + cadena);
        System.out.println("La cadena de caracteres en minúsculas es: " + cadena.toLowerCase());
        System.out.println("La cadena de caracteres en mayúsculas es: " + cadena.toUpperCase());
        System.out.println("El segundo caracter de la cadena es     : " + cadena.substring(1,2));

    }
}
