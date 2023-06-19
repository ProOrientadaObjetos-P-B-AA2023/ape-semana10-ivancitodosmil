package paquete2;

public class Prestamo {
    public Persona beneficiario;
    public int tiempoprestamo;
    public String ciudad;

    public Prestamo() {}
    public Prestamo(Persona beneficiario, int tiempoprestamo, String ciudad) {
        this.beneficiario = beneficiario;
        this.tiempoprestamo = tiempoprestamo;
        this.ciudad = ciudad;
    }

    public Persona getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Persona beneficiario) {
        this.beneficiario = beneficiario;
    }

    public int getTiempoprestamo() {
        return tiempoprestamo;
    }

    public void setTiempoprestamo(int tiempoprestamo) {
        this.tiempoprestamo = tiempoprestamo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String toString(){
        String msj = String.format("Préstamo "
                        + "\n Beneficiario %.2f "
                        + "\n Tiempo del Préstamo %d "
                        + "\n Ciudad del Préstamo %s ",
                this.getBeneficiario(),this.getTiempoprestamo(),this.getCiudad());
        return msj;
    }
}

