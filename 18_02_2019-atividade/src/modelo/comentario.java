package modelo;

import java.util.Date;
import java.util.ArrayList;

public final class comentario {
	private Usuario usu = new Usuario();
	private ArrayList<Produto> prod = new ArrayList<Produto>();
	private String Comentario; 
	private Date dat = new Date();
	public Usuario getUsu() {
		return usu;
	}
	public void setUsu(Usuario usu) {
		this.usu = usu;
	}
	public ArrayList<Produto> getProd() {
		return prod;
	}
	public void setProd(ArrayList<Produto> prod) {
		this.prod = prod;
	}
	public String getComentario() {
		return Comentario;
	}
	public void setComentario(String comentario) {
		Comentario = comentario;
	}
	public Date getDat() {
		return dat;
	}
	public void setDat(Date dat) {
		this.dat = dat;
	}
	
	
	
	
}
