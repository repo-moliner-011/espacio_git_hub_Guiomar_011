package tienda;

public class Productos {
private int id_productos;

public Productos(int id_productos) {
	this.id_productos = id_productos;
}

/**
 * @return el id_productos
 */
public int getId_productos() {
	return id_productos;
}

/**
 * @param id_productos el id_productos a establecer
 */
public void setId_productos(int id_productos) {
	this.id_productos = id_productos;
}

/* (sin Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Productos [id_productos=" + id_productos + "]";
}
}
