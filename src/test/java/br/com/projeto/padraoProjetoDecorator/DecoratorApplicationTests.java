package br.com.projeto.padraoProjetoDecorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.projeto.padraoProjetoDecorator.model.Cliente;
import br.com.projeto.padraoProjetoDecorator.model.Nota;
import br.com.projeto.padraoProjetoDecorator.model.Pedido;
import br.com.projeto.padraoProjetoDecorator.service.PedirMacarronada;
import br.com.projeto.padraoProjetoDecorator.service.PedirMacarronadaBacon;
import br.com.projeto.padraoProjetoDecorator.service.PedirMacarronadaBolonhesa;
import br.com.projeto.padraoProjetoDecorator.service.PedirMacarronadaInterface;
import br.com.projeto.padraoProjetoDecorator.service.PedirMacarronadaQueijo;

@SpringBootTest
class DecoratorApplicationTests {

	private static final double VALOR_ESPERADO_MACARRONADA_BOLONHESA_BACON = 22d;
	private static final double VALOR_ESPERADO_MACARRONADA_QUEIJO = 15d;
	private static final double VALOR_ESPERADO_MACARRONADA_BACON = 12d;
	private static final double VALOR_ESPERADO_MACARRONADA_BOLONHESA = 20d;
	private static final double VALOR_ESPERADO_MACARRONADA = 10d;
	private static final double VALOR_MACARRONADA = 10d;
	
	// Testes com de 2 combinações

	@Test
	void calcularValorDaMacarronada_quandoSucesso() {

		Cliente cliente = new Cliente(1, "Ronaldo");
		Pedido pedido = new Pedido(1, VALOR_MACARRONADA, cliente);

		PedirMacarronadaInterface pedirMacarronadaInterface = new PedirMacarronada();
		Nota nota = pedirMacarronadaInterface.criarNota(cliente, pedido);

		assertEquals(VALOR_ESPERADO_MACARRONADA, nota.getPedido().getValor());

	}
	
	@Test
	void calcularValorDaMacarronadaBolonhesa_quandoSucesso() {

		Cliente cliente = new Cliente(2, "Giovana");
		Pedido pedido = new Pedido(2, VALOR_MACARRONADA, cliente);

		PedirMacarronadaInterface pedirMacarronadaInterface = new PedirMacarronadaBolonhesa(new PedirMacarronada());
		Nota nota = pedirMacarronadaInterface.criarNota(cliente, pedido);

		assertEquals(VALOR_ESPERADO_MACARRONADA_BOLONHESA, nota.getPedido().getValor());

	}
		
	@Test
	void calcularValorDaMacarronadaBacon_quandoSucesso() {

		Cliente cliente = new Cliente(3, "Gustavo");
		Pedido pedido = new Pedido(3, VALOR_MACARRONADA, cliente);

		PedirMacarronadaInterface pedirMacarronadaInterface = new PedirMacarronadaBacon(new PedirMacarronada());
		Nota nota = pedirMacarronadaInterface.criarNota(cliente, pedido);

		assertEquals(VALOR_ESPERADO_MACARRONADA_BACON, nota.getPedido().getValor());

	}
		
	@Test
	void calcularValorDaMacarronadaQueijo_quandoSucesso() {

		Cliente cliente = new Cliente(4, "Mikaela");
		Pedido pedido = new Pedido(4, VALOR_MACARRONADA, cliente);

		PedirMacarronadaInterface pedirMacarronadaInterface = new PedirMacarronadaQueijo(new PedirMacarronada());
		Nota nota = pedirMacarronadaInterface.criarNota(cliente, pedido);

		assertEquals(VALOR_ESPERADO_MACARRONADA_QUEIJO, nota.getPedido().getValor());

	}

	// Testes com 3 combinações
		
	@Test
	void calcularValorDaMacarronadaBolonhesaBacon_quandoSucesso() {

		Cliente cliente = new Cliente(5, "Renata");
		Pedido pedido = new Pedido(5, VALOR_MACARRONADA, cliente);

		PedirMacarronadaInterface pedirMacarronadaInterface = new PedirMacarronadaBacon(new PedirMacarronadaBolonhesa(new PedirMacarronada()));
		Nota nota = pedirMacarronadaInterface.criarNota(cliente, pedido);

		assertEquals(VALOR_ESPERADO_MACARRONADA_BOLONHESA_BACON, nota.getPedido().getValor());

	}


}
