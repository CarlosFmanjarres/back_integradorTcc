package org.example;

public class CoctelConJugo extends Coctel {
    private String diaEnQueSeVence;

    public CoctelConJugo(String nombre, double precioUnitario, String diaEnQueSeVence) {
        super(nombre, precioUnitario);
        this.diaEnQueSeVence = diaEnQueSeVence;
    }

    @Override
    public double calcularCostoVenta(int cantidad, int diasRestantes) {
        double costo = cantidad * precioUnitario;
        if (diasRestantes == 1) {
            return costo * 0.95;
        } else if (diasRestantes == 2) {
            return costo * 0.965;
        } else if (diasRestantes == 3) {
            return costo * 0.98;
        } else {
            return costo;
        }
    }

    public String getDiaEnQueSeVence() {
        return diaEnQueSeVence;
    }
}