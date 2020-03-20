package Vistas;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Perfil extends JFrame implements ActionListener{
	JButton camnom, galeria, mascota, buscar, perfil, informacion, email, contraseña, telefono, salir;
	JPanel panel;
	JLabel nombre, correo;
	ImageIcon camara, find, user, pet, info;
	int i = 0;
	String imagen[] = new String[1];
	public Perfil() {
		
		panel = new JPanel(null);
		camnom = new JButton("Cambiar Nombre y Apellidos");
		email = new JButton("Cambiar Email");
		telefono = new JButton("Cambiar Número de Telefóno");
		contraseña = new JButton("Cambiar Contraseña");
		salir = new JButton("Cerrar Sesión");
		nombre = new JLabel ("User name");
		correo = new JLabel ("example@example.com");
		panel.setBackground(Color.white);
	
		camnom.setBounds(80, 150, 210, 20);
		camnom.setBorder(null);
		camnom.setBackground(Color.WHITE);
		camnom.addActionListener(this);
		panel.add(camnom);
		
		email.setBounds(80, 200, 210, 20);
		email.setBorder(null);
		email.setBackground(Color.WHITE);
		email.addActionListener(this);
		panel.add(email);
		
		telefono.setBounds(80, 250, 210, 20);
		telefono.setBorder(null);
		telefono.setBackground(Color.WHITE);
		telefono.addActionListener(this);
		panel.add(telefono);
		
		contraseña.setBounds(80, 300, 210, 20);
		contraseña.setBorder(null);
		contraseña.setBackground(Color.WHITE);
		contraseña.addActionListener(this);
		panel.add(contraseña);
		
		salir.setBounds(250, 350, 95, 20);
		salir.setBorder(null);
		salir.setBackground(Color.green);
		salir.addActionListener(this);
		panel.add(salir);
		
		camara = new ImageIcon("camara.png");
		galeria = new JButton(new ImageIcon(camara.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
		
		galeria.setBounds(110, 40, 50, 50);
		galeria.setBorder(null);
		galeria.setBackground(Color.GRAY);
		galeria.addActionListener(this);
		panel.add(galeria);
		
		nombre.setBounds(180, 45, 100, 30);
		panel.add(nombre);
		correo.setBounds(180, 60, 150, 30);
		panel.add(correo);
		
		find = new ImageIcon("buscar.png");
		buscar = new JButton(new ImageIcon(find.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
		buscar.setBounds(105,410,80,40);
		buscar.setBackground(Color.white);
		buscar.setBorder(null);
		panel.add(buscar);
		
		user = new ImageIcon("user.png");
		perfil = new JButton(new ImageIcon(user.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
		perfil.setBounds(193, 410, 80, 40);
		perfil.setBackground(Color.white);
		perfil.setBorder(null);
		panel.add(perfil);
		
		pet = new ImageIcon("pet.png");
		mascota = new JButton(new ImageIcon(pet.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
		mascota.setBounds(15, 410, 80, 40);
		mascota.setBackground(Color.white);
		mascota.setBorder(null);
		panel.add(mascota);
		
		info = new ImageIcon("info.png");
		informacion = new JButton(new ImageIcon(info.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
		informacion.setBounds(280, 410, 80, 40);
		informacion.setBackground(Color.white);
		informacion.setBorder(null);
		panel.add(informacion);
		
		this.add(panel);
		this.setTitle("Mi Cuenta");
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setSize(379,500);
	}
	
	public String mostrarImagen() {
		return imagen[1];
	}
	public void buscarImagen() {
		File archivoSeleccionado;
		JFileChooser seleccionarArchivo;
		if(i < 3) {
			seleccionarArchivo = new JFileChooser();
			seleccionarArchivo.showOpenDialog(null);
			archivoSeleccionado = seleccionarArchivo.getSelectedFile();	
			System.out.println("El archivo seleccionado es: "+archivoSeleccionado);
			imagen[i] = String.valueOf(archivoSeleccionado);
			i += 1;
		}else {
			System.out.print("Solo se permite 1 foto.");
			System.out.print(imagen[0]);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(galeria)){
			buscarImagen();
		}
		else if(e.getSource().equals(camnom)) {
			
		}
	}
}