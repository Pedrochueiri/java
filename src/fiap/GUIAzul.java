package fiap;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class GUIAzul extends JPanel {
	private JButton btCor;
	private JLabel lbCor;
	
	public GUIAzul() {
		inicializarComponentes();
		definirEventos();
	}
	
	private void inicializarComponentes() {
		setLayout(null);		

		btCor = new JButton("Azul");
		lbCor = new JLabel("Cor de fundo Azul");
		
		lbCor.setBounds(50, 20, 250, 25);
		btCor.setBounds(50, 80, 100, 25);
		
		add(lbCor);
		add(btCor);		
	}
	
	private void definirEventos() {
		
		btCor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.blue);
			}
		});
	}	
}











