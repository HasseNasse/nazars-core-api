package it.user;

import it.EndpointTest;
import org.junit.Test;

import javax.ws.rs.core.Response;

import static org.junit.Assert.assertTrue;

public class RegisterActionTest extends EndpointTest {
    private String endpoint = "/rest/register";

    @Test
    public void GET_success() {
        Response response = sendRequest(this.url + endpoint, "GET");
        assertTrue("Endpoint not reachable", response.getStatus() == 200);
    }
}
