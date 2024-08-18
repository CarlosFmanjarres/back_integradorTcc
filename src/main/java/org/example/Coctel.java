package org.example;

import java.util.regex.Pattern;

public abstract class Coctel {
    protected String nombre;
    protected double precioUnitario;

    private static final Pattern nombrePattern = Pattern.compile("^[a-zA-Z ]+$");
    private static final Pattern precioPattern = Pattern.compile("^\\d+(\\.\\d+)?$");

    public Coctel(String nombre, double precioUnitario) {
        if (!isValidNombre(nombre)) {
            throw new IllegalArgumentException("Nombre inválido");
        }
        if (!isValidPrecio(precioUnitario)) {
            throw new IllegalArgumentException("Precio inválido");
        }
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
    }

    private boolean isValidNombre(String nombre) {
        return nombrePattern.matcher(nombre).matches();
    }

    private boolean isValidPrecio(double precio) {
        return precioPattern.matcher(String.valueOf(precio)).matches() && precio > 0;
    }

    public abstract double calcularCostoVenta(int cantidad, int diasRestantes);

    public String getNombre() {
        return nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }
}
