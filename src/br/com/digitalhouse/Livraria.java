package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Livraria {

    List<Livro> listaLivros = new ArrayList<>();


    public void cadastra(Livro livro) {

        listaLivros.add(livro);
        System.out.println(livro.getCodigo() + "  Titulo: " +livro.getTitulo()+ " Estoque: " + livro.getQuantidadeEmEstoque());

    }

    public void consulta(int codigo) {

        breakloop:
        for (Livro listaLivro : listaLivros) {
            if (listaLivro.getCodigo() == codigo) {
                System.out.println("Titulo: " +listaLivro.getTitulo()+ " Estoque: " + listaLivro.getQuantidadeEmEstoque());
                break breakloop;} else {
                System.out.println("Livro não encontrado");
            }
        }


    }

    public void venda(int codigo1) {
        breakloop:
        for (Livro listaLivro : listaLivros) {
            if (listaLivro.getCodigo() == codigo1 && listaLivro.getQuantidadeEmEstoque() >= 1)   {

                Livro livro1 = new Livro();
                livro1.setTitulo(listaLivro.getTitulo());
                livro1.setCodigo(listaLivro.getCodigo());
                livro1.setQuantidadeEmEstoque(listaLivro.getQuantidadeEmEstoque()-1);
                System.out.println("Venda efetuada do livro: ");
                cadastra(livro1);
                listaLivros.remove(listaLivro);

                break breakloop;} else if (listaLivro.getQuantidadeEmEstoque()<1){
                System.out.println("Estoque insuficiente");} else {
                System.out.println("Livro não encontrado");
            }
        }



    }
}

