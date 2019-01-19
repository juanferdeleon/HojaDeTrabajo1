public interface iRadio {
    /**
     * Metodo para manejar el encendido y apagado de la radio
     *
     */
    boolean encendidoRadio();

    /**
     * Metodo para subir la frecuencia que se encuentra actualmente en la radio.
     *
     * @return Nueva frecuencia a reproducir en la radio.
     */
    double subirFrecuencia();

    /**
     * Metodo para bajar la frecuencia que se encuentra actualmente en la radio.
     *
     * @return Nueva frecuencia a reproducir en la radio.
     */

    double bajarFrecuencia();

    /**
     * Metodo para almacenar la frecuencia en el boton seleccionado
     *
     * @param posicion numero del boton de favoritos seleccionado.
     */

    void setFavorito(int posicion);

    /**
     * Metodo para obtener la frecuencia almacenada en el boton, segun la emisora.
     *
     * @param posicion numero del boton de favoritos seleccionado.
     * @return frecuencia almacenada en el boton de favoritos.
     */


    double getFavorito(int posicion);

    /**
     * @return identifica cambio de estacion
     */

    boolean cambiarAmFm();

}
