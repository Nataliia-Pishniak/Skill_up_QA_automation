public class LessonTwo {

    public static void main(String[] args) {
        int a =10;
        int b =7;
       // b= b+a;
        //b+=a;

        int c =8;
        int d =--c;

        int e = 8;
        int f = e--;

        String text  = "hello" ;
        String text2  = "hello" ;

        String text3 = new String ("hello");
        String text4 = new String ("hello");


        boolean bool =a!=b;
        boolean bool1 =c>d;
        boolean bool2 =c>=d;


        boolean bool7 =(5 > 6)||(4<6);
        boolean bool8 =(5 > 6)&&(4<6);


        System.out.println(bool);
        System.out.println(bool7);
        System.out.println(bool8);

        if(a!=b || a>=b){
            System.out.println("Hello hello");
        }

        if (a!=b){
            System.out.println("Hello hello if2");

        }else {
            System.out.println("Hello hello else");

        }

        if(e!=f || e>=c){
            System.out.println("Hello hello if 3");
        }else if (c==8) {
            System.out.println("Hello hello else if");
         }else if (c==7) {
        System.out.println("Hello hello else if");
    }

        switch (a){
           case 5:
                System.out.println("first case");
                break;
            case 10:
                System.out.println("second case");
                break;
            case 15:
                System.out.println("third case");
                break;

        }
        int z = a>b ? 10:5;
        if(a>b){
            z=10;
        }else {
            z=15;
         }


    }


    }

