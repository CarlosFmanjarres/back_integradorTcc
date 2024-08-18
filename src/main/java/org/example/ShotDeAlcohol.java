package org.example;

public class ShotDeAlcohol extends Coctel {
    public enum Tipo { PREMIUM, BASE }

    private Tipo tipo;

    public ShotDeAlcohol(String nombre, double precioUnitario, Tipo tipo) {
        super(nombre, precioUnitario);
        this.tipo = tipo;
    }

    @Override
    public double calcularCostoVenta(int cantidad, int diasRestantes) {
        return cantidad * precioUnitario;
    }

    public Tipo getTipo() {
        return tipo;
    }
}
