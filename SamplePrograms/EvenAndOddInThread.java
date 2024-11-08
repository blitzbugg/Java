class Odd extends Thread {
    public void run() {
        int odd;
        for (int i = 1; i < 100; i=i+2) {
           try{
            odd = i;
            System.out.println("Odd number is: " + odd);
            sleep(1000);
           }
           catch (Exception e){}
        }
    }
}

class Even extends Thread {
    public void run() {
        int even;
        for (int i = 2; i < 100; i=i+2) {
            try{
                even = i;
                System.out.println("Even number is:" + even);
                sleep(1500);
            }catch(Exception e){}
        }
        }
}


public class EvenAndOddInThread {
    public static void main(String[] args) {
        Odd odd = new Odd();
        Even even = new Even();
        odd.start();
        even.start();
        System.out.println("End of main function/thread");
    }
}
