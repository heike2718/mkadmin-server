// =====================================================
// Project: checklistenserver
// (c) Heike Winkelvoß
// =====================================================
package de.egladil.web.mkadmin_server.restclient;

import javax.json.JsonObject;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import de.egladil.web.commons_validation.payload.OAuthClientCredentials;

/**
 * ReplaceAccessTokenRestClient: die URI ist [auth-url]/accesstoken/{oldAccessToken}
 */
@RegisterRestClient
@Path("accesstoken")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface ReplaceAccessTokenRestClient {

	@PUT
	@Path("/{replacedToken}")
	JsonObject replaceAccessToken(@PathParam(
		value = "replacedToken") final String replacedToken, OAuthClientCredentials clientSecrets);
}
