package com.gcs.gcs;
import java.io.IOException;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GcsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GcsApplication.class, args);


        // 1016
        Scanner in = new Scanner(System.in);
        int km = in.nextInt();
        int minutos = (60 * km) / 30;
        System.out.println(minutos + " minutos");


        // 1004
        int A, B;
        A = in.nextInt();
        B = in.nextInt();
        System.out.println("PROD = " + (A * B));
	}

}
