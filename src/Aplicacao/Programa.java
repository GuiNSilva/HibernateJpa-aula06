package Aplicacao;

import Dominio.Pessoa;

public class Programa {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(1,"Borges Bronhão","bonha@gmail.com");
        Pessoa p2 = new Pessoa(2,"Amanda Vara","manda@gmail.com");
        Pessoa p3 = new Pessoa(3,"Lucia Souza","lucia@gmail.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
