package Sudoku;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class Sudoku extends JFrame{

	public static final int tamaño_cuadricula = 9;
	public static final int subcuadricula_tamaño = 3;
	public static final int tamaño_celda = 60;
	public static final int anchura = tamaño_celda * tamaño_cuadricula;
	public static final int altura = tamaño_celda * tamaño_cuadricula;
	public static final Color bgcolorabierto = Color.YELLOW;
	public static final Color SiColor = new Color (0, 255, 0);
	public static final Color NoColor = Color.RED;
	public static final Color bgcolorcerrado = new Color (240, 240, 240);
	public static final Color textocerrado = Color.BLACK;
	public static final Font FONT_NUMBERS = new Font("Monospaced", Font.BOLD, 20);
	private JTextField[][] tfceldas = new JTextField [tamaño_cuadricula][tamaño_cuadricula];
	
	private int [][] puzzle =
		{{5, 3, 4, 6, 7, 8, 9, 1, 2},
		{6, 7, 2, 1, 9, 5, 3, 4, 8},
		{1, 9, 8, 3, 4, 2, 5, 6, 7},
		{8, 5, 9, 7, 6, 1, 4, 2, 3},
		{4, 2, 6, 8, 5, 3, 7, 9, 1},
		{7, 1, 3, 9, 2, 4, 8, 5, 6},
		{9, 6, 1, 5, 3, 7, 2, 8, 4},
		{2, 8, 7, 4, 1, 9, 6, 3, 5},
		{3, 4, 5, 2, 8, 6, 1, 7, 9}};
	
	private boolean [][] mascaras = 
		 {{false, false, false, false, false, true, false, false, false},
		 {false, false, false, false, false, false, false, false, true},
		 {false, false, false, false, false, false, false, false, false},
		 {false, false, false, false, false, false, false, false, false},
		 {false, false, false, false, false, false, false, false, false},
		 {false, false, false, false, false, false, false, false, false},
		 {false, false, false, false, false, false, false, false, false},
		 {false, false, false, false, false, false, false, false, false},
		 {false, false, false, false, false, false, false, false, false}};
	
	public Sudoku() {
		Container cp = getContentPane () ;
		cp.setLayout(new GridLayout(tamaño_cuadricula, tamaño_cuadricula));
		
		
		for (int r = 0; r < tamaño_cuadricula; r++) {
			for (int c = 0; c < tamaño_cuadricula; c++) {
				tfceldas[r][c] = new JTextField();
				cp.add(tfceldas[r][c]);
				if (mascaras[r][c]) {
					tfceldas[r][c].setText("");
					tfceldas[r][c].setEditable(true);
					tfceldas[r][c].setBackground(bgcolorabierto);
					
				} else {
					 tfceldas[r][c].setText(puzzle[r][c] + "");
					 tfceldas[r][c].setEditable(false);
					 tfceldas[r][c].setBackground(bgcolorcerrado);
					 tfceldas[r][c].setForeground(textocerrado);
				}
				 tfceldas[r][c].setHorizontalAlignment(JTextField.CENTER);
				 tfceldas[r][c].setFont(FONT_NUMBERS);
			}
			
		}
			cp.setPreferredSize(new Dimension(anchura, altura));
	      pack();
	      
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	      setTitle("Sudoku");
	      setVisible(true);
	}
	public static void main(String[] args) {
		
		
		
	}

}
