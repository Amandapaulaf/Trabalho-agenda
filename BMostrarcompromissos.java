package AF;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BMostrarcompromissos extends JButton implements ActionListener {

private JFrame menu;
	
	public BMostrarcompromissos(Menuinicial m) {
		this.menu=m;
		setText("mostrar todos os compromissos cadastrados");
		setBackground(Color.white);
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		menu.setVisible(false);
		Mostrartudo mostrar= new Mostrartudo();
	}


}
