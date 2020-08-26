package Ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import models.Auto;
import javax.swing.JComboBox;

public class nuevoAuto extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField anioAuto;
	private Auto autoDialog;
	private JComboBox marcaAuto, modeloAuto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			nuevoAuto dialog = new nuevoAuto(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public nuevoAuto(Map<String, List<String>> autoModelo) {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);

		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						autoDialog = new Auto(String.valueOf(marcaAuto.getSelectedItem()), String.valueOf(modeloAuto.getSelectedItem()), Integer.parseInt(anioAuto.getText()));
						setVisible(false);
					}
				});

				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}	
		{
			JPanel datos = new JPanel();
			datos.setLayout(new BoxLayout(datos, BoxLayout.Y_AXIS));
			getContentPane().add(datos,BorderLayout.CENTER);
			{
				JPanel marca = new JPanel();
				marca.setBounds(20,20,20,20);
				marca.setLayout(new FlowLayout(FlowLayout.LEFT));
				datos.add(marca, BorderLayout.CENTER);
				{
					JTextPane txtMarca = new JTextPane();
					txtMarca.setEditable(false);
					txtMarca.setText("Marca del auto");					
					marca.add(txtMarca);
				}
				{
					marcaAuto = new JComboBox();
					for (Entry<String, List<String>> entry : autoModelo.entrySet()) {
						marcaAuto.addItem(entry.getKey());
					}
					marca.add(marcaAuto);
				}
			}
			
			{
				JPanel modelo = new JPanel();
				modelo.setBounds(20,20,20,20);
				modelo.setLayout(new FlowLayout(FlowLayout.LEFT));
				datos.add(modelo, BorderLayout.CENTER);
				{
					JTextPane txtMarca = new JTextPane();
					txtMarca.setEditable(false);
					txtMarca.setText("Modelo del auto");					
					modelo.add(txtMarca);
				}
				{
					modeloAuto = new JComboBox();
					String key = String.valueOf(marcaAuto.getSelectedItem());
					if(key != null) {
						List<String> autos = autoModelo.get(key);
						for (String mod : autos) {
							modeloAuto.addItem(mod);
						}
					}
					marcaAuto.addActionListener(new ActionListener(){
						@Override
						public void actionPerformed(ActionEvent e) {
							modeloAuto.removeAllItems();
							String key = String.valueOf(marcaAuto.getSelectedItem());
							if(key != null) {
								List<String> autos = autoModelo.get(key);
								for (String mod : autos) {
									modeloAuto.addItem(mod);
								}
							}
							modelo.add(modeloAuto);
							
						}
					});
				}
			}
			
			{
				JPanel anio = new JPanel();
				anio.setBounds(20,20,20,20);
				anio.setLayout(new FlowLayout(FlowLayout.LEFT));
				datos.add(anio, BorderLayout.CENTER);
				{
					JTextPane txtAnio = new JTextPane();
					txtAnio.setEditable(false);
					txtAnio.setText("Año del auto");					
					anio.add(txtAnio);
				}
				{
					anioAuto = new JTextField();
					anio.add(anioAuto);
					anioAuto.setColumns(10);
					anioAuto.setToolTipText("Tooltip here");
				}
			}
		}
	}


	public Auto autoDialog() {
		return this.autoDialog;
	}

}
