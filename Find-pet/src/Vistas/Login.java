
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.Font; 
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login extends JFrame{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -8009804346764518476L;
	TextPrompt ejemplo,ejemplo1;
	JTextField txt_prueba, txt_contraseña;
	JButton BtnOk;
	JLabel LblImg;
	JLabel etiqueta, LblCargo;
	JPanel panel;
	ImageIcon find, user, pet, info;
	JButton unirse, mascota, buscar, perfil, informacion;
	
	
	public Login() {
		
		super("Login");
		getContentPane().setLayout(null);
		
		
		etiqueta = new JLabel(new ImageIcon("box.png") );
		etiqueta.setBounds(90,10,200,250);
		getContentPane().add(etiqueta);
		
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
		ejemplo = new TextPrompt("Coreo Electronico",txt_prueba);
		txt_prueba.setBounds(40,250,300,20);
		getContentPane().add(txt_prueba);
		
		JTextField txt_contraseña = new javax.swing.JTextField();
		ejemplo1 = new TextPrompt("Contraseña",txt_contraseña);
		txt_contraseña.setBounds(40,280,300,20);
		getContentPane().add(txt_contraseña);
		
		LblCargo = new JLabel("¿Aun no tienes una cuenta? Registrate");  
		LblCargo.setFont(new Font("Verdama",Font.BOLD,10));     
		LblCargo.setBounds(90,355,200,30);
		getContentPane().add(LblCargo);
		
		BtnOk  =  new JButton ("Iniciar sesion");               
		BtnOk.setBounds(40,320,300,30);
		BtnOk.setBackground(new java.awt.Color( 91, 216, 125 ));
		getContentPane().add(BtnOk);
		
		
		//AQUI SE AGREGA EL EVENTO DEL BOTON DIRECTAMENTE
		BtnOk.addActionListener((ActionEvent evento) -> {
		     String Pass=txt_contraseña.getText();
		     String PassDefinido = new String(Pass);
		     
		     if(txt_prueba.getText().equals("admin") && PassDefinido.equals("123") )
		         
		         JOptionPane.showMessageDialog(null,"Bienvenido a Find-Pets");
		     
		     
		     else  {
		         if( !txt_prueba.getText().equals("admin") )
		             JOptionPane.showMessageDialog(null,"USUARIO INCORRECTO");
		         else
		             if( !txt_contraseña.getText().equals("123") )
		                 JOptionPane.showMessageDialog(null,"PASSWORD INCORRECTO");
		     }   });
		
		
		
		
		
		setSize(397,500);       
		setLocation(50,50);      
		setVisible(true);
		this.getContentPane().setBackground (Color.white );
		
		
	}
	
	public static void main(String[] args) {
		  Login EjecuteLogin = new Login();
		  EjecuteLogin.setVisible(true);
		  
		 }

	
}

