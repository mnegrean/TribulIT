package ro.tribulit;

import org.glassfish.grizzly.http.server.HttpServer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AnimalNamesTest {

    private HttpServer server;
    private WebTarget target;

    @Before
    public void setUp() throws Exception {
        server = Main.startServer();
        Client client = ClientBuilder.newClient();
        target = client.target(Main.BASE_URI);
    }

    @After
    public void tearDown() throws Exception {
        server.shutdownNow();
    }

    @Test
    public void testPostName() {
        Response response = target.path("animals").request().post(Entity.entity("first animal name", MediaType.TEXT_PLAIN) , Response.class);
        assertEquals(201, response.getStatus());
    }

    @Test
    public void testGetNames() {
        Response postResponse = target.path("animals").request().post(Entity.entity("second animal name", MediaType.TEXT_PLAIN) , Response.class);
        assertEquals(201, postResponse.getStatus());
        String getResponse = target.path("animals").request().get(String.class);
        assertTrue(getResponse.contains("second animal name"));
    }
}
