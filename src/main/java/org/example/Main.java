package org.example;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Lista lista = new Lista();
        Scanner scanner = new Scanner(System.in);


        while (true){
            System.out.println("Digite o nome: (Para sair aperte ENTER)" );
            String nome = scanner.nextLine();
            if (nome.isEmpty()){
                break;
            }
            System.out.println("Digite M - para masculino, ou F - para feminino ");
            String sexo = scanner.nextLine().toUpperCase();
            while (!(sexo.equals("M") || sexo.equals("F"))){
                System.out.println("Valor invalido. Digite M - para masculino, ou F - para feminino ");
               sexo = scanner.nextLine().toUpperCase();

            }
            Pessoa pessoa = new Pessoa(nome, sexo);
            lista.add(pessoa);
        }

        List<Pessoa> listaFeminina = lista.getList().stream()
                .filter(pessoa -> pessoa.getSexo().equals("F"))
                .collect(Collectors.toList());

        if (listaFeminina.isEmpty()){
            System.out.println("Não existem mulheres na lista");
        }
        else {
            System.out.println("Lista feminina: ");
            listaFeminina.forEach(System.out::println);
        }










    }
}