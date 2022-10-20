# clean-code-book

### Clean Code kitabından aldığım notlar

#####Bölüm 2: İsimlendirmeler
- İsimlendirmelerin çoğu zaman yorum satırına ihtiyaç duymaması gerekir.
- İsimlendirme niyeti belli etmelidir. 
- Yanlış bilgilendirmemelidir. 
- Telaffuzu mümkün olmalıdır. tamamd
- Interface isimlendirmelerinin başında "I" kullanımına gerek yoktur.
- Döngülerde alışılageldik harfler kullanılmalı i, j gibi.
- İletişim kurulabilir parametre isimleri kullanılmalı
- Aynı konsepten bahsederken aynı isim kullanılmalıdır.
- Aynı isim farklı konseptler için kullanılmamalıdır.
- Zeki olmaya çalışılmamalı, sade herkesin anlayacağı isim kullanılmalıdır.
- İsimleri değiştirmekten korkmamalı. Gerekli yerlerde refactor yapılmalıdır.

#####Bölüm 3: Fonksiyonlar
- Fonksiyon nedir?:  belirli işlemleri gerçekleştirmemizi sağlayan talimatlar bütünüdür.
- Fonksiyon uzunluğu kaç satır olmalı  = five lines of code okunmalı.
- Fonksiyonların ilk kuralı, küçük olmalarıdır. İkinci kuralı ise daha küçük olmaları gerektiğidir.
- Metod tek bir iş yapmalıdır. Tek sorumluluğu olmalıdır. (Single Responsibility Principle)
- Nested yapılar 2 seviyeden fazla olmamalıdır. If, else, while gibi blokların içi metoda alınarak tek satıra düşürülebilir.
- Switch blokları doğası gereği n tane iş yaparlar. Mümkün olduğunca kaçınmalıdır.
- Fonksiyonun ismi açıklayıcı olmalıdır. 
- Fonksiyonun ideal alması gereken parametre sayısı en fazla 3 dür eğer 3 den fazlaysa çok önemli bir sebebi olması gerekli.
- Argüman sayısı artıyorsa, argüman objesi oluşturmalı, argümanlar bu sınıf ile geçirilmelidir.
- Output argümanlar ekstra dikkat gerektireceğinden mümkün olduğunca kaçınılmalıdır.
- Boolean flag argüman alan fonksiyon büyük olasılıkla birden fazla iş yapıyordur. Fonksiyon ayrılarak flag argümanından kurtulunmalıdır.
- Fonksiyonun yan etkisi olmamalıdır. Var ise, fonksiyon isminde belirtilmelidir. (Unutmayın, fonksiyon bir iş yapmalıydı)
- Bir fonksiyon ya nesnenin durumunu değiştirmeli ya da nesneyle alakalı bilgi dönmelidir. İkisini aynı anda yapmamalıdır.
- Fonksiyondan hata kodu dönmektense exception fırlatmak tercih edilmelidir.
- Try/Catch blokları fonksiyonlara dönüştürülmeli, blok sadeleştirilmelidir.

#####Bölüm 4: Yorumlar

- Kötü koda açıklama yazmakla uğraşılmamalı, kodu tekrar yazmalıdır.
- Kod açıklamaya gerek kalmayacak kadar okunur ve anlaşılır olmalıdır. 
- Derdimizi kodla anlatmalıyız.
- Regexler karmaşık olduğundan yorum satırı ile açıklama yapılabilir.
- Yorumun gerekli olduğu yerler de vardır.
- Koddaki bir tasarımsal kararın arkasındaki neden yorum olarak eklenebilir.
- Geliştiriciyi çalıştırılacak kodun sonuçlarına karşı uyarmak gerektiğinde yorum kullanılabilir.
- TODO yorumları unutulmamak şartıyla faydalıdır. Javadoc yorumları dökümantasyon için faydalıdır.
- Kodu okuyarak anlayabileceğimiz şeyler için yorum yazılmamalıdır. Gereksiz kalabalık yaparlar.
- Yanlış bilgi içeren, yanlış yönlendiren yorumlar tehlikelidir. Bir an önce kurtulunmalıdır.
- Yoruma alınmış kod bırakılmamalıdır, silinmelidir. Siz silmezseniz, birinin işine yarayacak düşüncesiyle kimse silmeye cesaret edemez.

#####Bölüm 5: Formatlama
- Kodun çalışır olması kadar okunabilir olması da önemlidir.
- Kod listesi okurken gazete okuyor hissi vermeli, yukarıdan aşağıya genelden özele doğru bir yapı oluşturulmalıdır.
- Alakalı metodlar birbirine yakın yerleştirilmelidir.
- Değişkenler kullanıldığı yere mümkün olan en yakın yerde tanımlanmalıdır.
- Yatay satır uzunluğu, sayfada sağa doğru scrola gerek bırakmamalıdır.
- Takımca formatlamanın nasıl olacağına karar vermeli ve tüm geliştiriciler bu kurallara uymalıdır.
- Ctrl+Alt+R  kod formatlar(Intellij Idea).
- "=", "!=" bu tarz kontrollerin iki tarafınada boşluk koyulması uygun görülür.
- Sınıf içerisinde metodlar arası 1 adet boşluk var.
- İf ve else iflerin içinde 1 satır yazıyorsa süslü parantezden kaçınılır.

