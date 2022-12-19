package AF;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;


public class Import {
	public Import() {
		JFileChooser filech= new JFileChooser();
		filech.setFileSystemView(FileSystemView.getFileSystemView());
		FileNameExtensionFilter filter = new FileNameExtensionFilter("txt", "txt");
		filech.setFileFilter(filter);
		filech.showOpenDialog(null);
		if(filech.getSelectedFile()!=null) {
			importar(filech.getSelectedFile());
		}
	}
		public void importar(File file) {
			
			try {
				BufferedReader arquivo = new BufferedReader(new FileReader(file));
				while (arquivo.ready()) {
					String linha = arquivo.readLine();
					separarlinha(linha);
	}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		
	  public void separarlinha(String linha) {
		  String[] aux = linha.split(";");
		  Data auxiliar = new Data();
		  String[] separardata = aux[0].split("/");
		  auxiliar.setDia(separardata[0]);
		  auxiliar.setMes(separardata[1]);
		  auxiliar.setAno(separardata[2]);
		  auxiliar.setSete(aux[2]);
		  auxiliar.setOito(aux[4]);
		  auxiliar.setNove(aux[6]);
		  auxiliar.setDez(aux[8]);
		  auxiliar.setOnze(aux[10]);
		  auxiliar.setDoze(aux[12]);
		  auxiliar.setTreze(aux[14]);
		  auxiliar.setQuartorze(aux[16]);
		  auxiliar.setQuinze(aux[18]);
		  auxiliar.setDezesseis(aux[20]);
		  auxiliar.setDezesete(aux[22]);
		  auxiliar.setDezoito(aux[24]);
		 
		  DataDAO inserirauxiliar= new DataDAO();
		  inserirauxiliar.inserir(auxiliar);
		  
	  }
}
