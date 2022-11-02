package com.android.shoesRecyclerView;

public class ChildModel {
    private String shoeName;
    private String shoeImage;

    public ChildModel(String shoeImage, String shoeName) {
            this.shoeImage = shoeImage;
        this.shoeName = shoeName;
    }
    public String getShoeName() {
        return shoeName;
    }
    public void setShoeName(String shoeName) {
        this.shoeName = shoeName;
    }

    public String getShoeImage() {
        return shoeImage;
    }

    public void setShoeImage(String shoeImage) {
        this.shoeImage = shoeImage;
    }
}
