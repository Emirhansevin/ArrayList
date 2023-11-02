package Arrays;


import java.util.ArrayList;
import java.util.Scanner;

public class IntArrays {

	

	public static void main(String[] args) {

		int counter = 0 ;
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> soru= new ArrayList<String>();
		ArrayList<String> dorular= new ArrayList<String>();
		
		
		soru.add("Aşağıdakilerden hangisi küresel ısınmanın sonuçlarından biri değildir?\r\n"
				+ "\r\n"
				+ "A) Ortalama deniz seviyesinin yükselmesi\r\n"
				+ "B) Tatlı su kaynaklarının azalması\r\n"
				+ "C) Buzulların artması\r\n"
				+ "D) Denizlerin soğuması\r\n");
		soru.add("Küresel Isınma: Atmosfere salınan CO2 gibi sera etkisi yaratan gazların, yer yüzeyi ve denizlerin ortalama sıcaklığını artırmasıdır.\r\n"
				+ "\r\n"
				+ "Buna göre; aşağıdakilerden hangisi küresel ısınmaya karşı alınabilecek önlemler arasında değildir?\r\n"
				+ "\r\n"
				+ "A) Ambalajları fazla olan ürünleri kullanmaktan kaçınmak\r\n"
				+ "B) Ev ve iş yerinde enerji yalıtımı sağlamak\r\n"
				+ "C) Yenilenemez enerji kaynaklarını kullanmayı tercih etmek\r\n"
				+ "D) Otomobillerin hava ve yakıt filtrelerinin her zaman temiz olmasına dikkat etmek\\r\\n");
		soru.add("Dünya'ya Güneş'ten gelen ışınlar, karbondioksit, metan ve su buharı gibi atmosferde bulunan gazlar tarafından tutulur. Böylece Dünya'nın sıcaklığı artar.\r\n"
				+ "\r\n"
				+ "Güneş enerjisinin bu gazlar tarafından tutulması olayına ne ad verilir?\r\n"
				+ "\r\n"
				+ "A) Güneş Tutulması\r\n"
				+ "B) Sera Etkisi\r\n"
				+ "C) Buzulların Erimesi\r\n"
				+ "D) Ozon Tabakasının Delinmesi\r\n");
		soru.add("İnsanların her faaliyetinin doğa üzerinde olumlu veya olumsuz etkileri bulunmaktadır. Nüfus artışı bu etkilerin de artmasına neden olmaktadır. İnsan nüfusu, 1950-1987 arasında en hızlı artışını göstermiş ve ikiye katlanmıştır. 2017 dünya nüfusu ve 2050 için öngörülen dünya nüfusu ne kadardır?\r\n"
				+ "a) 2017: 2,1 milyar - 2050: 5,3 milyar\r\n"
				+ "b) 2017: 5,6 milyar - 2050: 8,3 milyar\r\n"
				+ "c) 2017: 7,6 milyar - 2050: 9,7 milyar\r\n"
				+ "d) 2017: 9,7 milyar - 2050: 12,1 milyar\r\n");
		soru.add(" Her yıl \"Dünya Hedefi Aşma Günü (Earth Overshoot Day)\", o yıl içinde kullanabileceğimiz kaynakların tükendiği tarihtir. 2017'de 2 Ağustos günü olarak hesaplanmıştır. Kişi başı küresel kaynak tüketimi ABD ortalamasına eşit olsaydı, bu ihtiyacın karşılanması için kaç tane dünya gezegenine ihtiyaç duyardık?\r\n"
				+ "a) 2\r\n"
				+ "b) 4\r\n"
				+ "c) 6\r\n"
				+ "d) 8\r\n");
		dorular.add("mükemmel");
		dorular.add("çok iyi");
		dorular.add("küresel isinma hakkindaki bilgilerinizi tazeleyin ");
		for (int i = 0; i < soru.size(); i++) {
		
			System.out.printf("sorular\r\n"  + soru.get(0));
			char cevap1 ='c' ;
			System.out.println("cevabınızı giriniz\n");
			 char cevaps1 = input.next().charAt(0);
			 if (cevaps1==cevap1) {
				 
				 System.out.println("doru cevapladınız");
				counter++ ;
			}
			 else {
				System.out.println("yanlıs cevapladınız");
			}
			 

				System.out.printf("sorular\r\n"  + soru.get(1));
				char cevap2 ='c' ;
				System.out.println("cevabınızı giriniz\n");
				 char cevaps2= input.next().charAt(0);
				 if (cevaps2==cevap2) {
				 
					 System.out.println("doru cevapladınız");
					counter++ ;
				}
				 else {
					System.out.println("yanlıs cevapladınız");
				}

					System.out.printf("sorular\r\n"  + soru.get(2));
					char cevap3 ='a' ;
					System.out.println("cevabınızı giriniz\n");
					 char cevaps3 = input.next().charAt(0);
					 if (cevaps3==cevap3) {
						 
						 System.out.println("doru cevapladınız");
						counter++ ;
					}
					 else {
						System.out.println("yanlıs cevapladınız");
					}

						System.out.printf("sorular\r\n"  + soru.get(3));
						char cevap4 ='c' ;
						System.out.println("cevabınızı giriniz\n");
						 char cevaps4 = input.next().charAt(0);
						 if (cevaps4==cevap4) {
							 
							 System.out.println("doru cevapladınız");
							counter++ ;
						}
						 else {
							System.out.println("yanlıs cevapladınız");
						}

							System.out.printf("sorular\r\n"  + soru.get(4));
							char cevap5 ='b' ;
							System.out.println("cevabınızı giriniz\n");
							 char cevaps5 = input.next().charAt(0);
							 if (cevaps5==cevap5) {
								 
								 System.out.println("doru cevapladınız");
								counter++ ;
							}
							 else {
								System.out.println("yanlıs cevapladınız");
							}
			 break;
			 }
		
		System.out.println("%d doru bildiniz" + counter);
		 
		 if (counter==5) {
			 
			System.out.printf(dorular.get(0));
		}
		 else if (counter==4) {
			 System.out.printf(dorular.get(1));
			
		}
		 else if (counter<= 3) {
			 
		 System.out.printf(dorular.get(2));
		 
		}
		 else {
			
		}
				
			




	}
}

