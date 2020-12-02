package com.example.bargo;

public class ProductListInfo {

    public int[] images;
    public String[] productos;
    public String[] unidades;
    public String[] points;

    public ProductListInfo() {
        setImages();
        setProductos();
        setUnidades();
        setPoints();
    }

    public int[] getImages() {
        return images;
    }

    public void setImages() {
        this.images = new int[]{R.drawable.image001,
                R.drawable.image002,
                R.drawable.image004,
                R.drawable.image003,};
    }

    public String[] getProductos() {
        return productos;
    }

    public void setProductos() {
        this.productos = new String[] {"Pendrive 64GB",
                "2 Entradas de cine",
                "2 Entradas del picasso",
                "2 Entradas de aquarium"};
    }


    public String[] getUnidades() {
        return unidades;
    }

    public void setUnidades() {
        this.unidades = new String[] {" /1000 ud.",
                " /500 ud.",
                " /500 ud.",
                " /500 ud.",};
    }

    public String[] getPoints() {
        return points;
    }

    public void setPoints() {
        this.points = new String[] {"5500 puntos",
                "6000 puntos.",
                "6500 puntos",
                "7000 puntos",};
    }

    public int totalNames() {
        return unidades.length;
    }
}
