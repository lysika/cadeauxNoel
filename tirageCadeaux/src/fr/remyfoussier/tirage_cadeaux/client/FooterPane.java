package fr.remyfoussier.tirage_cadeaux.client;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;

import fr.remyfoussier.tirage_cadeaux.shared.StyleCSS;

public class FooterPane extends HorizontalPanel {

	public FooterPane() {
		super();
		setSize("100%", "100%");
		addStyleName(StyleCSS.STYLE_FOOTER);
		setHorizontalAlignment(ALIGN_CENTER);
		add(new HTML("Joyeux Noel !! Remy FOUSSIER"));
		
	}

}
