package ro.tribulit.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("animals")
public class AnimalNamesRestService {

    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    private static List<String> animalNames = new ArrayList<>();

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getAnimalNames() {
        return ((ArrayList) animalNames).toString();
    }

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    public Response addAnimalName(String name) {
        animalNames.add(name);
        return Response.status(Response.Status.CREATED).build();
    }
}
