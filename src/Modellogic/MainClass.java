package Modellogic;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import ModelContoller.Cliente;

public class MainClass {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i;
		Cliente Alejo = new Cliente();
		
		Alejo.setCarnet(12);
		String nombre="Alejandro";
		String apellido="Osorio";
		int Edad = 18;
		int Cantidad_P=13;
		Alejo.setNombre(nombre);
		Alejo.setApellido(apellido);
		Alejo.setEdad(Edad);
		Alejo.setCantidad_P(Cantidad_P);
		JOptionPane.showMessageDialog(null,"Nombre es " + Alejo.getNombre()+" El apellido es: "+Alejo.getApellido());
		JOptionPane.showMessageDialog(null,"Su edad es: " + Alejo.getEdad()+" Su cantidad Es: "+Alejo.getCantidad_P());
		
		Cliente tato = new Cliente();
		String nombret ="Tatareto";
		String apellidoP="El Duro";
		int Edadt = 32;
		int Cantidad_t=23;
		tato.setNombre(nombret);
		tato.setApellido(apellidoP);
		tato.setEdad(Edadt);
		tato.setCantidad_P(Cantidad_t);
		
		Cliente Alexander = new Cliente();
		String nombreB ="Alias El Bryan";
		String apellidoB="El relajado";
		int EdadB = 32;
		int Cantidad_B=23;
		Alexander.setNombre(nombreB);
		Alexander.setApellido(apellidoB);
		Alexander.setEdad(EdadB);
		Alexander.setCantidad_P(Cantidad_B);

		ArrayList<Cliente> Cliente= new ArrayList<Cliente>();
		Cliente.add(Alejo);
		Cliente.add(tato);
		Cliente.add(Alexander);
		
		for (i=0;i < Cliente.size() ;i++) {
			System.out.println(Cliente.get(i).getNombre());
		}
		i=0;
		while(i<Cliente.size() ) {
			System.out.println(Cliente.get(i).getApellido());
			i++;
		}
		System.out.println("Hola");

	}
	

}
