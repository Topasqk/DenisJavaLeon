package NewPack;
class NewThread implements Runnable{
    String name;
    Thread t;
    NewThread(String threadname){
        name = threadname;
        t = new Thread(this, name);
        System.out.println( "Hoвый поток : "+ t);
        t.start();
    }
    public void run(){
        try {
            for(int i=5; i>0; i--){
                System.out.println(name + "· "+ i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println( name + " прерван . ");
        }
        System.out.println(name + " завершен . ");
    }
}
public class Main {
    public static void main(String[] args){
        NewThread ob1 = new NewThread( "Один");
        NewThread ob2 = new NewThread ( "Двa " );
        NewThread ob3 = new NewThread ( "Tpи" );
        System . out . println ( "Пoтoк Один запущен : "+ ob1.t.isAlive( ));
        System . out . println ( "Пoтoк Два запущен : "+ ob2.t.isAlive( ));
        System . out . println ( "Пoтoк Три запущен : "+ ob3.t.isAlive( ));
        try {
            System.out.println ( "Oжидaниe завершения потоков . " );
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e){
            System . out . println ( " Глaвный поток прерван " );
        }
        System.out.println ( "Пoтoк Один запущен : "+ ob1.t.isAlive());
        System.out.println ( "Пoтoк Один запущен : "+ ob2.t.isAlive());
        System.out.println ( "Пoтoк Один запущен : "+ ob3.t.isAlive());
}
}