package ro.tribulit.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("resource")
public class MyResourceRestService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getResource() {
        return "This is the resource.";
    }
}
