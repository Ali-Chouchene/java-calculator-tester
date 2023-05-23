package org.lessons.java.calculator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	Date today = new Date();
	public String nome;
	public String cognome;
	public Date dataN;
	public String ruolo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != "") {
			this.nome = nome;
		}

	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		if (cognome != "") {
			this.cognome = cognome;
		}
	}

	public Date getDataN() {
		return dataN;
	}

	public void setDataN(String dataIN) throws ParseException {
		SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
		Date dateO = formatter1.parse(dataIN);
		if (today.compareTo(dateO) < 0) {
			this.dataN = dateO;
		}

	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		String ruoloTLC = ruolo.toLowerCase();
		if (ruoloTLC == "employee" || ruoloTLC == "boss") {
			this.ruolo = ruolo;
		}

	}

}
