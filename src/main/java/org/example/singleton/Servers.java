package org.example.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Servers {
    private static List<String> serverList = new ArrayList<>();
    private static Servers instance;

    private Servers() {
    }
    public static Servers getInstance() {
        if (instance == null) {
            instance = new Servers();
        } return instance;
    }

    public boolean addServers(String server) {
        if ((server.startsWith("http") || server.startsWith("https")) && !serverList.contains(server)) {
            serverList.add(server);
            System.out.println("Serverul a fost adaugat: " + server);
            return true;
        }
        System.out.println("Serverul nu corespunde formatului.");
        return false;
    }

    public void downloadHttp() {
        System.out.println("Metoda de descarcare(http): ");
//        for (int i = 0; i < serverList.size(); i++) {
//            if (serverList.get(i).startsWith("http") && !serverList.get(i).startsWith("http")) {
//                System.out.println(serverList.get(i));
//            }
//        }
        for (String link : serverList) {
            if (link.startsWith("http:")) {
                System.out.println(link);
            }
        }
    }

    public List<String> downloadHttps() {
        return serverList.stream().filter(link -> link.startsWith("https")).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Servers{" +
                "serverList=" + serverList +
                '}';
    }
    //    public Servers(List<String> serverList) {
//        this.serverList = serverList;
//    }
}
