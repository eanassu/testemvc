package br.vemprafam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.vemprafam.pojo.Usuario;

@Repository
public class DaoUsuario {
	private final Connection connection;

	@Autowired
	public DaoUsuario(DataSource dataSource) {
		super();
		try {
			this.connection = dataSource.getConnection();
		} catch ( SQLException e ) {
			throw new RuntimeException(e);
		}
	}
	
	public boolean validarLogin(Usuario usuario) {
		try {
			PreparedStatement pstmt = connection.prepareStatement("select senha from usuarios where login = ?");
			pstmt.setString(1, usuario.getLogin());
			ResultSet rs = pstmt.executeQuery();
			if ( rs.next() ) {
				String senha = rs.getString(1);
				if ( senha.equals(usuario.getSenha())) {
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return false;
	}
}
