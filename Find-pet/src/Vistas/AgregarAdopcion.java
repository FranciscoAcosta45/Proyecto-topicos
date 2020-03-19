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
import javax.swing.JTextField;

public class AgregarAdopcion extends JFrame implements ActionListener{
	JButton agregar, galeria, mascota, buscar, perfil, informacion;
	JTextField nombre, ubicacion, descripccion;
	JPanel panel;
	JLabel etiqueta;
	ImageIcon camara, find, user, pet, info;
	int i = 0;
	String imagen[] = new String[3];
	public AgregarAdopcion() {
		
		panel = new JPanel(null);
		agregar = new JButton("Agregar a adopcion");
		nombre = new JTextField("Nombre de la mascota");
		ubicacion = new JTextField("Ubicacion");
		descripccion = new JTextField("Descripcion de la mascota");
		
		panel.setBackground(Color.white);
		
		//boton de agregar
		agregar.setBounds(80, 365, 210, 20);
		agregar.setBorder(null);
		agregar.setBackground(Color.GREEN);
		agregar.addActionListener(this);
		panel.add(agregar);
		
		//boton de galeria
		
		camara = new ImageIcon("camara.png");
		galeria = new JButton(new ImageIcon(camara.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
		
		galeria.setBounds(50, 140, 50, 50);
		galeria.setBorder(null);
		galeria.setBackground(Color.GRAY);
		galeria.addActionListener(this);
		panel.add(galeria);
		
		//ingresar nombre
		
		nombre.setBounds(80, 200, 210, 30);
		//nombre.setBorder(null);
		panel.add(nombre);
		
		ubicacion.setBounds(80, 240, 210, 30);
		panel.add(ubicacion);
		
		descripccion.setBounds(80, 280, 210, 60);
		panel.add(descripccion);
		
		//imagen de "portada"
		etiqueta = new JLabel(new ImageIcon("chalino2.jpg") );
		etiqueta.setBounds(0, 0, 500, 155);
		panel.add(etiqueta);
		
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
		this.setTitle("Agregar en adopcion");
		this.setLocationRelativeTo(null);
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
			System.out.print("Solo se pueden agregar 3 imagenes");
			System.out.print(imagen[0]);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(galeria)){
			buscarImagen();
		}
		else if(e.getSource().equals(agregar)) {
			
		}
	}
}
