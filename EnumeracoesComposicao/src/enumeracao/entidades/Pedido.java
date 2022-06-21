package enumeracao.entidades;

import java.util.Date;

import enumeracao.entidades.enums.PedidoStatus;

public class Pedido {
	
	private Integer id;
	private Date momentoPedido;
	private PedidoStatus status;
	
	public Pedido() {
	}

	public Pedido(Integer id, Date momentoPedido, PedidoStatus status) {
		this.id = id;
		this.momentoPedido = momentoPedido;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMomentoPedido() {
		return momentoPedido;
	}

	public void setMomentoPedido(Date momentoPedido) {
		this.momentoPedido = momentoPedido;
	}

	public PedidoStatus getStatus() {
		return status;
	}

	public void setStatus(PedidoStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", momentoPedido=" + momentoPedido + ", status=" + status + "]";
	}
	
	
	
}
