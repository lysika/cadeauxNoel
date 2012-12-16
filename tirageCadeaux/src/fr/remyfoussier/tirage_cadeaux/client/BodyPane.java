package fr.remyfoussier.tirage_cadeaux.client;

import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;

import fr.remyfoussier.tirage_cadeaux.shared.StyleCSS;

public class BodyPane extends HorizontalPanel{

	public BodyPane() {
		super();
		setSize("100%", "100%");
		setHorizontalAlignment(ALIGN_CENTER);
		addStyleName(StyleCSS.STYLE_BODY);

		FlexTable table = new FlexTable();
		table.setWidget(0, 0, new Label("text"));
		table.setWidget(0, 1, new TextBox());

		table.setWidget(1, 0, new Label("text"));
		table.setWidget(1, 1, new TextBox());

		table.setWidget(2, 0, new Label("text"));
		table.setWidget(2, 1, new TextBox());

		table.setWidget(3, 0, new Label("text"));
		table.setWidget(3, 1, new TextBox());

		add(table);
	}

}
