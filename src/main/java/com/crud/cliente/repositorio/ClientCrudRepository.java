/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.cliente.repositorio;

import com.crud.cliente.modelo.Client;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author SISTEMAS
 */
public interface ClientCrudRepository extends CrudRepository<Client, Integer>{
    
}
