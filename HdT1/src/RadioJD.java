
public class RadioJD implements iRadio{
    //Atributos
    private boolean isOn = false;
    private boolean isFM = true;
    private double emisora = 87.0;
    private Double[] ArrayDeFrecuencias = new Double[11];

    //CONSTANTES
    public static final double FM_STATION_INCREMENT = 0.5;
    public static final double AM_STATION_INCREMENT = 100.0;
    public static final double FM_MIN_STATION = 87.0;
    public static final double FM_MAX_STATION = 104.0;
    public static final double AM_MIN_STATION = 1000.0;
    public static final double AM_MAX_STATION = 4000.0;

    //Metodos

    public boolean encendidoRadio(){
        this.isOn = !this.isOn;
        return this.isOn;
    }

    public double subirFrecuencia(){
        if (this.isFM){
            this.emisora+= FM_STATION_INCREMENT;
            if (this.emisora>= FM_MAX_STATION) {
                this.emisora = FM_MIN_STATION;
            }
        } else {
            this.emisora+= AM_STATION_INCREMENT;
            if (this.emisora>= AM_MAX_STATION) {
                this.emisora= AM_MIN_STATION;
            }
        }
        return this.emisora;
    }

    public double bajarFrecuencia(){
        if (this.isFM) {
            this.emisora-= FM_STATION_INCREMENT;
            if (this.emisora<= FM_MIN_STATION) {
                this.emisora= FM_MAX_STATION;
            }
        } else {
            this.emisora-= AM_STATION_INCREMENT;
            if (this.emisora<= AM_MIN_STATION) {
                this.emisora= AM_MAX_STATION;
            }
        }
        return this.emisora;
    }

    public void setFavorito(int posicion){
    	/*
        Emisora emisora = new Emisora();
        emisora.setEstacion(getEmisora());
        if (this.isFM){
            emisora.setFrecuencia("FM");
        } else {
          emisora.setFrecuencia("AM");
        }
        */
        this.ArrayDeFrecuencias[posicion - 1] = getEmisora();
    }

    public double getFavorito(int posicion){
        if (ArrayDeFrecuencias[posicion - 1] != null){
            double n = ArrayDeFrecuencias[posicion-1];
            return n;
        }
        return this.emisora ;
    }

    public boolean cambiarAmFm(){
        this.isFM = !isFM;
        setEmisora();
        return this.isFM;
    }

    public void setEmisora(){
        if (this.isFM){
            this.emisora = FM_MIN_STATION;
        } else {
            this.emisora = AM_MIN_STATION;
        }
    }

    public void setEmisora(double _emisora){
        this.emisora = _emisora;
    }

    public void setIsFM(String isFM){
        if(isFM.equals("FM")){
            this.isFM = true;
        } else {
            this.isFM = false;
        }
    }


    public double getEmisora() {
        return emisora;
    }

    public boolean isTurnedOn(){
        return this.isOn;
    }

    @Override
    public String toString(){
        if (this.isOn){
            return "\nRadio:" +
                    "\nIs on: " + this.isOn +
                    "\nIs FM: " + this.isFM +
                    "\nEstacion: " + this.emisora;
        }

        return "Radio:\n\n" +
                "Is on: " + this.isOn;

    }
}
