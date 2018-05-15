

public class Direccion {
	//Definición de atributos
	private String calle;
	private int cp;
	private String provincia;
	
	//Definición de constructor
	public Direccion (String calle, int cp, String provincia) {
		this.calle = calle;
		this.cp = cp;
		this.provincia = provincia;
	}
	
	public String toString (){
        String mensaje = calle + ", " + cp + ", " + provincia;
        return mensaje;
    }
	

}
