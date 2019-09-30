import java.util.Scanner;

public class Lommeregner {
    //Brug "sout"+enter i stedet for at skrive system.out.rpint
    public static void main(String[] args){

        while(true){

            System.out.println("Tryk 1 for +, -, *, /");
            System.out.println("Tryk 2 for regne afstand mellem linje og punkt");
            System.out.println("Tryk 3 for at løse en andensgradsligning");

            //Fortæller java at den skal tage imod noget input
            //eller læser noget input
            Scanner input = new Scanner(System.in);

            String HvadNu = input.nextLine();

            if (HvadNu.equals("1")){
                System.out.println("Hvad vil du nu");
                System.out.println("Indtast '1' for at gange");
                System.out.println("Indtast '2' for at lægge sammen");
                System.out.println("Indtast '3' for at trække fra");
                System.out.println("Indtast '4' for at dividere");

                //Laver en String som tager imod noget input
                String Hvilket = input.nextLine();

                //Hvis Hvilket som er *,/,+ eller - er lig med en af de fire ting gør noget
                if (Hvilket.equals("1")){
                    //Her skriver vi ud til konsollen
                    System.out.println("Du kan nu gange to vilkårlige tal");
                    //Gør det muligt at indtaste en float værdi
                    float e = input.nextFloat();
                    float f = input.nextFloat();

                    System.out.println(e * f);
                    continue;
                }

                if (Hvilket.equals("2")){

                    System.out.println("Hvad vil lægge sammen?");
                    int c = input.nextInt();
                    int d = input.nextInt();

                    System.out.println(c + d);
                    continue;
                }

                if(Hvilket.equals("3")){

                    System.out.println("Hvad vil du trække fra hinanden?");
                    int g = input.nextInt();
                    int h = input.nextInt();

                    System.out.println(g - h);
                    continue;
                }


                if(Hvilket.equals("4")){

                    System.out.println("Dividere to tal");
                    float a = input.nextFloat();
                    float b = input.nextFloat();

                    System.out.println(a / b);
                    continue;
                }
            }

            if (HvadNu.equals("2")){
                System.out.println("Først definerer vi din ligning");
                System.out.println("Vælg først din 'a' værdi");
                int a = input.nextInt();

                System.out.println("Vælg nu din 'b' værdi");
                int b = input.nextInt();

                System.out.println(("y="+a+"x"+"+"+b));

                System.out.println("Vælg først din 'x' Værdi");
                int x = input.nextInt();

                System.out.println("Vælg nu din 'y' Værdi");
                int y = input.nextInt();

                int c = 1;

                System.out.println("dist(l,P)="+(a * x - y + b) / (Math.sqrt(Math.pow(a,2)+1)));
            }

            if (HvadNu.equals("3")){

                System.out.println("Først definerer vi din ligning");

                System.out.println("Indtast din 'a' værdi");
                float a = input.nextFloat();

                System.out.println("Indtast din 'b' værdi");
                float b = input.nextFloat();

                System.out.println("Indtast din 'c' værdi");
                float c = input.nextFloat();

                System.out.println("y="+a+"x^2+"+b+"x+"+c);
                System.out.println();

                if (a == 0 && b == 0) {

                    System.out.println("Ingen rødder");
                    System.out.println();
                    continue;


                } else if (a == 0) {

                    float x3;
                    x3 = -c / b;
                    System.out.println(x3);
                    System.out.println();
                    continue;


                } else {

                    double d;
                    d = Math.pow(b, 2) - 4 * a * c;

                    double x;
                    double x2;

                    System.out.println("Diskriminanten =" + d);
                    System.out.println();




                    if (d < 0) {
                        System.out.println("Ligningen har ingen løsning");
                        System.out.println();
                        continue;
                    }

                    if (d == 0) {
                        System.out.println("Ligningen har 1 løsning");
                        System.out.println();

                        x = -b / 2 * a;

                        System.out.println(" x= " + x);
                        System.out.println();
                        continue;
                    }

                    if (d > 0) {
                        System.out.println("Ligningen har 2 løsninger");
                        System.out.println();


                        x = ((-b + Math.sqrt(d)) / (2 * a));
                        x2 = ((-b - Math.sqrt(d)) / (2 * a));

                        System.out.println("x = " + x);
                        System.out.println();
                        System.out.println("x_2 = " + x2);
                        System.out.println();
                        System.out.println();


                    }
                }

            }

            //man fortæller at variabletypen scanner med navn input processen er færdig, men kan ikke benyttes i et loop
            //input.close();

            //lets go nemt
            //commit coomit skeeeet


        }


    }

}
