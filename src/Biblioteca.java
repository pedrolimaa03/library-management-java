import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private ArrayList<Livro> livros;
    private ArrayList<Cliente> clientes;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
        this.livros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void removerLivro(Livro livro) {
        livros.remove(livro);
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void listarLivros() {

        System.out.println("Biblioteca: " + nome);

        for (Livro livro : livros) {
            System.out.println("\n=== LIVRO ===");
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Páginas: " + livro.getQuantidadePaginas());
            System.out.println("Disponível: " + livro.getDisponivel());
        }
    }

    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println("\n=== CLIENTE ===");
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Idade: " + cliente.getIdade());
            System.out.println("Código: " + cliente.getCodigoCliente());
        }
    }

    public void emprestarLivro(Livro livro) {
        if (livro.getDisponivel()) {
            livro.setDisponivel(false);
            System.out.println("Livro emprestado com sucesso");
        } else {
            System.out.println("Livro indisponível");
        }
    }
}