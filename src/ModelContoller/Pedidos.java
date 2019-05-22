package ModelContoller;

import ModelContoller.Cliente;
import java.util.ArrayList;



public class Pedidos {

private int dia;
private int mes;
private int año;
private ArrayList<Cliente> Cliente = new ArrayList<Cliente>();
public Pedidos() {
	Cliente = new ArrayList<Cliente>();
	Cliente Alejo = new Cliente();
	Cliente tato = new Cliente();
	Cliente Alexander = new Cliente();
	tato.setCarnet(13);
	Alejo.setCarnet(12);
	Alexander.setCarnet(14);
	dia=16;
	mes=05;
	año=2019;
}


public ArrayList<Cliente> getListaClientes(){
	return this.Cliente;
}

public void setListaClientes(ArrayList<Cliente> Cliente) {
	this.Cliente=Cliente;
}
}
