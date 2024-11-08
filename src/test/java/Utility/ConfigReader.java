package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private Properties properties;
	private FileInputStream fileInputStream;

	public ConfigReader() {
		properties = new Properties();
		try {

			fileInputStream = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\java\\Resources\\data.properties");

			properties.load(fileInputStream);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getProperty(String key) {
		return properties.getProperty(key);
	}

}
