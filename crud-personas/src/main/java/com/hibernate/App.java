package com.hibernate;

import java.util.List;

import com.hibernate.dao.PersonaDAO;
import com.hibernate.model.Persona;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonaDAO personaDAO = new PersonaDAO();
		
		Persona pers1 = new Persona ("Luay",3);
		personaDAO.insertPersona(pers1);
		Persona pers2 = new Persona ("Claudio",92);
		personaDAO.insertPersona(pers2);
		Persona pers3 = new Persona ("Ivan",15);
		personaDAO.insertPersona(pers3);

		pers1.setEdad(5);
		personaDAO.updatePersona(pers1);
		
		Persona pers4 = personaDAO.selectPersonaById(2);
		System.out.println(pers4.getNombre());
		
		List<Persona> personas = personaDAO.selectAllPerson();
		
//		for (Persona p: personas) {
//			System.out.println(p.getNombre() + " " + p.getEdad());
//		}
		
		personas.forEach(p->System.out.println(p.getNombre() + " " + p.getEdad()));
		
		personaDAO.deletePersona(3);
	}

}
