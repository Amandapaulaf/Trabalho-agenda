package AF;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menuinicial extends JFrame {
	
public Menuinicial() {
	setSize(400,400);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setTitle("menu");
	setLayout(new BorderLayout());
	JLabel l= new JLabel("Agenda de compromissos");
	add(BorderLayout.NORTH, l);
	panelmenu(this);
	setVisible(true);
	
}
public void panelmenu(JFrame j) {
	JPanel p= new JPanel();
	j.add(BorderLayout.CENTER, p);
	p.setLayout(new GridLayout(5,1));
	Bcadastrarcompromissivo b1= new Bcadastrarcompromissivo(this);
	BMostrarcompromissos b2= new BMostrarcompromissos(this);
	Bmostrarcompromissodata b3= new Bmostrarcompromissodata(this);
	Bimportarcompromissos b4= new Bimportarcompromissos(this);
	Bexpotarcopromissos b5= new Bexpotarcopromissos(this);
	p.add(b1);
	p.add(b2);
	p.add(b3);
	p.add(b4);
	p.add(b5);
	
	
}
}
