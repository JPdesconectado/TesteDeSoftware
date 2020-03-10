
public class Tarefa {

	
	private String titulo;
	
	private String descricao;
	
	private String data;
	
	public Tarefa() {
		
	}
	
	public Tarefa(String titulo, String descricao, String data) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.data = data;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public String checkID() {
		if(titulo.isBlank())
			return null;
		
		return titulo;
	}
}
