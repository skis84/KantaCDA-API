package fi.kela.kanta.cda.validation;

import javax.swing;

import fi.kela.kanta.to.LaakemaaraysTO;

public abstract class LaakemaaraysValidoija extends Validoija {
	protected LaakemaaraysTO alkuperainenLaakemaarays;
	public LaakemaaraysValidoija(LaakemaaraysTO alkuperainenLaakemaarays) {
		setAlkuperainenLaakemaarays(alkuperainenLaakemaarays);
	}
	
	public LaakemaaraysTO getAlkuperainenLaakemaarays() {
		return alkuperainenLaakemaarays;
	}

	public void setAlkuperainenLaakemaarays(LaakemaaraysTO alkuperainenLaakemaarays) {
		this.alkuperainenLaakemaarays = alkuperainenLaakemaarays;
	}

	

}
