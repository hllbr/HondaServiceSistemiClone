
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Honda Servis Sistemine Hoşgeldiniz ...");
        System.out.println("Birazdan sizlere basit protokol soruları yöneltilecektir Lütfen sorulara basit cevaplar veriniz");
        System.out.println("Sorular yükleniyor lütfen bekleyiniz....");
        Scanner scn = new Scanner(System.in);
        Thread.sleep(3000);
        System.out.println("Lütfen aracınızın Markasını giriniz :");
        String marka = scn.nextLine();
        //
        System.out.println("Lütfen aracınızın Modelini giriniz :");
        String model = scn.nextLine();
        System.out.println("Lütfen aracınızın Yaşını Giriniz :");
        int yas = scn.nextInt();
        scn.nextLine();
        System.out.println("İlginizi ve değerli zamanınızı ayırdığınız için Teşekkür ederiz.");
        System.out.println("Yanıtlarınız Kontrol ediliyor Lütfen bekleyiniz");
        Thread.sleep(3000);
        kontrol(model, marka, yas);
        Queue<String> hondaMotor = new LinkedList<String>();
        
        List<String> model1 = new LinkedList<String>();
        
        hondaMotor.offer("forza");
        hondaMotor.offer("spaceX");
        hondaMotor.offer("CB25R");
        hondaMotor.offer("CBR250");
        hondaMotor.offer("forza-C");
        hondaMotor.add("sizin aracınız");
        
        model1.add("sizin aracınız");
        model1.add("forza-C");
        model1.add("CBR250");
        model1.add("CB25R");
        model1.add("spaceX");
        model1.add("forza");
        
        
        
       
        while(true){
            String islemler = "bakıma giren araçların listesini güncelle(1)\n"
                    + "çıkış rampasında bulunan araçların listesi(2)\n"
                    + "anahtar teslimatı ve ödeme işlemi için (3)";
            System.out.println("//////////////////////////////////////////////");
            System.out.println(islemler);
            System.out.println("----------------------------------------------");
            System.out.println("lütfen yapmak istediğiniz işlemi giriniz.");
            String islem = scn.nextLine();
            System.out.println("işleminiz kontrol ediliyor lütfen bekleyiniz.");
            Thread.sleep(2500);
            if(islem.equals("1")){
            for(String s : hondaMotor){
            System.out.println(s);
            }
            hondaMotor.poll();
            }else if(islem.equals("2")){
                System.out.println("Çıkış rampasındaki araçların listesi ");
                if(!hondaMotor.isEmpty()){
                for(String s : hondaMotor){
            System.out.println(s);
            }
            hondaMotor.poll(); 
                    /*
            veya List ile çıkarma işlemini yapabilirdik.
            */
                }else{
                    System.out.println("aracınız çıkış rampasındadır.");
                }
            }else if(islem.equals("3")){
            System.out.println("Sistemden Çıkış için 5 sn kaldı");
            Thread.sleep(1000);
            System.out.println("Sistemden Çıkış için 4 sn kaldı");
            Thread.sleep(1000);
            System.out.println("Sistemden Çıkış için 3 sn kaldı");
            Thread.sleep(1000);
            System.out.println("Sistemden Çıkış için 2 sn kaldı");
            Thread.sleep(1000);
            System.out.println("Sistemden Çıkış için 1 sn kaldı");
            Thread.sleep(1000);
            System.out.println("Sistemden Çıkış için 0 sn kaldı");
            System.out.println("Sistemden çıkış işlemi başarılı....");
            break;
            }

        }
        
    }
    public static void kontrol(String model,String marka,int yas) throws InterruptedException{
        Thread.sleep(1000);
        if(marka.equals("honda")){
            System.out.println("Kullandığınız arac Servisimize marka açısından uygundur.");
        }else{
            System.out.println("Servis ağımız sadece kendi markamıza hizmet vermektedir.");
        }
        Thread.sleep(1000);
        if(model.equals("activas") || model.equals("forza")){
            System.out.println("Aracınızın modeli servis sistemimizde kayıtlıdır.");
        }else{
            System.out.println("Aracınızın modeli servis sistemimiz dışındadır.");
        }
        Thread.sleep(1000);
        if(yas>=12){
            System.out.println("Aracınızın teknik tamiri ekiplerimizce yapılabilir FAKAT\n"
                    + "parçaların bazılarının tedarik zincilerinde meydana gelebilecek aksaklıklar yada gecikmeler firmamız \n"
                    + "tarafından tarafınıza iletilecektir.\n"
                    + "Yaşanabilecek Gecikmelerden ötürü tedarikçi firmalar adına sizden şimdiden özür dileriz");
        }else{
            System.out.println("Bakım ve tamirat açısından herhangi bir sıkıntı görülmemektedir.");
            
        }
        
    }
    
}
