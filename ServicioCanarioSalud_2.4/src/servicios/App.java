package servicios;

import personal.PersonalEnfermero;
import personal.PersonalMedico;

public class App {

	public static void main(String[] args) {
		
		//Inicializo las clases
		
		PersonalMedico Medico = new PersonalMedico("M1","Laura","MedicoGeneral");
    	PersonalEnfermero Enfermero = new PersonalEnfermero("E1", "Luis", "EnfermeroConsulta");
    	
    	//Ejecuto los metodos 
    	
    	System.out.println(Medico.toString());
    	Medico.prepararConsulta();
    	
    
    	System.out.println(Enfermero.toString());
    	Enfermero.prepararConsulta();
	
	}

}
