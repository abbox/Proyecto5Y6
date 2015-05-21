package Vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;

public class VistaJuegos extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public VistaJuegos() {
		setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(32, 41, 46, 14);
		add(lblNombre);
		
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(152, 41, 46, 14);
		add(lblGenero);
		
		JLabel lblPlataforma = new JLabel("Plataforma");
		lblPlataforma.setBounds(289, 41, 70, 14);
		add(lblPlataforma);
		
		textField = new JTextField();
		textField.setBounds(23, 66, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(152, 66, 70, 20);
		add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(286, 66, 60, 20);
		add(comboBox_1);
		
		JLabel lblNombre_1 = new JLabel("Nombre");
		lblNombre_1.setBounds(313, 113, 46, 14);
		add(lblNombre_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(313, 138, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblGenero_1 = new JLabel("Genero");
		lblGenero_1.setBounds(313, 169, 46, 14);
		add(lblGenero_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(313, 194, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPlataforma_1 = new JLabel("Plataforma");
		lblPlataforma_1.setBounds(313, 225, 86, 14);
		add(lblPlataforma_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(313, 245, 86, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(313, 277, 89, 23);
		add(btnEditar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(310, 316, 89, 23);
		add(btnSalvar);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(48, 128, 174, 172);
		add(scrollPane_1);
		
		JList list_1 = new JList();
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"jugador1", "jugador1", "jugador1", "jugador1", "jugador1", "jugador1", "jugador1", "jugador1", "jugador1", "jugador1", "jugador1", "jugador1"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane_1.setViewportView(list_1);

	
	
	
	}
}
