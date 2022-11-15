import java.util.HashMap;
import java.util.Map;

public class search2Dmatrix {
    public static void main(String[] args) {
        // int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int[][] matrix = {{1}};
        int target = 1;
        System.out.println(searchMatrix(matrix, target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        // Map<Integer,Integer> newMap = new HashMap<>();
        // int k = matrix[0].length;
        // for(int i = 0; i<matrix.length; i++){
        //     for(int j = 0; j<k;j++){
        //         newMap.put(matrix[i][j],j);
        //         if(newMap.containsKey(target)) return true;
        //     }
        // }
        // return false;
        
		int row= matrix.length;
		int col= matrix[0].length;

		int i=0, j=col-1;
		while(i<row && j>=0)
		{
			if(matrix[i][j]==target)
				return true;
			else if(matrix[i][j]<target)
				i++;
			else if(matrix[i][j]>target)
				j--;
		}
		return false; 
    }
}
