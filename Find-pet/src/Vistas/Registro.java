package Vistas;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Registro extends JFrame implements ActionListener{
	JButton unirse, mascota, buscar, perfil, informacion;
	JTextField email, telefono;
	JPasswordField contraseña, confirmo;
	JPanel panel;
	JLabel etiqueta;
	ImageIcon find, user, pet, info;
	TextPrompt ejemplo;
	public Registro() {
		
		panel = new JPanel(null);
		panel.setBackground(Color.white);
		unirse = new JButton("Unirse");
		email = new JTextField();
		telefono = new JTextField();
		telefono.addKeyListener(new KeyListener(){
            public void keyTyped (KeyEvent e){
                if (!Character.isDigit(e.getKeyChar())){
                    e.consume();
                    JOptionPane.showMessageDialog(telefono, "Solo ingresar números");
                }
            }
            public void keyReleased(KeyEvent e){
 
            }
            public void keyPressed(KeyEvent e){
 
            }
        });
		contraseña = new JPasswordField();
		confirmo = new JPasswordField();
		
		unirse.setBounds(80, 365, 210, 20);
		unirse.setBorder(null);
		unirse.setBackground(Color.GREEN);
		unirse.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent evento)
			{
				JOptionPane.showMessageDialog(unirse, "Bienvenido a FindPets :3");
			}
		});
		panel.add(unirse);
		
		ejemplo = new TextPrompt("Ingrese su correo electrónico", email);
		email.setBounds(80, 200, 210, 30);
		panel.add(email);
		
		ejemplo = new TextPrompt("Ingrese su número de celular", telefono);
		telefono.setBounds(80, 240, 210, 30);
		panel.add(telefono);
		
		ejemplo = new TextPrompt("Ingrese su contraseña", contraseña);
		contraseña.setBounds(80, 280, 210, 30);
		panel.add(contraseña);
		
		ejemplo = new TextPrompt("Confirmar contraseña", confirmo);
		confirmo.setBounds(80, 320, 210, 30);
		panel.add(confirmo);
		
		etiqueta = new JLabel(new ImageIcon("box.png") );
		etiqueta.setBounds(0, 0, 365, 190);
		panel.add(etiqueta);
		
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
		this.setTitle("Registro");
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setSize(379,500);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}
}