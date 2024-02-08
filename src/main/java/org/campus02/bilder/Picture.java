package org.campus02.bilder;

public class Picture
{
    private int length;
    private int width;

    public Picture(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    public int totalPixels()
    {
        return length*width;
    }

    public int totalSize(int bytePerPixel)
    {
        return totalPixels()*bytePerPixel;
    }

    public void scale(double factor)
    {
        length = (int) (length*factor);
        width = (int) (width*factor);
    }
}
