package com.company;

import java.util.ArrayList;

public class Main {

    private ArrayList<Double> cijfers = new ArrayList<>();
    private double gemiddelde;
    public double voldoendes;
    public double onvoldoendes;

    public static void main(String[] args) {
        Main gitToets = new Main();
        gitToets.addCijfer(5);
        gitToets.addCijfer(6);
        gitToets.addCijfer(8);
        gitToets.addCijfer(10);
        gitToets.addCijfer(10);
        gitToets.addCijfer(5);
        gitToets.addCijfer(6);

        gitToets.berekenGemiddelde();
        gitToets.printVoldoendes();
        gitToets.printOnvoldoendes();
    }

    public void addCijfer(double cijfer) {
        cijfers.add(cijfer);
    }

    public void berekenGemiddelde() {
        double totaal = 0;
        for (int i = 0; i < cijfers.size(); i++) {
            double cijfer = cijfers.get(i);
            if(cijfer < 5.5) {
                onvoldoendes++;
            }
            else {
                voldoendes++;
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
        System.out.println("Aantal onvoldoendes: " + onvoldoendes);
    }
}
