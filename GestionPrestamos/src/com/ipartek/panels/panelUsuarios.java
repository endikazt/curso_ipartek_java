package com.ipartek.panels;

import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import com.ipartek.model.Admin;
import com.ipartek.model.Disco;
import com.ipartek.model.Usuario;
import com.ipartek.utils.Auxiliar;

import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;

public class panelUsuarios extends JPanel {
	private JTable tableUsuarios;
	private JTextField textNombre;
	private JTextField textApellidos;
	private JTextField textDNI;
	
	public panelUsuarios(Admin admin) {
		
		this.setBounds(0, 0, 669, 536);
		this.setBackground(new Color(100, 149, 237));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 669, 92);
		panel.setLayout(null);
		panel.setBackground(new Color(0, 0, 139));
		add(panel);
		
		JLabel lblBienvenidoALa = new JLabel("Panel de gestión de usuarios");
		lblBienvenidoALa.setHorizontalAlignment(SwingConstants.LEFT);
		lblBienvenidoALa.setForeground(Color.WHITE);
		lblBienvenidoALa.setFont(new Font("Decker", Font.BOLD | Font.ITALIC, 24));
		lblBienvenidoALa.setBounds(10, 0, 659, 92);
		panel.add(lblBienvenidoALa);
		
		String col[] = {"DNI", "NOMBRE", "APELLIDOS"};
		
		DefaultTableModel tableModel = new DefaultTableModel(col,0);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 261, 651, 267);
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBorder(new LineBorder(new Color(255, 255, 255), 3, true));
		panel_1.setBackground(new Color(70, 130, 180));
		add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(9, 10, 632, 249);
		panel_1.add(scrollPane);
		
		tableUsuarios = new JTable();
		scrollPane.setViewportView(tableUsuarios);
		tableUsuarios.setModel(tableModel);
		
		Auxiliar.mostrarUsuarios(admin.getListaUsuarios(),tableUsuarios);
		Auxiliar.refrescarTablaUsuarios(admin, tableUsuarios);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(tableUsuarios, popupMenu);
		
		JMenuItem mntmEliminar = new JMenuItem("Eliminar");
		mntmEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int filaSeleccionadaTabla = tableUsuarios.getSelectedRow();
				
				if(filaSeleccionadaTabla == -1)
				{
					System.out.println("Tienes que seleccionar una elemento");
				}
				else
				{
					String dniUsuario = (String) tableUsuarios.getValueAt(filaSeleccionadaTabla, 0);
					
									
					admin.eliminarUsuario(Auxiliar.buscarUsuario(dniUsuario, admin));
				}
				
			}
		});
		popupMenu.add(mntmEliminar);
		mntmEliminar.setIcon(new ImageIcon(getClass().getResource("/icons/icons8_Trash_Can_14px.png")));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(13, 250, 649, 8);
		separator.setForeground(new Color(255, 255, 255));
		add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Lista de usuarios");
		lblNewLabel_2.setBounds(13, 221, 648, 22);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 20));
		add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(255, 255, 255), 3, true));
		panel_2.setBackground(new Color(70, 130, 180));
		panel_2.setBounds(11, 138, 654, 76);
		add(panel_2);
		panel_2.setLayout(null);
		
		textNombre = new JTextField();
		textNombre.setBounds(13, 44, 166, 20);
		panel_2.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(14, 15, 166, 19);
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 16));
		
		textApellidos = new JTextField();
		textApellidos.setBounds(188, 44, 166, 20);
		panel_2.add(textApellidos);
		textApellidos.setColumns(10);
		
		JLabel lblGenero = new JLabel("DNI");
		lblGenero.setForeground(new Color(255, 255, 255));
		lblGenero.setBounds(360, 13, 166, 20);
		panel_2.add(lblGenero);
		lblGenero.setFont(new Font("Dialog", Font.BOLD, 16));
		
		textDNI = new JTextField();
		textDNI.setBounds(361, 44, 166, 20);
		panel_2.add(textDNI);
		textDNI.setColumns(10);
		
		JButton btnCrearUsuario = new JButton("A\u00F1adir");
		btnCrearUsuario.setBounds(533, 17, 115, 47);
		panel_2.add(btnCrearUsuario);
		btnCrearUsuario.setFont(new Font("Dialog", Font.BOLD, 13));
		
		JLabel lblGrupo = new JLabel("Apellidos");
		lblGrupo.setForeground(new Color(255, 255, 255));
		lblGrupo.setBounds(188, 13, 166, 20);
		panel_2.add(lblGrupo);
		lblGrupo.setFont(new Font("Dialog", Font.BOLD, 16));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(14, 127, 646, 8);
		add(separator_1);
		separator_1.setForeground(Color.WHITE);
		
		JLabel lblNuevoDisco = new JLabel("Nuevo usuario");
		lblNuevoDisco.setBounds(13, 99, 655, 20);
		add(lblNuevoDisco);
		lblNuevoDisco.setForeground(Color.WHITE);
		lblNuevoDisco.setFont(new Font("Dialog", Font.BOLD, 20));
		btnCrearUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String nombre = textNombre.getText();
				String apellidos = textApellidos.getText();
				String dni = textDNI.getText();
				
				if (nombre.length()>3) {
					if (apellidos.length()>4) {
						if (Auxiliar.validarDni(dni)) {
							Usuario usuario = new Usuario(nombre,apellidos,dni);
							
							admin.getListaUsuarios().add(usuario);
							
							//Mostramos mensaje emergente al usuario
							JOptionPane.showMessageDialog(null, "Se ha añadido el usuario " + nombre + " "  + apellidos + " correctamente a la lista.");
							
							Auxiliar.refrescarTablaUsuarios(admin, tableUsuarios);
						}else {
							JOptionPane.showMessageDialog(null, "Debes introducir un DNI válido");
						}
					}else {
						JOptionPane.showMessageDialog(null, "Debes introducir un apellido válido");
					}
				}else {
					JOptionPane.showMessageDialog(null, "Debes introducir un nombre válido");
				}
	
			}
		});
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}


