package org.example;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    private List<Pessoa> lista;

    public Lista(){
        lista = new ArrayList<>();

    };



    public void add (Pessoa pessoa) {
        lista.add(pessoa);

    }

    public List<Pessoa> getList() {
        return lista;
    }


}
