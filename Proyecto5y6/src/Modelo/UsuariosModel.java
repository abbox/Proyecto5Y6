package Modelo;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuariosModel {
	
	private int id;
	private String nombre;
	private String password;
	private String usuario;
	
	public UsuariosModel(){
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public ArrayList<String> load(){
		ConexionBD conexion = ConexionBD.getInstance();
		ResultSet resultado = conexion.query("select * FROM usuarios");
		
		ArrayList<String> nombresUsuario = new ArrayList<String>();
		ArrayList<UsuariosModel> usuarios = new ArrayList<UsuariosModel>();
		try{
			while(resultado.next()){
				UsuariosModel usuario = new UsuariosModel();
				usuario.setId((int)resultado.getObject("id"));
				usuario.setNombre((String)resultado.getObject("nombre"));
				usuario.setPassword((String)resultado.getObject("pass"));
				usuario.setUsuario((String)resultado.getObject("usuario"));
				usuarios.add(usuario);
				nombresUsuario.add(usuario.getNombre());
			}
		}
		catch(SQLException errorCargaDatos){
			errorCargaDatos.printStackTrace();
			System.out.println("ERROR LOAD USUARIOS");
		}
		return nombresUsuario;
	}
}
