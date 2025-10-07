package com.example;

public class ProductoElectronico extends Producto {
    private int garantiaMeses;
    private double consumoEnergia; 
    private boolean importado;

    public ProductoElectronico(String nombre, double precioBase, String codigo, int cantidadStock,
                               String categoria, int garantiaMeses, double consumoEnergia, boolean importado) {
        super(nombre, precioBase, codigo, cantidadStock, categoria);
        this.garantiaMeses = garantiaMeses;
        this.consumoEnergia = consumoEnergia;
        this.importado = importado;
    }

    public double calcularPrecioElectronico() {
        double precio = calcularPrecioFinal();

        if (importado) {
            precio += getPrecioBase() * 0.10;
        }

        if (garantiaMeses > 24) {
            precio += getPrecioBase() * 0.05;
        }

        return precio;
    }

    public double calcularValorInventario() {
        return getPrecioBase() * getCantidadStock();
    }

    // Getters y Setters
    public int getGarantiaMeses() { return garantiaMeses; }
    public void setGarantiaMeses(int garantiaMeses) { this.garantiaMeses = garantiaMeses; }

    public double getConsumoEnergia() { return consumoEnergia; }
    public void setConsumoEnergia(double consumoEnergia) { this.consumoEnergia = consumoEnergia; }

    public boolean isImportado() { return importado; }
    public void setImportado(boolean importado) { this.importado = importado; }
}
