package temperature;

public class Main {
    public static void main(String[] args) {
        NhietDo nhietDo = new NhietDo(20);

        System.out.println(nhietDo.getDoC() + " bang do F la: " + nhietDo.showDoF());

        System.out.println(nhietDo.getDoC() + " bang kevin la: " +  nhietDo.showKenvin());

    }


}
