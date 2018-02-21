package it.user;

import static org.junit.Assert.assertTrue;
import it.EndpointTest;
import org.junit.Test;

import javax.ws.rs.core.Response;

public class LoginActionTest extends EndpointTest {
    private String endpoint = "/rest/login";

    @Test
    public void GET_success() {
        Response response = sendRequest(this.url + endpoint, "GET");
        assertTrue("Endpoint not reachable", response.getStatus() == 200);
    }
}
