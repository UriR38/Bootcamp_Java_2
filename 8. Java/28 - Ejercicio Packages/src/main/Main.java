// src/main/Main.java
package main;

import saludos.HolaMundo;

public class Main {
    public static void main(String[] args) {

        HolaMundo hola = new HolaMundo();
        System.out.println(hola.saludar());

        saludos.HastaNunqui hasta = new saludos.HastaNunqui();
        System.out.println(hasta.patada());
    }
}
