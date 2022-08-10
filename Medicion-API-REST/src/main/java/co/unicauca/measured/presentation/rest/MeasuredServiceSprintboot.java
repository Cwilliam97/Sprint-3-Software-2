/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.measured.presentation.rest;

import co.unicauca.measured.domain.service.*;
import co.unicauca.measured.ports.in.MeasuredServiceInterface;
import co.unicauca.measured.domain.entity.Measured;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import co.unicauca.measured.ports.out.IMeasuredRepository;

/**
 *
 * @author William
 */
@RequestScoped
public class MeasuredServiceSprintboot implements MeasuredServiceInterface {

    /**
     * Inyecta una implementación del repositorio
     */
    @Inject
    @Default
    IMeasuredRepository repo;

    public MeasuredServiceSprintboot() {
    }

    @Override
    public List<Measured> findAll() {
        return repo.findAll();
    }

    @Override
    public Measured findById(int id) {
        return repo.findById(id);
    }

    @Override
    public boolean create(Measured prod) {
        return repo.create(prod);
    }

    @Override
    public boolean update(Measured prod) {
        return repo.update(prod);
    }

    @Override
    public boolean delete(int id) {
        return repo.delete(id);
    }

}
