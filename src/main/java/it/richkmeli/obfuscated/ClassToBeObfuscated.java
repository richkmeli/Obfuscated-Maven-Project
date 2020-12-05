package it.richkmeli.obfuscated;

import it.richkmeli.jframework.crypto.Crypto;
import it.richkmeli.jframework.system.FileManager;

public class ClassToBeObfuscated {

	public static String DoStuff() {
		// usage example of the dependency present in pom file
		FileManager.loadDataFromFile("");
		return Crypto.encryptRC4("test","test");
	}


}
