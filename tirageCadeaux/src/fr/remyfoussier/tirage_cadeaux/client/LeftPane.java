package fr.remyfoussier.tirage_cadeaux.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

import fr.remyfoussier.tirage_cadeaux.client.guiTools.PopUpCouple;
import fr.remyfoussier.tirage_cadeaux.shared.Couple;
import fr.remyfoussier.tirage_cadeaux.shared.StyleCSS;

public class LeftPane extends VerticalPanel {

	public LeftPane() {
		super();
		Button butParametre = new ButtonNoel("Couple");
		Button butGenerer = new ButtonNoel("Mail");
		Button butEnvoyer = new ButtonNoel("Envoyer");
		
		butParametre.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				Couple couple = new Couple();
				PopUpCouple popup = new PopUpCouple(couple);
				couple = couple;
				popup.show();
				couple=couple;
				
			}
		});
						
		setSize("90%", "100%");
		setHorizontalAlignment(ALIGN_CENTER);
		addStyleName(StyleCSS.STYLE_BANDEAU);
		add(butParametre);
		add(butGenerer);
		add(butEnvoyer);
	}

}
