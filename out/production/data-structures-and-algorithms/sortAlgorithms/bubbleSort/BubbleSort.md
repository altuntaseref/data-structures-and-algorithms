# Bubble Sort

---
Bubble Sort, veri yapılarındaki öğeleri sıralamak için kullanılan basit bir sıralama algoritmasıdır. Temel mantığı, dizi üzerinde tekrar tekrar geçerek bitişik öğeleri karşılaştırmak ve gerekirse yer değiştirmektir. Bu işlem, dizideki en büyük öğenin sona "kabarcık" gibi yükselmesini sağlar, bu yüzden adı "Bubble Sort"tur (Kabarcık Sıralama).

**Algoritmanın Adımları**:

- Karşılaştırma ve Yer Değiştirme: Dizinin başından başlayarak, her çift bitişik öğeyi karşılaştırın. Eğer birinci öğe ikincisinden büyükse, yerlerini değiştirin. Bunu dizinin sonuna kadar tekrarlayın.

- Tekrarlı Geçişler: Yukarıdaki adımı, dizideki her öğe doğru sıraya gelene kadar tekrar edin. Her tam geçiş sonunda, en büyük öğe dizinin sonuna yerleşeceği için, her yeni geçişte bir öncekinden bir adım daha az kontrol yapabilirsiniz.

- Bitiş Koşulu: Dizi sıralandığında veya bir geçişte hiçbir yer değiştirme yapılmadığında algoritma sona erer.

**Özellikleri**:

- Zaman Karmaşıklığı: En kötü ve ortalama durumda O(n²) zaman karmaşıklığına sahiptir, burada 'n' dizideki öğe sayısını ifade eder. Bu, büyük veri kümeleri için verimsiz olduğu anlamına gelir.
- Kararlılık: Eşit öğelerin sıralama sonrası sırası korunduğundan, Bubble Sort kararlı bir algoritmadır.
- Yerinde Sıralama: Bubble Sort, ekstra bellek kullanmadan diziyi yerinde sıralar (in-place).
- Basitlik: Algoritma, anlaşılması ve uygulanması çok basittir.


**Örnek Kullanım Senaryoları** :

Küçük veri kümeleri veya zaten neredeyse sıralanmış veriler.
Basit ve öğretici amaçlar, özellikle sıralama algoritmalarını öğrenirken.
Bubble Sort, düşük verimliliği nedeniyle büyük veri kümelerinde kullanım için uygun değildir.
