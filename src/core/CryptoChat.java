package core;

import chat.Bow;
import chat.SirLauncelot;
import chat.Concorde;

public class CryptoChat {

	public static void main(String[] args) {
		Bow bow = new Bow(6969);
		Concorde concorde = new Concorde(bow);
		concorde.listen();
		SirLauncelot sirLauncelot = new SirLauncelot(concorde, bow);
		sirLauncelot.chat();
	}

}
