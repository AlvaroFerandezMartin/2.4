package personal;

import servicios.DatosBasicos;

public class PersonalEnfermero extends DatosBasicos{

	public PersonalEnfermero(String id, String nombre, String tipo) {
		super(id, nombre, tipo);
		// TODO Auto-generated constructor stub
		
	}
	

	@Override
	public String toString() {
		return "Personal Enfermero " + "," + getId() + "," + getNombre() + "," + getTipo();
	}
	
	
	public  void prepararConsulta() {
		System.out.println( "Ayudando el médico");
		
	}


}
