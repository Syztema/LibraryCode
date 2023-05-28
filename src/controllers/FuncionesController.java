package controllers;

import java.util.ArrayList;
import models.PersonaModel;

public interface FuncionesController {        
    public boolean update(PersonaModel model);
    public boolean create(PersonaModel model);
    public boolean deleteByCedula(String cedula);
    public PersonaModel findByCedula(String Cedula);
    public ArrayList<PersonaModel> findAll();
}
