package com.udemy.compras.graphQL;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;


@Component
public class QueryGraphQL implements GraphQLQueryResolver {

    public String hello() {
        return "Hello!!!";
    }

    public int soma(int a, int b) {
        return a + b;
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
