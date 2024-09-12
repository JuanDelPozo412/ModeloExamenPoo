import javax.swing.*;
import java.time.LocalDate;

public class VerificacionVtv {
    private String modelo;
    private String marca;
    private int patente;
    private int anio;
    private boolean pasoVtv;

    public VerificacionVtv(String modelo, String marca, int patente, int anio) {
        this.modelo = modelo;
        this.marca = marca;
        this.anio = anio;
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo.length() > 0) {
            for (int i = 0; i < modelo.length(); i++) {
                char modeloC = modelo.charAt(i);
                if (Character.isDigit(modeloC)) {
                    this.modelo = modelo;
                }
            }
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca.length() > 0) {
            for (int i = 0; i < marca.length(); i++) {
                char marcaC = marca.charAt(i);
                if (Character.isDigit(marcaC)) {
                    this.marca = marca;
                }
            }
        }
    }

    public int getPatente() {
        return patente;
    }

    public void setPatente(int patente) {
        if (Character.isDigit(patente)){
            this.patente = patente;
        }else {
            JOptionPane.showMessageDialog(null,"ingrese una patente valida");
        }

    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if (anio >= 1960 && anio <= 2024) {
            this.anio = anio;
        }else {
            JOptionPane.showMessageDialog(null,"Ingresa un anio correcto");
        }

    }
    public boolean verificarVtv(){
        boolean motor;
        boolean transmision;
        boolean freno;
        String[] opciones = {"motor","transmision","freno"};
        int opcion = JOptionPane.showOptionDialog(null,"Verifica si pasa o no la VTV","banco",0,0,null,opciones ,opciones[0]);
        Object[] opcionesBoolean = {"Si","No"};
        switch (opcion){
            case 0:
                int estadoM = JOptionPane.showOptionDialog(null, "El motor", "esta bien?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesBoolean, opcionesBoolean[0]);
                motor = (estadoM == JOptionPane.YES_NO_OPTION);
            case 1:
                int estadoT = JOptionPane.showOptionDialog(null, "El transmision", "esta bien?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesBoolean, opcionesBoolean[0]);
                motor = (estadoT == JOptionPane.YES_NO_OPTION);
            case 2:
                int estadoF = JOptionPane.showOptionDialog(null, "El freno", "esta bien?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesBoolean, opcionesBoolean[0]);
                motor = (estadoF == JOptionPane.YES_NO_OPTION);
        }
        return true;
    }
}



