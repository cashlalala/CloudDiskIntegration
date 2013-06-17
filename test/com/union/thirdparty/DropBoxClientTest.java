package com.union.thirdparty;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.dropbox.client2.exception.DropboxException;

public class DropBoxClientTest {

	private DropBoxClient dropBoxClient;

	@Before
	public void setUp() throws Exception {
		dropBoxClient = new DropBoxClient();
	}

	@Test
	public void testGetAuthUrl() {
		try {
			String authUrl = dropBoxClient.GetAuthUrl();

			assertNotNull(authUrl);

		} catch (DropboxException e) {

			fail(e.toString());

		}

	}

}
