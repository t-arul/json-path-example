package de.dhbw.vs.jsonpath;

import java.io.InputStream;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dhbw.vs.utils.logging.LogLevel;
import de.dhbw.vs.utils.logging.Logging;

public class Main {

	static {
		Logging.setLoggingDefaults(LogLevel.DEBUG, "[%-5p; %c{1}::%M] %m%n");
	}

	public static void main(String[] args) {
		// Obtain an instance of a logger for this class
		Logger log = LoggerFactory.getLogger(Main.class);

		// The JSON file to read
		String filename = "simple.json";

		// Read JSON into a string
		InputStream resourceAsStream = Main.class.getClassLoader().getResourceAsStream(filename);
		Scanner scanner = new Scanner(resourceAsStream, "UTF-8");
		String inputStreamString = scanner.useDelimiter("\\A").next();
		scanner.close();

		log.info("JSON: {}", inputStreamString);

		// Now, do sth with the document

	}

}
