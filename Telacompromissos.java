package AF;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Telacompromissos {

private Data d;
	
public Data getD() {
	return d;
}

public void setD(Data d) {
	this.d = d;
}

public Telacompromissos(Data d){
	this.d= d;
	Tela();
}

private void Tela() {
	DataDAO verificar= new DataDAO();
	if(verificar.existenobanco(d.getDia(), d.getMes(), d.getAno())==false) {
		verificar.inserir(d);
	}
	d=verificar.selecionarPorData(d.getDia(), d.getMes(), d.getAno());
	JFrame nome= new JFrame();
	nome.setSize(400,400);
	nome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	nome.setTitle("cadastrar compromissos");
	nome.setLayout(new BorderLayout());
	JPanel v= new JPanel();
	JPanel p= new JPanel();
	JPanel g= new JPanel();
	
	v.add(new JLabel("compromissos data "+d.getDia()+"/"+d.getMes()+"/"+d.getAno()));
	p.setLayout(new GridLayout(6,4));
	JTextField tsete= new JTextField(30);
	tsete.setText(d.getSete());
	p.add(new JLabel("7:00hrs-"));
	p.add(tsete);
	JTextField toito= new JTextField(30);
	toito.setText(d.getOito());
	p.add(new JLabel("8:00hrs-"));
	p.add(toito);
	JTextField tnove= new JTextField(30);
	tnove.setText(d.getNove());
	p.add(new JLabel("9:00hrs-"));
	p.add(tnove);
	JTextField tdez= new JTextField(30);
	tdez.setText(d.getDez());
	p.add(new JLabel("10:00hrs-"));
	p.add(tdez);
	JTextField tonze= new JTextField(30);
	tonze.setText(d.getOnze());
	p.add(new JLabel("11:00hrs-"));
	p.add(tonze);
	JTextField tdoze= new JTextField(30);
	tdoze.setText(d.getDoze());
	p.add(new JLabel("12:00hrs-"));
	p.add(tdoze);
	JTextField ttreze= new JTextField(30);
	ttreze.setText(d.getTreze());
	p.add(new JLabel("13:00hrs-"));
	p.add(ttreze);
	JTextField tquartorze= new JTextField(30);
	tquartorze.setText(d.getQuartorze());
	p.add(new JLabel("14:00hrs-"));
	p.add(tquartorze);
	JTextField tquinze= new JTextField(30);
	tquinze.setText(d.getQuinze());
	p.add(new JLabel("15:00hrs-"));
	p.add(tquinze);
	JTextField tdezesseis= new JTextField(30);
	tdezesseis.setText(d.getDezesseis());
	p.add(new JLabel("16:00hrs-"));
	p.add(tdezesseis);
	JTextField tdezesete= new JTextField(30);
	tdezesete.setText(d.getDezesete());
	p.add(new JLabel("17:00hrs-"));
	p.add(tdezesete);
	JTextField tdezoito= new JTextField(30);
	tdezoito.setText(d.getDezoito());
	p.add(new JLabel("18:00hrs-"));
	p.add(tdezoito);
	
	
	JButton b = new JButton("enviar");
	b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			nome.setVisible(false);
			d.setSete(tsete.getText());
			d.setOito(toito.getText());
			d.setNove(tnove.getText());
			d.setDez(tdez.getText());
			d.setOnze(tonze.getText());
			d.setDoze(tdoze.getText());
			d.setTreze(ttreze.getText());
			d.setQuartorze(tquartorze.getText());
			d.setQuinze(tquinze.getText());
			d.setDezesseis(tdezesseis.getText());
			d.setDezesete(tdezesete.getText());
			d.setDezoito(tdezoito.getText());
			verificar.update(d);
		}
	});
	g.add(b);
	nome.add(BorderLayout.NORTH, v);
	nome.add(BorderLayout.CENTER, p);
	nome.add(BorderLayout.SOUTH, g);
	nome.setVisible(true);
	
}

}
