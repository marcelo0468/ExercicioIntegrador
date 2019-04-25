package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastrarLivro extends Livraria{

    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.setTitulo("Titulo do livro 123");
        livro.setCodigo(123);
        livro.setQuantidadeEmEstoque(100);

        Livro livro1 = new Livro();
        livro1.setTitulo("Titulo livro 111");
        livro1.setCodigo(111);
        livro1.setQuantidadeEmEstoque(50);

        Livro livro2 = new Livro();
        livro2.setTitulo("Titulo livro 001");
        livro2.setCodigo(001);
        livro2.setQuantidadeEmEstoque(000);

        Livraria liv = new Livraria();
        liv.cadastra(livro);
        liv.cadastra(livro1);
        liv.cadastra(livro2);

        //////Consulta Livros

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código do livro a consultar: ");
        int codigo = scanner.nextInt();


        liv.consulta(codigo);


        ///Vender livros

        System.out.println("Digite o código do livro a vender: ");
        int codigo1 = scanner.nextInt();


        liv.venda(codigo1);
        scanner.close();


    }

}
