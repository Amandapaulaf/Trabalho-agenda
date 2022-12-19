package AF;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaMostrardata {
private Data d;
	public TelaMostrardata(Data d) {
		this.d=d;
		exibircompromissos();
	}
	private void exibircompromissos() {
		JFrame frame= new JFrame();
		JPanel v= new JPanel();
		frame.setSize(640,480);
		frame.setTitle("mostrar compromissos");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		v.add(new JLabel("mostrar compromissos na data "+d.getDia()+"/"+d.getMes()+"/"+d.getAno()));
		JPanel g= new JPanel();
		JLabel label= new JLabel(pegarstring());
		g.add(label);
		frame.add(BorderLayout.NORTH, v);
		frame.add(BorderLayout.CENTER, g);
		frame.setVisible(true);
		
	}
	private String pegarstring() {
		String lista= new String();
		Data aux= new Data();
		DataDAO data= new DataDAO();
		aux= data.selecionarPorData(d.getDia(), d.getMes(), d.getAno());
		lista+="<html>";
			lista+= "Agenda "+ aux.getDia()+"/"+aux.getMes()+"/"+aux.getAno()+"<br>"+"7:00- "+aux.getSete()+"<br>"+"8:00- "+aux.getOito()+"<br>"+
		"9:00- "+aux.getNove()+"<br>"+"10:00- "+aux.getDez()+"<br>"+"11:00- "+aux.getOnze()+"<br>"+"12:00- "+aux.getDoze()+"<br>"+"13:00- "+aux.getTreze()+"<br>"+"14:00- "+aux.getQuartorze()+"<br>"+"15:00- "+aux.getQuinze()+"<br>"+"16:00- "+aux.getDezesseis()+"<br>"+"17:00- "+aux.getDezesete()+"<br>"+"18:00- "+aux.getDezoito()+"<br>"+"<br>";
	    lista+="</html>";
		return lista;
	}
}
