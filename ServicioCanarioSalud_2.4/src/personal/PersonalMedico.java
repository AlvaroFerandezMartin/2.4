package personal;

import servicios.DatosBasicos;

public class PersonalMedico extends DatosBasicos {
	
    public PersonalMedico(String id, String nombre, String tipo) {
        super(id, nombre, tipo);
    }

	@Override
	public String toString() {
		return "Personal Medico " + getId() + "," + getNombre() +","+ getTipo();
	}
	
	public void prepararConsulta() {
		System.out.println( "Preparando consulta");
		
	}

    

    
    
   

    
    
    	
    
    
    
}
