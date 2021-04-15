package praxis.com.java.basic;

import praxis.com.java.basic.kendaraan.kereta;
import praxis.com.java.basic.kendaraan.mobil;
import praxis.com.java.basic.kendaraan.motor;
import praxis.com.java.basic.music.Gitar;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Gitar.bunyi();

        kereta.jumlahBan();
        mobil.jumlahBan();
        motor.jumlahBan();
    }
}
