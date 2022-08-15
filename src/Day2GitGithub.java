public class Day2GitGithub {
   /*
 1-) git init --> Local repo olusturmak icin yani  .git ile klasörümüzün
 içindeki dosyaları
 ilişkilendirmek için kullanılır
 2-) git add . --> Working space'den (yani yerel) dosyalarımı staging area'ya
 (yani commitlemek için beklenen yer) gönderir
 3-)3- git status --> Working space'deki ve staging area'daki durumu gosterir
 4-)git commiit -m "mesaj" --> Staging area'dan commit stora
 dosyalarımı göndermek için kullanılır
 (commit yani versiyon yani sürüm oluşturmuş olurum)
 5- git push --> Uzak repo'ya(yani remote - GitHub)
  göndermek için kullandıgımız kod
 yalnız git push komutunu diirekt kullanmak istersek 1 kez
         git remote add origin adress
         git push -u origin master
 6-) git pull --> Remote (uzak depodaki) dosyalarimizi guncellemek
 icin kullanilir
NOT: Yukarıdaki iki komutu tek seferde kullandıktan sonra ikinci commit'lerim için sadece git puskullanırız

*/
   public static void main(String[] args) {
       System.out.println("GitHub ı da ogrendik");
       System.out.println("Branch ı da ogrendik");
       System.out.println("Master 1.Deneme");
   }

}
