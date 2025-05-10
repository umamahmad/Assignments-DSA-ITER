package semester2.assignment1;

public class HAQ05 {
    public static void main(String[] args) {
        int arr [][] = new int[4][4];
        for (int i=0; i<4; i++)
        {
            for (int j=0; j<4; j++)
            {
             arr [i][j] = (int)((Math.random()*2));
             System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }


        int maxRowIndex = 0;
        int maxRowCount = 0;
        for (int i = 0; i < 4; i++) {
            int count = 0;
            for (int j = 0; j < 4; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxRowCount) {
                maxRowCount = count;
                maxRowIndex = i;
            }
        }

        int maxColIndex = 0;
        int maxColCount = 0;
        for (int j = 0; j < 4; j++) {
            int count = 0;
            for (int i = 0; i < 4; i++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxColCount) {
                maxColCount = count;
                maxColIndex = j;
            }
        }

        System.out.println("\nThe largest row index: " + maxRowIndex);
        System.out.println("The largest column index: " + maxColIndex);
    }
}

/*
0  1  1  0
1  0  1  1
0  0  1  0
0  1  1  1

The largest row index: 1
The largest column index: 2
 */