package com.example;

public class Main {
    public static void main(String[] args) {
        // Producto Alimenticio
        ProductoAlimenticio leche = new ProductoAlimenticio(
            "Leche Entera", 2500, "PROD-0001", 40, "Lácteos", true, "L123", 5
        );

        // Producto Electrónico
        ProductoElectronico laptop = new ProductoElectronico(
            "Laptop Lenovo", 2500000, "PROD-0002", 10, "Tecnología", 36, 0.8, true
        );

        System.out.println("----- PRODUCTO ALIMENTICIO -----");
        System.out.println("Nombre: " + leche.getNombre());
        System.out.println("Precio final: " + leche.calcularPrecioAlimenticio());
        System.out.println("Valor total inventario: " + leche.calcularValorInventario());

        System.out.println("\n----- PRODUCTO ELECTRÓNICO -----");
        System.out.println("Nombre: " + laptop.getNombre());
        System.out.println("Precio final: " + laptop.calcularPrecioElectronico());
        System.out.println("Valor total inventario: " + laptop.calcularValorInventario());
    }
}
