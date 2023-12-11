package br.org.sesisp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;

import br.org.sesisp.controller.Conexao;
import br.org.sesisp.model.FilmesSeries;

public class CrudDAO {
	//CREATE
	public void create(FilmesSeries filmeseseries) {
		String sql = "INSERT INTO filmeseseries(nome, anoLancamento, faixaEtaria, genero, sinopse) VALUES (?,?,?,?,?)";
		//link com o banco
		Connection conn = null;
		PreparedStatement p = null;
		try {
			conn = Conexao.criandoConexao(); //conecta
			p = (PreparedStatement) conn.prepareStatement(sql); //cast
			p.setString(1, filmeseseries.getNome());
			p.setInt(2, filmeseseries.getAnoLancamento());
			p.setInt(3, filmeseseries.getFaixaEtaria());
			p.setString(4, filmeseseries.getGenero());
			p.setString(5, filmeseseries.getSinopse());
			p.execute();
		}catch(Exception e) {
			System.out.println("Erro ao inserir os dados! \nERRO: " + e);
		}finally {
			try {
				if(p != null) {
					p.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}//fim do CREATE
	
	//UPDATE
	public void update(FilmesSeries filmeseseries) {
		String sql = "UPDATE filmeseseries SET nome = ?, anoLancamento = ?, faixaEtaria = ?, genero = ?, sinopse = ? WHERE coluna = ?";
		//link com o banco
		Connection conn = null;
		PreparedStatement p = null;
		try {
			conn = Conexao.criandoConexao(); //conecta
			p = (PreparedStatement) conn.prepareStatement(sql); //cast
			p.setInt(1, filmeseseries.getColuna());
			p.setString(2, filmeseseries.getNome());
			p.setInt(3, filmeseseries.getAnoLancamento());
			p.setInt(4, filmeseseries.getFaixaEtaria());
			p.setString(5, filmeseseries.getGenero());
			p.setString(6, filmeseseries.getSinopse());
			p.execute();
			System.out.println("Dados atualizados!");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao inserir os dados! \nERRO: " + e);
		}finally {
			try {
				if(p != null) {
					p.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}//fim do UPDATE
	
	//READ
	public List<FilmesSeries> read(){
		String sql = "SELECT * FROM filmeseseries";
		List<FilmesSeries> filmeseseries = new ArrayList<FilmesSeries>();
		//link com o banco
		Connection conn = null;
		PreparedStatement p = null;
		ResultSet resultado = null;
		try {
			conn = Conexao.criandoConexao(); //conecta
			p = (PreparedStatement) conn.prepareStatement(sql); //cast
			resultado = p.executeQuery(); // mostra os dados do sql
			while(resultado.next()) {
				FilmesSeries filmes_series = new FilmesSeries();
				//recuperar os atributos
				filmes_series.setColuna(resultado.getInt("coluna"));
				filmes_series.setNome(resultado.getString("nome"));
				filmes_series.setAnoLancamento(resultado.getInt("anoLancamento"));
				filmes_series.setFaixaEtaria(resultado.getInt("faixaEtaria"));
				filmes_series.setGenero(resultado.getString("genero"));
				filmes_series.setSinopse(resultado.getString("sinopse"));
				//adicionar na lista
				filmeseseries.add(filmes_series);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(p != null) {
					p.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return filmeseseries;
	}//fim do READ
	
	//DELETE
	public boolean delete(int coluna) {
		String sql = "DELETE FROM filmeseseries WHERE coluna = ?";
		//link com o banco
		Connection conn = null;
		PreparedStatement p = null;
		try {
			conn = Conexao.criandoConexao(); //conecta
			p = (PreparedStatement) conn.prepareStatement(sql); //cast
			p.setInt(1, coluna);
			p.execute();
			JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
			System.out.println("Dados excluidos com sucesso!");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao excluir os dados! \nERRO: " + e);
		}finally {
			try {
				if(p != null) {
					p.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}//fim do DELETE
}