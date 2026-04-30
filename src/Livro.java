public class Livro {
    private String titulo;
    private String autor;
    private int quantidadePaginas;
    private boolean disponivel;

    public Livro(String titulo, String autor, int quantidadePaginas, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;

        if (quantidadePaginas > 0) {
            this.quantidadePaginas = quantidadePaginas;
        }
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}