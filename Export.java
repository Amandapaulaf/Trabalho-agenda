package AF;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;



public class Export {
	public Export(){
		JFileChooser filech= new JFileChooser();
		filech.setFileSystemView(FileSystemView.getFileSystemView());
		FileNameExtensionFilter filter = new FileNameExtensionFilter("txt", "txt");
		filech.setFileFilter(filter);
		filech.showOpenDialog(null);
		if(filech.getSelectedFile()!=null) {
			escrever(escreverstring() ,filech.getSelectedFile());
		}
	}
	public void escrever(String mensagem, File file) {
			
			try {
				FileWriter arquivo = new FileWriter(file);
				arquivo.write(mensagem);
				arquivo.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	public String escreverstring() {
		DataDAO data= new DataDAO();
		ArrayList<Data> a= data.listar();
		String aux= new String();
		for(Data b: a) {
			aux= b.getDia()+"/"+b.getMes()+"/"+b.getAno()+"7:00;"+b.getSete()+";"+"8:00;"+b.getOito()+";"+
					"9:00;"+b.getNove()+";"+"10:00;"+b.getDez()+";"+"11:00;"+b.getOnze()+";"+"12:00;"+b.getDoze()+";"+"13:00;"+b.getTreze()+";"+"14:00;"+b.getQuartorze()+";"+"15:00;"+b.getQuinze()+";"+"16:00;"+b.getDezesseis()+";"+"17:00;"+b.getDezesete()+";"+"18:00;"+b.getDezoito()+"/n";
		}
		return aux;
	}

}
