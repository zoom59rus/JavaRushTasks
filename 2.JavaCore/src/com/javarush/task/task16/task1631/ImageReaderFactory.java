package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes imageTypes) throws IllegalArgumentException {
        ImageReader ir = null;
        /*try
        {*/
            if (imageTypes == ImageTypes.JPG)
                ir = new JpgReader();
            else if (imageTypes == ImageTypes.BMP)
                ir = new BmpReader();
            else if (imageTypes == ImageTypes.PNG)
                ir = new PngReader();
            else if (imageTypes == null)
                throw new IllegalArgumentException();
        /*} catch (IllegalArgumentException e) {
            e.printStackTrace();
        }*/

        return ir;
    }
}
