/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

public class Rectangulo extends FiguraGeometrica {
    private double ladoAncho; 
    private double ladoLongitud; 

    public Rectangulo(String nombre, String color, double ladoAncho, double ladoLongitud) {
        super(nombre, color); 
        this.ladoAncho = ladoAncho;
        this.ladoLongitud = ladoLongitud;
    }

    @Override
    public double obtenerArea() {
        return ladoAncho * ladoLongitud; 
    }

    // Complejidad: O(1)
    @Override
    public double obtenerPerimetro() {
        return 2 * (ladoAncho + ladoLongitud);
    }

    public double getLadoAncho() {
        return ladoAncho;
    }

    // Complejidad: O(1)
    public void setLadoAncho(double ladoAncho) {
        this.ladoAncho = ladoAncho;
    }

    // Complejidad: O(1)
    public double getLadoLongitud() {
        return ladoLongitud;
    }

    // Complejidad: O(1)
    public void setLadoLongitud(double ladoLongitud) {
        this.ladoLongitud = ladoLongitud;
    }
}