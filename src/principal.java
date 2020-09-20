import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import Ventanas.nuevoAuto;
import models.Auto;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;

public class principal {

	private JFrame frame;
	private JTable table;
	private List<Auto> autos;
	private DefaultTableModel tableModel;
	private nuevoAuto nuevoAuto;
	private Auto dataAuto = null;
	private Map<String, List<String>> autoModelo = new HashMap<String, List<String>>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal window = new principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		crearAutos();
		
		//BARRA MENU
		
		JMenuBar menuBar = new JMenuBar();
		JMenu inicio = new JMenu("Inicio");
		menuBar.add(inicio);
		
		
		JMenuItem consultaAutos = new JMenuItem("Agregar auto");
		inicio.add(consultaAutos);
		consultaAutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nuevoAuto = new nuevoAuto(autoModelo);
				nuevoAuto.setModal(true);
				nuevoAuto.setVisible(true);				
				dataAuto = nuevoAuto.autoDialog();
				autos.add(dataAuto);
				String[] data = {dataAuto.getMarca(), dataAuto.getModelo(), String.valueOf(dataAuto.getYear())};
				tableModel.addRow(data);
			}
		});

		
		frame.setJMenuBar(menuBar);
		
		JScrollPane panelCentral = new JScrollPane();
		frame.add(panelCentral,BorderLayout.CENTER);

		
		//TABLA AUTOS
		
		tableModel = new DefaultTableModel();
		table = new JTable(tableModel);
		tableModel.addColumn("Marca");		
		tableModel.addColumn("Modelo");		
		tableModel.addColumn("Año");			
		panelCentral.setViewportView(table);
		

		
		for(Auto auto : autos) {			
			String[] data = {auto.getMarca(), auto.getModelo(), String.valueOf(auto.getYear())};
			tableModel.addRow(data);
		}		

	}

	private void crearAutos() {
		autos = new ArrayList<Auto>();
		autos.add(new Auto("Chevrolet", "Spark", 2012));
		autos.add(new Auto("Nissan", "Sentra", 2015));
		autos.add(new Auto("Fiat", "Toro", 2020));
		autos.add(new Auto("Chevsdfsdfdsrolet", "Onix", 2019));
		autos.add(new Auto("Suzuki", "Alto", 2013));	
		autos.add(new Auto("Cherry", "QQ", 2010));	
		
		
		autos.add(new Auto("Chevssssrolet", "Celta", 2004));	
		autos.add(new Auto("Daewoo", "Tico", 1990));	
		autos.add(new Auto("Chessssvrolet", "S10", 2018));	
		autos.add(new Auto("Fiat", "Duna", 1989));	
		autos.add(new Auto("Volkswagen", "Gol", 2017));	
		autos.add(new Auto("Peugeot", "208", 2020));	
		autos.add(new Auto("Renault", "Kwid", 2017));	
		autos.add(new Auto("Ford", "Fiesta", 2015));	
		autos.add(new Auto("Volkswagen", "Vento", 2010));	
		autos.add(new Auto("Honda", "Civic", 2017));	
	    for (Auto auto : autos) {
	        if (!autoModelo.containsKey(auto.getMarca())) {
	        	autoModelo.put(auto.getMarca(), new ArrayList<String>());
	        }
	        autoModelo.get(auto.getMarca()).add(auto.getModelo());
	    }
	    asdasd
	    asd
	    asd
	    asd
	    asd
	    asd
	    for (Auto auto : autos) {
	        if (!autoModelo.containsKey(auto.getMarca())) {
	        	autoModelo.put(auto.getMarca(), new ArrayList<String>());
	        }
	        autoModelo.get(auto.getMarca()).add(auto.getModelo());
	    }a
	    
	    asd
	    asd
	    as
	    das
	    d
	    asd
	    for (Auto auto : autos) {
	        if (!autoModelo.containsKey(auto.getMarca())) {
	        	autoModelo.put(auto.getMarca(), new ArrayList<String>());
	        }
	        autoModelo.get(auto.getMarca()).add(auto.getModelo());
	    }
	    for (Auto auto : autos) {
	        if (!autoModelo.containsKey(auto.getMarca())) {
	        	autoModelo.put(auto.getMarca(), new ArrayList<String>());
	        }
	        autoModelo.get(auto.getMarca()).add(auto.getModelo());
	    }
	    for (Auto auto : autos) {
	        if (!autoModelo.containsKey(auto.getMarca())) {
	        	autoModelo.put(auto.getMarca(), new ArrayList<String>());
	        }
	        autoModelo.get(auto.getMarca()).add(auto.getModelo());
	    }
	    for (Auto auto : autos) {
	        if (!autoModelo.containsKey(auto.getMarca())) {
	        	autoModelo.put(auto.getMarca(), new ArrayList<String>());
	        }
	        autoModelo.get(auto.getMarca()).add(auto.getModelo());
	    }
	}
}
