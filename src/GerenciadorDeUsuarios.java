import java.util.List;
import java.util.ArrayList;


public class GerenciadorDeUsuarios {
	private List<Usuario> usuarios;
	
	public GerenciadorDeUsuarios() {
		this.usuarios = new ArrayList<>();
	}
	
	public void adicionarUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}
	
	public void removerUsuario(int id) {
		usuarios.removeIf(usuario -> usuario.getId() == id);
	}
	
	public Usuario buscarUsuarioId(int id) {
		for(Usuario usuario : usuarios) {
			if(usuario.getId() == id) {
				return usuario;
			}
		}
		return null;
	}
	
	public List<Usuario> listarUsuarios(){
		return new ArrayList<>(usuarios);
	}
}
