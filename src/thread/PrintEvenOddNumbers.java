package thread;

public class PrintEvenOddNumbers {

    int count = 1;
    int MAX = 20;

    public void printEven() throws InterruptedException {
        synchronized (this){
            while (count < MAX){
                if (count % 2 == 1){
                    wait();
                }
                System.out.println(count);
                count++;
                notify();
            }
        }
    }


    public void printOdd() throws InterruptedException {
        synchronized (this){
            while (count < MAX){
                if (count % 2 == 0){
                    wait();
                }
                System.out.println(count);
                count++;
                notify();
            }
        }
    }

    public static void main(String[] args) {

        PrintEvenOddNumbers evenOddNumbers = new PrintEvenOddNumbers();

        Thread evenThread = new Thread(() -> {
            try {
                evenOddNumbers.printEven();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread oddThread = new Thread(() -> {
            try {
                evenOddNumbers.printOdd();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        evenThread.start();
        oddThread.start();
    }
}

