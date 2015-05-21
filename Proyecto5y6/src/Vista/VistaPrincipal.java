package Vista;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import Modelo.UsuariosModel;


public class VistaPrincipal extends JPanel {
	
		private JLabel icono,Usuario,Contraseya;
		private JButton Perfiles,Juegos,login,Registrarse;
		private JTextField textField;
		private JComboBox<String> comboBox;
		
	/**
	 * Create the panel.
	 */
		
	public VistaPrincipal() {
		setLayout(null);
		
		Jlabel();
		JButton();
		JComobox();
		JTextFiel();
		
	}
	
	private void Jlabel(){
		//creamos un jlabel donde ira dentro la imagen
		icono = new JLabel("");
		icono.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/img/user.jpg")));
		icono.setBounds(55, 41, 148, 120);
		icono.setBorder(getBorder());
		Border border = LineBorder.createGrayLineBorder();
		
		add(icono);
		//ponemos en el jpanel el nombre de usuario
		Usuario = new JLabel("Usuario");
		Usuario.setBounds(55, 172, 148, 14);
		add(Usuario);
		
		//ponemos en el jpanel el nombre de contraseña
		Contraseya = new JLabel("Contraseña");
		Contraseya.setBounds(55, 228, 148, 14);
		add(Contraseya);
		
	}
	
	private void JButton(){

		//creamos el boton de juegos
		Juegos = new JButton("Juegos>");
		Juegos.setBounds(292, 61, 148, 23);
		add(Juegos);
		
		//creamos el boton de perfiles
		Perfiles = new JButton("Perfiles>");
		Perfiles.setBounds(292, 104, 148, 23);
		add(Perfiles);
		
		//creamos el boton de login
		login= new JButton("login");
		login.setBounds(55, 311, 148, 23);
		add(login);
		
		//creamos el boton de registrarse
		Registrarse = new JButton("Registrarse");
		Registrarse.setBounds(54, 345, 149, 23);
		add(Registrarse);
	}
	
	private void JComobox(){
		UsuariosModel um = new UsuariosModel();
		ArrayList<String> nombresUsuario = um.load();
		
		//ponemos un deplegable 
		comboBox = new JComboBox(nombresUsuario.toArray());
		comboBox.setBounds(55, 197, 148, 20);
		add(comboBox);
		
		
	}
	
	private void JTextFiel (){
		//ponemos un cuadro donde intruducir la contraseña
		textField = new JTextField();
		textField.setBounds(55, 265, 148, 20);		
		add(textField);
		textField.setColumns(10);
			
		
	}
}
