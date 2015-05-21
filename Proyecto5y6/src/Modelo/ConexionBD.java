package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class ConexionBD {
	static final String CONTROLADOR_MYSQL="com.mysql.jbdc.Driver";
	//----------------------------------------------------------------
	private Connection con;
	private String host="localhost";
	private String bbdd="proyecto6";
	private String user="root";
	private String pass="";
	//----------------------------------------------------------------
	private static ConexionBD instance=null;
	
	public ConexionBD(){
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			System.out.println("CONTROLADOR CARGADO CORRECTAMENTE");
		} 
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("ERROR EN LA CARGA DEL CONTROLADOR");
		}
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://"+host+"/"+bbdd+"?"+"user="+user+"&password="+pass);
			System.out.println("CONEXION ESTABLECIDA CORRECTAMENTE");
		} 
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ERROR DE CONEXION");
		}
	}
	
	public static ConexionBD getInstance(){
		if(instance==null){
			instance = new ConexionBD();
		}
		return instance;
	}
	
public ResultSet query(String query){
		
		
		Statement st;
		ResultSet rs = null;

		try {
			st = con.createStatement();
			try{
				rs = st.executeQuery(query);
			}catch (SQLException e){
				e.printStackTrace();
			}
		
		} catch (SQLException e1) {
				// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		return rs;	
										
	}
	
	//Con este metodo vamos a hacer los inserts, update y deletes.
	public int modifyQuery(String update){
		Statement stmt;
		int rs = 0;
		try{
		stmt = con.createStatement();		
			try{
				rs = stmt.executeUpdate(update);
			}catch (SQLException e){
				
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return rs;
	}


}
