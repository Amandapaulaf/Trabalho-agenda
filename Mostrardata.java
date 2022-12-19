package AF;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Mostrardata {

	public Mostrardata() {
		informardata();
		
	}



	private void informardata() {
		JFrame nome= new JFrame();
		nome.setSize(400,400);
		nome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nome.setTitle("informar data");
		nome.setLayout(new BorderLayout());
		JPanel v= new JPanel();
		JPanel p= new JPanel();
		v.add(new JLabel("data:"));
		JTextField dia= new JTextField(2);
		JTextField mes= new JTextField(2);
		JTextField ano= new JTextField(2);
		v.add(dia);
		v.add(mes);
		v.add(ano);
		JButton b = new JButton("enviar");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Data mdata= new Data();
				mdata.setDia(dia.getText());
				mdata.setMes(mes.getText());
				mdata.setAno(ano.getText());
				nome.setVisible(false);
				TelaMostrardata m= new TelaMostrardata(mdata);
			}
		});
		p.add(b);
		nome.add(BorderLayout.CENTER, v);
		nome.add(BorderLayout.SOUTH, p);
		nome.setVisible(true);
		
	}
}
