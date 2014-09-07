package entidade;

public class Cliente implements Comparable<Cliente> {

	private Integer idCliente;
	private String nome;
	private String email;
	private String sexo;

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(Integer idCliente, String nome, String email, String sexo) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nome=" + nome
				+ ", email=" + email + ", sexo=" + sexo + "]";
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	@Override
	public int compareTo(Cliente o) {
		
		return  this.nome.compareTo(o.getNome());
	}

}
