package varGlobal;

import java.util.ArrayList;

import entitys.system.Pakete;

/**
 * The Class VariablesGlobales.
 */
public class VariablesGlobales {

	/** The lista paketes en espera para IA. */
	private static ArrayList<Pakete> listaPakEnEsperaParaIA = new ArrayList<Pakete>();

	/** The sistema osoa geldi edo martxan. */
	private static boolean sistemaOsoaGeldiEdoMartxan = true; // true: martxan false: geldi

	/** The ia sistema on off. */
	private static boolean iaSistemaOnOff = true; // true: martxan false: geldi

	public static boolean isIaSistemaOnOff() {
		return iaSistemaOnOff;
	}

	public static void setIaSistemaOnOff(boolean iaSistemaOnOff) {
		VariablesGlobales.iaSistemaOnOff = iaSistemaOnOff;
	}

	public static boolean isSistemaOsoaGeldiEdoMartxan() {
		return sistemaOsoaGeldiEdoMartxan;
	}

	public static void setSistemaOsoaGeldiEdoMartxan(boolean sistemaOsoaGeldiEdoMartxan) {
		VariablesGlobales.sistemaOsoaGeldiEdoMartxan = sistemaOsoaGeldiEdoMartxan;
	}

	public static ArrayList<Pakete> getListaPakEnEsperaParaIA() {
		return listaPakEnEsperaParaIA;
	}

	public static void setListaPakEnEsperaParaIA(ArrayList<Pakete> listaPakEnEsperaParaIA) {
		VariablesGlobales.listaPakEnEsperaParaIA = listaPakEnEsperaParaIA;
	}

}
