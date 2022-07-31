
package com.portfolio.BackEnd.Interface;

import com.portfolio.BackEnd.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guaradar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto Persona
    public void deletePersona(Long id);
    
    //Buscar una persona
    public Persona findPersona(Long id);
}
