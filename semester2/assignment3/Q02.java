package semester2.assignment3;

public class Q02 {
    public static void main(String[] args) {
        String str[] = new String[3];
        str[0] = "Red";
        str[1] = "Blue";
        //str[2]  null

        for(int i=0; i< str.length+1; i++) {

            try{
                System.out.println(str[i]);
                System.out.println(str[i].length());
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array is out of Bound");
            }catch (NullPointerException e) {
                System.out.println("Null reference");
            }

        }


    }
}

/*
Red
3
Blue
4
null
Null reference
Array is out of Bound
 */
