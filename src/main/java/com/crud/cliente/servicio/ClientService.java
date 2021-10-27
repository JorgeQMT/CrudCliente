/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.cliente.servicio;

import com.crud.cliente.modelo.Client;
import com.crud.cliente.repositorio.ClientRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author SISTEMAS
 */
@Service
public class ClientService {
    
    @Autowired
    private ClientRepository clientRepository;
    
    public List<Client> getAll(){
        return clientRepository.getAll();
    }
    
    public Optional<Client> getClient(int id){
        return clientRepository.getClient(id);
    }
    
    public Client save(Client client){
        if(client.getId()== null){
            return clientRepository.save(client);
        }else { 
            Optional<Client> caux=clientRepository.getClient(client.getId());
            if (caux.isEmpty()) {
                return clientRepository.save(client);
            }else{
                return client;
            }
        }  
    }
    
    public Client update(Client client){
        if(client.getId()!= null){
            Optional<Client> claux=clientRepository.getClient(client.getId());
            if (!claux.isEmpty()) {
                if (client.getPrimerNombre()!= null) {
                    claux.get().setPrimerNombre(client.getPrimerNombre());   
                }
                if (client.getSegundoNombre()!= null) {
                    claux.get().setSegundoNombre(client.getSegundoNombre());   
                }
                if (client.getPrimerApellido()!= null) {
                    claux.get().setPrimerApellido(client.getPrimerApellido());   
                }
                if (client.getSegundoApellido()!= null) {
                    claux.get().setSegundoApellido(client.getSegundoApellido());   
                }
                if (client.getDocumentoTipo()!= null) {
                    claux.get().setDocumentoTipo(client.getDocumentoTipo());   
                }
                if (client.getDocumentoNumero()!= null) {
                    claux.get().setDocumentoNumero(client.getDocumentoNumero());   
                }
                if (client.getTelefono()!= null) {
                    claux.get().setTelefono(client.getTelefono());   
                }
                if (client.getDireccion()!= null) {
                    claux.get().setDireccion(client.getDireccion());   
                }
                if (client.getCorreo()!= null) {
                    claux.get().setCorreo(client.getCorreo());   
                }
                clientRepository.save(claux.get());
                return claux.get();
            }else{
                return client;
            }
        }else {
            return client;
        }
    }
    
    public boolean deleteClient(int id){
        Boolean aBoolean = getClient(id).map(client ->{
            clientRepository.delete(client);
            return true;
        }).orElse(false);
        return aBoolean;
    }
}
