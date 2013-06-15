package com.union.thirdparty;

import com.dropbox.client2.DropboxAPI;
import com.dropbox.client2.exception.DropboxException;
import com.dropbox.client2.session.AppKeyPair;
import com.dropbox.client2.session.Session.AccessType;
import com.dropbox.client2.session.WebAuthSession;
import com.dropbox.client2.session.WebAuthSession.WebAuthInfo;

public class DropBoxClient {

	final static private String APP_KEY = "u9compy49br7h6h";
	final static private String APP_SECRET = "rt9kz1vd2336k3k";
	final static private AccessType ACCESS_TYPE = AccessType.DROPBOX;

	// In the class declaration section:
	@SuppressWarnings("unused")
	private DropboxAPI<WebAuthSession> dbApi;

	private WebAuthSession webSession;

	public DropBoxClient() {
		AppKeyPair appKeys = new AppKeyPair(APP_KEY, APP_SECRET);
		webSession = new WebAuthSession(appKeys, ACCESS_TYPE);
		dbApi = new DropboxAPI<WebAuthSession>(webSession);
	}

	public String GetAuthUrl() throws DropboxException {
		WebAuthInfo wAI = webSession.getAuthInfo();
		return wAI.url;
	}
	
//	protected return_type name() {
//		
//	}

}
