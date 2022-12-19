package AF;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;




public class DataDAO {
	public ArrayList<Data> listar() {
		ArrayList<Data> aux = new ArrayList<Data>();
		try {
			Connection conexao = new Conexao().getConexao();

			ResultSet resultado = conexao.prepareStatement("select * from compromissos").executeQuery();

			Data data;
			while (resultado.next()) {
				data = new Data();
				data.setDia(resultado.getString("dia"));
				data.setMes(resultado.getString("mes"));
				data.setAno(resultado.getString("ano"));
				data.setSete(resultado.getString("sete"));
				data.setOito(resultado.getString("oito"));
				data.setNove(resultado.getString("nove"));
				data.setDez(resultado.getString("dez"));
				data.setOnze(resultado.getString("onze"));
				data.setDoze(resultado.getString("doze"));
				data.setTreze(resultado.getString("treze"));
				data.setQuartorze(resultado.getString("quartoze"));
				data.setQuinze(resultado.getString("quinze"));
				data.setDezesseis(resultado.getString("dezesseis"));
				data.setDezesete(resultado.getString("dezesete"));
				data.setDezoito(resultado.getString("dezoito"));
			
				aux.add(data);
				
			}
			
			conexao.close();
		} catch (Exception e) {

		}
		return aux;
	}
	
	public void inserir(Data a) {
		try {
			Connection conexao = new Conexao().getConexao();

			PreparedStatement inserir =
					 conexao.prepareStatement("insert into compromissos (dia, mes, ano, sete, oito, nove, dez, onze, doze, treze, quartoze, quinze, dezesseis, dezesete, dezoito ) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			inserir.setString(1, a.getDia());
			inserir.setString(2, a.getMes());
			inserir.setString(3, a.getAno());
			inserir.setString(4, a.getSete());
			inserir.setString(5, a.getOito());
			inserir.setString(6, a.getNove());
			inserir.setString(7, a.getDez());
			inserir.setString(8, a.getOnze());
			inserir.setString(9, a.getDoze());
			inserir.setString(10, a.getTreze());
			inserir.setString(11, a.getQuartorze());
			inserir.setString(12, a.getQuinze());
			inserir.setString(13, a.getDezesseis());
			inserir.setString(14, a.getDezesete());
			inserir.setString(15, a.getDezoito());
			
			
			inserir.executeUpdate();
			
			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Data selecionarPorData(String dia, String mes,String ano) {

		Data data = null;

		try {
			Connection conexao = new Conexao().getConexao();

			PreparedStatement resultado = 
		 conexao.prepareStatement("select * from compromissos where dia =? and mes=? and ano=?");
           
			resultado.setString(1, dia);
			resultado.setString(2, mes);
			resultado.setString(3, ano);
			ResultSet resposta= resultado.executeQuery();
			
			while (resposta.next()) {
				data = new Data();
				data.setDia(resposta.getString("dia"));
				data.setMes(resposta.getString("mes"));
				data.setAno(resposta.getString("ano"));
				data.setSete(resposta.getString("sete"));
				data.setOito(resposta.getString("oito"));
				data.setNove(resposta.getString("nove"));
				data.setDez(resposta.getString("dez"));
				data.setOnze(resposta.getString("onze"));
				data.setDoze(resposta.getString("doze"));
				data.setTreze(resposta.getString("treze"));
				data.setQuartorze(resposta.getString("quartoze"));
				data.setQuinze(resposta.getString("quinze"));
				data.setDezesseis(resposta.getString("dezesseis"));
				data.setDezesete(resposta.getString("dezesete"));
				data.setDezoito(resposta.getString("dezoito"));
			}
			conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return data;

	}
public boolean existenobanco(String dia, String mes, String ano){
	boolean resul;
	int contador=0;
	try {
		Connection conexao = new Conexao().getConexao();

		PreparedStatement resultado = 
	 conexao.prepareStatement("select * from compromissos where dia =? and mes=? and ano=?");
       
		resultado.setString(1, dia);
		resultado.setString(2, mes);
		resultado.setString(3, ano);
		ResultSet resposta= resultado.executeQuery();
		
		while (resposta.next()) {
			contador++;
		}
		conexao.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
if(contador==0) {
	resul=false;}
else {
	resul=true;}
System.out.println(resul);
return resul;
}

public void update(Data a) {

	try {
		Connection conexao = new Conexao().getConexao();
		PreparedStatement up = conexao.prepareStatement("update compromissos set sete=?, oito=?, nove=?, dez=?, onze=?, doze=?, treze=?, quartoze=?, quinze=?, dezesseis=?, dezesete=?, dezoito=? where dia =? and mes=? and ano=?");
		up.setString(1, a.getSete());
		up.setString(2, a.getOito());
		up.setString(3, a.getNove());
		up.setString(4, a.getDez());
		up.setString(5, a.getOnze());
		up.setString(6, a.getDoze());
		up.setString(7, a.getTreze());
		up.setString(8, a.getQuartorze());
		up.setString(9, a.getQuinze());
		up.setString(10, a.getDezesseis());
		up.setString(11, a.getDezesete());
		up.setString(12, a.getDezoito());
		up.setString(13, a.getDia());
		up.setString(14, a.getMes());
		up.setString(15, a.getAno());
		up.executeUpdate();

		conexao.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}


}
