///////////////////////////////////////////////////////////////
//David Mugavero
//November 19, 2014
//RaggedArrays Jave Program
//This point of this program is to make a multi-demential and get practice with its functions
//
public class RaggedArrays{
    //main method required for all java programs
    public static void main(String [] args){
        int [][] ragged = new int [5][];//declare multi-array
        for(int i = 0; i < ragged.length; i++){
            //allocating the length of each row in the array
            ragged[i] = new int [3 * i + 5];
        }
        for(int i = 0; i < ragged.length; i++){//fills array with random numbers [0,39]
            for(int j = 0; j < ragged[i].length; j++){
                ragged[i][j] = (int) (Math.random() * 40);
            }
        }
        System.out.println("The array before sorting:");
        for(int k = 0; k < ragged.length; k++){
            for(int z = 0; z < ragged[k].length; z++){//array gets printed before sorting
                System.out.print(ragged[k][z]+ " ");
            }
            System.out.println();
        }
        for(int k = 0; k < ragged.length; k++){//nest of loops sorts the array into accending order
            for(int j = 0; j < ragged[k].length; j++){
                int min = ragged[k][j];
                for(int i = 0; i < ragged[k].length; i++){
                    if(ragged[k][i] != min && ragged[k][i] > min){
                        int temp = min;
                        min = ragged[k][i];
                        ragged[k][i] = temp;
                    }
                }
                ragged[k][j] = min;
            }
        }
        System.out.println("The array after sorting");//prints array after sorting has taken place
        for(int k = 0; k < ragged.length; k++){
            for(int y = 0; y < ragged[k].length; y++){
                System.out.print(ragged[k][y]+ " ");
            }
            System.out.println();
        }
    }
}