package fr.remyfoussier.tirage_cadeaux.client;

import com.google.gwt.user.client.ui.VerticalPanel;

import fr.remyfoussier.tirage_cadeaux.shared.StyleCSS;

public class LeftPane extends VerticalPanel {

	public LeftPane() {
		super();
		
						
		setSize("90%", "100%");
		setHorizontalAlignment(ALIGN_CENTER);
		addStyleName(StyleCSS.STYLE_BANDEAU);
		
}

}
