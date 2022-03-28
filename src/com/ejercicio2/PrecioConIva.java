package com.ejercicio2;

public class PrecioConIva {
    public static void main(String[] args) {
        double precioSinIva = 10000;
        System.out.println("El precio con IVA incluido es de: "+precioConIva(precioSinIva));
    }
    public static double precioConIva(double precioSinIva){
        return precioSinIva+(precioSinIva*0.19);
    }
}
