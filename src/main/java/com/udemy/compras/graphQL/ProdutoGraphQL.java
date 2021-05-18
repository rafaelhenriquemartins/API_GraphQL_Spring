package com.udemy.compras.graphQL;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.udemy.compras.model.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProdutoGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

    @Autowired
    private ProdutoService service;

    public Produto cliente(Long id) {
        return service.findById(id);
    }

    public List<Produto> clientes(){
        return service.findAll();
    }

    public Produto saveCliente(ProdutoInput input){
//        Cliente c = new Cliente();
//        c.setId(input.getId());
//        c.setNome(input.getNome());
//        c.setEmail(input.getEmail());
        ModelMapper m = new ModelMapper();
        Produto c = m.map(input, Produto.class);

        return service.save(c);

    }

    public Boolean deleteProduto(Long id) {
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
