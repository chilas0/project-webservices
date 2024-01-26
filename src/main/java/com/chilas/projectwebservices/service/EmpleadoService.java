package com.chilas.projectwebservices.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.chilas.projectwebservices.entity.Empleado;

/**
 * @author Anthony
 * 
 * */

public class EmpleadoService {

	
	/**
	 *Metodo que permite consultar un empleado por su id.
	 *@param numeroEmpleado {@link String} numero del empleado.
	 * @return {@link Empleado} empleado consultado.
	 **/
	public Empleado consultarEmpleadoPorId(String numeroEmpleado) {
		List<Empleado> empleadosConsultados =  this.consultarEmpleados();
		
		for(Empleado empleadoConsultado : empleadosConsultados) {
			if(empleadoConsultado.getNumeroEmpleado().equals(numeroEmpleado)) {
				return empleadoConsultado;
			}
		}
		return null;
	}
	
	
	/**
	 * Metodo que simula la consulta de un empleado.
	 * @return {@link Empleado} empleado consultado
	 * */
	public Empleado consultarEmpleado() {
		Empleado empleado = new Empleado();
		empleado.setNumeroEmpleado("123456");
		empleado.setNombre("Antony");
		empleado.setPrimerApellido("Abarca");
		empleado.setSegundoApellido("Zúñiga");
		empleado.setFechaCreacion(LocalDateTime.now());
		empleado.setEdad(28);
		
		return empleado;
	}
	
	
	/**
	 * Metodo que permite consultar la lista de empleados
	 * @return {@link List} lista consultada 
	 * */
	public List<Empleado> consultarEmpleados(){
		List<Empleado> empleados = new ArrayList();
		
		Empleado empleado = new Empleado();
		empleado.setNumeroEmpleado("123456");
		empleado.setNombre("Antony");
		empleado.setPrimerApellido("Abarca");
		empleado.setSegundoApellido("Zúñiga");
		empleado.setFechaCreacion(LocalDateTime.now());
		empleado.setEdad(28);
		
		Empleado empleadoNuevo = new Empleado();
		empleadoNuevo.setNumeroEmpleado("789");
		empleadoNuevo.setNombre("Jerouth");
		empleadoNuevo.setPrimerApellido("Campos");
		empleadoNuevo.setSegundoApellido("Salazar");
		empleadoNuevo.setFechaCreacion(LocalDateTime.now());
		empleadoNuevo.setEdad(22);
		
		empleados.add(empleado);
		empleados.add(empleadoNuevo);
		
		return empleados;
		
	}
	
	
	
}









