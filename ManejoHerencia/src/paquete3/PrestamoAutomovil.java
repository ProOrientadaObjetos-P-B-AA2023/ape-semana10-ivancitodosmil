package paquete3;

import paquete2.Persona;
import paquete2.Prestamo;

public class PrestamoAutomovil extends Prestamo {
    private String tipoautomovil;
    private String marcaautomovil;
    private Persona garante1;
    private double valorautomovil;
    private double valormensualprestamoautomovil;

    public PrestamoAutomovil() {}
    public PrestamoAutomovil(Persona beneficiario, int tiempoprestamo, String ciudad, String tipoautomovil, String marcaautomovil, Persona garante1, double valorautomovil) {
        super(beneficiario, tiempoprestamo, ciudad);
        this.tipoautomovil = tipoautomovil;
        this.marcaautomovil = marcaautomovil;
        this.garante1 = garante1;
        this.valorautomovil = valorautomovil;
    }

    public void CalcularValorMensualPagoPrestamoAutomovil(){
        this.valormensualprestamoautomovil= this.valorautomovil/ this.getTiempoprestamo();
    }

    public String getTipoautomovil() {
        return tipoautomovil;
    }

    public void setTipoautomovil(String tipoautomovil) {
        this.tipoautomovil = tipoautomovil;
    }

    public String getMarcaautomovil() {
        return marcaautomovil;
    }

    public void setMarcaautomovil(String marcaautomovil) {
        this.marcaautomovil = marcaautomovil;
    }

    public Persona getGarante1() {
        return garante1;
    }

    public void setGarante1(Persona garante1) {
        this.garante1 = garante1;
    }

    public double getValorautomovil() {
        return valorautomovil;
    }

    public void setValorautomovil(double valorautomovil) {
        this.valorautomovil = valorautomovil;
    }

    public double getValormensualprestamoautomovil() {
        return valormensualprestamoautomovil;
    }

    public void setValormensualprestamoautomovil(double valormensualprestamoautomovil) {
        this.valormensualprestamoautomovil = valormensualprestamoautomovil;
    }
    public String toString(){
        String presentar= String.format("Préstamo Automóvil"+
                        "\n Tipo Automóvil: %s"+
                        "\n Marca Automóvil: %s"+
                        "\n Garante 1: %s"+
                        "\n Valor Automóvil %.2f"+
                        "\n Valor Mensual del Préstamo Automóvil %.2f",
                this.getTipoautomovil(),this.getMarcaautomovil(), this.getGarante1(),
                this.getValorautomovil(),this.getValormensualprestamoautomovil());
        return presentar;
    }
}
