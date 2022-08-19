package com.openbootcamp;
import java.util.*;

public class SmartDevice {
    ArrayList<String> apps = new ArrayList<String>();
    boolean notificaciones = true;
    int camara = 1;

    void aniadirApp(String app){
        this.apps.add(app);
    }

    public SmartDevice(){
        this.aniadirApp("Reloj");
        this.aniadirApp("Calendario");
        this.aniadirApp("WhatsApp");
        this.aniadirApp("Google");
    }
}