#####Bölüm 6: Nesneler Ve Veri Yapıları
- Değişkenleri private yapmamızın bir sebebi var. Başka kimsenin onlara bağımlı olmasını istemeyiz.

- Demeter Kuralına göre (Law of Demeter, LoD *), hiçbir modül bir diğer modülünü iç dünyasını bilmemeli. Vikipedi’de (evet 2 yıldır yasaklı olan Vikipedi’de) bu yasa aşağıdaki üç madde ile açıklanıyor:

1-)Her birim diğer birimler hakkında kısıtlı bilgiye sahip olmalıdır. Sadece birbiriyle yakından ilişkili olanlar birbirini tanımalı.
2-)Her birim yalnızca kendi arkadaşlarıyla konuşmalı; yabancılarla konuşmamalı.
3-)Sadece yakın arkadaşlarıyla konuşmalı.

- Bu sayede gevşekçe bağlı (loosely coupled) modüller üretilmiş olur. Bu da projenin esnekliğini, bakım yapılabilirliğini, anlaşılabilirliğini ve test edilebilirliğini artırır.

- Zincirleme metot kullanımından kaçınılmalıdır.
- Data Transfer Object önemi.

#####Bölüm 7: Hataları Yönetmek

- Hata kodu dönmektense Exception kullanılmalıdır. Böylece çağıran kod hata kodu kontrol etmekten kurtulur ve esas işi yapan kod, hata handling kodundan ayrıldığı için daha temiz olur.
- Unchecked exception tercih edilmelidir. Checked exception fırlatan bir metodun catch’i 3 seviye yukardaysa, exceptiondaki bir değişiklik tüm seviyelerin değişmesine ve yeniden compile-deploy edilmesine sebep olmaktadır.
- Checked exception olmadan da sağlam yazılım yapılabilir. Örneğin; C#, C++, Python ve Ruby dillerinde Checked exception yoktur.
- Exception içine hata ile alakalı içeriksel bilgiler de konulmalıdır. Ne yapmaya çalışırken hata oluştuğu bilgisi debug yaparken yardımcı olacaktır.
- Duruma özel nesne ile çözülebilecek exceptional case’ler, try/catch ile değil, bu nesne ile çözülmelidir. (SPECIAL CASE PATTERN [FOWLER]
- Metodlardan null dönmek hatalara davetiye çıkarır. Null dönmemeli, Exception fırlatmalı veya SPECIAL CASE nesnesi kullanılmalıdır.
- Metodlara null parametre geçirmek, null dönmekten daha kötüdür. Null parametre geçirmekten sakınmalıdır. 

#####Bölüm 8-9: Birim Testler
- Temiz bir test ne sağlar? Üç şey: okunabilirlik, okunabilirlik, okunabilirlik.
- TDD (Test Driven Development) pratiğinin üç temel yasası vardır. 
1-) Fail eden bir test yazmadan production kodu yazma
2-) Fail etmeye yetecek kadardan fazla test yazmaya devam etme.
3-) Fail eden testi geçecek kadardan fazla production kod yazma. Testi geçecek kadar geliştirmen yeterli.

Bu sayede fail edecek test yaz - kodu geliştir - fail edecek test yaz şeklinde bir döngüye girilir. Böylece production kodu testlerle beraber üretilir.

- Test sınıfları da production kod kalitesinde temiz tutulmalıdır. İkinci sınıf vatandaş muamelesi görmemelidir.
- Testler temiz tutulmadığında sürdürülemez ve bir süre sonra production kod testsiz kalma tehlikesiyle karşı karşıya kalır. 
- Testsiz kalan production kodda değişiklik yapmaya cesaret etmek zordur. Nerenin bozulduğu anlaşılamaz

- Test metodlarındaki assert sayısı en aza indirgenmelidir. Testler çalıştırıldığında fail eden bir assert yüzünde onun altında kalan assertlerin sonuçları muamma olmaktadır.
- Test metodu sadece bir konuyu test etmelidir. 
- Birden fazla durum için farklı test metodları yazılmalıdır.
#####**F.I.R.S.T. kuralı**
Testler F.I.R.S.T. kuralına uymalıdır:
**Fast**: Testler hızlı çalışmalıdır. Yavaş çalışan testi kimse çalıştırmak istemez, hatalar tespit edilemez.
**Independent**: Testler birbirinden bağımsız çalışabilmelidir.
**Repeatable**: Testler her ortamda tekrarlanabilmelidir.
**Self-validating**: Test sonucunu anlamak için fazla düşünmeye gerek olmamalıdır. Test ya geçmeli ya fail etmelidir. Durumu anlamak için çıktıları incelemek vs. gerekmemelidir.
**Timely**: Testler zamanında yazılmalıdır. Production kodla beraber geliştirilmelidir.


