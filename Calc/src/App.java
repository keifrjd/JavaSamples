public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int x = 999;
        int y = 33;

        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        synchronized (System.out) {
            System.out.print(x/y);
        }
        System.out.println();
        int a = 33;
        int b = 33%2;
        System.out.println(b);
        int c = 33;
        int d = 999;
        System.out.println(c==d);//ожидаем, что в консоль будет выведено false 

        int e = 999;
       int f = 33;

       e += f;
       System.out.println(e);
       boolean g = true;
       System.out.println(!g);

       System.out.println(100 > 10 && 100 > 200);
       System.out.println(100 > 50 && 100 >= 100);
       System.out.println(100 > 10 || 100 > 200);
    }
}
