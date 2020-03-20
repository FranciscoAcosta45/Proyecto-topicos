import java.awt.Color;
//import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ModalNombre extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1757127584699710455L;
	
	TextPrompt ejemplo,ejemplo1,ejemplo2;
	JTextField txt_prueba, txt_contraseña, txt_RepContra;
	JButton CambiarContra;
	JLabel LblImg;
	JLabel etiqueta, LblCargo;
	JPanel panel;
	ImageIcon find, user, pet, info;
	JButton unirse, mascota, buscar, perfil, informacion;
	
	
	public ModalNombre() {
		
		
		getContentPane().setLayout(null);
		
	
		/*
		find = new ImageIcon("buscar.png");
		buscar = new JButton(new ImageIcon(find.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
		buscar.setBounds(105,410,80,40);
		buscar.setBackground(Color.white);
		buscar.setBorder(null);
		getContentPane().add(buscar);
		
		user = new ImageIcon("user.png");
		perfil = new JButton(new ImageIcon(user.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
		perfil.setBounds(193, 410, 80, 40);
		perfil.setBackground(Color.white);
		perfil.setBorder(null);
		getContentPane().add(perfil);
		
		pet = new ImageIcon("pet.png");
		mascota = new JButton(new ImageIcon(pet.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
		mascota.setBounds(15, 410, 80, 40);
		mascota.setBackground(Color.white);
		mascota.setBorder(null);
		getContentPane().add(mascota);
		
		info = new ImageIcon("info.png");
		informacion = new JButton(new ImageIcon(info.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
		informacion.setBounds(280, 410, 80, 40);
		informacion.setBackground(Color.white);
		informacion.setBorder(null);
		getContentPane().add(informacion); */
		
		// J TEXT FIEL 
		JTextField txt_prueba = new javax.swing.JTextField();
		ejemplo = new TextPrompt("Cambiar Nombre",txt_prueba);
		txt_prueba.setBounds(20,10,200,20);
		getContentPane().add(txt_prueba);
		
		CambiarContra= new JButton ("Cambiar Nombre");               
		CambiarContra.setBounds(20,60,200,30);
		CambiarContra.setBackground(new java.awt.Color( 91, 216, 125 ));
		getContentPane().add(CambiarContra);
		
		
		
	
		      
		setLocation(50,50);      
		setVisible(true);
		this.getContentPane().setBackground (Color.white );
		
		
	}
	
	public static void main(String[] args) {
		ModalNombre EjecuteLogin = new ModalNombre();
		  EjecuteLogin.setVisible(true);
		  EjecuteLogin.setBounds(10,10,260,200);
		  
		 }

	
}