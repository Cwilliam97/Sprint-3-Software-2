/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.unicauca.measured.ports.out;

import co.unicauca.measured.domain.entity.Measured;
import java.util.List;

/**
 *
 * @author William
 */
public interface IMeasuredRepository {
    List<Measured> findAll();
    Measured findById(Integer Id);
    boolean create(Measured newProduct);
    boolean update(Measured newProduct);
    boolean delete(Integer id);
}
