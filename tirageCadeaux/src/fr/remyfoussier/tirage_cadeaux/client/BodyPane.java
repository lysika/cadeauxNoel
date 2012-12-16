package fr.remyfoussier.tirage_cadeaux.client;

import java.util.ArrayList;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

import fr.remyfoussier.tirage_cadeaux.client.gui.TextBoxCadeaux;
import fr.remyfoussier.tirage_cadeaux.shared.StyleCSS;

public class BodyPane extends VerticalPanel{
	private int ii = 0;
	private ArrayList<TextBox> listeTextBoxNoms = new ArrayList<TextBox>();
	private ArrayList<TextBox> listeEmails = new ArrayList<TextBox>();
	public BodyPane() {
		super();
		setSize("100%", "100%");
		setHorizontalAlignment(ALIGN_CENTER);
		addStyleName(StyleCSS.STYLE_BODY);

		final FlexTable table = new FlexTable();
		
		final Button plus = new Button("+");
		final Button moins = new Button("-");
		
		ajouteCellule(table,plus,moins);
		
		moins.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				supprimeCellule(table,plus,moins);
				
			}

		});
		
		plus.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				ajouteCellule(table,plus,moins);
				
			}
		});
		
		Button butEnvoyer = new ButtonNoel("Envoyer");
		
		add(table);
		add(butEnvoyer);
	}
	private void ajouteCellule(FlexTable table,Button plus,Button moins) {
		ii++;
		table.setWidget(ii-1, 0, new Label("participant " + ii));
		TextBox tb = new TextBoxCadeaux("Nom");
		TextBox tbMail = new TextBoxCadeaux("eMail");
		listeTextBoxNoms.add(tb);
		listeEmails.add(tbMail);
		table.setWidget(ii-1, 1, tb);
		table.setWidget(ii-1, 2, tbMail);
		table.remove(plus);
		table.remove(moins);
		if (ii>1){
			table.setWidget(ii-1, 3,moins);
		}
		table.setWidget(ii-1, 4,plus);
		
	}
	
	private void supprimeCellule(FlexTable table, Button plus,
			Button moins) {
		ii--;
		if (listeTextBoxNoms.size()>0){
			listeTextBoxNoms.remove(listeTextBoxNoms.size()-1);
			listeEmails.remove(listeEmails.size()-1);
			table.removeRow(ii);
			if (ii>1)
			{
				table.setWidget(ii-1, 3,moins);
			}
			table.setWidget(ii-1, 4,plus);
		}

		
	}

}
