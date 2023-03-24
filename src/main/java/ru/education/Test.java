package ru.education;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Arrays;

public class Test {




    public static void checkHosts(String subnet) throws IOException
    {

        System.out.println(InetAddress.getLocalHost().getHostAddress());

        int timeout = 500;
        InetAddress localhost = InetAddress.getLocalHost();
        byte[] ip = localhost.getAddress();
        for (int i = 1; i < 255; i++)
        {
            String host = subnet + "." + i;
            ip[3] = (byte)i;
            if (InetAddress.getByAddress(ip).isReachable(timeout))
            {
               InetAddress address = InetAddress.getByName(host);
                System.out.println(address.getHostName());
                System.out.println(address.getHostAddress());
                System.out.println(host + " is reachable");

            }
        }
    }

    public static void main(String[] arguments) throws IOException
    {
//        checkHosts("192.168.0");
        getNetworkIPs();
    }

    public static void getNetworkIPs() {
        final byte[] ip;
        try {
            ip = InetAddress.getLocalHost().getAddress();
        } catch (Exception e) {
            return;     // exit method, otherwise "ip might not have been initialized"
        }

        for(int i=1;i<=254;i++) {
            final int j = i;  // i as non-final variable cannot be referenced from inner class
            new Thread(new Runnable() {   // new thread for parallel execution
                public void run() {
                    try {
                        ip[3] = (byte)j;
                        InetAddress address = InetAddress.getByAddress(ip);
                        String output = address.toString().substring(1);
                        if (address.isReachable(50000)) {
                            System.out.println(output + " is on the network");
                        } else {
//                            System.out.println("Not Reachable: "+output);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).start();     // dont forget to start the thread
        }
}}
