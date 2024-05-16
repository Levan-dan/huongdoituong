package meobatchuot;

public class Main {
    public static void main(String[] args) {
        Rat rat = new Rat("momo", 5.0, 10, true);
        Cat cat = new Cat("mimi", 10.0, 20);

        if(rat.getSpeed() < cat.getSpeed()){
            System.out.println("meo da bat dc chuot");
            if(rat.song()){
                System.out.println("Chuot van song " + "\n" + "Chuot da bi meo an" + "\n" + "Can nang cua meo luc nay la : " +(cat.getWeight() + rat.getWeight()) );

            }
        }else {
            System.out.println("Chuot chay nhanh qua di.");
        }




    }
}
