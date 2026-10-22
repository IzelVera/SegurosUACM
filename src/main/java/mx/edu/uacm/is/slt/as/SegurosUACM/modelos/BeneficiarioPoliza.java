package mx.edu.uacm.is.slt.as.SegurosUACM.modelos;


import java.util.Objects;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;


@Entity
public class BeneficiarioPoliza {


	@EmbeddedId
	private	idBeneficiarioPoliza id ; 
	private byte  porcentaje;	
	
	public BeneficiarioPoliza() {}
		
	public BeneficiarioPoliza(idBeneficiarioPoliza id, byte porcentaje) {
		super();
		this.id = id;
		this.porcentaje = porcentaje;
	}
	
	public idBeneficiarioPoliza getId() {
		return id;
	}

	public void setId(idBeneficiarioPoliza id) {
		this.id = id;
	}

	public byte getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(byte porcentaje) {
		this.porcentaje = porcentaje;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, Byte.valueOf(porcentaje));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof BeneficiarioPoliza)) {
			return false;
		}
		BeneficiarioPoliza other = (BeneficiarioPoliza) obj;
		return Objects.equals(id, other.id) && porcentaje == other.porcentaje;
	}


}
