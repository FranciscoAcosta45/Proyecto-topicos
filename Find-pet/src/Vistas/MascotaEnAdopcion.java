package Vistas;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MascotaEnAdopcion extends JFrame{
	JPanel panel;
	JButton mascota, buscar, perfil, informacion;
	ImageIcon find, user, pet, info;
	JLabel etiqueta, nombre, direccion, contacto,descripcion, telefono, correo, name, adress, descripction, telefonNumber, email;
	
	public MascotaEnAdopcion() {
		panel = new JPanel(null);
		nombre = new JLabel("Nombre de la Mascota :");
		direccion = new JLabel("Direccion :");
		descripcion = new JLabel("Descripcion de la Mascota :");
		contacto = new JLabel("Informacion de Contacto :");
		telefono = new JLabel("Telefono :");
		correo = new JLabel("Correo Electronico :");
		descripction = new JLabel("Es muy terco le gusta hacer mucha kk");
		name = new JLabel("Chalino");
		adress = new JLabel("calle 25 Becal");
		telefonNumber = new JLabel("9967843671");
		email = new JLabel("panfiloacosta@gmail.com");
		panel.setBackground(Color.white);
		
		//imagen de "portada"
		etiqueta = new JLabel(new ImageIcon("chalino2.jpg") );
		etiqueta.setBounds(0, 0, 370, 155);
		panel.add(etiqueta);
		
		
		nombre.setBounds(30, 160, 140, 30);
		panel.add(nombre);
		name.setBounds(170, 160, 140, 30);
		panel.add(name);
		
		direccion.setBounds(30, 190, 90, 30);
		panel.add(direccion);
		adress.setBounds(100, 190, 140, 30);
		panel.add(adress);
		
		descripcion.setBounds(30, 220, 170, 30);
		panel.add(descripcion);
		descripction.setBounds(30, 240, 250, 30);
		panel.add(descripction);
		
		contacto.setBounds(30, 300, 150, 30);
		panel.add(contacto);
		
		telefono.setBounds(30, 330, 80, 30);
		panel.add(telefono);
		telefonNumber.setBounds(100, 330, 80, 30);
		panel.add(telefonNumber);
		
		correo.setBounds(30, 360, 120, 30);
		panel.add(correo);
		email.setBounds(150, 360, 200, 30);
		panel.add(email);
		
		//navegacion
				//buscar
				find = new ImageIcon("buscar.png");
				buscar = new JButton(new ImageIcon(find.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
				buscar.setBounds(105,410,80,40);
				buscar.setBackground(Color.white);
				buscar.setBorder(null);
				panel.add(buscar);
				
				//perfil
				user = new ImageIcon("user.png");
				perfil = new JButton(new ImageIcon(user.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
				perfil.setBounds(193, 410, 80, 40);
				perfil.setBackground(Color.white);
				perfil.setBorder(null);
				panel.add(perfil);
				
				//mascota
				pet = new ImageIcon("pet.png");
				mascota = new JButton(new ImageIcon(pet.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
				mascota.setBounds(15, 410, 80, 40);
				mascota.setBackground(Color.white);
				mascota.setBorder(null);
				panel.add(mascota);
				
				//informacion
				info = new ImageIcon("info.png");
				informacion = new JButton(new ImageIcon(info.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
				informacion.setBounds(280, 410, 80, 40);
				informacion.setBackground(Color.white);
				informacion.setBorder(null);
				panel.add(informacion);
		
		
		this.add(panel);
		this.setTitle("Mascota En Adopcion");
		this.setLocationRelativeTo(null);
		this.setSize(379,500);
	}
}
