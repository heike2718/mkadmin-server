//=====================================================
// Project: checklistenserver
// (c) Heike Winkelvoß
//=====================================================
package de.egladil.web.mkadmin_server.restclient;

import javax.json.JsonObject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import de.egladil.web.commons.payload.OAuthClientCredentials;

/**
 * OAuthRestClient: die URI ist [auth-url]/clients/client/accesstoken
 */
@RegisterRestClient
@Path("clients")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface OAuthRestClient {

	@POST
	@Path("/client/accesstoken")
	JsonObject orderAccessToken(OAuthClientCredentials clientSecrets);
}
