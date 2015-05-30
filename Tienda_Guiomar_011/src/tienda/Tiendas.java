package tienda;

public class Tiendas {
	private int id_tienda;

	public Tiendas(int id_tienda) {
		this.id_tienda = id_tienda;
	}

	/**
	 * @return el id_tienda
	 */
	public int getId_tienda() {
		return id_tienda;
	}

	/**
	 * @param id_tienda el id_tienda a establecer
	 */
	public void setId_tienda(int id_tienda) {
		this.id_tienda = id_tienda;
	}

	/* (sin Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Tiendas [id_tienda=" + id_tienda + "]";
	}

}
