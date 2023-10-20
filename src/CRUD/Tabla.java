package CRUD;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tabla {

	private JFrame frame;
	private JTextField txtNom;
	private JTextField txtAp;
	private JTextField txtAm;
	private JTextField txtId;
	private JTextField txtNcon;
	private JTextField txtCur;
	private JTextField txtDir;
	private JTextField txtTel;
	private JTextField txtCor;
	private JTextField txtGru;
	private JTextField txtCar;
	private JTextField txtFec;
	private JTable tblD;
	private DefaultTableModel modelo = new DefaultTableModel();
	public ArrayList<Dtaos> lista = new ArrayList<Dtaos>();
	private JScrollPane scrollPane;
	private JButton btnNewButton_1;
	private JButton btnAgr;

	public static void main(String[] args) {
		Tabla x = new Tabla();
		x.frame.setVisible(true);
	}

	public void borrarTabla() {
		lista.clear();
		actualizarTabla();

	}

	public ArrayList<DataAlumno> selectDataAlumno() {
		
		return null;

	}

	public void actualizarTabla() {
		while (modelo.getRowCount() > 0) {
			modelo.removeRow(0);
			
		}
		for (Dtaos dragon : lista) {
			Object o[] = new Object[12];
			o[0] = dragon.getNobre();
			o[1] = dragon.getApellidop();
			o[2] = dragon.getApellidom();
			o[3] = dragon.getId();
			o[4] = dragon.getNumeroc();
			o[5] = dragon.getCurp();
			o[6] = dragon.getDireccion();
			o[7] = dragon.getTelefono();
			o[8] = dragon.getCorreo();
			o[9] = dragon.getGrupo();
			o[10] = dragon.getCarrera();
			o[11] = dragon.getFecha();
			modelo.addRow(o);
		}
		tblD.setModel(modelo);

	}

	public Tabla() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Tabla.class.getResource("/CRUD/oky.jpg")));
		frame.setTitle("Tabla de datos de alumno");
		frame.setBounds(100, 100, 1151, 487);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(20, 25, 78, 14);
		frame.getContentPane().add(lblNewLabel);

		txtNom = new JTextField();
		txtNom.setBounds(120, 22, 133, 20);
		frame.getContentPane().add(txtNom);
		txtNom.setColumns(10);

		JLabel lblApellidoPaterno = new JLabel("Apellido Paterno");
		lblApellidoPaterno.setBounds(10, 50, 99, 14);
		frame.getContentPane().add(lblApellidoPaterno);

		txtAp = new JTextField();
		txtAp.setColumns(10);
		txtAp.setBounds(120, 48, 133, 20);
		frame.getContentPane().add(txtAp);

		JLabel lblApellidoMaterno = new JLabel("Apellido materno");
		lblApellidoMaterno.setBounds(10, 78, 88, 14);
		frame.getContentPane().add(lblApellidoMaterno);

		txtAm = new JTextField();
		txtAm.setColumns(10);
		txtAm.setBounds(120, 75, 133, 20);
		frame.getContentPane().add(txtAm);

		JLabel lblId = new JLabel("id");
		lblId.setBounds(20, 105, 78, 14);
		frame.getContentPane().add(lblId);

		txtId = new JTextField();
		txtId.setColumns(10);
		txtId.setBounds(120, 102, 133, 20);
		frame.getContentPane().add(txtId);

		JLabel lblNumeroControl = new JLabel("numero control");
		lblNumeroControl.setBounds(20, 131, 78, 14);
		frame.getContentPane().add(lblNumeroControl);

		txtNcon = new JTextField();
		txtNcon.setColumns(10);
		txtNcon.setBounds(120, 128, 133, 20);
		frame.getContentPane().add(txtNcon);

		JLabel lblCurp = new JLabel("CURP");
		lblCurp.setBounds(20, 159, 78, 14);
		frame.getContentPane().add(lblCurp);

		txtCur = new JTextField();
		txtCur.setColumns(10);
		txtCur.setBounds(120, 156, 133, 20);
		frame.getContentPane().add(txtCur);

		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(20, 189, 78, 14);
		frame.getContentPane().add(lblDireccion);

		txtDir = new JTextField();
		txtDir.setColumns(10);
		txtDir.setBounds(120, 186, 133, 20);
		frame.getContentPane().add(txtDir);

		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(20, 218, 78, 14);
		frame.getContentPane().add(lblTelefono);

		txtTel = new JTextField();
		txtTel.setColumns(10);
		txtTel.setBounds(120, 215, 133, 20);
		frame.getContentPane().add(txtTel);

		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setBounds(20, 246, 78, 14);
		frame.getContentPane().add(lblCorreo);

		txtCor = new JTextField();
		txtCor.setColumns(10);
		txtCor.setBounds(120, 246, 133, 20);
		frame.getContentPane().add(txtCor);

		JLabel lblGrupo = new JLabel("Grupo");
		lblGrupo.setBounds(20, 274, 78, 14);
		frame.getContentPane().add(lblGrupo);

		txtGru = new JTextField();
		txtGru.setColumns(10);
		txtGru.setBounds(120, 271, 133, 20);
		frame.getContentPane().add(txtGru);

		JLabel lblCarrera = new JLabel("Carrera");
		lblCarrera.setBounds(20, 304, 78, 14);
		frame.getContentPane().add(lblCarrera);

		txtCar = new JTextField();
		txtCar.setColumns(10);
		txtCar.setBounds(120, 302, 133, 20);
		frame.getContentPane().add(txtCar);

		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(20, 330, 78, 14);
		frame.getContentPane().add(lblFecha);

		txtFec = new JTextField();
		txtFec.setColumns(10);
		txtFec.setBounds(120, 327, 133, 20);
		frame.getContentPane().add(txtFec);
		
		
		btnAgr = new JButton("Agregar");
		btnAgr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dtaos x = new Dtaos();
				x.setNobre(txtNom.getText());
				x.setApellidop(txtAp.getText());
				x.setApellidom(txtAm.getText());
				x.setId(txtId.getText());
				x.setNumeroc(txtNcon.getText());
				x.setCurp(txtCur.getText());
				x.setDireccion(txtDir.getText());
				x.setTelefono(txtTel.getText());
				x.setCorreo(txtCor.getText());
				x.setGrupo(txtGru.getText());
				x.setCarrera(txtCar.getText());
				x.setFecha(txtFec.getText());

				if (x.insertarAlumno()) {
					JOptionPane.showMessageDialog(null, "correcto");
					actualizarTabla();
				} else {
					JOptionPane.showMessageDialog(null, "Error 404 xd xd");
				} lista.add(x);
				actualizarTabla();
			}
		});
		btnAgr.setBounds(10, 355, 89, 23);
		frame.getContentPane().add(btnAgr);

		btnNewButton_1 = new JButton("Borrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAm.setText("");
				txtAp.setText("");
				txtCar.setText("");
				txtCor.setText("");
				txtCur.setText("");
				txtDir.setText("");
				txtFec.setText("");
				txtFec.setText("");
				txtGru.setText("");
				txtId.setText("");
				txtNcon.setText("");
				txtNom.setText("");
				txtTel.setText("");
			}
		});
		btnNewButton_1.setBounds(120, 358, 89, 23);
		frame.getContentPane().add(btnNewButton_1);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(283, 25, 842, 392);
		frame.getContentPane().add(scrollPane);

		tblD = new JTable();

		scrollPane.setViewportView(tblD);
		modelo.addColumn("Nombre");
		modelo.addColumn("Apellido paterno");
		modelo.addColumn("Apellido materno");
		modelo.addColumn("Id");
		modelo.addColumn("Numero control");
		modelo.addColumn("CURP");
		modelo.addColumn("Direccion");
		modelo.addColumn("Telefono");
		modelo.addColumn("Correo");
		modelo.addColumn("Grupo");
		modelo.addColumn("Carrera");
		modelo.addColumn("Fecha");
		tblD.setModel(modelo);

		JButton btnNewButton = new JButton("Borrar tabla");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrarTabla();
			}
		});
		btnNewButton.setBounds(20, 394, 110, 23);
		frame.getContentPane().add(btnNewButton);
		
	

	}
}
