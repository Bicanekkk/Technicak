package org.example;

public class Technicak {
    private String spz;
    private int rok_vyroby;
    private Ridic majitel;


    public Technicak(String spz, int rok_vyroby, Ridic majitel) {
        this.spz = spz;
        this.rok_vyroby = rok_vyroby;
        this.majitel = majitel;
    }


        public String getSpz() {
            return spz;
        }

        public int getRok_vyroby() {
            return rok_vyroby;
        }
        public void info()  {
            System.out.println("SPZ:"+spz);
            System.out.println("rok výroby:"+getRok_vyroby());
            System.out.println("majitel"+majitel.getPrijmeni()+"-"+majitel.getRok_narozeni());
    }
}

