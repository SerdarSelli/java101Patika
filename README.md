java dilinde Mayın Tarlası oyunu.

Oyun Kuralları :
Oyun metin tabanlıdır.
Çift boyutlu diziler üzerinden oynanmalı ve MineSweeper sınıfı içerisinde.
Matris boyutunu yani satır ve sütun sayısını kullanıcı belirlemeli.
Diziye ait eleman sayısının çeyreği (elemanSayisi / 4) kadar rastgele mayın yerleştirilmeli. Örneğin dizi 4x3 boyutunda ise eleman sayısı (satırSayısı * sütunSayısı) formülü ile hesaplanır ve boyutu 12. Bu durumda mayın sayısı 12 / 4 = 3 adet olmalı.
Kullanıcı matris üzerinden bir nokta seçmeli. Nokta seçimi için satır ve sütun değerlerini girmeli.
Seçilen noktanın dizinin sınırları içerisinde olup olmadığını kontrol edilir ve koşul sağlanmazsa tekrar nokta istenir.
Kullanıcının girdiği noktada mayın var ise oyunu kaybeder.
Mayın yok ise, ilgili noktaya değen tüm konumlarına bakılır (sağı, solu, yukarısı, aşağısı, sol üst çapraz, sağ üst çapraz, sağ alt çapraz, sol alt çapraz) ve etrafındaki mayınların sayısının toplamı ilgili noktaya yazılır. Noktaya değen herhangi bir mayın yok ise "0" değeri atanır.
Kullanıcı hiç bir mayına basmadan tüm noktaları seçebilirse oyunu kazanır.

Kaybetme Senaryosu
Mayınların Konumu
* - - 
- - * 
- - - ===========================
Mayın Tarlası Oyuna Hoşgeldiniz !
- - - 
- - - 
- - - 
Satır Giriniz : 0
Sütun Giriniz : 1 ===========================
- 2 - 
- - - 
- - - 
Satır Giriniz : 2
Sütun Giriniz : 0 ===========================
- 2 - 
- - - 
0 - - 
Satır Giriniz : 0
Sütun Giriniz : 2 ===========================
- 2 1 
- - - 
0 - - 
Satır Giriniz : 1
Sütun Giriniz : 0 ===========================
- 2 1 
1 - - 
0 - - 
Satır Giriniz : 2
Sütun Giriniz : 1 ===========================
- 2 1 
1 - - 
0 1 - 
Satır Giriniz : 2
Sütun Giriniz : 2 ===========================
- 2 1 
1 - - 
0 1 1 
Satır Giriniz : 1
Sütun Giriniz : 2
Game Over!! ===========================


Kazanma Senaryosu
Mayınların Konumu
- - - 
- * - 
- * - ===========================
Mayın Tarlası Oyuna Hoşgeldiniz !
- - - 
- - - 
- - - 
Satır Giriniz : 0
Sütun Giriniz : 0 ===========================
1 - - 
- - - 
- - - 
Satır Giriniz : 0
Sütun Giriniz : 1 ===========================
1 1 - 
- - - 
- - - 
Satır Giriniz : 0
Sütun Giriniz : 2 ===========================
1 1 1 
- - - 
- - - 
Satır Giriniz : 1
Sütun Giriniz : 0 ===========================
1 1 1 
2 - - 
- - - 
Satır Giriniz : 2
Sütun Giriniz : 0 ===========================
1 1 1 
2 - - 
2 - - 
Satır Giriniz : 1
Sütun Giriniz : 2 ===========================
1 1 1 
2 - 2 
2 - - 
Satır Giriniz : 2
Sütun Giriniz : 2
Oyunu Kazandınız !
1 1 1 
2 - 2 
2 - 2 ===========================
