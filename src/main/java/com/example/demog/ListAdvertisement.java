package com.example.demog;

import java.util.ArrayList;

public class ListAdvertisement {
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
