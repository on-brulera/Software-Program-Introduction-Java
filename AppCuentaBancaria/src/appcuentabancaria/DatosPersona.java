package appcuentabancaria;


public class DatosPersona {

    private String nombrePropietario;
    private String apellidoPropietario;
    private int diaNacimiento;
    private int mesNacimiento;
    private int añoNacimiento;

    public DatosPersona(String nombrePropietario, String apellidoPropietario, int diaNacimiento, int mesNacimiento, int añoNacimiento) {

        this.nombrePropietario = nombrePropietario;
        this.apellidoPropietario = apellidoPropietario;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.añoNacimiento = añoNacimiento;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getNombrePropietario(String nombrePropietario) {
        return this.nombrePropietario;
    }

    public void setApellidoPropietario(String apellidoPropietario) {
        this.apellidoPropietario = apellidoPropietario;
    }

    public String getApellidoPropietario(String apellidoPropietario) {
        return this.apellidoPropietario;
    }

    public void setDiaNacimiento(int dia) {
        if (dia >= 1 && dia <= 31) {
            this.diaNacimiento = dia;
        } else {
            this.diaNacimiento = 1;
        }
    }

    public int getDiaNacimiento() {
        return this.diaNacimiento;
    }

    public void setMesNacimiento(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mesNacimiento = mes;
        } else {
            this.mesNacimiento = 1;
        }
    }

    public int getMesNacimiento() {
        return this.mesNacimiento;
    }

    public void setAñoNacimiento(int año) {
        if (año > 1950) {
            this.añoNacimiento = año;
        } else {
            this.diaNacimiento = 2000;
        }
    }

    public int getAñoNacimiento() {
        return this.añoNacimiento;
    }

    public String NombreCompleto() {
        return this.nombrePropietario + " " + this.apellidoPropietario;
    }
    
    public String FechaNacimientoPropietario() {
        return this.diaNacimiento + "-" + this.mesNacimiento + "-" + this.añoNacimiento;
    }
}
