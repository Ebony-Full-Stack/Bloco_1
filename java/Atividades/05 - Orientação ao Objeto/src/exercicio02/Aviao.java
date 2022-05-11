package exercicio02;
// Leonardo Alves

public class Aviao {

	private String modelo, fabricante, status;
	private Integer horasVoo;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public Integer getHorasVoo() {
		return horasVoo;
	}
	public void setHorasVoo(Integer horasVoo) {
		this.horasVoo = horasVoo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}	
	
	void vooAtual() {
		System.out.println("\n\nAeronave me voo. \nPartida: SBRJ\nDestino: SBSP");
	}
	
	
}
