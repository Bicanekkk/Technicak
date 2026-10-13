package org.example;

public class Main {
    public static void main(String[] args)  {
        Ridic ridic = new Ridic("Krucký", 2009);
        Technicak papir = new Technicak("4SV0127", 2015, ridic);

    //    System.out.println(papir.getSpz()+" "+ papir.getRok_vyroby());

        papir.info();

    }
}
