
import java.util.ArrayList;
import java.util.Iterator;

public class Lista {
	
		//Definición de atributos:
		private ArrayList<Persona> lista;
		
		
		//Definición de constructor:
		public Lista () {
			lista = new ArrayList<Persona>();
		}

		//Definición de métodos:
		public void cargar() {
			lista.add(new Persona("Julio", "García Santos", 11111111, 23, "C/ Los Olivos", 38493, "Santa Cruz de Tenerife"));
			lista.add(new Persona("Ana", "Méndez Núñez", 22222222, 22, "C/ Los Pinos", 38403, "Santa Cruz de Tenerife"));
			lista.add(new Persona("María", "Sánchez Camacho", 33333333, 45, "C/ Los Franceces", 38505, "Las Palmas"));
			lista.add(new Persona("Julio", "Brito Gonzáles", 44444444, 30, "C/ Los Pinos", 38403, "Las Palmas"));
		}
		
		public void listar() {
			for(Persona person: lista) {
				System.out.println(person.getNombre());
			}
		}
		
		public void insertar(String nombre, String apellidos, int dni, int edad, String calle, int cp, String provincia) {
			lista.add(new Persona(nombre, apellidos, dni, edad, calle, cp, provincia));
			
		}
		
		public int numeroElementos() {
			return lista.size();
		}
		
		public void eliminar(String nombreBorrar) {
			Iterator<Persona> it = lista.iterator();

			while(it.hasNext()) {	
				Persona person = it.next();
				String nombrePersona = person.getNombre();
				if (nombrePersona.equalsIgnoreCase(nombreBorrar)) {
					it.remove();	
				}		
			}

		}
		
		public Persona buscar(int dni) {
			Persona personaencontrada = null;
			for(Persona person: lista) {
				if (dni == person.getDni()) {
					personaencontrada = person;
				}
			}
			return personaencontrada;
		}
		
		public ArrayList<Persona> buscar(String nombre) {
			ArrayList<Persona> personasbuscadas;
			personasbuscadas = new ArrayList<Persona>();
			for(Persona person: lista) {
				if (nombre == person.getNombre()) {
					personasbuscadas.add(person);
				}
			}
			return personasbuscadas;
		}
	
		
}
