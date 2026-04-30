public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Central Books");

        Cliente cliente1 = new Cliente("Pedro", 22, 01);
        Cliente cliente2 = new Cliente("Sophia", 19, 02);

        Livro livro1 = new Livro("Clean Code", "Robert Martin", 464, true);
        Livro livro2 = new Livro("Java Efetivo", "Joshua Bloch", 419, true);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        biblioteca.cadastrarCliente(cliente1);
        biblioteca.cadastrarCliente(cliente2);

        System.out.println("=== LISTA INICIAL ===");
        biblioteca.listarLivros();

        System.out.println("\n=== CLIENTES ===");
        biblioteca.listarClientes();

        System.out.println("\n=== EMPRÉSTIMO ===");
        biblioteca.emprestarLivro(livro2);

        System.out.println("\n=== LISTA APÓS EMPRÉSTIMO ===");
        biblioteca.listarLivros();

        System.out.println("\n=== TENTANDO EMPRESTAR NOVAMENTE ===");
        biblioteca.emprestarLivro(livro2);
    }
}