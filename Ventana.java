package GUI;
import Clases.Graph;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;


public class Ventana extends JFrame {

	private JPanel contentPane;
	
	private static final Graph.Edge[] GRAPH = {
			
			//Aeropuerto Internacional Francisco Secada Vignetta (Iquitos)
		    new Graph.Edge("Aeropuerto Internacional Francisco Secada Vignetta (Iquitos)", "Aeropuerto Guillermo del Castillo Paredes (Tarapoto)", 60),
		    new Graph.Edge("Aeropuerto Internacional Francisco Secada Vignetta (Iquitos)", "Aeropuerto Internacional Armando Revoredo Iglesias (Cajamarca)", 260),
		    new Graph.Edge("Aeropuerto Internacional Francisco Secada Vignetta (Iquitos)", "Aeropuerto Carlos Martínez de Pinillos (Trujillo)", 230),
		    new Graph.Edge("Aeropuerto Internacional Francisco Secada Vignetta (Iquitos)", "Aeropuerto Internacional David Abensur Rengifo (Pucallpa)", 60),
		    new Graph.Edge("Aeropuerto Internacional Francisco Secada Vignetta (Iquitos)", "Aeropuerto David Figueroa F. (Huanuco)", 300),
		    new Graph.Edge("Aeropuerto Internacional Francisco Secada Vignetta (Iquitos)", "Aeropuerto Francisco Carlé (Jauja)", 930),
		    new Graph.Edge("Aeropuerto Internacional Francisco Secada Vignetta (Iquitos)", "Aeropuerto Internacional Jorge Chávez (Callao)", 85),
		    new Graph.Edge("Aeropuerto Internacional Francisco Secada Vignetta (Iquitos)", "Aeropuerto Internacional Alejandro Velasco Astete (Cusco)", 215),
		    new Graph.Edge("Aeropuerto Internacional Francisco Secada Vignetta (Iquitos)", "Aeropuerto Alfredo Mendivil Duarte (Ayacucho)", 825),
		    new Graph.Edge("Aeropuerto Internacional Francisco Secada Vignetta (Iquitos)", "eropuerto Internacional Alfredo Rodríguez Ballón (Cerro Colorado Arequipa)", 210),
		    new Graph.Edge("Aeropuerto Internacional Francisco Secada Vignetta (Iquitos)", "Aeropuerto de La Joya (La Joya - Arequipa)", 210),
		    new Graph.Edge("Aeropuerto Internacional Francisco Secada Vignetta (Iquitos)", "Aeropuerto Internacional Carlos Ciriani Santa Rosa (Tacna)", 870),
		    
		    //Aeropuerto Guillermo del Castillo Paredes (Tarapoto)
		    new Graph.Edge("Aeropuerto Guillermo del Castillo Paredes (Tarapoto)", "Aeropuerto Internacional Francisco Secada Vignetta (Iquitos)", 60),
		    new Graph.Edge("Aeropuerto Guillermo del Castillo Paredes (Tarapoto)", "Aeropuerto Francisco Carlé (Jauja)", 890),
		    new Graph.Edge("Aeropuerto Guillermo del Castillo Paredes (Tarapoto)", "Aeropuerto Internacional Jorge Chávez (Callao)", 70),
		    new Graph.Edge("Aeropuerto Guillermo del Castillo Paredes (Tarapoto)", "Aeropuerto Internacional Alejandro Velasco Astete (Cusco)", 220),
		    new Graph.Edge("Aeropuerto Guillermo del Castillo Paredes (Tarapoto)", "Aeropuerto Alfredo Mendivil Duarte (Ayacucho)", 785),
		    new Graph.Edge("Aeropuerto Guillermo del Castillo Paredes (Tarapoto)", "Aeropuerto Internacional Alfredo Rodríguez Ballón (Cerro Colorado Arequipa)", 245),
		    new Graph.Edge("Aeropuerto Guillermo del Castillo Paredes (Tarapoto)", "Aeropuerto de La Joya (La Joya - Arequipa)", 245),
		    new Graph.Edge("Aeropuerto Guillermo del Castillo Paredes (Tarapoto)", "Aeropuerto Internacional Carlos Ciriani Santa Rosa (Tacna)", 890),
		    
		    //Aeropuerto Internacional Armando Revoredo Iglesias (Cajamarca)
		    new Graph.Edge("Aeropuerto Internacional Armando Revoredo Iglesias (Cajamarca)", "Aeropuerto Internacional Francisco Secada Vignetta (Iquitos)", 225),
		    new Graph.Edge("Aeropuerto Internacional Armando Revoredo Iglesias (Cajamarca)", "Aeropuerto Guillermo del Castillo Paredes (Tarapoto)", 265),
		    new Graph.Edge("Aeropuerto Internacional Armando Revoredo Iglesias (Cajamarca)", "Aeropuerto Internacional David Abensur Rengifo (Pucallpa)", 290),
		    new Graph.Edge("Aeropuerto Internacional Armando Revoredo Iglesias (Cajamarca)", "Aeropuerto David Figueroa F. (Huanuco)", 910),
		    new Graph.Edge("Aeropuerto Internacional Armando Revoredo Iglesias (Cajamarca)", "Aeropuerto Francisco Carlé (Jauja)" , 1015),
		    new Graph.Edge("Aeropuerto Internacional Armando Revoredo Iglesias (Cajamarca)", "Aeropuerto Internacional Jorge Chávez (Callao)", 65),
		    new Graph.Edge("Aeropuerto Internacional Armando Revoredo Iglesias (Cajamarca)", "Aeropuerto Internacional Alejandro Velasco Astete (Cusco)", 180),
		    new Graph.Edge("Aeropuerto Internacional Armando Revoredo Iglesias (Cajamarca)", "Aeropuerto Alfredo Mendivil Duarte (Ayacucho)", 1010),
		    new Graph.Edge("Aeropuerto Internacional Armando Revoredo Iglesias (Cajamarca)", "Aeropuerto Internacional Alfredo Rodríguez Ballón (Arequipa)", 190),
		    new Graph.Edge("Aeropuerto Internacional Armando Revoredo Iglesias (Cajamarca)", "Aeropuerto de La Joya (La Joya - Arequipa)", 190),
		    new Graph.Edge("Aeropuerto Internacional Armando Revoredo Iglesias (Cajamarca)", "Aeropuerto Internacional Carlos Ciriani Santa Rosa (Tacna)", 1075),
		    
		    
		    //Aeropuerto Carlos Martínez de Pinillos (Trujillo)
		    new Graph.Edge("Aeropuerto Carlos Martínez de Pinillos (Trujillo)", "Aeropuerto Internacional Francisco Secada Vignetta (Iquitos)", 195),
		    new Graph.Edge("Aeropuerto Carlos Martínez de Pinillos (Trujillo)", "Aeropuerto Guillermo del Castillo Paredes (Tarapoto)", 220),
		    new Graph.Edge("Aeropuerto Carlos Martínez de Pinillos (Trujillo)", "Aeropuerto Internacional David Abensur Rengifo (Pucallpa)", 290),
		    new Graph.Edge("Aeropuerto Carlos Martínez de Pinillos (Trujillo)", "Aeropuerto David Figueroa F. (Huanuco)", 460),
		    new Graph.Edge("Aeropuerto Carlos Martínez de Pinillos (Trujillo)", "Aeropuerto Francisco Carlé (Jauja)", 825),
		    new Graph.Edge("Aeropuerto Carlos Martínez de Pinillos (Trujillo)", "Aeropuerto Internacional Jorge Chávez (Callao)", 65),
		    new Graph.Edge("Aeropuerto Carlos Martínez de Pinillos (Trujillo)", "Aeropuerto Internacional Alejandro Velasco Astete (Cusco)", 185),
		    new Graph.Edge("Aeropuerto Carlos Martínez de Pinillos (Trujillo)", "Aeropuerto Alfredo Mendivil Duarte (Ayacucho)", 720),
		    new Graph.Edge("Aeropuerto Carlos Martínez de Pinillos (Trujillo)", "Aeropuerto Internacional Alfredo Rodríguez Ballón (Arequipa)", 180),
		    new Graph.Edge("Aeropuerto Carlos Martínez de Pinillos (Trujillo)", "Aeropuerto de La Joya (La Joya - Arequipa)", 180),
		    new Graph.Edge("Aeropuerto Carlos Martínez de Pinillos (Trujillo)", "Aeropuerto Internacional Carlos Ciriani Santa Rosa (Tacna)", 785),
		    
		    //Aeropuerto Internacional David Abensur Rengifo (Pucallpa)
		    new Graph.Edge("Aeropuerto Internacional David Abensur Rengifo (Pucallpa)", "Aeropuerto Internacional Francisco Secada Vignetta (Iquitos)", 60),
		    new Graph.Edge("Aeropuerto Internacional David Abensur Rengifo (Pucallpa)", "Aeropuerto Guillermo del Castillo Paredes (Tarapoto)", 195),
		    new Graph.Edge("Aeropuerto Internacional David Abensur Rengifo (Pucallpa)", "Aeropuerto Internacional Armando Revoredo Iglesias (Cajamarca)", 275),
		    new Graph.Edge("Aeropuerto Internacional David Abensur Rengifo (Pucallpa)", "Aeropuerto Carlos Martínez de Pinillos (Trujillo)", 265),
		    new Graph.Edge("Aeropuerto Internacional David Abensur Rengifo (Pucallpa)", "Aeropuerto David Figueroa F. (Huanuco)", 235),
		    new Graph.Edge("Aeropuerto Internacional David Abensur Rengifo (Pucallpa)", "Aeropuerto Francisco Carlé (Jauja)", 1040),
		    new Graph.Edge("Aeropuerto Internacional David Abensur Rengifo (Pucallpa)", "Aeropuerto Internacional Jorge Chávez (Callao)", 60),
		    new Graph.Edge("Aeropuerto Internacional David Abensur Rengifo (Pucallpa)", "Aeropuerto Internacional Alejandro Velasco Astete (Cusco)", 185),
		    new Graph.Edge("Aeropuerto Internacional David Abensur Rengifo (Pucallpa)", "Aeropuerto Alfredo Mendivil Duarte (Ayacucho)", 935),
		    new Graph.Edge("Aeropuerto Internacional David Abensur Rengifo (Pucallpa)", "Aeropuerto Internacional Alfredo Rodríguez Ballón (Arequipa)", 190),
		    new Graph.Edge("Aeropuerto Internacional David Abensur Rengifo (Pucallpa)", "Aeropuerto de La Joya (La Joya - Arequipa)", 190),
		    new Graph.Edge("Aeropuerto Internacional David Abensur Rengifo (Pucallpa)", "Aeropuerto Internacional Carlos Ciriani Santa Rosa (Tacna)", 1000),
		    
		    
		    //Aeropuerto David Figueroa F. (Huanuco)
		    new Graph.Edge("Aeropuerto David Figueroa F. (Huanuco)", "Aeropuerto Internacional Francisco Secada Vignetta (Iquitos)", 335),
		    new Graph.Edge("Aeropuerto David Figueroa F. (Huanuco)", "Aeropuerto Guillermo del Castillo Paredes (Tarapoto)", 570),
		    new Graph.Edge("Aeropuerto David Figueroa F. (Huanuco)", "Aeropuerto Internacional Armando Revoredo Iglesias (Cajamarca)", 450),
		    new Graph.Edge("Aeropuerto David Figueroa F. (Huanuco)", "Aeropuerto Carlos Martínez de Pinillos (Trujillo)", 60),
		    new Graph.Edge("Aeropuerto David Figueroa F. (Huanuco)", "Aeropuerto Internacional David Abensur Rengifo (Pucallpa)", 235),
		    new Graph.Edge("Aeropuerto David Figueroa F. (Huanuco)", "Aeropuerto Francisco Carlé (Jauja)", 45),
		    new Graph.Edge("Aeropuerto David Figueroa F. (Huanuco)", "Aeropuerto Internacional Jorge Chávez (Callao)", 60),
		    new Graph.Edge("Aeropuerto David Figueroa F. (Huanuco)", "Aeropuerto Internacional Alejandro Velasco Astete (Cusco)", 65),
		    new Graph.Edge("Aeropuerto David Figueroa F. (Huanuco)", "Aeropuerto Alfredo Mendivil Duarte (Ayacucho)", 65),
		    new Graph.Edge("Aeropuerto David Figueroa F. (Huanuco)", "Aeropuerto Internacional Alfredo Rodríguez Ballón (Arequipa)", 70),
		    new Graph.Edge("Aeropuerto David Figueroa F. (Huanuco)", "Aeropuerto de La Joya (La Joya - Arequipa)", 70),
		    new Graph.Edge("Aeropuerto David Figueroa F. (Huanuco)", "Aeropuerto Internacional Carlos Ciriani Santa Rosa (Tacna)", 100),
		    
		    //Aeropuerto Francisco Carlé (Jauja)
		    new Graph.Edge("Aeropuerto Francisco Carlé (Jauja)", "Aeropuerto Internacional Francisco Secada Vignetta (Iquitos)", 210),
		    new Graph.Edge("Aeropuerto Francisco Carlé (Jauja)", "Aeropuerto Guillermo del Castillo Paredes (Tarapoto)", 305),
		    new Graph.Edge("Aeropuerto Francisco Carlé (Jauja)", "Aeropuerto Internacional Armando Revoredo Iglesias (Cajamarca)", 205),
		    new Graph.Edge("Aeropuerto Francisco Carlé (Jauja)", "Aeropuerto Carlos Martínez de Pinillos (Trujillo)", 255),
		    new Graph.Edge("Aeropuerto Francisco Carlé (Jauja)", "Aeropuerto Internacional David Abensur Rengifo (Pucallpa)", 275),
		    new Graph.Edge("Aeropuerto Francisco Carlé (Jauja)", "Aeropuerto David Figueroa F. (Huanuco)", 60), 
		    new Graph.Edge("Aeropuerto Francisco Carlé (Jauja)", "Aeropuerto Internacional Alejandro Velasco Astete (Cusco)", 175),
		    new Graph.Edge("Aeropuerto Francisco Carlé (Jauja)", "Aeropuerto Alfredo Mendivil Duarte (Ayacucho)", 1275),
		    new Graph.Edge("Aeropuerto Francisco Carlé (Jauja)", "Aeropuerto Internacional Alfredo Rodríguez Ballón (Arequipa)", 225),
		    new Graph.Edge("Aeropuerto Francisco Carlé (Jauja)", "Aeropuerto de La Joya (La Joya - Arequipa)", 225),
		    new Graph.Edge("Aeropuerto Francisco Carlé (Jauja)", "Aeropuerto Internacional Carlos Ciriani Santa Rosa (Tacna)", 1345),
		    
		    //Aeropuerto Internacional Jorge Chávez (Callao)
		    new Graph.Edge("Aeropuerto Internacional Jorge Chávez (Callao)", "Aeropuerto Internacional Francisco Secada Vignetta (Iquitos)", 85),
		    new Graph.Edge("Aeropuerto Internacional Jorge Chávez (Callao)", "Aeropuerto Guillermo del Castillo Paredes (Tarapoto)", 70),
		    new Graph.Edge("Aeropuerto Internacional Jorge Chávez (Callao)", "Aeropuerto Internacional Armando Revoredo Iglesias (Cajamarca)", 70),
		    new Graph.Edge("Aeropuerto Internacional Jorge Chávez (Callao)", "Aeropuerto Carlos Martínez de Pinillos (Trujillo)", 60),
		    new Graph.Edge("Aeropuerto Internacional Jorge Chávez (Callao)", "Aeropuerto Internacional David Abensur Rengifo (Pucallpa)", 65),
		    new Graph.Edge("Aeropuerto Internacional Jorge Chávez (Callao)", "Aeropuerto David Figueroa F. (Huanuco)", 60),
		    new Graph.Edge("Aeropuerto Internacional Jorge Chávez (Callao)", "Aeropuerto Internacional Alejandro Velasco Astete (Cusco)", 65),
		    new Graph.Edge("Aeropuerto Internacional Jorge Chávez (Callao)", "Aeropuerto Alfredo Mendivil Duarte (Ayacucho)", 65),
		    new Graph.Edge("Aeropuerto Internacional Jorge Chávez (Callao)", "Aeropuerto Internacional Alfredo Rodríguez Ballón (Arequipa)", 70),
		    new Graph.Edge("Aeropuerto Internacional Jorge Chávez (Callao)", "Aeropuerto de La Joya (La Joya - Arequipa)", 70),
		    new Graph.Edge("Aeropuerto Internacional Jorge Chávez (Callao)", "Aeropuerto Internacional Carlos Ciriani Santa Rosa (Tacna)", 100),
		    
		    //Aeropuerto Internacional Alejandro Velasco Astete (Cusco)
		    new Graph.Edge("Aeropuerto Internacional Alejandro Velasco Astete (Cusco)", "Aeropuerto Internacional Francisco Secada Vignetta (Iquitos)", 225),
		    new Graph.Edge("Aeropuerto Internacional Alejandro Velasco Astete (Cusco)", "Aeropuerto Guillermo del Castillo Paredes (Tarapoto)", 240),
		    new Graph.Edge("Aeropuerto Internacional Alejandro Velasco Astete (Cusco)", "Aeropuerto Internacional Armando Revoredo Iglesias (Cajamarca)", 870),
		    new Graph.Edge("Aeropuerto Internacional Alejandro Velasco Astete (Cusco)", "Aeropuerto Carlos Martínez de Pinillos (Trujillo)", 210),
		    new Graph.Edge("Aeropuerto Internacional Alejandro Velasco Astete (Cusco)", "Aeropuerto Internacional David Abensur Rengifo (Pucallpa)", 245),
		    new Graph.Edge("Aeropuerto Internacional Alejandro Velasco Astete (Cusco)", "Aeropuerto Francisco Carlé (Jauja)", 875),
		    new Graph.Edge("Aeropuerto Internacional Alejandro Velasco Astete (Cusco)", "Aeropuerto Internacional Jorge Chávez (Callao)", 70),
		    new Graph.Edge("Aeropuerto Internacional Alejandro Velasco Astete (Cusco)", "Aeropuerto Alfredo Mendivil Duarte (Ayacucho)", 770),
		    new Graph.Edge("Aeropuerto Internacional Alejandro Velasco Astete (Cusco)", "Aeropuerto Internacional Alfredo Rodríguez Ballón (Arequipa)", 210),
		    new Graph.Edge("Aeropuerto Internacional Alejandro Velasco Astete (Cusco)", "Aeropuerto de La Joya (La Joya - Arequipa)", 210),
		    new Graph.Edge("Aeropuerto Internacional Alejandro Velasco Astete (Cusco)", "Aeropuerto Internacional Carlos Ciriani Santa Rosa (Tacna)", 835),
		    
		    //Aeropuerto Alfredo Mendivil Duarte (Ayacucho)
		    new Graph.Edge("Aeropuerto Alfredo Mendivil Duarte (Ayacucho)", "Aeropuerto Internacional Francisco Secada Vignetta (Iquitos)", 220),
		    new Graph.Edge("Aeropuerto Alfredo Mendivil Duarte (Ayacucho)", "Aeropuerto Guillermo del Castillo Paredes (Tarapoto)", 410),
		    new Graph.Edge("Aeropuerto Alfredo Mendivil Duarte (Ayacucho)", "Aeropuerto Internacional Armando Revoredo Iglesias (Cajamarca)", 210),
		    new Graph.Edge("Aeropuerto Alfredo Mendivil Duarte (Ayacucho)", "Aeropuerto Carlos Martínez de Pinillos (Trujillo)", 250),
		    new Graph.Edge("Aeropuerto Alfredo Mendivil Duarte (Ayacucho)", "Aeropuerto Internacional David Abensur Rengifo (Pucallpa)", 380),
		    new Graph.Edge("Aeropuerto Alfredo Mendivil Duarte (Ayacucho)", "Aeropuerto David Figueroa F. (Huanuco)", 60),
		    new Graph.Edge("Aeropuerto Alfredo Mendivil Duarte (Ayacucho)", "Aeropuerto Internacional Jorge Chávez (Callao)", 50),
		    new Graph.Edge("Aeropuerto Alfredo Mendivil Duarte (Ayacucho)", "Aeropuerto Internacional Alejandro Velasco Astete (Cusco)", 190),
		    new Graph.Edge("Aeropuerto Alfredo Mendivil Duarte (Ayacucho)", "Aeropuerto Internacional Alfredo Rodríguez Ballón (Arequipa)", 225),
		    new Graph.Edge("Aeropuerto Alfredo Mendivil Duarte (Ayacucho)", "Aeropuerto de La Joya (La Joya - Arequipa)", 225),
		    new Graph.Edge("Aeropuerto Alfredo Mendivil Duarte (Ayacucho)", "Aeropuerto Internacional Carlos Ciriani Santa Rosa (Tacna)", 220),
		    
		    //Aeropuerto Internacional Alfredo Rodríguez Ballón (Cerro Colorado Arequipa)
		    new Graph.Edge("Aeropuerto Internacional Alfredo Rodríguez Ballón (Arequipa)", "Aeropuerto Internacional Francisco Secada Vignetta (Iquitos)", 255),
		    new Graph.Edge("Aeropuerto Internacional Alfredo Rodríguez Ballón (Arequipa)", "Aeropuerto Guillermo del Castillo Paredes (Tarapoto)", 230),
		    new Graph.Edge("Aeropuerto Internacional Alfredo Rodríguez Ballón (Arequipa)", "Aeropuerto Internacional Armando Revoredo Iglesias (Cajamarca)", 230),
		    new Graph.Edge("Aeropuerto Internacional Alfredo Rodríguez Ballón (Arequipa)", "Aeropuerto Carlos Martínez de Pinillos (Trujillo)", 180),
		    new Graph.Edge("Aeropuerto Internacional Alfredo Rodríguez Ballón (Arequipa)", "Aeropuerto Internacional David Abensur Rengifo (Pucallpa)", 200),
		    new Graph.Edge("Aeropuerto Internacional Alfredo Rodríguez Ballón (Arequipa)", "Aeropuerto Francisco Carlé (Jauja)", 815),
		    new Graph.Edge("Aeropuerto Internacional Alfredo Rodríguez Ballón (Arequipa)", "Aeropuerto Internacional Jorge Chávez (Callao)", 70),
		    new Graph.Edge("Aeropuerto Internacional Alfredo Rodríguez Ballón (Arequipa)", "Aeropuerto Internacional Alejandro Velasco Astete (Cusco)", 200),
		    new Graph.Edge("Aeropuerto Internacional Alfredo Rodríguez Ballón (Arequipa)", "Aeropuerto Alfredo Mendivil Duarte (Ayacucho)", 710),
		    new Graph.Edge("Aeropuerto Internacional Alfredo Rodríguez Ballón (Arequipa)", "Aeropuerto Internacional Carlos Ciriani Santa Rosa (Tacna)", 775),
		    
		    //Aeropuerto de La Joya (La Joya Arequipa)
		    new Graph.Edge("Aeropuerto de La Joya (La Joya - Arequipa)", "Aeropuerto Internacional Francisco Secada Vignetta (Iquitos)", 255),
		    new Graph.Edge("Aeropuerto de La Joya (La Joya - Arequipa)", "Aeropuerto Guillermo del Castillo Paredes (Tarapoto)", 230),
		    new Graph.Edge("Aeropuerto de La Joya (La Joya - Arequipa)", "Aeropuerto Internacional Armando Revoredo Iglesias (Cajamarca)", 230),
		    new Graph.Edge("Aeropuerto de La Joya (La Joya - Arequipa)", "Aeropuerto Carlos Martínez de Pinillos (Trujillo)", 180),
		    new Graph.Edge("Aeropuerto de La Joya (La Joya - Arequipa)", "Aeropuerto Internacional David Abensur Rengifo (Pucallpa)", 200),
		    new Graph.Edge("Aeropuerto de La Joya (La Joya - Arequipa)", "Aeropuerto Francisco Carlé (Jauja)", 815),
		    new Graph.Edge("Aeropuerto de La Joya (La Joya - Arequipa)", "Aeropuerto Internacional Jorge Chávez (Callao)", 70),
		    new Graph.Edge("Aeropuerto de La Joya (La Joya - Arequipa)", "Aeropuerto Internacional Alejandro Velasco Astete (Cusco)", 200),
		    new Graph.Edge("Aeropuerto de La Joya (La Joya - Arequipa)", "Aeropuerto Alfredo Mendivil Duarte (Ayacucho)", 710),
		    new Graph.Edge("Aeropuerto de La Joya (La Joya - Arequipa)", "Aeropuerto Internacional Carlos Ciriani Santa Rosa (Tacna)", 775),
		    
		    //Aeropuerto Internacional Carlos Ciriani Santa Rosa (Tacna)
		    new Graph.Edge("Aeropuerto Internacional Carlos Ciriani Santa Rosa (Tacna)", "Aeropuerto Internacional Francisco Secada Vignetta (Iquitos)", 215),
		    new Graph.Edge("Aeropuerto Internacional Carlos Ciriani Santa Rosa (Tacna)", "Aeropuerto Guillermo del Castillo Paredes (Tarapoto)", 230),
		    new Graph.Edge("Aeropuerto Internacional Carlos Ciriani Santa Rosa (Tacna)", "Aeropuerto Internacional Armando Revoredo Iglesias (Cajamarca)", 245),
		    new Graph.Edge("Aeropuerto Internacional Carlos Ciriani Santa Rosa (Tacna)", "Aeropuerto Carlos Martínez de Pinillos (Trujillo)", 195),
		    new Graph.Edge("Aeropuerto Internacional Carlos Ciriani Santa Rosa (Tacna)", "Aeropuerto Internacional David Abensur Rengifo (Pucallpa)", 200),
		    new Graph.Edge("Aeropuerto Internacional Carlos Ciriani Santa Rosa (Tacna)", "Aeropuerto Francisco Carlé (Jauja)", 1210),
		    new Graph.Edge("Aeropuerto Internacional Carlos Ciriani Santa Rosa (Tacna)", "Aeropuerto Internacional Jorge Chávez (Callao)", 75),
		    new Graph.Edge("Aeropuerto Internacional Carlos Ciriani Santa Rosa (Tacna)", "Aeropuerto Internacional Alejandro Velasco Astete (Cusco)", 215),
		    new Graph.Edge("Aeropuerto Internacional Carlos Ciriani Santa Rosa (Tacna)", "Aeropuerto Alfredo Mendivil Duarte (Ayacucho)", 1100),
		    new Graph.Edge("Aeropuerto Internacional Carlos Ciriani Santa Rosa (Tacna)", "Aeropuerto Internacional Alfredo Rodríguez Ballón (Arequipa)", 200),
		    
		  };
	public static String START;
	public static String END;
	Graph g = new Graph(GRAPH);
	/**
	 * Create the frame.
	 */
	/**
	 * Launch the application.
	 * @throws InterruptedException 
	 */
	public Ventana() throws InterruptedException {
		long inicio = System.currentTimeMillis();     
        Thread.sleep(2000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 488);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox cborigen = new JComboBox();
		cborigen.setFont(new Font("Tahoma", Font.BOLD, 11));
		cborigen.setBackground(new Color(204, 255, 204));
		cborigen.setModel(new DefaultComboBoxModel(new String[] {"Aeropuerto Internacional Francisco Secada Vignetta (Iquitos)", "Aeropuerto Guillermo del Castillo Paredes (Tarapoto)", "Aeropuerto Internacional Armando Revoredo Iglesias (Cajamarca)", "Aeropuerto Carlos Mart\u00EDnez de Pinillos (Trujillo)", "Aeropuerto Internacional David Abensur Rengifo (Pucallpa)", "Aeropuerto David Figueroa F. (Huanuco)", "Aeropuerto Francisco Carl\u00E9 (Jauja)", "Aeropuerto Internacional Jorge Ch\u00E1vez (Callao)", "Aeropuerto Internacional Alejandro Velasco Astete (Cusco)", "Aeropuerto Alfredo Mendivil Duarte (Ayacucho)", "Aeropuerto Internacional Alfredo Rodr\u00EDguez Ball\u00F3n (Cerro Colorado Arequipa)", "Aeropuerto de La Joya (La Joya - Arequipa)", "Aeropuerto Internacional Carlos Ciriani Santa Rosa (Tacna)"}));
		cborigen.setBounds(44, 93, 396, 30);
		contentPane.add(cborigen);
		
		JComboBox cbdestino = new JComboBox();
		cbdestino.setBackground(new Color(204, 255, 204));
		cbdestino.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbdestino.setModel(new DefaultComboBoxModel(new String[] {"Aeropuerto Internacional Francisco Secada Vignetta (Iquitos)", "Aeropuerto Guillermo del Castillo Paredes (Tarapoto)", "Aeropuerto Internacional Armando Revoredo Iglesias (Cajamarca)", "Aeropuerto Carlos Mart\u00EDnez de Pinillos (Trujillo)", "Aeropuerto Internacional David Abensur Rengifo (Pucallpa)", "Aeropuerto David Figueroa F. (Huanuco)", "Aeropuerto Francisco Carl\u00E9 (Jauja)", "Aeropuerto Internacional Jorge Ch\u00E1vez (Callao)", "Aeropuerto Internacional Alejandro Velasco Astete (Cusco)", "Aeropuerto Alfredo Mendivil Duarte (Ayacucho)", "Aeropuerto Internacional Alfredo Rodr\u00EDguez Ball\u00F3n (Cerro Colorado Arequipa)", "Aeropuerto de La Joya (La Joya - Arequipa)", "Aeropuerto Internacional Carlos Ciriani Santa Rosa (Tacna)"}));
		cbdestino.setBounds(44, 183, 396, 30);
		contentPane.add(cbdestino);
		
		JLabel lblNewLabel = new JLabel("Selecciona el origen:");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(155, 45, 185, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Selecciona el destino:");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(155, 150, 217, 14);
		contentPane.add(lblNewLabel_1);
		
		JTextPane prueba = new JTextPane();
		prueba.setFont(new Font("Tahoma", Font.PLAIN, 14));
		prueba.setBounds(44, 320, 396, 96);
		contentPane.add(prueba);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBackground(new Color(102, 204, 102));
		btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String origen;
				origen = cborigen.getSelectedItem().toString();
				String destino;
				destino = cbdestino.getSelectedItem().toString();
				START = origen;
				END = destino;
				g.dijkstra(START);
			    prueba.setText(g.printPath(END));
			}
		});
		btnBuscar.setBounds(180, 236, 125, 30);
		contentPane.add(btnBuscar);
		
		JLabel lblTiempoODistancia = new JLabel("Tiempo m\u00E1s corto de viaje:");
		lblTiempoODistancia.setForeground(Color.BLUE);
		lblTiempoODistancia.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTiempoODistancia.setBounds(136, 288, 281, 21);
		contentPane.add(lblTiempoODistancia);
		
		long fin = System.currentTimeMillis();  
        double tiempo = (double) ((fin - inicio)/1000);       
        System.out.println("El Tiempo de Ejecucion es:"+tiempo +" segundos");
	}
	
	/**
	 * Launch the application.
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
       
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
}
