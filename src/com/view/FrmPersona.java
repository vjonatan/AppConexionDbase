package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Component;

public class FrmPersona extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField txtDni;
	public JTextField txtNombre;
	public JTextField txtId;
	
	public JButton btnPrimero;
	public JButton btnUltimo;
	public JButton btnAnterior;
	public JButton btnSiguiente;
	public JButton btnDeshacer;
	public JButton btnImprimir;
	
	public JButton btnNuevo;
	public JButton btnGuardar;
	public JButton btnModificar;
	public JButton btnEliminar;
	private JTextField textField;
	private JLabel lblUbicacin;
	private JTextField textField_1;
	private JLabel lblFechaNacimiento;
	private JLabel lblSexo;
	private JLabel lblEstadoCivil;
		

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPersona frame = new FrmPersona();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmPersona() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrmPersona.class.getResource("/imagenes/printer.ico")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 777, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		/***************************************
		 * BOTONES
		 * *************************************
		 */
		
		btnPrimero = new JButton("<<");
		btnPrimero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPrimero.setBounds(55, 437, 50, 26);
		contentPane.add(btnPrimero);
		
		btnAnterior = new JButton("<");
		btnAnterior.setBounds(179, 437, 50, 26);
		contentPane.add(btnAnterior);
		
		btnSiguiente = new JButton(">");
		btnSiguiente.setBounds(296, 437, 50, 26);
		contentPane.add(btnSiguiente);
		
		btnUltimo = new JButton(">>");
		btnUltimo.setBounds(413, 437, 50, 26);
		contentPane.add(btnUltimo);
		
		btnDeshacer = new JButton("Deshacer");
		btnDeshacer.setBounds(631, 214, 98, 26);
		contentPane.add(btnDeshacer);
		
		btnImprimir = new JButton("Imprimir");
		btnImprimir.setIcon(new ImageIcon(FrmPersona.class.getResource("/imagenes/printer.ico")));
		btnImprimir.setBounds(631, 418, 98, 26);
		contentPane.add(btnImprimir);
		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(631, 31, 98, 26);
		contentPane.add(btnNuevo);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(631, 69, 98, 26);
		contentPane.add(btnGuardar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(631, 106, 98, 26);
		contentPane.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(631, 144, 98, 26);
		contentPane.add(btnEliminar);
		
		/**************************************
		 * JPANEL
		 ************************************** 
		 */
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 11, 514, 415);
		contentPane.add(panel);
		panel.setLayout(null);
		
		/**************************************
		 * JLABEL
		 ************************************** 
		*/
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(10, 56, 56, 16);
		panel.add(lblDni);		
		
		/**************************************
		 * JTXT
		 ************************************** 
		*/
		
		txtDni = new JTextField();		
		txtDni.setBounds(105, 56, 116, 20);
		panel.add(txtDni);
		txtDni.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre / R. Social:");
		lblNewLabel.setBounds(10, 80, 128, 16);
		panel.add(lblNewLabel);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(105, 80, 229, 20);
		panel.add(txtNombre);
		txtNombre.setEnabled(false);
		txtNombre.setColumns(10);		
		
		JLabel lblDatosPersonales = new JLabel("DATOS PERSONALES");
		lblDatosPersonales.setBounds(10, 11, 122, 14);
		panel.add(lblDatosPersonales);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 36, 345, 7);
		panel.add(separator);
		separator.setToolTipText("");
		separator.setForeground(Color.BLACK);
		
		JLabel lblCalle = new JLabel("Calle:");
		lblCalle.setBounds(10, 283, 56, 16);
		panel.add(lblCalle);
		
		textField = new JTextField();
		textField.setBounds(53, 281, 279, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		lblUbicacin = new JLabel("Ubicaci\u00F3n:");
		lblUbicacin.setBounds(342, 283, 56, 16);
		panel.add(lblUbicacin);
		
		textField_1 = new JTextField();
		textField_1.setBounds(393, 281, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		lblFechaNacimiento = new JLabel("Fecha Nacimiento:");
		lblFechaNacimiento.setBounds(10, 107, 88, 14);
		panel.add(lblFechaNacimiento);
		
		lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(10, 132, 46, 14);
		panel.add(lblSexo);
		
		lblEstadoCivil = new JLabel("Estado Civil:");
		lblEstadoCivil.setBounds(10, 157, 88, 14);
		panel.add(lblEstadoCivil);
		
		txtId = new JTextField();
		txtId.setVisible(false);
		txtId.setBounds(528, 34, 91, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);

	}
	
	public void setEstadoEdicion(boolean isEdicion){
		
		txtNombre.setEnabled( isEdicion );
		
		btnNuevo.setEnabled( !isEdicion );
		btnModificar.setEnabled( !isEdicion );
		btnEliminar.setEnabled( !isEdicion );
		btnImprimir.setEnabled( !isEdicion );
		
		btnAnterior.setEnabled( !isEdicion );
		btnPrimero.setEnabled( !isEdicion );
		btnSiguiente.setEnabled( !isEdicion );
		btnUltimo.setEnabled( !isEdicion );
		
	}
}
