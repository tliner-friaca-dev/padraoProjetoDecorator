package br.com.projeto.padraoProjetoDecorator.model;

public class Nota {

    private Cliente cliente;
    private Pedido pedido;

    public Nota() {
    }

    private Nota(Cliente cliente, Pedido pedido) {
        this.cliente = cliente;
        this.pedido = pedido;
    }

    public static class NotaBuilder {
        
        private Cliente cliente;
        private Pedido pedido;

        public NotaBuilder comCliente(int codigo, String nome) {
            Cliente cliente = new Cliente(codigo, nome);
            this.cliente = cliente;

            return this;
        }

        public NotaBuilder comPedido(int codigo, Double valor, Cliente cliente){
            Pedido pedido = new Pedido(codigo, valor, cliente);
            this.pedido = pedido;

            return this;
        }

        public Nota construir(){
            return new Nota(cliente, pedido);
        }

    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pedido getPedido() {
        return this.pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
}
