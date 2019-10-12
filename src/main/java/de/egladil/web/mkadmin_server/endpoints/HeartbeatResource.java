// =====================================================
// Projekt: checklisten
// (c) Heike Winkelvoß
// =====================================================

package de.egladil.web.mkadmin_server.endpoints;

import javax.annotation.security.PermitAll;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.egladil.web.commons_validation.payload.MessagePayload;
import de.egladil.web.commons_validation.payload.ResponsePayload;
import de.egladil.web.mkadmin_server.error.LogmessagePrefixes;
import de.egladil.web.mkadmin_server.service.HeartbeatService;

/**
 * HeartbeatResource
 */
@RequestScoped
@Path("heartbeats")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@PermitAll
public class HeartbeatResource {

	private static final Logger LOG = LoggerFactory.getLogger(HeartbeatResource.class.getName());

	@ConfigProperty(name = "heartbeat.id")
	String heartbeatId;

	@Inject
	HeartbeatService heartbeatService;

	@GET
	public Response check(@QueryParam("heartbeatId") final String heartbeatId) {

		if (!heartbeatId.equals(heartbeatId)) {

			LOG.warn("{}Aufruf mit fehlerhaftem QueryParam {}", LogmessagePrefixes.BOT, heartbeatId);
			return Response.status(401)
				.entity(ResponsePayload.messageOnly(MessagePayload.error("keine Berechtigung für diese Resource"))).build();
		}
		ResponsePayload responsePayload = heartbeatService.update();

		if (responsePayload.isOk()) {

			return Response.ok().entity(responsePayload).build();
		}
		return Response.serverError().entity(responsePayload).build();
	}
}
