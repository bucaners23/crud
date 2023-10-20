package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DataAlumno {
	Connection cx;

	public DataAlumno() {
	}

	public Connection conectar() {
		try {
			cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/xd", "root", "");
			System.out.println("CONEXION EXITOSA");
		} catch (SQLException e) {
			System.out.println("FALLO DE CONEXION");
			e.printStackTrace();
		}
		return cx;
	}

	public boolean insertarAlumno(Dtaos a) {
		PreparedStatement ps;
		try {
			ps = conectar().prepareStatement("Insert into datos values(null,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, a.getNumeroc());
			ps.setString(2, a.getNobre());
			ps.setString(3, a.getApellidop());
			ps.setString(4, a.getApellidom());
			ps.setString(5, a.getCurp());
			ps.setString(6, a.getDireccion());
			ps.setString(7, a.getTelefono());
			ps.setString(8, a.getCorreo());
			ps.setString(9, a.getGrupo());
			ps.setString(10, a.getCarrera());
			ps.setString(11, a.getFecha());
			ps.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public ArrayList<Dtaos> selectDtaos() {
		ArrayList<Dtaos> listaAlumno = null;
		try {
			listaAlumno = new ArrayList<Dtaos>();
			PreparedStatement ps = conectar().prepareStatement("Select * FROM datos");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Dtaos x = new Dtaos();
				x.setId(rs.getString(1));
				x.setNumeroc(rs.getString(2));
				x.setNobre(rs.getString(3));
				x.setApellidop(rs.getString(4));
				x.setApellidom(rs.getString(5));
				x.setCurp(rs.getString(6));
				x.setDireccion(rs.getString(7));
				x.setTelefono(rs.getString(8));
				x.setCorreo(rs.getString(9));
				x.setGrupo(rs.getString(10));
				x.setCarrera(rs.getString(11));
				x.setFecha(rs.getString(12));
				listaAlumno.add(x);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaAlumno;
	}
}
