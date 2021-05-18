package com.udemy.compras.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;

    public Cliente findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Cliente> findAll(){
        return repository.findAll();
    }

    @Transactional
    public Cliente save(Cliente c){


        return repository.save(c);

    }

    @Transactional
    public Boolean deleteById(Long id) {
        if(repository.findById(id).isPresent()){
            repository.deleteById(id);
            return true;
        }
        return false;
    }


//    public List<Cliente> clientes(){
//        List<Cliente> listClientes = new ArrayList<>();
//
//        for (int i = 0; i <=10 ; i++) {
//            listClientes.add(new Cliente("Cliente"+i,"Cliente"+i+"@gmail"));
//        }
//        return listClientes;
//    }


}
