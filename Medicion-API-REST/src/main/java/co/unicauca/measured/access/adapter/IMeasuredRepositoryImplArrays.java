/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.measured.access.adapter;

import co.unicauca.measured.ports.out.IMeasuredRepository;
import co.unicauca.measured.domain.entity.Measured;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.spi.Producer;

/**
 *
 * @author William
 */
@Default
public class IMeasuredRepositoryImplArrays implements IMeasuredRepository {

    public static List<Measured> products;

    public IMeasuredRepositoryImplArrays() {
        if (products == null) {
            products = new ArrayList<>();
            initialize();
        }
    }

    private void initialize() {
        products.add(new Measured(120, "Cerveza", 12, 7, "CC", "Defectuoso"));
        products.add(new Measured(121, "Gaseosa", 12, 7, "GA", "Defectuoso"));
    }

    @Override
    public List<Measured> findAll() {
        return products;
    }

    @Override
    public Measured findById(Integer id) {
        for (Measured prod : products) {
            if (prod.getProductId() == id) {
                return prod;
            }
        }
        return null;
    }

    @Override
    public boolean create(Measured newProduct) {
        Measured prod = this.findById(newProduct.getProductId());
        if (prod != null) {
            //Ya existe
            return false;
        }
        products.add(newProduct);
        return true;
    }

    @Override
    public boolean update(Measured product) {
        Measured prod = this.findById(product.getProductId());
        if (prod != null) {
            prod.setName(product.getName());
            prod.setLargo(product.getLargo());
            prod.setDiametro(prod.getDiametro());
            prod.setReferencia(product.getReferencia());
            prod.setEstado(product.getEstado());
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        int i = 0;
        for (Measured prod : products) {
            if (prod.getProductId() == id) {
                products.remove(i++);
                return true;
            }
        }
        return false;
    }

}
