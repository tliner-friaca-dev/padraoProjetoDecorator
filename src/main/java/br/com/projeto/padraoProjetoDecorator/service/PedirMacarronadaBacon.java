package br.com.projeto.padraoProjetoDecorator.service;

import br.com.projeto.padraoProjetoDecorator.model.Cliente;
import br.com.projeto.padraoProjetoDecorator.model.Nota;
import br.com.projeto.padraoProjetoDecorator.model.Pedido;

public class PedirMacarronadaBacon extends PedirMacarronadaDecorator {

    private static final double TAXA_ACRESCIMO = 2D;

    public PedirMacarronadaBacon(PedirMacarronadaInterface pedirMacarronadaInterface) {
        super(pedirMacarronadaInterface);
    }

    @Override
    public Nota criarNota(Cliente cliente, Pedido pedido) {

        pedido.setValor(pedido.getValor() + TAXA_ACRESCIMO);

        return super.criarNota(cliente, pedido);
    }
    
}
