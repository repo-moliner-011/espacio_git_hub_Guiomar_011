package tienda;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Object>lista=new ArrayList<Object>();
		Clientes c1 = new Clientes(111);
		Clientes c2 = new Clientes(113);
		Clientes c3 = new Clientes(114);
		Productos p1 = new Productos(11);
		Productos p2 = new Productos(12);
		Productos p3 = new Productos(13);
		Tiendas t1 = new Tiendas(01);
		Tiendas t2 = new Tiendas(02);
		Tiendas t3 = new Tiendas(03);
		Vendedores v1 = new Vendedores(1);
		Vendedores v2 = new Vendedores(2);
		Vendedores v3 = new Vendedores(3);
		lista.add(0,c1);
		lista.add(1,p1);
		lista.add(2,t1);
		lista.add(3,v1);
		lista.add(4,c2);
		lista.add(5,p2);
		lista.add(6,t2);
		lista.add(7,v2);
		lista.add(8,c3);
		lista.add(9,p3);
		lista.add(10,t3);
		lista.add(11,v3);
		for(int i=0; i<lista.size(); i++){
	    	System.out.println(lista.get(i));
	    }
		
		
		
		

	}

}
