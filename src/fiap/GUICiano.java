package fiap;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class GUICiano extends JPanel {
	private JButton btCor;
	private JLabel lbCor;
	
	public GUICiano() {
		inicializarComponentes();
		definirEventos();
	}
	
	private void inicializarComponentes() {
		setLayout(null);		

		btCor = new JButton("Ciano");
		lbCor = new JLabel("Cor de fundo Ciano");
		
		lbCor.setBounds(50, 20, 250, 25);
		btCor.setBounds(50, 80, 100, 25);
		
		add(lbCor);
		add(btCor);		
	}
	
	private void definirEventos() {
		
		btCor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.cyan);
			}
		});
	}	
}











