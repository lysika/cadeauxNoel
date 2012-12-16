package fr.remyfoussier.tirage_cadeaux.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TirageCadeaux implements EntryPoint {


	/**
	 * Create a remote service proxy to talk to the server-side Greeting service.
	 */
	private final GreetingServiceAsync greetingService = GWT
			.create(GreetingService.class);

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		// Ajoute Titre à l'écran
		RootPanel.get().setTitle("Tirage au sort");
		RootPanel.get().setHeight("100%");
		// Ajoute le panel prinipale
		final DockPanel dock = new DockPanel();
		dock.setSize("100%", "100%");

		final HeaderPane header = new HeaderPane();
		final FooterPane footer = new FooterPane();
		
		final BodyPane body = new BodyPane();
		VerticalPanel verti = new VerticalPanel();
		dock.add(header,DockPanel.NORTH);

		dock.add(body,DockPanel.CENTER);
		verti.setSize("100%", "100%");
		verti.add(dock);
		verti.add(footer);


		RootPanel.get().add(verti);
	}

}
