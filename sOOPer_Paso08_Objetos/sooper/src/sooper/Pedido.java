package sooper;

import java.util.HashSet;
import java.util.Set;

public class Pedido implements IPedido {

	private String referencia;
	private Set<IContenedor> contenedores;
	
	public Pedido(String referencia) {
		this.referencia = referencia;
		this.contenedores = new HashSet<IContenedor>();
	}

	@Override
	public String getReferencia() {
		return referencia;
	}

	@Override
	public Set<IProducto> getProductos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<IContenedor> getContenedores() {
		return contenedores;
	}

	@Override
	public void addContenedor(IContenedor contenedor) {
		contenedores.add(contenedor);
	}

	@Override
	public IContenedor addProducto(IProducto producto) {
		// TODO Auto-generated method stub
		return null;
	}

}
