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
import com.ipartek.utils.ComboDisco;
import com.ipartek.utils.ComboUsuarios;

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
import javax.swing.JComboBox;

public class panelPrestamos extends JPanel {
	private JTable tableDiscos;
	
	public panelPrestamos(Admin admin) {
		
		this.setBounds(0, 0, 669, 536);
		this.setBackground(new Color(100, 149, 237));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 669, 92);
		panel.setLayout(null);
		panel.setBackground(new Color(0, 0, 139));
		add(panel);
		
		JLabel lblBienvenidoALa = new JLabel("Panel de gestión de prestamos");
		lblBienvenidoALa.setHorizontalAlignment(SwingConstants.LEFT);
		lblBienvenidoALa.setForeground(Color.WHITE);
		lblBienvenidoALa.setFont(new Font("Decker", Font.BOLD | Font.ITALIC, 24));
		lblBienvenidoALa.setBounds(10, 0, 659, 92);
		panel.add(lblBienvenidoALa);
		
		String col[] = {"CODIGO","DNI", "NOMBRE", "APELLIDOS", "COD_DISCO", "TITULO"};
		
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
		
		tableDiscos = new JTable();
		scrollPane.setViewportView(tableDiscos);
		tableDiscos.setModel(tableModel);
		
		Auxiliar.mostrarDiscos(admin.getListaDiscos(),tableDiscos);
		Auxiliar.refrescarTablaPrestamos(admin, tableDiscos);
		
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
					int codigoPrestamo = (int) tableDiscos.getValueAt(filaSeleccionadaTabla, 0);
					
									
					admin.eliminarPrestamo(Auxiliar.buscarPrestamo(codigoPrestamo, admin));
				}
				
			}
		});
		popupMenu.add(mntmEliminar);
		mntmEliminar.setIcon(new ImageIcon(getClass().getResource("/icons/icons8_Trash_Can_14px.png")));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(13, 250, 649, 8);
		separator.setForeground(new Color(255, 255, 255));
		add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Lista de prestamos");
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
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(14, 15, 239, 19);
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 16));
		
		JButton btnCrearDisco = new JButton("<html><p align='center'>Crear <br/>prestamo</p></html>");
		btnCrearDisco.setBounds(513, 17, 131, 47);
		panel_2.add(btnCrearDisco);
		btnCrearDisco.setFont(new Font("Dialog", Font.BOLD, 13));
		
		JLabel lblGrupo = new JLabel("Disco");
		lblGrupo.setForeground(new Color(255, 255, 255));
		lblGrupo.setBounds(263, 14, 240, 20);
		panel_2.add(lblGrupo);
		lblGrupo.setFont(new Font("Dialog", Font.BOLD, 16));
		
		JComboBox<ComboUsuarios> comboUsuarios = new JComboBox<ComboUsuarios>();
		comboUsuarios.setBounds(14, 45, 239, 20);
		panel_2.add(comboUsuarios);
		
		for(int i = 0; i < admin.getListaUsuarios().size(); i++)
		{
			comboUsuarios.addItem(new ComboUsuarios(admin.getListaUsuarios().get(i).getDniUsuario(), admin.getListaUsuarios().get(i)));
		}
		
		JComboBox<ComboDisco> comboDiscos = new JComboBox<ComboDisco>();
		comboDiscos.setBounds(264, 44, 239, 20);
		panel_2.add(comboDiscos);
		
		for(int i = 0; i < admin.getListaDiscos().size(); i++)
		{
			if(admin.getListaDiscos().get(i).getEstaPrestado() == false)
			{
				comboDiscos.addItem(new ComboDisco(admin.getListaDiscos().get(i).getCodigoDisco(), admin.getListaDiscos().get(i)));
			}
		}
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(14, 127, 646, 8);
		add(separator_1);
		separator_1.setForeground(Color.WHITE);
		
		JLabel lblNuevoDisco = new JLabel("Nuevo prestamo");
		lblNuevoDisco.setBounds(13, 99, 655, 20);
		add(lblNuevoDisco);
		lblNuevoDisco.setForeground(Color.WHITE);
		lblNuevoDisco.setFont(new Font("Dialog", Font.BOLD, 20));
		btnCrearDisco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ComboUsuarios comboUsuario = (ComboUsuarios) comboUsuarios.getSelectedItem();
				
				ComboDisco comboDisco = (ComboDisco) comboDiscos.getSelectedItem();
				
				admin.abrirPrestamo(comboUsuario.getUsuario(), comboDisco.getDisco());
				
				Auxiliar.refrescarTablaPrestamos(admin, tableDiscos);
				
				comboDiscos.removeAllItems();
				
				Auxiliar.recargarComboDiscos(comboDiscos, admin);
			
				
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


