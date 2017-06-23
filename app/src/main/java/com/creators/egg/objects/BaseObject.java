package com.creators.egg.objects;

import android.content.Context;
import android.graphics.Bitmap;

/**
 * Created by PlusTV on 21/6/17.
 */

public class BaseObject {
   protected int x;
    protected int y;
    protected Bitmap bitmapOfObject;

    int height;
    int width;

    Context context;

    public BaseObject(Context context,int x, int y) {
       this.context=context;
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public Bitmap getBitmapOfObject() {
        return bitmapOfObject;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Context getContext() {
        return context;
    }





}
