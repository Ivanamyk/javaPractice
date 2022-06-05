package empresa.test;

import empresa.domain.EmpComercial;
import empresa.domain.EmpRepartidor;
import empresa.domain.Empleado;
import empresa.domain.Empresa;

public class EmpleadoTest {
	public static void main(String[] args) {
		
		Empleado emp = new EmpComercial("Jon", 40, 3000.00, 215.00);
		Empleado emp3 = new EmpComercial("Jon", 40, 3000.00, 300.00);
		Empleado emp2 = new EmpRepartidor("Maria", 21, 2500.00, "zona 3");
		//System.out.println(emp.hacePlus());
		//System.out.println(emp2.hacePlus());
		
		
		Empresa empresa = new Empresa();
		
		empresa.addEmpleado(emp);
		empresa.addEmpleado(emp2);
		empresa.addEmpleado(emp3);
		
		empresa.showEmpleados();
		
	}
}	
