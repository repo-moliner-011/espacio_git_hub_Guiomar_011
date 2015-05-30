package tienda;

public class Clientes {
private int id_cliente;

public Clientes(int id_cliente) {
	this.id_cliente = id_cliente;
}

/**
 * @return el id_cliente
 */
public int getId_cliente() {
	return id_cliente;
}

/**
 * @param id_cliente el id_cliente a establecer
 */
public void setId_cliente(int id_cliente) {
	this.id_cliente = id_cliente;
}

/* (sin Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Clientes [id_cliente=" + id_cliente + "]";
}
}
