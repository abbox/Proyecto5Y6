package Vista;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VistaApp extends JFrame {

	private VistaPrincipal vp;
	private VistaJuegos vj;

	public VistaApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 446);
		menu();
		
		
		
		//DECLARACION DE PANELES
		vp = new VistaPrincipal();
		vj = new VistaJuegos();
		getContentPane().setLayout(new CardLayout(0, 0));
		
		
		this.getContentPane().add(vp, "Principal");
		this.getContentPane().add(vj, "Juegos");
		
	}
	
	private void menu(){
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnPrincipal = new JMenu("Principal");
		menuBar.add(mnPrincipal);
		
		JMenuItem mntmPrincipal = new JMenuItem("Principal");
		mntmPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout layout = (CardLayout)getContentPane().getLayout();
				layout.show(getContentPane(), "Principal");
				
			}
		});
		mnPrincipal.add(mntmPrincipal);
		
		JMenu mnJuegos = new JMenu("Juegos");
		menuBar.add(mnJuegos);
		
		JMenuItem mntmJuegos = new JMenuItem("Juegos");
		mntmJuegos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout layout = (CardLayout)getContentPane().getLayout();
				layout.show(getContentPane(), "Juegos");
			}
		});
		mnJuegos.add(mntmJuegos);
		
		JMenu mnPerfil = new JMenu("Perfil");
		menuBar.add(mnPerfil);
		
		JMenuItem mntmPerfil = new JMenuItem("Perfil");
		mnPerfil.add(mntmPerfil);
	}
}
