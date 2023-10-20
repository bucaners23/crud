package CRUD;

public class Dtaos {
String nobre;
String apellidop;
String apellidom;
String id;
String numeroc;
String curp;
String direccion;
String telefono;
String correo;
String grupo;
String carrera;
String fecha;
DataAlumno da=new DataAlumno();
public boolean insertarAlumno() {
	if(da.insertarAlumno(this)) {
		return true;
	}else {
		return false;
	}
}
public Dtaos() {
}
public Dtaos(String nobre, String apellidop, String apellidom, String id, String numeroc, String curp, String direccion,
		String telefono, String correo, String grupo, String carrera, String fecha) {
	super();
	this.nobre = nobre;
	this.apellidop = apellidop;
	this.apellidom = apellidom;
	this.id = id;
	this.numeroc = numeroc;
	this.curp = curp;
	this.direccion = direccion;
	this.telefono = telefono;
	this.correo = correo;
	this.grupo = grupo;
	this.carrera = carrera;
	this.fecha = fecha;
}
public String getNobre() {
	return nobre;
}
public void setNobre(String nobre) {
	this.nobre = nobre;
}
public String getApellidop() {
	return apellidop;
}
public void setApellidop(String apellidop) {
	this.apellidop = apellidop;
}
public String getApellidom() {
	return apellidom;
}
public void setApellidom(String apellidom) {
	this.apellidom = apellidom;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getNumeroc() {
	return numeroc;
}
public void setNumeroc(String numeroc) {
	this.numeroc = numeroc;
}
public String getCurp() {
	return curp;
}
public void setCurp(String curp) {
	this.curp = curp;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
public String getCorreo() {
	return correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}
public String getGrupo() {
	return grupo;
}
public void setGrupo(String grupo) {
	this.grupo = grupo;
}
public String getCarrera() {
	return carrera;
}
public void setCarrera(String carrera) {
	this.carrera = carrera;
}
public String getFecha() {
	return fecha;
}
public void setFecha(String fecha) {
	this.fecha = fecha;
}

}
