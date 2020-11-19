package com.example.bargo;

public class EventListInfo {
    public int[] images;
    public String[] names;

    public EventListInfo() {
        setImages();
        setNames();
    }

    public int[] getImages() {
        return images;
    }

    public void setImages() {
        this.images = new int[]{R.drawable.image1,
                R.drawable.image2,
                R.drawable.image3,
                R.drawable.image4,
                R.drawable.image5,
                R.drawable.image6,
                R.drawable.image7,
                R.drawable.image8,
                R.drawable.image9};
    }


    public String[] getNames() {
        return names;
    }

    public void setNames() {
        this.names = new String[] {"John",
                "Peter",
                "Sasha",
                "Diana",
                "Rose",
                "Mike",
                "Hussain",
                "Alex",
                "Nazia",
                "Roshale"};
    }

    public int totalNames() {
        return names.length;
    }
}
