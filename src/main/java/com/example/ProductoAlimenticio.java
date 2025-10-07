package com.example;

public class ProductoAlimenticio extends Producto {
    private boolean refrigerado;
    private String lote;
    private int diasParaVencer;

    public ProductoAlimenticio(String nombre, double precioBase, String codigo, int cantidadStock,
                               String categoria, boolean refrigerado, String lote, int diasParaVencer) {
        super(nombre, precioBase, codigo, cantidadStock, categoria);
        this.refrigerado = refrigerado;
        this.lote = lote;
        this.diasParaVencer = diasParaVencer;
    }

    public double calcularPrecioAlimenticio() {
        double precio = calcularPrecioFinal();

        if (refrigerado) {
            precio += getPrecioBase() * 0.08; 
        }

        double descuento = calcularDescuentoVencimiento();
        return precio * (1 - descuento);
    }

    public double calcularDescuentoVencimiento() {
        if (diasParaVencer <= 3) return 0.50;
        if (diasParaVencer <= 7) return 0.30;
        if (diasParaVencer <= 15) return 0.15;
        return 0.0;
    }

    public double calcularValorInventario() {
        return getPrecioBase() * getCantidadStock();
    }

    public boolean isRefrigerado() { return refrigerado; }
    public void setRefrigerado(boolean refrigerado) { this.refrigerado = refrigerado; }

    public String getLote() { return lote; }
    public void setLote(String lote) { this.lote = lote; }

    public int getDiasParaVencer() { return diasParaVencer; }
    public void setDiasParaVencer(int diasParaVencer) { this.diasParaVencer = diasParaVencer; }
}
