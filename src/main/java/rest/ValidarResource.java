package rest;

import model.ValidarClass;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/validar")
public class ValidarResource {

    @GET
    @Path("{cpf}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getValidacao(@PathParam("cpf") String cpf) {
        return ValidarClass.validar(cpf);
    }
}