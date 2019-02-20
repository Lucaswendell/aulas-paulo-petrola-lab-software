package modelo;

public final class Venda {
	private Usuario usu = new Usuario();
	private Produto pro = new Produto();
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
	public Produto getPro() {
		return pro;
	}
	public void setPro(Produto pro) {
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
