package org.example;
import java.net.InetAddress;
import java.net.UnknownHostException;


public class InnetAddressExample {
    public static void main(String[] args) {

        try {
            InetAddress ip = InetAddress.getByName("www.google.pl");
            System.out.println(ip.getHostAddress());
            System.out.println(ip.getHostName());
            InetAddress adresses[] = InetAddress.getAllByName("www.google.pl");

            for(int i = 0; i < adresses.length; i++){
                System.out.println(adresses[i]);
            }
            for ( InetAddress adr : adresses){
                System.out.println(adr.getHostAddress());
            }
        }catch(UnknownHostException e){
            e.printStackTrace();
        }

    }
}
