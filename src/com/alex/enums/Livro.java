package com.alex.enums;

public enum Livro {
        //Declara Constantes do Tipo Enum
        JHTU("Java Como Programar ", "2018"), //OBS: Aqui Tem 2 Strings isso Depende Do que o Construtor pede.
        CHTY("Como Programar C ", "2019"),
        GCCF("Banco de Dados ", "2020"),
        VCCF("Git Version", "2020"),
        HGTT("C++ Como Programar ", "2021"),
        HHII("Visual Basic Como Programar ", "2015"),
        VSCC("Visual C# Como Programar ", "2017");

        //Campos de instância
        private final String titulo;
        private final String anoDireitoAutorais;

        //Construtor Enum
        Livro(String titulo, String anoDireitoAutorais) {
                this.titulo = titulo;
                this.anoDireitoAutorais = anoDireitoAutorais;
        }

        public String getTitulo() {
                return titulo;
        }

        public String getAnoDireitoAutorais() {
                return anoDireitoAutorais;
        }

}