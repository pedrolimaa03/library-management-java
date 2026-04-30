public class Cliente extends Pessoa {
    private int codigoCliente;

    public Cliente(String nome, int idade, int codigoCliente) {
        super(nome, idade);
        this.codigoCliente = codigoCliente;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }
}