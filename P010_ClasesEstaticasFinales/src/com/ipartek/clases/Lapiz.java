package com.ipartek.clases;

public final class Lapiz extends Producto{
	
	private boolean tieneGoma;
	private Dureza dureza;
	
	public Lapiz(String referencia, boolean tieneGoma, Dureza dureza) {
		super(referencia);
		this.tieneGoma = tieneGoma;
		this.dureza = dureza;
	}

	public Lapiz(boolean tieneGoma, Dureza dureza) {
		super();
		this.tieneGoma = tieneGoma;
		this.dureza = dureza;
	}

	public Lapiz() {
		super();
		this.tieneGoma = false;
		this.dureza = new Dureza();
	}

	public boolean getTieneGoma() {
		return tieneGoma;
	}

	public void setTieneGoma(boolean tieneGoma) {
		this.tieneGoma = tieneGoma;
	}
	
	public Dureza getDureza() {
		return dureza;
	}

	public void setDureza(Dureza dureza) {
		this.dureza = dureza;
	}

	@Override
	public String mostrarInfo() {
		super.mostrarInfo();
		
		return "Lapiz [referencia=" + this.getReferencia() + ", tieneGoma=" + this.getTieneGoma() + ", tipoDureza=" + this.dureza.getNumeroDureza() +  this.dureza.getLetraDureza() + "]";
	}
	
	
	
}
