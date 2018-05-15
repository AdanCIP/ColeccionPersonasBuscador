

public class Persona {
	//Definición de atributos
	private String nombre;
	private String apellidos;
	private int dni;
	private int edad;
	private Direccion direccion;
	
	//Definición de constructor
	public Persona (String nombre, String apellidos, int dni, int edad, String calle, int cp, String provincia) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
		direccion = new Direccion(calle, cp, provincia);	
	}

	public String toString (){
        String mensaje = nombre + " " + apellidos + " con DNI " + dni + ", " + edad + " años de edad y dirección: " + direccion.toString();
        return mensaje;
    }
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

}
