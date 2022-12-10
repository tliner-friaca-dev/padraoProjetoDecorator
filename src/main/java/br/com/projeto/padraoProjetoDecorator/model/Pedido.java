package br.com.projeto.padraoProjetoDecorator.model;

public class Pedido {

    private int codigo;
    private Double valor;
    private Cliente cliente;

    public Pedido(int codigo, Double valor, Cliente cliente) {
        this.codigo = codigo;
        this.valor = valor;
        this.cliente = cliente;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
