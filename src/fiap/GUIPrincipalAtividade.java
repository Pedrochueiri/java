package fiap;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class GUIPrincipalAtividade extends JFrame {
	private Container contentPane;
	private JMenuBar mnBarra;
	private JMenu mnArquivo, mnCores, mnJanelas;
	private JMenuItem miSobre, miSair, miAzul, miVerde, miCinza, miCiano, miClientes;
	
	public GUIPrincipalAtividade() {
		inicializarComponentes();
		definirEventos();
	}
	
	private void inicializarComponentes() {
		setTitle("Janela Principal");
		setBounds(0, 0, 800, 600);
		contentPane = getContentPane();
		
		mnBarra = new JMenuBar();
		mnArquivo = new JMenu("Arquivo");
		mnArquivo.setMnemonic('A');
		mnCores = new JMenu("Cores");
		mnCores.setMnemonic('C');
		mnJanelas = new JMenu("Janelas");
		mnJanelas.setMnemonic('J');
		miSobre = new JMenuItem("Sobre");
		miSair = new JMenuItem("Sair", new ImageIcon(
				getClass().getResource("exit_icon.png")));
		miAzul = new JMenuItem("Azul");
		miVerde = new JMenuItem("Verde");
		miCinza = new JMenuItem("Cinza");
		miCiano = new JMenuItem("Ciano");
		miClientes = new JMenuItem("Clientes");
		
		setJMenuBar(mnBarra);
		mnBarra.add(mnArquivo);
		mnBarra.add(mnCores);
		mnBarra.add(mnJanelas);
		mnArquivo.add(miSobre);
		mnArquivo.add(miSair);
		mnCores.add(miAzul);
		mnCores.add(miVerde);
		mnCores.add(miCinza);
		mnCores.add(miCiano);
		mnJanelas.add(miClientes);
	}
	
	private void definirEventos() {
		miSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		miSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Bem vindo!");
			}
		});
		
		miAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIAzul cor = new GUIAzul();
				contentPane.removeAll();
				contentPane.add(cor);
				contentPane.validate();
			}
		});
		
		miVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIVerde cor = new GUIVerde();
				contentPane.removeAll();
				contentPane.add(cor);
				contentPane.validate();
			}
		});
		
		miCinza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUICinza cor = new GUICinza();
				contentPane.removeAll();
				contentPane.add(cor);
				contentPane.validate();
			}
		});
		
		miCiano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUICiano cor = new GUICiano();
				contentPane.removeAll();
				contentPane.add(cor);
				contentPane.validate();
			}
		});
		
		miClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUICliente cliente = new GUICliente();
				contentPane.removeAll();
				contentPane.add(cliente);
				contentPane.validate();
			}
		});
	}	
}











