package fiap;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class GUIPrincipal extends JFrame {
	private Container contentPane;
	private JMenuBar mnBarra;
	private JMenu mnArquivo, mnExemplos;
	private JMenuItem miSair, miBotao, miCaixaOpcao, miRadio;

	public GUIPrincipal() {
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
		mnExemplos = new JMenu("Exemplos");
		mnExemplos.setMnemonic('E');
		miSair = new JMenuItem("Sair", new ImageIcon(getClass().getResource("exit_icon.png")));
		miBotao = new JMenuItem("Botao");
		miCaixaOpcao = new JMenuItem("Caixa de Opção");
		miRadio = new JMenuItem("Botão de Rádio");

		setJMenuBar(mnBarra);
		mnBarra.add(mnArquivo);
		mnBarra.add(mnExemplos);
		mnArquivo.add(miSair);
		mnExemplos.add(miBotao);
		mnExemplos.add(miCaixaOpcao);
		mnExemplos.add(miRadio);
	}

	private void definirEventos() {
		miSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		miBotao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIBotao botao = new GUIBotao();
				contentPane.removeAll();
				contentPane.add(botao);
				contentPane.validate();
			}
		});
		
		miCaixaOpcao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				GUICaixaOpcao caixa = new GUICaixaOpcao();
				contentPane.removeAll();
				contentPane.add(caixa);
				contentPane.validate();
			}
		});
		
		miRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				GUIRadio radio = new GUIRadio();
				contentPane.removeAll();
				contentPane.add(radio);
				contentPane.validate();
			}
		});
	}

	public void abrir() {
		GUIPrincipal frame = new GUIPrincipal();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((tela.width - frame.getSize().width) / 2, (tela.height - frame.getSize().height) / 2);
		frame.setVisible(true);
	}

}
