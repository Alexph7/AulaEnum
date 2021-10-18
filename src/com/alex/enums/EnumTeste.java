package com.alex.enums;

import java.util.EnumSet;

public class EnumTeste {

        public static void main(String[] args) {
                System.out.println("Todos Os Livros");

                //imprime Todos Os Livros Da Classe Livro
                for (Livro livros : Livro.values()) {
                        System.out.printf("%-10s%-45s%s%n", livros, livros.getTitulo(),livros.getAnoDireitoAutorais());
                        
                        System.out.printf("%nMostra a Faixa do Enum:%n");
                }

                //Imprime os Primeiros 4 Livros
                
                for (Livro livros : EnumSet.range(Livro.CHTY, Livro.GCCF))
                        System.out.printf("%-10s%45s%s%n", livros, livros.getTitulo(), livros.getAnoDireitoAutorais());
        }
}
