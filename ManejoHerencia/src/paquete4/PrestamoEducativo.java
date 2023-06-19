package paquete4;

import paquete2.InstitucionEducativa;
import paquete2.Persona;
import paquete2.Prestamo;

public class PrestamoEducativo extends Prestamo {
    private String nivelestudio;
    private InstitucionEducativa centroeducativo;
    private double valorcarrera;
    private double valormensualprestamocarrera;

    public PrestamoEducativo() {}
    public PrestamoEducativo(Persona beneficiario, int tiempoprestamo, String ciudad, String nivelestudio, InstitucionEducativa centroeducativo, double valorcarrera) {
        super(beneficiario, tiempoprestamo, ciudad);
        this.nivelestudio = nivelestudio;
        this.centroeducativo = centroeducativo;
        this.valorcarrera = valorcarrera;
    }
    public void CalcularValorMensualPagoPrestamoCarrera(){
        this.valormensualprestamocarrera=((this.valorcarrera/this.getTiempoprestamo())-(0.10*this.valorcarrera/this.getTiempoprestamo()));
    }

    public String getNivelestudio() {
        return nivelestudio;
    }

    public void setNivelestudio(String nivelestudio) {
        this.nivelestudio = nivelestudio;
    }

    public InstitucionEducativa getCentroeducativo() {
        return centroeducativo;
    }

    public void setCentroeducativo(InstitucionEducativa centroeducativo) {
        this.centroeducativo = centroeducativo;
    }

    public double getValorcarrera() {
        return valorcarrera;
    }

    public void setValorcarrera(double valorcarrera) {
        this.valorcarrera = valorcarrera;
    }

    public double getValormensualprestamo() {
        return valormensualprestamocarrera;
    }

    public void setValormensualprestamo(double valormensualprestamo) {
        this.valormensualprestamocarrera = valormensualprestamo;
    }
    public String toString(){
        String presentar= String.format("Préstamo Educativo"+
                        "\n Nivel de Estudio: %s"+
                        "\n Centro Educativo: %s"+
                        "\n Valor de la Carrera: %.2f"+
                        "\n Valor Mensual del Préstamo Carrera %.2f",
                this.getNivelestudio(),this.getCentroeducativo(),
                this.getValorcarrera(), this.getValormensualprestamo());
        return presentar;
    }
}
