package org.example.factory;

public class Main {
    public static void main(String[] args) {
        PC pc = new PC(16,256);
        System.out.println(pc.getRam());
        System.out.println(pc.getHardDisk());

        Server server = new Server(8,128,2);
        System.out.println(server.getRam());
        System.out.println(server.getHardDisk());

        Computer pc2 = new PC(32,512);
        Computer server2 = new Server(16,256,4);
        System.out.println(pc2.getRam());
        System.out.println(server2.getRam());

//        Computer server3 = ComputerFactory.createComputer("Server",16,512);
//        System.out.println(server3.getHardDisk());

        Computer pc3 = ComputerFactory.createComputer("PC",8,256);
        System.out.println(pc3.getHardDisk());
    }
}
