
public class Usuario {
	private int Id;
	private String Nome;
	private String Email;
	
	public Usuario(int id, String nome, String email) {
		this.Id = id;
		this.Nome = nome;
		this.Email = email;
	}
	
	
	// Getters e Setters 
	
	public int getId() {
		return Id;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public String getEmail() {
		return Email;
	}
	
	
	public void setId(int id) {
		this.Id = id;
	}
	
	public void setNome(String nome) {
		this.Nome = nome;
	}
	
	public void setEmail(String email) {
		this.Email = email;
	}
	
	@Override
	public String toString() {
		return "Id: " + Id + ", Nome: " + Nome + ", Email: " + Email;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		
		Usuario usuario = (Usuario) o;
		
		return Id == usuario.Id;
	}
}
