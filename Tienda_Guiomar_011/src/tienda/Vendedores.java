package tienda;

public class Vendedores {
	private int id_vendedor;

	public Vendedores(int id_vendedor) {
		this.id_vendedor = id_vendedor;
	}

	/**
	 * @return el id_vendedor
	 */
	public int getId_vendedor() {
		return id_vendedor;
	}

	/**
	 * @param id_vendedor el id_vendedor a establecer
	 */
	public void setId_vendedor(int id_vendedor) {
		this.id_vendedor = id_vendedor;
	}

	/* (sin Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vendedores [id_vendedor=" + id_vendedor + "]";
	}

}
