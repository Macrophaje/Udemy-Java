package com.duncan;

/**
 * Created by duncan.macleod on 5/19/16.
 */
public class Door {

    private int height;
    private int width;
    private boolean isLocked;

    public Door(int height, int width, boolean isLocked) {
        this.height = height;
        this.width = width;
        this.isLocked = isLocked;
    }

    public void doorLock(){
        if (this.isLocked == true){
            this.isLocked = false;
        } else {
            this.isLocked = true;
        }
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isLocked() {
        return isLocked;
    }
}
