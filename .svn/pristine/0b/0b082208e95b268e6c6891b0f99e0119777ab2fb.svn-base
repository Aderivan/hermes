package br.com.apsinformatica.infra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ArqProperties {
	private Properties props;

	public ArqProperties() {
		props = new Properties();
		FileInputStream file;
		try {
			file = new FileInputStream("configuracao.properties");
			props.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getValue(String key) {
		return props.getProperty(key);
	}

}
