public class App {
    /**
     * @param args
     * @throws Exception
     */

    public static void main(String[] args) throws Exception {
        class Point {
            int x, y;

            void print(Point this) {
                System.out.println("Point<" + this.x + "," + this.y + ">");
            }

            double norm() {
                return Math.sqrt(x * x + y * y);
            }

            void shift(int dx, int dy) {
                x += dx;
                y += dy;
            }

            @Override
            public String toString() {
                return "Point<" + this.x + "," + this.y + ">";
            }
        }
        Point point = new Point();
        point.x = 5;
        point.y = 6;
        Point point2 = new Point();
        point2.x = 7;
        point2.y = 8;
        point = point2;
        point.x = 9;
        point.print();
        double point_norm = point.norm();
        String str = point.toString();

        System.out.println("Hello, World!");
        int x = 999;
        int y = 33;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        synchronized (System.out) {
            System.out.print(x / y);
        }
        System.out.println();
        int a = 33;
        int b = 33 % 2;
        System.out.println(b);
        int c = 33;
        int d = 999;
        System.out.println(c == d);// ожидаем, что в консоль будет выведено false

        int e = 999;
        int f = 33;

        e += f;
        System.out.println(e);
        boolean g = true;
        System.out.println(!g);

        System.out.println(100 > 10 && 100 > 200);
        System.out.println(100 > 50 && 100 >= 100);
        System.out.println(100 > 10 || 100 > 200);

        System.out.println(x > 0 ? "positive" : "negative or zero");

        // Unboxing
        Double doubler = 1.0;
        Integer integerr = 2;
        Number n = false ? doubler : integerr;
        System.out.println(n);// 2.0

        int integerSwitch = 1;
        switch (integerSwitch) {
            case 1:
                System.out.println("one");
                break;
            case 3:
                System.out.println("two or three");
                break;
            default: {
                System.out.println("other:");
                System.out.println(integerSwitch);
                break;
            }
        }
        // infinity loop
        // while (true) {
        // System.out.println("catch me if you can!");
        // }
        int dou = 0;
        do {
            System.out.println(dou);
            dou++;
        } while (false);
        // while(dou<10);
        for (int p = 0; p < 10; p++) {
            System.out.println(p);
        }
        // for(;;){}//бесконечный цикл
        // for(String arg: args){ цикл по массиву
        // System.out.println(arg);
        // }
        for (Weeekday weekday : Weeekday.values()) {
            System.out.println(
                    weekday + "(" + weekday.getShortName() + ")" + (weekday.isWeekend() ? "relax and enjoy" : "work!"));

        }
    }

}
