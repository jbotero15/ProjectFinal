package presentation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * Board Index window where the window will enter the game options
 * @author Jenny Paola Quesada Hernandez
 *
 */

public class InputWindow extends JDialog{
	//-------------Constants--------------------
	/**
	 * action of button
	 */
	public static final String COMMAND_BUTTON_ENTER = "Ingresar";
	/**
	 * Commad button add
	 */
	public static final String COMMAND_BUTTON_ADD = "Agregar";
	/**
	 * Constant width panel
	 */
	private static int DEFAULT_WIDTH = 500;
	/**
	 * Constant heigth panel
	 */
	private static int DEFAULT_HEIGTH = 300;
	/**
	 * Constant color panel 
	 */
	private static String DEFAULT_COLOR = "#2ECCFA";
	/**
	 * Constant name panel
	 */
	private static String DEFAULT_NAME = "JUEGO DE GEOMETRIA" ;
	/**
	 * Constant name label
	 */
	private static String DEFAULT_LABEL = "INGRESE SU NOMBRE";
	/**
	 * Constant button name
	 */
	private static String DEFAULT_NAME_BUTTON = "INGRESAR";
	/**
	 * Constant button add
	 */
	private static String DEFAUL_ADD_BUTTON = "AGREGAR" ;
	/**
	 * Constant button color
	 */
	private static String DEFAULT_COLOR_BUTTON = "#0080FF";
	//-------------Attributes-------------------
	/**
	 * handler attribute buttons
	 */
	private EventHandler event;
	/**
	 * Label where anger name which the user must enter
	 */
	private JLabel lbTitle;
	/**
	 * Box where the user will enter the name
	 */
	private JTextField txName;
	/**
	 *Button to enter the menu of the application for sale
	 */
	private JButton btnEnter;
	/**
	 * button to enter the file name
	 */
	private JButton btnAdd;
	//-------------Builders---------------------
	/**
	 *Constructor which will make the visual part of the panel
	 */
	public InputWindow() {
		
		EventHandler events = new EventHandler(this);
		
		/**
		 * Panel name
		 */
		setTitle(DEFAULT_NAME);
		/**
		 *Panel size
		 */
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGTH);
		/**
		 * Panel Color
		 */
		setBackground(Color.yellow);
		/**
		 * Location of the buttons within the panel
		 */
		setLayout(null);
		/**
		 *Ending the execution of the window when it is closed
		 */
	//	setDefaultCloseOperation(EXIT_ON_CLOSE);
		/**
		 * Add the label to the panel
		 */
		
		lbTitle = new JLabel(DEFAULT_LABEL);
		/**
		 * Size Label
		 */
		lbTitle.setBounds(150, 50, 150, 50);
		this.add(lbTitle);
		
		/**
		 * Add the text box on the panel
		 */
		
		txName = new JTextField();
		/**
		 * Size box
		 */
		txName.setBounds(150, 100, 150, 50);
		this.add(txName);
		
		/**
		 * Add the button panel
		 */
		btnEnter = new JButton(DEFAULT_NAME_BUTTON);
		/**
		 * Color Button
		 */
		btnEnter.setBackground(Color.decode(DEFAULT_COLOR_BUTTON));
		/**
		 * Size button
		 */
		btnEnter.setBounds(70,200,150,50);
		btnEnter.setActionCommand(COMMAND_BUTTON_ENTER);
		btnEnter.addActionListener(events);
		this.add(btnEnter);
		
		btnAdd = new JButton(DEFAUL_ADD_BUTTON);
		/**
		 * Color Button
		 */
		btnAdd.setBackground(Color.decode("#2E64FE"));
		/**
		 * Size button
		 */
		btnAdd.setBounds(250, 200, 150, 50);
		this.add(btnAdd);
	}
	//-------------Methods----------------------
	//-------------Gets&Sets--------------------
/**
 * Metodo de prueba temporal
 */
	public static void main(String[] args) {
		
		InputWindow in = new InputWindow();
		in.setVisible(true);
		System.out.println("Hola Mundo");
	}
}
