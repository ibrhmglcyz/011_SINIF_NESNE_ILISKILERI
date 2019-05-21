package com.vektorel.Models;

public class Ogrenci {

	public String[] ogrenciler = new String[10];
	
	int kayitSayisi = 0;
	
	public void Listele() {
		System.out.println("*********************");
		System.out.println("** ÖĞRENCİ LİSTESİ **");
		System.out.println();
		System.out.println("NO   |   ÖĞRENCİ ADI");
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println((i+1)+ "    :"+ ogrenciler[i]);
		}
	}
	
	public void Ekle(String ogrenciAdi) {
		if(kayitSayisi==10)
		{
			System.out.println("Tüm Öğrenciler girilmiştir.");
			System.out.println("Kayıt Başarısız...");
		}
		else {
		ogrenciler[kayitSayisi] = ogrenciAdi;
		kayitSayisi++;
		}		
	}
	
	
	
}
