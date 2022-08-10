/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.measured.presentation.rest;

import co.unicauca.measured.domain.entity.Measured;
import co.unicauca.measured.domain.service.MeasuredService;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author William
 */
@Stateless
@Path("measured")
public class MeasuredController {

    /**
     * Se inyecta la única implementación que hay de MeasuredService
     */
    @Inject
    private MeasuredService service;

    public MeasuredController() {
    }
    
          /*
 Su uso desde consola mediante client url:
 curl -X GET http://localhost:8080/Medicion-API-REST/measured-services/measured/
     */
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Measured> findAll() {
        return service.findAll();
    }
    
        /*
 Su uso desde consola mediante client url:
 curl -X GET http://localhost:8080/Medicion-API-REST/measured-services/measured/1
     */
    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Measured findById(@PathParam("id") int id) {
        return service.findById(id);
    }
    
 /*
    Su uso desde consola mediante client url:
    curl -X POST http://localhost:8080/Medicion-API-REST/measured-services/measured/
        -H 'Content-Type: application/json' \
        -d '{
                "productId":3,
                "name":"Cerveza",
                "largo":13,
                "diametro": 7,
                "referencia": "CC",
                "estado": "defectuoso"
        }'
    */
    
    @POST
     @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
     public String create(Measured prod) {
         if (service.create(prod)) {
             return "{\"ok\":\"true\", \"mensaje\":\"Medicion creada correctamente\",\"errores\":\"\"}";
         } else {
             return "{\"ok\":\"false\", \"mensaje\":\"No se pudo crear la medicion\",\"errores\":\"Id ya existe\"}";
         }
     }
    
}
