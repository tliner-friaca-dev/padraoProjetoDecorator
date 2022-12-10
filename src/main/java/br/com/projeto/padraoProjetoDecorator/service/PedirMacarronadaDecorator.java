package br.com.projeto.padraoProjetoDecorator.service;

import br.com.projeto.padraoProjetoDecorator.model.Cliente;
import br.com.projeto.padraoProjetoDecorator.model.Nota;
import br.com.projeto.padraoProjetoDecorator.model.Pedido;

public abstract class PedirMacarronadaDecorator implements PedirMacarronadaInterface {

    private final PedirMacarronadaInterface pedirMacarronadaInterface;

    public PedirMacarronadaDecorator(PedirMacarronadaInterface pedirMacarronadaInterface) {
        this.pedirMacarronadaInterface = pedirMacarronadaInterface;
    }

    @Override
    public Nota criarNota(Cliente cliente, Pedido pedido) {

        Nota nota = pedirMacarronadaInterface.criarNota(cliente, pedido);
        
        return nota;

    }

    public PedirMacarronadaInterface getPedirMacarronadaDecorator() {
        return this.pedirMacarronadaInterface;
    }
    
}
