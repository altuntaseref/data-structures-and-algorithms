# Bubble Sort

---
Bu algoritma bir diziyi sıralanmış ve sıralanmamış olarak ayırır. Bu sebeple dizinin son indeksinden sıralamaya başlarız. 

Örnek bir dizi vermek gerekirse:

20,35,-15,7,55,1,-22
 
Bu diziyi bubble sort a göre sıralayalım.Sıralama yaparken 0. indeksten başlayacağız ve bir sağındaki değerden büyük olup olamdığına bakacağız eğer büyükse yer değiştireceğiz ama küçükse herhangi bir işlem yapmayacağız.


## Adım-1
   20,35,-15,7,55,1,-22 -->>  20 ve 35 i karşılaştırdım 20 < 35 old için bir işlem yapmıyorum .
20,35,-15,7,55,1,-22 -->> 35 ve -15 i karşılaştırdım 35 > -15 oldu için ikisini yer değiştiriyorum.
Bu işlemi dizinin son elemanına gelene kadar yaptıktan sonra dizimiz
   20,-15,7,35,1,-22,55 şeklinde olacaktır.

Bu durumda dizinin 6. indexi sıralanmış oluyor ve artık dizimizin boyutu 5. indexe kadar gidiyor. Çünkü buuble sort da 
