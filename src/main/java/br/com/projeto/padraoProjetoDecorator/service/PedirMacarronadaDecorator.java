package br.com.projeto.padraoProjetoDecorator.service;

import br.com.projeto.padraoProjetoDecorator.model.Cliente;
import br.com.projeto.padraoProjetoDecorator.model.Nota;
import br.com.projeto.padraoProjetoDecorator.model.Pedido;

public abstract class PedirMacarronadaDecorator implements PedirMacarronadaInterface {

    private final PedirMacarronadaInterface pedirMacarronadaDecorator;

    public PedirMacarronadaDecorator(PedirMacarronadaInterface pedirMacarronadaInterface) {
        this.pedirMacarronadaDecorator = pedirMacarronadaInterface;
    }

    @Override
    public Nota criarNota(Cliente cliente, Pedido pedido) {

        Nota nota = new Nota.NotaBuilder()
                        .comCliente(cliente.getCodigo(), cliente.getNome())
                        .comPedido(pedido.getCodigo(), pedido.getValor(), cliente)
                        .construir();
        
        return nota;

    }

    public PedirMacarronadaInterface getPedirMacarronadaDecorator() {
        return this.pedirMacarronadaDecorator;
    }
    
}
