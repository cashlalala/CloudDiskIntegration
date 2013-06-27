package com.union.client.dlg;

import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

public class AuthDlg extends DialogBox {

	public AuthDlg(String authUrl) {
		super(true);
		setSize("423px", "182px");

		VerticalPanel dialogVPanel = new VerticalPanel();
		dialogVPanel.add(new HTML(authUrl));
		
		setWidget(dialogVPanel);
		dialogVPanel.setSize("403px", "154px");
	}

}
