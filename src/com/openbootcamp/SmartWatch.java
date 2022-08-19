package com.openbootcamp;

public class SmartWatch extends SmartDevice {
    int camara = 0;
    boolean alarma = true;

    public SmartWatch(){
        this.aniadirApp("Health");
        this.aniadirApp("Notas");
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "alarma=" + alarma +
                ", apps=" + apps +
                ", notificaciones=" + notificaciones +
                ", camara=" + camara +
                '}';
    }
}
