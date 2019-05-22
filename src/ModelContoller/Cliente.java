package ModelContoller;

public class Cliente extends Persona{
private int Carnet;
private String nombre;
private String apellido;
private int edad;
private int Cantidad_P;
private static String gen ;
private static String nac ;



public Cliente(int IDC,String NDC,String ADC,int EDC,int CDC,String gen, String nac) {
	super(gen,nac);
	this.Carnet=IDC;
	this.nombre=NDC;
	this.apellido=ADC;
	this.edad=EDC;
	this.Cantidad_P=CDC;
}

public Cliente(){
	super(gen, nac);
}

public int getCarnet() {
	return Carnet;
}

public void setCarnet(int carnet) {
	Carnet = carnet;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public int getCantidad_P() {
	return Cantidad_P;
}

public void setCantidad_P(int cantidad_P) {
	Cantidad_P = cantidad_P;
}
}
