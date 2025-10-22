PARA BOZMA :
Bu programın amacı belirli bir miktardaki parayı büyükten küçüğe doğru banknotlara ayırmak.
Örneğin: 278 TL → 2 adet 100’lük, 1 adet 50’lik, 1 adet 20’lik, 1 adet 5’lik, 1 adet 2’lik, 1 adet 1’lik.
Programda int para = 278; satırıyla başlangıç tutarı belirlenir.
Kalan değişkeni, her adımda geriye kalan parayı takip eder.
yuzluk = kalan / 100; ifadesi 278 TL içinde kaç tane 100 TL olduğunu bulur.
Sonra kalan = kalan % 100; ifadesi 100’lükler çıktıktan sonra kalan miktarı hesaplar.
Bu işlem sırasıyla 50, 20, 5, 2 ve 1 TL için de tekrarlanır.
/ bölme işlemi kaç adet banknot olduğunu bulur.
% (mod) işlemi, bölmeden sonra geriye kaç TL kaldığını hesaplar.
Bu yöntem sayesinde para en büyük banknottan en küçüğe doğru verimli şekilde bozulur.
Program çıktısı her banknotun kaç adet kullanıldığını net şekilde gösterir.


SAAT DÖNÜŞTÜRME :
Bu ödevin amacı zamanı saniye cinsinden alıp saat:dakika:saniye formatına dönüştürmek.
Programda bölme (/) ve mod alma (%) işlemleri birlikte kullanılır.
1 saat = 3600 saniye, 1 dakika = 60 saniye olduğu için bu oranlar temel alınır.
printf("%02d") sayesinde sayılar 2 haneli biçimde görünür (örneğin 01, 09).
Program kısa ama zaman hesaplamasında mantıksal düşünmeyi öğretir.
Geliştirme olarak kullanıcıdan saniye değeri alınabilir (Scanner ile).
Böylece farklı saniye değerleri girilerek program test edilebilir.
Bu ödev değişken kullanımı, aritmetik işlemler ve biçimlendirilmiş çıktı konularını pekiştirir.
Gerçek hayatta zaman dönüştürme işlemlerinde kullanılan mantıkla aynıdır.
Kod hem sade hem tamamen çalışır — 3665 saniye örneğinde 1:01:05 sonucu üretir.
