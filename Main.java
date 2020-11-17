class Main {
  public static void main(String[] args) {
    String[] candy = {"Adam", "Dexter", "Marcus", "Gabby", "Elianna", "Katie" ,"Merida" "Anna","Brayn"};
    
    for(int i=0;i<7;i++){
      System.out.println( "The candy is  " + candy [i]);
    }

    candy[6]= "crunch";

    for(int i=0; i<7; i++){ 
      System.out.println("The update is " + candy[i]);
    }

  }
}