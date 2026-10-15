package mx.edu.uacm.is.slt.as.SegurosUACM.modelos;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity new*
public class Poliza {
	
	@Id
	private UUID clave;
	
	private byte tipo;
	
	private BigDecimal monto; //no se pierde decimales
	
	private String descripcion;
	
	private String curpCliente; 

	public UUID getClave() {
		return clave;
	}

	public void setClave(UUID clave) {
		this.clave = clave;
	}

	public byte getTipo() {
		return tipo;
	}

	public void setTipo(byte tipo) {
		this.tipo = tipo;
	}
	
	
	
	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCurpCliente() {
		return curpCliente;
	}

	public void setCurpCliente(String curpCliente) {
		this.curpCliente = curpCliente;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(super.equals(obj)) {
		return true;
		}
		if(obj instanceof Poliza) {
			Poliza p = (Poliza) obj;
			return clave.equals(p.clave);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(clave, tipo);
	}

}

