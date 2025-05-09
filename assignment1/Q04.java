package assignment1;

public class Q04
{
//    public static void main(String[] args)
//    {
//        char[] chars = {'c', 'a', 'r', 'b', 'o', 'n'};
//        permute(chars, 0);
//    }
//
//    public static void permute(char[] arr, int index) {
//        if (index == arr.length) {
//            System.out.println(new String(arr));
//            return;
//        }
//
//        for (int i = index; i < arr.length; i++) {
//            swap(arr, i, index);
//            permute(arr, index + 1);
//            swap(arr, i, index);
//        }
//    }
//
//    public static void swap(char[] arr, int i, int j) {
//        char temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }

    public static void main(String[] args){
        String str = "CARBON";
        int count =0;
        int l1 = str.length();
        for (int i=0; i<l1; i++)
        {
            for (int j=0; j<l1; j++)
            {
                for (int k=0; k<l1; k++)
                {
                    for (int l=0; l<l1; l++)
                    {
                        for (int m=0; m<l1; m++)
                        {
                            for (int n=0; n<l1; n++)
                            {
                                if(i!=j&&i!=k&&i!=l&&i!=m&&i!=n&&j!=k&&j!=l&&j!=m&&j!=n&&k!=l&&k!=m&&k!=n&&l!=m&&l!=n&&m!=n)
                                    System.out.print(""+str.charAt(i)+str.charAt(j)+str.charAt(k)+str.charAt(l)+str.charAt(m)+str.charAt(n)+"\n");


                            }

                        }

                    }

                }
            }

        }

    }
}
