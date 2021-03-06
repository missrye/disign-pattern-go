package com.deepocean.designpattern.structuremode.proxy;

import java.net.MalformedURLException;
import java.net.URL;

public class ImageViewer {

    public static void main(String[] args) throws MalformedURLException {
        String image = "http://image.jpg";
        URL url = new URL(image);
        HighResolutionImage highResolutionImage = new HighResolutionImage(url);
        ImageProxy imageProxy = new ImageProxy(highResolutionImage);
        imageProxy.showImage();
    }
}
