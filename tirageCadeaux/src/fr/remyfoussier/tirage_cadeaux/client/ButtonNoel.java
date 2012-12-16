package fr.remyfoussier.tirage_cadeaux.client;

import com.google.gwt.user.client.ui.Button;

import fr.remyfoussier.tirage_cadeaux.shared.StyleCSS;

public class ButtonNoel extends Button {

	public ButtonNoel(String name) {
		super(name);
		setStyleName(StyleCSS.STYLE_BOUTON_LEFT);
	}

}
