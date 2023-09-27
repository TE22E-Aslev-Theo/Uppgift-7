import java.util.Scanner;

public class Javavavaj {

    public static void main(String[] args) {
        
        Scanner tangentbord = new Scanner(System.in);

        int[] array1 = {8,4,6,3,9};
        for (int i = 0; i < 5; i++){
            System.out.println("tal"+ (i+1) + ": " +array1[i]);
        }
        System.out.println(array1.length);

        double svar1=0;
        
        for (int i = 0; i < 5; i++){
            svar1 += Double.valueOf(array1[i]);
        }
      
        System.out.println(svar1/array1.length);

        int[] array2 = {18,14,16,13,19};
        
        double svar2 = 0;

        for(int i = 0; i < 5; i++){
            svar2 += Double.valueOf(array2[i]);
        }

        System.out.println((int)svar2);
        System.out.println(svar2/array2.length);
        
        int[] summaarray = {0, 0, 0, 0, 0};
        for(int i = 0; i < 5; i++){
            
            summaarray[i] = array1[i] + array2[i];
            System.out.println("tal"+ (i+1) + ": " +summaarray[i]);
        }

        int[] array3 = {2,4,6,3};

        String text1 =tangentbord.nextLine();
        String[] array4 = text1.split(" ");

        for(int i = 0;i < 4; i++){

        array3[i] += Integer.parseInt(array4[i]);
        
        }
        int svar3 = 0;
        for(int i = 0;i < 4; i++){

            svar3 += array3[i];

        }
        System.out.println(svar3);
        tangentbord.close();
    }
}