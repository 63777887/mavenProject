package understandMaven.example.Thread;

public class ThreadTicketTest {
    public static void main(String[] args) {
        ThreadTicket threadTicket=new ThreadTicket();
        Thread t1=new Thread(threadTicket,"线程A");
        Thread t2=new Thread(threadTicket,"线程B");
        Thread t3=new Thread(threadTicket,"线程C");
        Thread t4=new Thread(threadTicket,"线程D");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
