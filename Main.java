public class Main {
    public static void main(String[] args) {

        Autor autor = new Autor("Jessica Felix", "Brasileira");
        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia");
        Usuario usuario = new Usuario("Lucas Rafael", 25);

        // Primeiro empréstimo (ok)
        Emprestimo emp1 = new Emprestimo(livro, usuario);

        // Segundo empréstimo (vai mostrar "O livro não está disponível")
        Emprestimo emp2 = new Emprestimo(livro, usuario);

        // Exibir detalhes do primeiro empréstimo
        emp1.exibirDetalhes();
    }
}
