import java.util.Date;

public class Emprestimo {
    private Date dataRetirada;
    private Date dataDevolucao;
    private Livro livro;
    private Usuario usuario;

    public Emprestimo(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;

        if (!livro.isDisponivel()) {
            livro.validarDisponibilidade();
        } else {
            livro.setDisponivel(false);
            this.dataRetirada = new Date();
            this.dataDevolucao = new Date();
        }
    }

    public void exibirDetalhes() {
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome());
        System.out.println("Genero: " + livro.getGenero());
        System.out.println("Usuario: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de Retirada: " + dataRetirada);
        System.out.println("Data de Devolucao: " + dataDevolucao);
    }
}
