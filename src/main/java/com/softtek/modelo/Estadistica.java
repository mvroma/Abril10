package com.softtek.modelo;

public class Estadistica {
    private double min;
    private double max;
    private double media;

    public Estadistica(double min, double max, double media) {
        this.min = min;
        this.max = max;
        this.media = media;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return "Datos:{" +
                "min=" + min +
                ", max=" + max +
                ", media=" + media +
                '}';
    }
}
