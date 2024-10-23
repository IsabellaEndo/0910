package dia0910;

public class itemTema {

		public long id;
		public String nome;
		public String descricao;
		
		public itemTema(long id, String nome, String descricao) {
		super();
		
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		}
		public long getId() {
		return id;
		}
		public void setId(long id) {
		this.id = id;
		}
		public String getNome() {
		return nome;
		}
		public void setNome(String nome) {
		this.nome = nome;
		}
		public String getDescricao() {
		return descricao;
		}
		public void setDescricao(String descricao) {
		this.descricao = descricao;
		}
		


	}


