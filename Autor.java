public class Autor extends Pessoa {
    private String nacionalidade;

    public Autor(String nome, String nacionalidade) {
        super(nome);
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
}
