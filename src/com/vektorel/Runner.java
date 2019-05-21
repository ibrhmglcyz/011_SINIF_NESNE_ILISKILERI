package com.vektorel;

import java.beans.Expression;
import java.util.Scanner;

import com.vektorel.Models.Ogrenci;

public class Runner {

	public static void main(String[] args) {
		
		int secim = 0;
		
		Ogrenci ogr = new Ogrenci();
		
		do {
			System.out.println("** ÖĞRENCİ TAKİP SİSTEMİ **");
			System.out.println("1. Öğrenci Ekleme");
			System.out.println("2. Öğrenci Listeleme");
			System.out.println("3. ÇIKIŞ");
			System.out.println("Seçiniz...: ");
			Scanner sc = new Scanner(System.in);
			
			try{secim = sc.nextInt();
			
			if (secim == 1) {
				System.out.println("Eklenecek Öğrenci Adı...:");
				sc = new Scanner(System.in);
				String ad = sc.nextLine();
				ogr.Ekle(ad);
			}else if (secim == 2) {
				ogr.Listele();
				}
			}catch(Exception ex) {
				System.err.println("Lutfen rakamsal bir deger giriniz.");
				}
			finally{
				System.out.println("PROGRAM SONLANDIRILDI");
			}
			
			
		}while (secim == 1 || secim == 2);
		
		
	}

}
