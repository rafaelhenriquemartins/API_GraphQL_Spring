package com.udemy.compras.graphQL;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.udemy.compras.model.Cliente;
import com.udemy.compras.model.ClienteInput;
import com.udemy.compras.model.ClienteRepository;
import com.udemy.compras.model.ClienteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class ClienteGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

    @Autowired
    private ClienteService service;

    public Cliente cliente(Long id) {
        return service.findById(id);
    }

    public List<Cliente> clientes(){
        return service.findAll();
    }

    public Cliente saveCliente(ClienteInput input){
//        Cliente c = new Cliente();
//        c.setId(input.getId());
//        c.setNome(input.getNome());
//        c.setEmail(input.getEmail());
        ModelMapper m = new ModelMapper();
        Cliente c = m.map(input, Cliente.class);

        return service.save(c);

    }

    public Boolean deleteCliente(Long id) {
        return service.deleteById(id);

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
