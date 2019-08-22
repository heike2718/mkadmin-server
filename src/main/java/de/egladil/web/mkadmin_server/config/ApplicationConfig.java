//=====================================================
// Projekt: mkadmin-server
// (c) Heike Winkelvoß
//=====================================================

package de.egladil.web.mkadmin_server.config;

import javax.enterprise.context.ApplicationScoped;

import com.kumuluz.ee.configuration.cdi.ConfigBundle;

/**
 * ApplicationConfig<br>
 * <br>
 * Attribut 'application-config' verweist auf den gleichnamigen Abschnitt in der mkadmin-server-config.yaml.
 */
@ApplicationScoped
@ConfigBundle("application-config")
public class ApplicationConfig {

	private String configRoot;

	private String targetOrigin;

	private boolean blockOnMissingOriginReferer = false;

	private String nameDynamicConfigFile;

	private String heartbeatId;

	private String clientId;

	private String clientSecret;

	private String authBaseUri;

	public String getConfigRoot() {
		return configRoot;
	}

	public void setConfigRoot(final String configRoot) {
		this.configRoot = configRoot;
	}

	public String getTargetOrigin() {
		return targetOrigin;
	}

	public void setTargetOrigin(final String targetOrigin) {
		this.targetOrigin = targetOrigin;
	}

	public boolean isBlockOnMissingOriginReferer() {
		return blockOnMissingOriginReferer;
	}

	public void setBlockOnMissingOriginReferer(final boolean blockOnMissingOriginReferer) {
		this.blockOnMissingOriginReferer = blockOnMissingOriginReferer;
	}

	public String getNameDynamicConfigFile() {
		return nameDynamicConfigFile;
	}

	public void setNameDynamicConfigFile(final String nameDynamicConfigFile) {
		this.nameDynamicConfigFile = nameDynamicConfigFile;
	}

	public String getHeartbeatId() {
		return heartbeatId;
	}

	public void setHeartbeatId(final String heartbeatId) {
		this.heartbeatId = heartbeatId;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(final String clientSecret) {
		this.clientSecret = clientSecret;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(final String clientId) {
		this.clientId = clientId;
	}

	public String getAuthBaseUri() {
		return authBaseUri;
	}

	public void setAuthBaseUri(final String authBaseUri) {
		this.authBaseUri = authBaseUri;
	}
}
