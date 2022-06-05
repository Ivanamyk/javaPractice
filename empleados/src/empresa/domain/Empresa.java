package empresa.domain;

import java.util.ArrayList;
import java.util.List;

//creo la clase Empresa para ahi crear una lista de empleados
public class Empresa {
	
	// list importado de java util 
	List<Empleado> ListaEmpleados;
	
	//constructor
	public Empresa() {
		//array list importado de java util 
		ListaEmpleados = new ArrayList<>();
	}

	
	//getters & setters
	public List<Empleado> getListaEmpleados() {
		return ListaEmpleados;
	}
	public void setListaEmpleados(List<Empleado> listaEmpleados) {
		ListaEmpleados = listaEmpleados;
	}
	//aparte del get y set, para un array list necesito agregar un "add" para facilmente añadir nuevos items en mi lista
	public void addEmpleado(Empleado empleado) {
		this.ListaEmpleados.add(empleado);
	}
	
	
	//metodo para mostrar los empleados
	public void showEmpleados() {
		//el : significa un "in"; empleado in(:) ListaEmpleados - que los recorre uno a uno
		for(Empleado empleado : ListaEmpleados) {
			if(empleado != null) {
				System.out.println(empleado.toString());
			}
		}
	}
}
