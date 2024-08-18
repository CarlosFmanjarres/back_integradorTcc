package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            CoctelConJugo coctel1 = new CoctelConJugo("Mojito", 10.0, "2024-08-20");
            ShotDeAlcohol coctel2 = new ShotDeAlcohol("Whisky", 15.0, ShotDeAlcohol.Tipo.PREMIUM);

            System.out.println("Costo Mojito (3 días restantes, 5 unidades): $" + coctel1.calcularCostoVenta(5, 3));
            System.out.println("Costo Whisky (5 unidades): $" + coctel2.calcularCostoVenta(5, 0));

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
