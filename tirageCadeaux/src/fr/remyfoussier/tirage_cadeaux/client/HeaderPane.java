package fr.remyfoussier.tirage_cadeaux.client;

import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;

import fr.remyfoussier.tirage_cadeaux.shared.StyleCSS;

public class HeaderPane extends HorizontalPanel {

	public HeaderPane() {
		super();
		setSize("100%", "100%");
		setHorizontalAlignment(ALIGN_CENTER);
		addStyleName(StyleCSS.STYLE_HEADER);
		Image widget = new Image("ressource/header.png");
		add(widget);
	}

}
