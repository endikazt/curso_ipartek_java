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

public class panelDiscos extends JPanel {
	private JTable tableDiscos;
	private JTextField textTitulo;
	private JTextField textGrupo;
	private JTextField textGenero;
	
	public panelDiscos(Admin admin) {
		
		this.setBounds(0, 0, 669, 536);
		this.setBackground(new Color(100, 149, 237));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 669, 92);
		panel.setLayout(null);
		panel.setBackground(new Color(0, 0, 139));
		add(panel);
		
		JLabel lblBienvenidoALa = new JLabel("Panel de gestión de discos");
		lblBienvenidoALa.setHorizontalAlignment(SwingConstants.LEFT);
		lblBienvenidoALa.setForeground(Color.WHITE);
		lblBienvenidoALa.setFont(new Font("Decker", Font.BOLD | Font.ITALIC, 24));
		lblBienvenidoALa.setBounds(10, 0, 659, 92);
		panel.add(lblBienvenidoALa);
		
		String col[] = {"CÓDIGO", "TÍTULO", "GRUPO", "GÉNERO", "PRESTADO"};
		
		DefaultTableModel tableModel = new DefaultTableModel(col,0);
		
		JLabel lblNewLabel_2 = new JLabel("Lista de discos");
		lblNewLabel_2.setBounds(13, 221, 648, 22);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 20));
		add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(13, 250, 649, 8);
		separator.setForeground(new Color(255, 255, 255));
		add(separator);
		
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
		
		tableDiscos = new JTable();
		scrollPane.setViewportView(tableDiscos);
		tableDiscos.setModel(tableModel);
		
		Auxiliar.mostrarDiscos(admin.getListaDiscos(),tableDiscos);
		Auxiliar.refrescarTablaDiscos(admin, tableDiscos);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(tableDiscos, popupMenu);
		
		JMenuItem mntmEliminar = new JMenuItem("Eliminar");
		mntmEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int filaSeleccionadaTabla = tableDiscos.getSelectedRow();
				
				if(filaSeleccionadaTabla == -1)
				{
					System.out.println("Tienes que seleccionar una elemento");
				}
				else
				{
					int codigDisco = (int) tableDiscos.getValueAt(filaSeleccionadaTabla, 0);
					
									
					admin.eliminarDisco(Auxiliar.buscarDisco(codigDisco, admin));
				}
			}
		});
		popupMenu.add(mntmEliminar);
		mntmEliminar.setIcon(new ImageIcon(getClass().getResource("/icons/icons8_Trash_Can_14px.png")));
		
		JLabel lblNuevoDisco = new JLabel("Nuevo disco");
		lblNuevoDisco.setBounds(13, 99, 655, 20);
		add(lblNuevoDisco);
		lblNuevoDisco.setForeground(Color.WHITE);
		lblNuevoDisco.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(14, 127, 646, 8);
		add(separator_1);
		separator_1.setForeground(Color.WHITE);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(255, 255, 255), 3, true));
		panel_2.setBackground(new Color(70, 130, 180));
		panel_2.setBounds(11, 138, 654, 76);
		add(panel_2);
		panel_2.setLayout(null);
		
		textTitulo = new JTextField();
		textTitulo.setBounds(13, 44, 166, 20);
		panel_2.add(textTitulo);
		textTitulo.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Titulo");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(14, 15, 166, 19);
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 16));
		
		textGrupo = new JTextField();
		textGrupo.setBounds(188, 44, 166, 20);
		panel_2.add(textGrupo);
		textGrupo.setColumns(10);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setForeground(new Color(255, 255, 255));
		lblGenero.setBounds(360, 13, 166, 20);
		panel_2.add(lblGenero);
		lblGenero.setFont(new Font("Dialog", Font.BOLD, 16));
		
		textGenero = new JTextField();
		textGenero.setBounds(361, 44, 166, 20);
		panel_2.add(textGenero);
		textGenero.setColumns(10);
		
		JButton btnCrearDisco = new JButton("A\u00F1adir disco");
		btnCrearDisco.setBounds(533, 17, 115, 47);
		panel_2.add(btnCrearDisco);
		btnCrearDisco.setFont(new Font("Dialog", Font.BOLD, 13));
		
		JLabel lblGrupo = new JLabel("Grupo");
		lblGrupo.setForeground(new Color(255, 255, 255));
		lblGrupo.setBounds(188, 13, 166, 20);
		panel_2.add(lblGrupo);
		lblGrupo.setFont(new Font("Dialog", Font.BOLD, 16));
		btnCrearDisco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String titulo = textTitulo.getText();
				String grupo = textGrupo.getText();
				String genero = textGenero.getText();
				
				if (titulo.length()>2) {
					if (grupo.length()>3) {
						if (genero.length()>2) {
							Disco disco = new Disco(titulo,grupo,genero, false);
							
							admin.getListaDiscos().add(disco);
							
							//Mostramos mensaje emergente al usuario
							JOptionPane.showMessageDialog(null, "Se ha añadido el disco " + titulo + " correctamente a la lista.");
							
							Auxiliar.refrescarTablaDiscos(admin, tableDiscos);
						}else {
							JOptionPane.showMessageDialog(null, "Debes introducir un nombre de género válido");
						}
					}else {
						JOptionPane.showMessageDialog(null, "Debes introducir un nombre de grupo válido");
					}
				}else {
					JOptionPane.showMessageDialog(null, "Debes introducir un nombre de título válido");
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


