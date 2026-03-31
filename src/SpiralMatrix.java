import java.util.Scanner;
public class SpiralMatrix {
        static Scanner sc = new Scanner(System.in);

        public static int[] spiral(int[][] arr, int r, int c){
                int[] ans = new int[r*c];
                int top = 0;
                int bottom = r-1;
                int left = 0;
                int right = c-1;
                int k = 0;
                while(top<=bottom && left<=right){
                        for(int i = left; i<=right;i++){
                                ans[k++] = arr[top][i];
                        }
                        top++;
                        for(int i=top; i<=bottom; i++){
                                ans[k++] = arr[i][right];
                        }
                        right--;
                        if(top<=bottom){
                                for(int i=right; i>=left; i--){
                                        ans[k++] = arr[bottom][i];
                                }
                                bottom--;
                        }
                        if(left<=right){
                                for(int i=bottom; i>=top; i--){
                                        ans[k++] = arr[i][left];
                                }
                                left++; 
                        }
                }
                return ans;
        }
        // TODO: Read r and c
        // TODO: Read the matrix elements
        // TODO: Print the elements in spiral order
        // Hint: Use 4 pointers: top, bottom, left, right
        public static void main(String[] args) {
                int r = sc.nextInt();
                int c = sc.nextInt();
                int[][] arr = new int[r][c];
                for(int i=0; i<r; i++){
                        for(int j=0; j<c; j++){
                                arr[i][j] = sc.nextInt();
                        }
                }
                int[] ans = spiral(arr, r, c);
                for(int i=0; i<ans.length; i++){
                        System.out.print(ans[i]);
                        if(i != ans.length) 
                                System.out.print(" ");
                }
        }
}
