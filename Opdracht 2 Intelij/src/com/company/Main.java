package com.company;

import java.util.ArrayList;

public class Main {

    private int voldoendes;
    private ArrayList<Integer> cijfers = new ArrayList<>();
    private double gemiddelde;
    private int onvoldoendes;

    public static void main(String[] args) {
        Main gitToets = new Main();
        gitToets.addCijfer(5);
        gitToets.addCijfer(6);
        gitToets.addCijfer(8);
        gitToets.addCijfer(10);
        gitToets.berekenGemiddelde();
        gitToets.printVoldoendes();
        gitToets.printVoldoendes();
    }

    public void addCijfer(int cijfer) {
        cijfers.add(cijfer);
    }

    public void berekenGemiddelde() {
        int totaal = 0;
        for (int i = 0; i < cijfers.size(); i++) {
            if(cijfers.get(i) > 5.5) {
                voldoendes++;
            }
            else {
                onvoldoendes--;
            }
            totaal += cijfers.get(i);
        }
        gemiddelde = totaal / cijfers.size();
        System.out.println("Gemiddelde is: " + gemiddelde);
    }

    public void printVoldoendes() {
        System.out.println("Aantal voldoendes: " + voldoendes);
    }

    public void printOnvoldoendes() {
        System.out.println("Aantal voldoendes: " + onvoldoendes);
    }
}
