/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.measured.domain.entity;

/**
 *
 * @author William
 */
public class Measured {
    
    private Integer productId;
    private String name;
    private double largo;
    private double diametro;
    private String Referencia;
    private String estado;

    public Measured(Integer productId, String name, double largo, double diametro, String Referencia, String estado) {
        this.productId = productId;
        this.name = name;
        this.largo = largo;
        this.diametro = diametro;
        this.Referencia = Referencia;
        this.estado = estado;
    }

    public Measured() {
    }
    
    

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String Referencia) {
        this.Referencia = Referencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
