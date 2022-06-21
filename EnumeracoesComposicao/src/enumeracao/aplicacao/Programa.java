package enumeracao.aplicacao;

import java.util.Date;

import enumeracao.entidades.Pedido;
import enumeracao.entidades.enums.PedidoStatus;

public class Programa {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido(1080, new Date(), PedidoStatus.AGUARDANDO_PAGAMENTO);
		
		System.out.println(pedido);
		
		PedidoStatus ps1 = PedidoStatus.ENTREGUE;
		
		PedidoStatus ps2 = PedidoStatus.valueOf("ENTREGUE");
		
		System.out.println(ps1);
		System.out.println(ps2);
	}

}
