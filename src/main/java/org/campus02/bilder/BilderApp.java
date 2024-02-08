package org.campus02.bilder;

public class BilderApp
{
    public static void main(String[] args)
    {
        Picture picture = new Picture(2048,3072);
        System.out.println(picture.totalPixels());
        System.out.println(picture.totalSize(3));

        picture.scale(2.0);
        System.out.println(picture.totalPixels());
    }
}
