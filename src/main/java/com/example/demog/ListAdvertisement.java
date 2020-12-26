package com.example.demog;

import java.io.Serializable;
import java.util.ArrayList;

public class ListAdvertisement implements Serializable {
    private static ArrayList<Advertisement> advertisements = new ArrayList<>();

    public ListAdvertisement() {
    }

    public static ArrayList<Advertisement> getAdvertisements() {
        return advertisements;
    }

    public synchronized void addAdvertisements(Advertisement advertisement) {
        advertisements.add(advertisement);
    }
}
