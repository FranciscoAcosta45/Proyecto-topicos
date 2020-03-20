package Vistas;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Buscar extends JFrame{
	JButton mascota, buscar, perfil, informacion;
	ImageIcon find, user, pet, info, noFund;
	JPanel panel;
	JLabel etiqueta;
	boolean encontrado = false;
	JTextField busca;
	public Buscar() {
		panel = new JPanel(null);
		panel.setBackground(Color.WHITE);
		busca = new JTextField();
		
		busca.setBounds(0, 0, 379, 30);
		busca.setBackground(Color.GRAY);
		panel.add(busca);
		
		
		if(!encontrado) {
			noFund = new ImageIcon("no-result-found.png");
			etiqueta = new JLabel( new ImageIcon(noFund.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
			etiqueta.setBounds(130, 30, 100, 100);
			panel.add(etiqueta);
		}else {
			
		}
		
		
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
		this.setTitle("Buscar");
		this.setLocationRelativeTo(null);
		this.setSize(379,500);
	}
}
