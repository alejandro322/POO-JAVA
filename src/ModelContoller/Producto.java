package ModelContoller;

public class Producto {
private int id;
private String name;
private String Description;
private int Quantity;

public Producto(int IDP,String NDP,String NDD,int NDQ) {
	this.setId(IDP);
	this.setName(NDP);
	this.setDescription(NDD);
	this.setQuantity(NDQ);
}



public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}



public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public String getDescription() {
	return Description;
}



public void setDescription(String description) {
	Description = description;
}



public int getQuantity() {
	return Quantity;
}



public void setQuantity(int quantity) {
	Quantity = quantity;
}



}
