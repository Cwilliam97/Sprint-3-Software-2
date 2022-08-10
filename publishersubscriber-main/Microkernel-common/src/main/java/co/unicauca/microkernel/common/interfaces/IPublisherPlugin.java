/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.microkernel.common.interfaces;

import java.util.Properties;

/**
 *
 * @author ahurtado, wpantoja
 */
public interface IPublisherPlugin {
    
    /**
     *
     * @param msg
     * Mensaje a ser publicado a través de un servicio de mensajería
     */
    public void publish(String msg);
    public void setProperties(Properties publisherProperties);
}
