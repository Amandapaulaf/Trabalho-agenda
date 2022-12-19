package AF;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Bcadastrarcompromissivo extends JButton implements ActionListener {
	private JFrame menu;
	
	public Bcadastrarcompromissivo(Menuinicial m) {
		this.menu=m;
		setText("cadastrar novo compromisso");
		setBackground(Color.white);
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		menu.setVisible(false);
		Cadastrarcompromissos c= new Cadastrarcompromissos();
	}

}
