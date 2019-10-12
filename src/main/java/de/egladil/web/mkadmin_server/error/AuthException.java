// =====================================================
// Project: admin-server
// (c) Heike Winkelvoß
// =====================================================
package de.egladil.web.mkadmin_server.error;

/**
 * AuthException
 */
public class AuthException extends RuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 *
	 */
	public AuthException() {

	}

	/**
	 * @param message
	 */
	public AuthException(final String message) {

		super(message);
	}

}
