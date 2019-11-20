package com.ipartek.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;

import com.ipartek.panels.panelDiscos;
import com.ipartek.panels.panelPrestamos;
import com.ipartek.panels.panelUsuarios;

import com.ipartek.model.Admin;

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class AppUsuario extends JFrame {

	private JPanel contentPane;
	private JPanel botonDiscos;
	private JPanel botonPrestamos;
	private JPanel botonUsuarios;
	private JLayeredPane contenido;
	private panelDiscos panelDisco;
	private panelPrestamos panelPrestamo;
	private panelUsuarios panelUsuario;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppUsuario window = new AppUsuario();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public AppUsuario() throws SQLException {
		
		Admin admin = new Admin("71200145k", "Alain", "Moles");
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel menu = new JPanel();
		menu.setBackground(new Color(65, 105, 225));
		menu.setBounds(0, 0, 185, 536);
		contentPane.add(menu);
		menu.setLayout(null);
		
		// ---------------- MENU LATERAL -------------------
		
		botonDiscos = new JPanel();
		botonDiscos.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setColor(botonDiscos);
				restoreColor(botonPrestamos);
				restoreColor(botonUsuarios);
				panelDisco.setVisible(true);
				panelPrestamo.setVisible(false);
				panelUsuario.setVisible(false);

			}
		});
		
		JPanel panelInfo = new JPanel();
		panelInfo.setLayout(null);
		panelInfo.setBackground(new Color(65, 105, 225));
		panelInfo.setBounds(0, 11, 185, 49);
		menu.add(panelInfo);
		
		JLabel lblUsuarioSesion = new JLabel("");
		lblUsuarioSesion.setIcon(new ImageIcon(getClass().getResource("/icons/user_48px.png")));
		lblUsuarioSesion.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuarioSesion.setBounds(10, 0, 58, 49);
		panelInfo.add(lblUsuarioSesion);
		
		JLabel lblNombreUsuario = new JLabel(admin.getNombreUsuario());
		lblNombreUsuario.setForeground(new Color(245, 245, 245));
		lblNombreUsuario.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNombreUsuario.setBackground(new Color(245, 245, 245));
		lblNombreUsuario.setBounds(78, 0, 97, 49);
		panelInfo.add(lblNombreUsuario);
		botonDiscos.setBackground(new Color(100, 149, 237));
		botonDiscos.setBounds(0, 92, 185, 61);
		menu.add(botonDiscos);
		botonDiscos.setLayout(null);
		
			JLabel lblIconoDiscos = new JLabel("");
			lblIconoDiscos.setHorizontalAlignment(SwingConstants.CENTER);
			lblIconoDiscos.setIcon(new ImageIcon(getClass().getResource("/icons/cd_collection_50px.png")));
			lblIconoDiscos.setBounds(0, 0, 73, 61);
			botonDiscos.add(lblIconoDiscos);
			
			JLabel lblDiscos = new JLabel("Discos");
			lblDiscos.setForeground(new Color(245, 245, 245));
			lblDiscos.setFont(new Font("Dialog", Font.BOLD, 15));
			lblDiscos.setBounds(83, 0, 102, 61);
			botonDiscos.add(lblDiscos);
		
		botonPrestamos = new JPanel();
		botonPrestamos.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setColor(botonPrestamos);
				restoreColor(botonDiscos);
				restoreColor(botonUsuarios);
				panelDisco.setVisible(false);
				panelPrestamo.setVisible(true);
				panelUsuario.setVisible(false);

			}
		});
		botonPrestamos.setLayout(null);
		botonPrestamos.setBackground(new Color(0, 0, 139));
		botonPrestamos.setBounds(0, 153, 185, 61);
		menu.add(botonPrestamos);
		
			JLabel lblIconoPrestamos = new JLabel("");
			lblIconoPrestamos.setHorizontalAlignment(SwingConstants.CENTER);
			lblIconoPrestamos.setIcon(new ImageIcon(getClass().getResource("/icons/loan.png")));
			lblIconoPrestamos.setBounds(0, 0, 73, 61);
			botonPrestamos.add(lblIconoPrestamos);
			
			JLabel lblPrestamos = new JLabel("Prestamos");
			lblPrestamos.setForeground(new Color(245, 245, 245));
			lblPrestamos.setFont(new Font("Dialog", Font.BOLD, 15));
			lblPrestamos.setBounds(83, 0, 102, 61);
			botonPrestamos.add(lblPrestamos);
		
		botonUsuarios = new JPanel();
		botonUsuarios.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setColor(botonUsuarios);
				restoreColor(botonPrestamos);
				restoreColor(botonDiscos);
				panelDisco.setVisible(false);
				panelPrestamo.setVisible(false);
				panelUsuario.setVisible(true);

			}
		});
		botonUsuarios.setLayout(null);
		botonUsuarios.setBackground(new Color(0, 0, 139));
		botonUsuarios.setBounds(0, 214, 185, 61);
		menu.add(botonUsuarios);
		
			JLabel lblIconoUsuarios = new JLabel("");
			lblIconoUsuarios.setIcon(new ImageIcon(getClass().getResource("/icons/user_list_50px.png")));
			lblIconoUsuarios.setHorizontalAlignment(SwingConstants.CENTER);
			lblIconoUsuarios.setBounds(0, 0, 71, 61);
			botonUsuarios.add(lblIconoUsuarios);
			
			JLabel lblUsuarios = new JLabel("Usuarios");
			lblUsuarios.setForeground(new Color(245, 245, 245));
			lblUsuarios.setFont(new Font("Dialog", Font.BOLD, 15));
			lblUsuarios.setBounds(81, 0, 104, 61);
			botonUsuarios.add(lblUsuarios);
			
			JSeparator separator = new JSeparator();
			separator.setForeground(new Color(0, 0, 0));
			separator.setBounds(10, 71, 165, 10);
			menu.add(separator);
			separator.setBackground(new Color(0, 0, 0));
		
		contenido = new JLayeredPane();
		contenido.setBounds(185, 0, 669, 536);
		contentPane.add(contenido);
		
		
			// ---------------- PANEL DE INICIO -------------------
		
			panelDisco = new panelDiscos(admin);
			panelDisco.setBounds(0, 0, 669, 536);
			contenido.setLayer(panelDisco, 10);
			contenido.add(panelDisco);
	
			// ---------------- PANEL DE PERFIL -------------------
			
			panelPrestamo = new panelPrestamos(admin);
			panelPrestamo.setBounds(0, 0, 790, 662);
			contenido.setLayer(panelPrestamo, 8);
			contenido.add(panelPrestamo);
			
			// ---------------- PANEL DE AULAS -------------------
			
			panelUsuario = new panelUsuarios(admin);
			panelUsuario.setBounds(0, 0, 790, 662);
			contenido.setLayer(panelUsuario, 7);
			contenido.add(panelUsuario);
		
	}
	
	void setColor(JPanel jpanel) {
		jpanel.setBackground(new Color(100,149,237));
	}
	
	void restoreColor(JPanel jpanel) {
		jpanel.setBackground(new Color(0,0,139));
	}
}
