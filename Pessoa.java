public class Pessoa {
    private String nome;
    private Livro[] livros;

    public Pessoa(String nome) {
        this.nome = nome;
        this.livros = new Livro[10];
    }

    public String getNome() {
        return nome;
    }

    public Livro[] getLivros() {
        return livros;
    }
}
