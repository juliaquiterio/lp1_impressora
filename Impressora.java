package impressora;

public class Impressora {
    private String material;
    private String tamanho;
    private String peso;
    private String cor;
    private String modelo;
    
    public String getMaterial() {
		return material;
	}

	
	public void setMaterial(String material) {
		this.material = material;
		
	}
	
	public String getTamanho(){
		return tamanho;
	}
	
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
		
	}
	
	public String getPeso() {
		return peso;
	}
	
	public void setPeso(String peso) {
		this.peso = peso;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;	
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

    public static void main(String[] args) {
        Impressora c1=new Impressora();
        
    }
    
}
