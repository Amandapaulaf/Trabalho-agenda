package AF;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Bmostrarcompromissodata extends JButton implements ActionListener{

private JFrame menu;
	
	public Bmostrarcompromissodata(Menuinicial m) {
		this.menu=m;
		setText("mostrar compromissos por data");
		setBackground(Color.white);
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		menu.setVisible(false);
		Mostrardata mostrar=new Mostrardata();
	}

}
