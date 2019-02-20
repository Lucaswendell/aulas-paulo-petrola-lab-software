package modelo;

import java.util.ArrayList;

public final class Venda {
	private Usuario usu = new Usuario();
	private ArrayList<Produto> pro = new ArrayList<Produto>();
	private int qua;
	private float vt;
	private String tipoPg;
	private boolean status;
	public Usuario getUsu() {
		return usu;
	}
	public void setUsu(Usuario usu) {
		this.usu = usu;
	}
	public ArrayList<Produto> getPro() {
		return pro;
	}
	public void setPro(ArrayList<Produto> pro) {
		this.pro = pro;
	}
	public int getQua() {
		return qua;
	}
	public void setQua(int qua) {
		this.qua = qua;
	}
	public float getVt() {
		return vt;
	}
	public void setVt(float vt) {
		this.vt = vt;
	}
	public String getTipoPg() {
		return tipoPg;
	}
	public void setTipoPg(String tipoPg) {
		this.tipoPg = tipoPg;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	} 
	
}
