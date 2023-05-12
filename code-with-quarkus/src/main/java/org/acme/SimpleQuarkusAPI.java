package org.acme;

import io.vertx.core.http.HttpServerRequest;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;

@Path("{requestId: (.+?(?=/))|(.+)}")

public class SimpleQuarkusAPI
{
    @PUT
    @Produces (MediaType.TEXT_PLAIN)
    public String request(String requestId,
                        @QueryParam ("variable1") String test_Parameter_1,
                        @QueryParam ("variable2") String test_Parameter_2,
                        @Context HttpServerRequest request) throws Exception
    {
        String test = request.absoluteURI();

        if (test_Parameter_1 == null) {throw new Exception("Request must contain two test parameters");}

        if (test_Parameter_1 == null) {throw new Exception("Request must contain two test parameters");}

        return "This program is working";

    }
}