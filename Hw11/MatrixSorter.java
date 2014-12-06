////////////////////////////////////////////////////////////////
//David Mugavero
//December 5, 2014
//MatrixSorter Java Program
//The point of this program is to perform multiple computations with a 3D array
//
public class MatrixSorter{
    //main method required for every java program
  public static void main(String arg[]){
    int mat3d[][][];//declared 3d array
    mat3d=buildMat3d();//calls method
    for(int i = 0; i < mat3d.length; i++){//fills 3d array with random numbers from 0-99
        for(int j = 0; j < mat3d[i].length; j++){
            for(int k = 0; k < mat3d[i][j].length; k++){
                mat3d[i][j][k] = (int) (Math.random() * 100);
            }
        }
    }
    show(mat3d);//calls methdod to display array
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));//calls method to find min of array and displays
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);//sorts third slab
    show(mat3d);//displays new 3d array
   }
   
   public static int[][][] buildMat3d(){//sets the number of rows in each slab and columns in each row
       int [][][] mat3d = new int [3][][];
       for(int i = 0; i < mat3d.length; i++){//number of rows
           mat3d[i] = new int [3 + 2 * i][];
       }
       for(int i = 0; i < mat3d.length; i++){
           for(int j = 0; j < mat3d[i].length; j++){//number of columns
               mat3d[i][j] = new int [i + j + 1];
           }
       }
       return mat3d;//returns array
   }
   
   public static void show(int mat3d[][][]){//displays slabs
       for(int i = 0; i < mat3d.length; i++){
           System.out.println("-----------Slab" +(i+1));
           for(int j = 0; j < mat3d[i].length; j++){
               for(int k = 0; k < mat3d[i][j].length; k++){
                   System.out.print(mat3d[i][j][k]+ " ");
               }
               System.out.println();
           }
       }
       System.out.println();
   }
   
   public static int findMin(int mat3d[][][]){//finds min of the 3d array
       int min = mat3d[0][0][0];//sets min to first element in first slab or first row of first column
       for(int i = 0; i < mat3d.length; i++){
           for(int j = 0; j < mat3d[i].length; j++){
               for(int k = 0; k < mat3d[i][j].length; k++){
                   if(mat3d[i][j][k] < min){//goes through all other numbers in array to find min
                       min = mat3d[i][j][k];
                   }
               }
           }
       }
       return min;//returns min
   }
   
   public static int[][] sort(int mat2d[][]){//sorts columns in each row in accending order and rows in accending based on first column of each row
       for(int k = 0; k < mat2d.length; k++){//these three nested for-loops sort each row's columns in accending order
            for(int j = 0; j < mat2d[k].length; j++){
                int min = mat2d[k][j];
                for(int i = 0; i < mat2d[k].length; i++){
                    if(mat2d[k][i] != min && mat2d[k][i] > min){
                        int temp = min;
                        min = mat2d[k][i];
                        mat2d[k][i] = temp;
                    }
                }
                mat2d[k][j] = min;
            }
        }
        for(int i = 0; i < mat2d.length; i++){//sorts the rows in third slab in accending order based on number in first column
            for(int j = i + 1; j < mat2d.length; j++){
                if(mat2d[j][0] < mat2d[i][0]){
                    int [] temp = mat2d[i];//points first row to temp
                    int [] temp2 = mat2d[j];//points second row to temp2
                    mat2d[i] = new int [mat2d[j].length];//sets first row to length of second row
                    mat2d[j] = new int [mat2d[i].length];//sets second row to length of first row
                    mat2d[i] = temp2;//points first row at temp2
                    mat2d[j] = temp;//points second row at temp
                }
            }
        }
        return mat2d;//return sorted slab
   }
}
