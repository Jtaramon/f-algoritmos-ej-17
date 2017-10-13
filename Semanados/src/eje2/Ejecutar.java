/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje2;

import java.util.Scanner;

/**
 *
 * @author Juan Ramón
 */
public class Ejecutar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Computadora c = new Computadora();

        System.out.println(c.obtener_velopro());

        c.establecer_velopro(4.2);

        System.out.println(c.obtener_velopro());
    }

}
