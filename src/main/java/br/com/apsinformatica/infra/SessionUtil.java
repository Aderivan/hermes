package br.com.apsinformatica.infra;

import javax.faces.context.FacesContext;

public class SessionUtil {

	public static void setSession(String pName, String pValor) {
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put(pName, pValor);
	}

	public static void setSession(String pName, Integer pValor) {
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put(pName, pValor);
	}

	public static void setSession(String pName, Double pValor) {
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put(pName, pValor);
	}

	public static void setSession(String pName, Object pValor) {
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put(pName, pValor);
	}

	public static Double getSessionDouble(String pName) {
		return (Double) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get(pName);
	}

	public static Integer getSessionInteger(String pName) {
		return (Integer) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get(pName);
	}

	public static String getSessionString(String pName) {
		return (String) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get(pName);
	}
	
	public static Object getSessionObject(String pName) {
		return FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get(pName);
	}

	public static void finalizarSession() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
	}

}
