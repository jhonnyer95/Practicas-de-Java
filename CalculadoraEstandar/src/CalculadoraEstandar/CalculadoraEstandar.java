package CalculadoraEstandar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraEstandar extends JFrame implements ActionListener {
	
	//Se crea la ventana
	JPanel base = (JPanel) this.getContentPane();
	
	//Se crea la pantalla Textfield
	JTextField pantalla = new JTextField();
	
	//Los botones
	JButton btnUno = new JButton("1");
	JButton btnDos = new JButton("2");
	JButton btnTres = new JButton("3");
	JButton btnBorrar = new JButton("Borrar");
	
	JButton btnCuatro = new JButton("4");
	JButton btnCinco = new JButton("5");
	JButton btnSeis = new JButton("6");
	JButton btnMas = new JButton("+");
	
	JButton btnSiete = new JButton("7");
	JButton btnOcho = new JButton("8");
	JButton btnNueve = new JButton("9");
	JButton btnMenos = new JButton("-");
	
	JButton btnPor = new JButton("*");
	JButton btnCero = new JButton("0");
	JButton btnDiv = new JButton("/");
	JButton btnPunto = new JButton(".");
	
	JButton btnIgual = new JButton("=");
	
	
	//Metodo constructor donde le doy propiedades del formulario de la calculadora
	public CalculadoraEstandar() {
		base.setLayout(null);	//null para acomodar manualmente los elementos
		setSize(350,450);		
		setTitle("Jhonny Calculador"); //El titulo de la calculadora
		setVisible(true);	
		
		//Propiedades de pantalla
		pantalla.setBounds(22, 8, 288, 70);
		add(pantalla);
		
		//Propiedades Botones
		btnUno.setBounds(22, 83, 60, 60);
		btnUno.setFont(new Font("Cabeza", Font.BOLD,20));
		add(btnUno);
		btnDos.setBounds(87, 83, 60, 60);
		btnDos.setFont(new Font("Cabeza", Font.BOLD,20));
		add(btnDos);
		btnTres.setBounds(152, 83, 60, 60);
		btnTres.setFont(new Font("Cabeza", Font.BOLD,20));
		add(btnTres);
		btnBorrar.setBounds(217, 83, 92, 60);
		btnBorrar.setFont(new Font("Cabeza", Font.BOLD,13));
		add(btnBorrar);
		
		btnCuatro.setBounds(22, 148, 60, 60);
		btnCuatro.setFont(new Font("Cabeza", Font.BOLD,20));
		add(btnCuatro);
		btnCinco.setBounds(87, 148, 60, 60);
		btnCinco.setFont(new Font("Cabeza", Font.BOLD,20));
		add(btnCinco);
		btnSeis.setBounds(152, 148, 60, 60);
		btnSeis.setFont(new Font("Cabeza", Font.BOLD,20));
		add(btnSeis);
		btnMas.setBounds(217, 148, 92, 60);
		btnMas.setFont(new Font("Cabeza", Font.BOLD,13));
		add(btnMas);
		
		btnSiete.setBounds(22, 213, 60, 60);
		btnSiete.setFont(new Font("Cabeza", Font.BOLD,20));
		add(btnSiete);
		btnOcho.setBounds(87, 213, 60, 60);
		btnOcho.setFont(new Font("Cabeza", Font.BOLD,20));
		add(btnOcho);
		btnNueve.setBounds(152, 213, 60, 60);
		btnNueve.setFont(new Font("Cabeza", Font.BOLD,20));
		add(btnNueve);
		btnMenos.setBounds(217, 213, 92, 60);
		btnMenos.setFont(new Font("Cabeza", Font.BOLD,13));
		add(btnMenos);
		
		btnPor.setBounds(22, 278, 60, 60);
		btnPor.setFont(new Font("Cabeza", Font.BOLD,20));
		add(btnPor);
		btnCero.setBounds(87, 278, 60, 60);
		btnCero.setFont(new Font("Cabeza", Font.BOLD,20));
		add(btnCero);
		btnDiv.setBounds(152, 278, 60, 60);
		btnDiv.setFont(new Font("Cabeza", Font.BOLD,20));
		add(btnDiv);
		btnPunto.setBounds(217, 278, 92, 60);
		btnPunto.setFont(new Font("Cabeza", Font.BOLD,20));
		add(btnPunto);
		
		btnIgual.setBounds(22, 343, 288, 60);
		btnIgual.setFont(new Font("Cabeza", Font.BOLD,13));
		add(btnIgual);
	}
	
	
	
	public static void main(String[]args) {
		new CalculadoraEstandar();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
