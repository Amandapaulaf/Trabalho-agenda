package AF;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Mostrartudo {
public Mostrartudo() {
	tela();
}

public void tela() {
JFrame frame= new JFrame();
JPanel v= new JPanel();
frame.setSize(640,480);
frame.setTitle("mostrar compromissos");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(new BorderLayout());
v.add(new JLabel("compromissos cadastrados"));
JPanel g= new JPanel();
JLabel label= new JLabel(pegarstring());
g.add(label);
frame.add(BorderLayout.NORTH, v);
frame.add(BorderLayout.CENTER, g);
frame.setVisible(true);

}
public String pegarstring() {
	String lista= new String();
	DataDAO data= new DataDAO();
	lista="<html>";
	for(Data d: data.listar()) {
		lista+= "Agenda "+ d.getDia()+"/"+d.getMes()+"/"+d.getAno()+"<br>"+"7:00- "+d.getSete()+"<br>"+"8:00- "+d.getOito()+"<br>"+
	"9:00- "+d.getNove()+"<br>"+"10:00- "+d.getDez()+"<br>"+"11:00- "+d.getOnze()+"<br>"+"12:00- "+d.getDoze()+"<br>"+"13:00- "+d.getTreze()+"<br>"+"14:00- "+d.getQuartorze()+"<br>"+"15:00- "+d.getQuinze()+"<br>"+"16:00- "+d.getDezesseis()+"<br>"+"17:00- "+d.getDezesete()+"<br>"+"18:00- "+d.getDezoito()+"<br>"+"<br>";
	}
	lista+="</html>";
	return lista;
	
}

}
