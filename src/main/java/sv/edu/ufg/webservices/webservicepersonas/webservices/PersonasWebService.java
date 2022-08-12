/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package sv.edu.ufg.webservices.webservicepersonas.webservices;

import jakarta.inject.Inject;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import java.util.List;
import sv.edu.ufg.webservices.webservicepersonas.entities.Personas;
import sv.edu.ufg.webservices.webservicepersonas.entities.dto.PersonasDTO;
import sv.edu.ufg.webservices.webservicepersonas.repositories.PersonasRepository;

/**
 *
 * @author xtecuan
 */
@WebService(serviceName = "PersonasWebService")
public class PersonasWebService {

    @Inject
    private PersonasRepository personasRepository;

    @WebMethod(operationName = "findAll")
    public @WebResult(name = "personas")
    List<Personas> findAll() {
        return personasRepository.findAll();
    }

    @WebMethod(operationName = "findById")
    public @WebResult(name = "persona")
    Personas findById(@WebParam(name = "idPersona") Long idPersona) {
        return personasRepository.findById(idPersona);
    }

    @WebMethod(operationName = "save")
    public @WebResult(name = "success") void save(@WebParam(name = "persona") PersonasDTO persona) {
        personasRepository.save(persona);
    }

    @WebMethod(operationName = "delete")
    public void delete(@WebParam(name = "idPersona") Long idPersona) {
        personasRepository.delete(idPersona);
    }

    @WebMethod(operationName = "update")
    public @WebResult(name = "success") void update(@WebParam(name = "persona") PersonasDTO persona, @WebParam(name = "idPersona") Long idPersona) {
        personasRepository.update(persona, idPersona);
    }

}
