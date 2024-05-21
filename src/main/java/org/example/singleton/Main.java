package org.example.singleton;

public class Main {
    public static void main(String[] args) {
//        Servers servers = new Servers();
        Servers.getInstance();
        Servers server1 = Servers.getInstance();
        Servers server2 = Servers.getInstance();
//        System.out.println(server1);
//        System.out.println(server2);
        server1.addServers("http:/eu.com");
//        System.out.println(server1);
        server2.addServers("https:/yt.be");
//        System.out.println(server2);
//        System.out.println(server1);

        server2.downloadHttp();
        System.out.println(server2.downloadHttps());
    }
}
