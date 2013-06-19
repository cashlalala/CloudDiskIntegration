package com.union.thirdparty;

import com.dropbox.client2.DropboxAPI;
import com.dropbox.client2.exception.DropboxException;
import com.dropbox.client2.session.AccessTokenPair;
import com.dropbox.client2.session.AppKeyPair;
import com.dropbox.client2.session.Session.AccessType;
import com.dropbox.client2.session.WebAuthSession;
import com.dropbox.client2.session.WebAuthSession.WebAuthInfo;

public class DropBoxClient {

	final static private String APP_KEY = "1g595zf9fu7zwqc";
	final static private String APP_SECRET = "a08v1nn3sj5g6ki";
	final static private AccessType ACCESS_TYPE = AccessType.DROPBOX;

	// In the class declaration section:
	@SuppressWarnings("unused")
	private DropboxAPI<WebAuthSession> dbApi;

	private WebAuthSession webSession;
	
	private WebAuthInfo wAI;

	public DropBoxClient() {
		AppKeyPair appKeys = new AppKeyPair(APP_KEY, APP_SECRET);
		webSession = new WebAuthSession(appKeys, ACCESS_TYPE);
		dbApi = new DropboxAPI<WebAuthSession>(webSession);
	}

	public String GetAuthUrl() throws DropboxException {
		wAI = webSession.getAuthInfo();
		return wAI.url;
	}
	

}
