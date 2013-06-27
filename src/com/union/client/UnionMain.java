package com.union.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Tree;
import com.union.client.dlg.AuthDlg;

public class UnionMain implements EntryPoint {

	private final GreetingServiceAsync greetingService = GWT
			.create(GreetingService.class);
	
	public void onModuleLoad() {
		RootPanel rootPanel = RootPanel.get();
		
		DockPanel dockPanel = new DockPanel();
		rootPanel.add(dockPanel);
		
		rootPanel.add(dockPanel, 0, 0);
		dockPanel.setSize("100%", "100%");
		
		HorizontalPanel horizontalPanel = new HorizontalPanel();
		dockPanel.add(horizontalPanel, DockPanel.NORTH);
		horizontalPanel.setSize("100%", "90");
		
		Label lblNewLabel = new Label("Union");
		horizontalPanel.add(lblNewLabel);
		lblNewLabel.setWidth("100");
		
		String baseUrl = GWT.getModuleBaseURL();
		String hostUrl = GWT.getHostPageBaseURL();
		
		greetingService.greetServer("QQQQQ",
				new AsyncCallback<String>() {
					public void onFailure(Throwable caught) {
						DialogBox dialogBox = new DialogBox();
						dialogBox
								.setText("Remote Procedure Call - Failure");
						dialogBox.center();
					}

					public void onSuccess(String result) {
						
						AuthDlg authDlg = new AuthDlg(result);
						authDlg.center();
					}
				});
	}
}
