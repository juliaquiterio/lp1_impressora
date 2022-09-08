public class Impressora {
	
	private String material;
	private int tamanho;
	private double peso;
	private String cor;
	private String modelo;
	
	//
	public String getMaterial() {
		return material;
	}

	
	public void setMaterial(String material) {
		this.material = material;
		
	}
	
	public int getTamanho(){
		return tamanho;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
		
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
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
	
	//métodos de classes
	public String imprimir() {
		return ("Sua impressão está sendo carregada... aguarde");
	}
	
	public String carregartinta() {
		return ("ATENÇÃO! Carregue o toner de tinta para não causar danos futuros no dispositivo!");
			
	}
	
	public void armazenarpapel(int papel) {
		System.out.println("A impressora tem" + papel + "papeis.");
	}
	
	public String Carregar_Tinta() {
		System.out.println("Carregue seu Toner de tinta")
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//criando o objeto
		Impressora c1 = new Impressora();
		c1.setTamanho(50);
		System.out.println(c1.imprimir());
		c1.Carregar_Tinta();
		System.out.println(c1.carregartinta());
		
		
	}

	

}