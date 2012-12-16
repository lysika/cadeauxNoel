package fr.remyfoussier.tirage_cadeaux.client.gui;

import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.gwt.user.client.ui.TextBox;

import fr.remyfoussier.tirage_cadeaux.shared.StyleCSS;

public class TextBoxCadeaux extends TextBox {
	private String defaut ="";
	public TextBoxCadeaux(String defaut2) {
		super();
		this.defaut = defaut2;
		setText(defaut);
		setStyleName(StyleCSS.STYLE_TEXT_ITALIC);

		
		addFocusHandler(new FocusHandler() {
			
			@Override
			public void onFocus(FocusEvent event) {
				setSelectionRange(0, defaut.length());
				setStyleName(StyleCSS.STYLE_TEXT_FOCUS);
				
			}
		});
	}
	
}
