import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ModalContraseņa extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1757127584699710455L;
	
	TextPrompt ejemplo,ejemplo1,ejemplo2;
	JTextField txt_prueba, txt_contraseņa, txt_RepContra;
	JButton CambiarContra;
	JLabel LblImg;
	JLabel etiqueta, LblCargo;
	JPanel panel;
	ImageIcon find, user, pet, info;
	JButton unirse, mascota, buscar, perfil, informacion;
	
	
	public ModalContraseņa() {
		
		
		getContentPane().setLayout(null);
		
	
		
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
		getContentPane().add(informacion);
		
		// J TEXT FIEL 
		JTextField txt_prueba = new javax.swing.JTextField();
		ejemplo = new TextPrompt("Contraseņa Actual",txt_prueba);
		txt_prueba.setBounds(20,10,200,20);
		getContentPane().add(txt_prueba);
		
		JTextField txt_contraseņa = new javax.swing.JTextField();
		ejemplo1 = new TextPrompt("Contraseņa Nueva",txt_contraseņa);
		txt_contraseņa.setBounds(20,40,200,20);
		getContentPane().add(txt_contraseņa);
		
		JTextField txt_RepContra = new javax.swing.JTextField();
		ejemplo2 = new TextPrompt("Repetir la contraseņa",txt_RepContra);
		txt_RepContra.setBounds(20,70,200,20);
		getContentPane().add(txt_RepContra);
		
		CambiarContra= new JButton ("Cambiar contraseņa");               
		CambiarContra.setBounds(20,100,200,30);
		CambiarContra.setBackground(new java.awt.Color( 91, 216, 125 ));
		getContentPane().add(CambiarContra);
		
		
		
	
		setSize(397,500);       
		setLocation(50,50);      
		setVisible(true);
		this.getContentPane().setBackground (Color.white );
		
		
	}
	
	public static void main(String[] args) {
		ModalContraseņa EjecuteLogin = new ModalContraseņa();
		  EjecuteLogin.setVisible(true);
		  EjecuteLogin.setBounds(10,10,260,200);
		  
		 }

	
}