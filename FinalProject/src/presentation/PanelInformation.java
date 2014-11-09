package presentation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * Clase donde ira la informacion de puntaje y usuario que esta en el moemento de la aplicacion /////
 * Where anger class score and the user information at the time this application
 * @author Jenny Paola Quesada Hernandez
 */

public class PanelInformation extends JPanel {
	
	//------------Constants-----------------
		/**
		 * Contante del ancho del panel ////
		 * Constant width panel
		 */
		public static int DEFAULT_HEIGTH = 50 ;
		/**
		 * Cosntante del alto del panel ////////
		 * Constant high panel
		 */
		public static int DEFAULT_WIDTH = 200 ;
		/**
		 * Constante para el nombre del panel ////////
		 * Constant for the name of the panel
		 */
		public static String DEFAULT_LABEL = "INFORMACION" ;
		/**
		 * Constante del nombre del Label de Jugador]//////////////
		 * Constant Label Name Player.
		 */
		public static String DEFAUL_PLAYER = "JUGADOR";
		/**
		 * Constante del nombre del Label de pUNTAJE]//////////////
		 * Constant Label Name Points.
		 */
		public static String DEFAUL_POINTS = "PUNTAJE";
		/**
		 * Constante del color dado en String(//////
		 * Constant color as String
		 */
		public static String DEFAULT_COLOR = "#FF8000";
		//------------Atributes-----------------
		 /**
		  * Atributo label Jugador///
		  * Label Attribute Player
		  */
		private JLabel lbPlayer ;
		/**
		 * Atributo donde ira el nombre del jugador que ingreso/////
		 * Attribute where anger player name you entered
		 */
		private JLabel lbNamePlayer;
		/**
		 * Atributo donde ira el nombre del label Puntaje//////////////
		 * Attribute where name label anger Points
		 */
		private JLabel lbNamePoint;
		/**
		 * Atributo donde ira el puntaje que lleve el jugador/////////
		 * Attribute where anger score leading player
		 */
		private JLabel lbPoints;
		
		//------------Builders------------------
		
		/**
		 * Cosntructor donde se va a crear los label en el panel//
		 * Constructor which will create the labels on the panel.
		 */
		public PanelInformation() {
			/**
			 * Este espara gregarle el titulo en l aprte superior del panel //
			 * This is to add the title at the top of the panel
			 */
			TitledBorder border = BorderFactory.createTitledBorder(DEFAULT_LABEL);
			/**
			 * Color de la letra del Tittle Border
			 * Letter Color Border Tittle
			 */
			border.setTitleColor(Color.black);
			/**
			 * Asignar el Border al Tittle //
			 * Assign the Border Title
			 */
			setBorder(border);
			/**
			 * GridLayout situa los componente dentro del panel dependiendo  de como fue construido//
			 * GridLayout places components inside the panel depending on how it was built
			 */
			setLayout(new GridLayout(2,2));
			/**
			 * Dimension del panel en la ventana principal///
			 * Dimension of the panel in the main window
			 * MIRAR PARA QUE SIRVE EL SETPREFERREDSIZE
			 */
			setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGTH));
			/**
			 * Color del panel para diferencialos del principal///////////
			 * Color panel to differentiate the main.
			 */
			setBackground(Color.decode(DEFAULT_COLOR));
			
			/**
			 * Crear el label nombre /////////////
			 * Create the label name
			 */
			lbNamePlayer = new JLabel(DEFAUL_PLAYER);
			/**
			 * Asignarlo al panel]//////////
			 * assign the panel
			 */
			this.add(lbNamePlayer);
			
			/**
			 * Crear el label donde estar el nombre del jugador.((((((((
			 * Create the label where the player's name
			 */
			lbPlayer = new JLabel("Jenny");

			/**
			 * Asirnarle color para diferenciarlo del panel dnde esta el nombre((
			 * Assign color to differentiate it from the panel where the name
			 */
			setBackground(Color.decode(DEFAULT_COLOR));
			/**
			 * Asinar el label Jugador////////
			 * Assign the player label
			 */
			this.add(lbPlayer);
			
			/**
			 * Crear el label donde ira la el titulo del label((((((((
			 * Create the label where anger the title of label
			 */
			lbNamePoint = new JLabel(DEFAUL_POINTS);
			/**
			 * Asignar el boton al panel /////////
			 * Assign the button panel
			 */
			this.add(lbNamePoint);
			/**
			 * Crear el label donde esta el puntaje del Juagdor.((((((((
			 * Create the label where the player's name
			 */
			lbPoints = new JLabel("Paola");

			/**
			 * Asirnarle color para diferenciarlo del panel dnde esta el nombre((
			 * Assign color to differentiate it from the panel where the name
			 */
			setBackground(Color.decode(DEFAULT_COLOR));
			/**
			 * Asinar el label puntaje////////
			 * Assign the score label
			 */
			this.add(lbPoints);
		}

}
