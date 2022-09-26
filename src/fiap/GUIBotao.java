package fiap;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class GUIBotao extends JPanel {
	private JButton btMensagem, btTeimoso;
	private ImageIcon imageIcon1;
	
	public GUIBotao() {
		inicializarComponentes();
		definirEventos();
	}
	
	private void inicializarComponentes() {
		setLayout(null);
		setBackground(Color.cyan);
		imageIcon1 = new ImageIcon(
				getClass().getResource("java_logo.png"));
		btMensagem = new JButton("Mensagem", imageIcon1);
		btMensagem.setBounds(50, 20, 140, 40);
		btMensagem.setMnemonic(KeyEvent.VK_M);
		btMensagem.setToolTipText("Clique aqui para ver a mensagem");
		
		btTeimoso = new JButton("Teimoso");
		btTeimoso.setBounds(50, 70, 100, 30);
		
		add(btMensagem);
		add(btTeimoso);		
	}
	
	private void definirEventos() {
		
		btMensagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, 
						"Botao Mensagem");
			}
		});
		
		btTeimoso.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, 
						"Botao Teimoso");
			}
		});
		
		btTeimoso.addMouseListener(new MouseListener() {

			public void mouseReleased(MouseEvent e) {}

			public void mousePressed(MouseEvent e) {}

			public void mouseExited(MouseEvent e) {}

			public void mouseEntered(MouseEvent e) {
				int x = (int)(Math.random() * 700);
				int y = (int)(Math.random() * 500);
				btTeimoso.setLocation(x, y);
			}

			public void mouseClicked(MouseEvent e) {}
		});
		
	}
	
}











