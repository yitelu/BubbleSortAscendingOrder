class Main {
  public static void main(String[] args) {
    
    int[] myArr = new int[5];

    myArr[0] = 12;
    myArr[1] = -1;
    myArr[2] = 5;
    myArr[3] = 40;
    myArr[4] = 7;

    System.out.print("unsorted arry: ");
    for(int a: myArr){
      System.out.print(" " +a+ " ");
    }

    for(int trackIndex=0; trackIndex<myArr.length-1; trackIndex++){

      for(int i = trackIndex; i<myArr.length-1; i++){
        int j = i;
        j++;
        if(myArr[i] > myArr[j]){
          AscendingOrder(myArr, i, j);
        }
      }
    }

    System.out.println(" ");
    System.out.print("sorted arry: ");
    for(int a: myArr){
      System.out.print(" " +a+ " ");
    }
    
  }

  public static void AscendingOrder(int[] myArr, int i, int j){
    int temp = myArr[i];
    myArr[i] = myArr[j];
    myArr[j] = temp;
  }


}