package ModelContoller;

public class Persona {
private String genero;
private String nacionalida;

public Persona(String gen, String nac){
	this.genero=gen;
	this.nacionalida= nac;
}

public String getGenero() {
	return genero;
}

public void setGenero(String genero) {
	this.genero = genero;
}

public String getNacionalida() {
	return nacionalida;
}

public void setNacionalida(String nacionalida) {
	this.nacionalida = nacionalida;
}
}
