/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.unicauca.measured.ports.in;

import co.unicauca.measured.domain.entity.Measured;
import java.util.List;

/**
 *
 * @author juanc
 */
public interface MeasuredServiceInterface {

    boolean create(Measured prod);

    boolean delete(int id);

    List<Measured> findAll();

    Measured findById(int id);

    boolean update(Measured prod);
    
}
