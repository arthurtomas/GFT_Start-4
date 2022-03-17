package exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Livro> livros = new ArrayList<Livro>(){{
            add(new Livro("A Cabana",100,0));
            add(new Livro("Naruto",110,0));
            add(new Livro("O Senhor dos Aneis",120,0));
            add(new Livro("Futuro",150,0));
        }};

        Livro livroFavorito = new Livro("Futuro",150,0);

        livros.add(livroFavorito);

        System.out.println(livros);

        Leitor leitor = new Leitor("Arthur",livroFavorito, livros);

        Livro livroF = new Livro("Java Master",2010,0);

        System.out.println(livroFavorito.verificarProgresso());

        leitor.adicionarLivro(livroF);

        System.out.println(leitor.getEstanteLivros());

    }
}