package com.openbootcamp;

public class SmartPhone extends SmartDevice {
    int camara = 3;
    boolean linterna = true;
    boolean teclado = true;

    public SmartPhone(){
        this.aniadirApp("Instagram");
        this.aniadirApp("Youtube");
        this.aniadirApp("Netflix");
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "linterna=" + linterna +
                ", teclado=" + teclado +
                ", apps=" + apps +
                ", notificaciones=" + notificaciones +
                ", camara=" + camara +
                '}';
    }
}
