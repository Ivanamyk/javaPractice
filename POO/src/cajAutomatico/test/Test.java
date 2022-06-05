package cajAutomatico.test;

import cajAutomatico.dominio.CajeroAutomatico;

public class Test {
	public static void main(String args[]) {
		
		CajeroAutomatico cajAutomatico = new CajeroAutomatico();
		
		cajAutomatico.setCodigoAcceso("ADC12345");
		cajAutomatico.setDni(39393939);
		cajAutomatico.setNombre("Maria");
		
		System.out.println(cajAutomatico.getCodigoAcceso());
		System.out.println(cajAutomatico.getDni());
		System.out.println(cajAutomatico.getNombre());
		
		cajAutomatico.salirDeLaSesion();
		cajAutomatico.transferirDinero();
	}
}
