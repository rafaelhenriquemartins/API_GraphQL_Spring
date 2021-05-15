package com.udemy.compras.helloController;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.udemy.compras.entity.Cliente;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class QueryGraphQL implements GraphQLQueryResolver {

    public String hello() {
        return "Hello!!!";
    }

    public int soma(int a, int b) {
        return a + b;
    }

    public Cliente cliente() {
        return new Cliente("Rafael", "rafael@gmail.com");
    }

    public List<Cliente> clientes(){
        List<Cliente> listClientes = new ArrayList<>();

        for (int i = 0; i <=10 ; i++) {
            listClientes.add(new Cliente("Cliente"+i,"Cliente"+i+"@gmail"));
        }
        return listClientes;
    }


}
