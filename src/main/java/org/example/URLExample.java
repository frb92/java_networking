package org.example;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.net.MalformedURLException;
import java.net.URL;

public class URLExample {
    public static void main(String[] args)
        throws MalformedURLException {
        URL url = new URL("https://google.pl");
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: "+ url.getHost());
        System.out.println("Path: " + url.getPath());
        System.out.println("file: " + url.getFile());
        System.out.println("port: " + url.getPort());
    }
}
