package web.beans;


import entities.*;
import org.primefaces.context.*;
import services.*;
import javax.faces.application.*;
import javax.faces.bean.*;
import java.io.Serializable;

/**
* Backing Bean Computo Service
*
*/
@ManagedBean
@SessionScoped
public class ComputoServicesBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private IPensionadoServices servicesPensionado;
	private IComputoServices services;
	private Long pensionadoId;
	private double valorPorPagar;
	private Pensionado pensionado=new Pensionado();
	
	private double pagoRiesgos;
	private double pagoSalud;
	private double pagoPension;
	
	

	public ComputoServicesBean() {
		servicesPensionado = new PensionadoServices();
		services = new ComputoServices();
		
	}
	
	
	public void findPensionadoById(Long idPensionado){
		pensionado=new Pensionado();
		pensionado=servicesPensionado.find(idPensionado);
		calculoPagoTotal();
	}
	
	public void calculoPagoTotal() {		
	
		pagoRiesgos = services.pagoRiesgos(pensionado);
		pagoSalud = services.pagoSalud(pensionado);
		pagoPension = services.pagoPension(pensionado);
		
		valorPorPagar = pagoRiesgos+pagoSalud+pagoPension;
	}
	
	public void showMessagePago() {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,"Pago exitoso", "Su pago fue realizado por los siguientes conceptos:"+
		" pagoRiesgos: "+pagoRiesgos+","+" pagoSalud: "+pagoSalud+","+" pagoPension: "+pagoPension+","+" valor Total a Pagar =" +valorPorPagar);
		RequestContext.getCurrentInstance().showMessageInDialog(message);
	}
	
	
	public Pensionado getPensionado() {
		return pensionado;
	}
	
	public void setPensionado(Pensionado pensionado) {
		this.pensionado = pensionado;
	}
	
	
	public double getValorPorPagar() {
		return valorPorPagar;
	}
	
	public void setValorPorPagar(float valorPorPagar) {
		this.valorPorPagar = valorPorPagar;
	}
	
	public Long getPensionadoId() {
		return pensionadoId;
	}
	
	public void setPensionadoId(Long pensionadoId) {
		this.pensionadoId = pensionadoId;
	}
	
	public double getPagoRiesgos() {
		return pagoRiesgos;
	}
	
	public void setPagoRiesgos(double pagoRiesgos) {
		this.pagoRiesgos = pagoRiesgos;
	}
	
	public double getPagoSalud() {
		return pagoSalud;
	}
	
	public void setPagoSalud(double pagoSalud) {
		this.pagoSalud = pagoSalud;
	}
	
	public double getPagoPension() {
		return pagoPension;
	}
	
	public void setPagoPension(double pagoPension) {
		this.pagoPension = pagoPension;
	}
	
}