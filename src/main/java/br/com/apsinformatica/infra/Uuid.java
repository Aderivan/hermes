package br.com.apsinformatica.infra;

import java.util.UUID;

public class Uuid {

	public static String newUuid() {
		UUID uuid = UUID.randomUUID();
		String randomUUIDString = uuid.toString();
		return randomUUIDString;
	}

}
