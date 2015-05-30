package tienda;



public class Venta {
	private int anio;
	private int fecha;
	private int horas;
	private int minutos;
	private int segundos;
	private int mes;
	public Venta(int mes, int anio, int fecha, int horas, int minutos,
			int segundos) {
		this.mes = mes;
		this.anio = anio;
		this.fecha = fecha;
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public Venta(int i, int j, int k, int l, int m) {
		// TODO Apéndice de constructor generado automáticamente
	}

	/**
	 * @return el mes
	 */
	public int getMes() {
		return mes;
	}
	/**
	 * @param mes el mes a establecer
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}
	/**
	 * @return el anio
	 */
	public int getAnio() {
		return anio;
	}
	/**
	 * @param anio el anio a establecer
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}
	/**
	 * @return el fecha
	 */
	public int getFecha() {
		return fecha;
	}
	/**
	 * @param fecha el fecha a establecer
	 */
	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
	/**
	 * @return el horas
	 */
	public int getHoras() {
		return horas;
	}
	/**
	 * @param horas el horas a establecer
	 */
	public void setHoras(int horas) {
		this.horas = horas;
	}
	/**
	 * @return el minutos
	 */
	public int getMinutos() {
		return minutos;
	}
	/**
	 * @param minutos el minutos a establecer
	 */
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	/**
	 * @return el segundos
	 */
	public int getSegundos() {
		return segundos;
	}
	/**
	 * @param segundos el segundos a establecer
	 */
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	/* (sin Javadoc)
	 * @see java.lang.Object#toString()
	 */

	/* (sin Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Venta [anio=" + anio + ", fecha=" + fecha + ", horas=" + horas
				+ ", minutos=" + minutos + ", segundos=" + segundos + ", mes="
				+ mes + "]";
	}
	
	
}
