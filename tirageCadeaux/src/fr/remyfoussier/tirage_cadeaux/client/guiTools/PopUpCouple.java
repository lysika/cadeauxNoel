package fr.remyfoussier.tirage_cadeaux.client.guiTools;

import com.google.gwt.user.client.ui.DialogBox;

import fr.remyfoussier.tirage_cadeaux.shared.Couple;

	public class PopUpCouple extends DialogBox{
		public PopUpCouple(Couple couple){
			super();
			couple = new Couple("Rémy","Audrey");
			
	}
}