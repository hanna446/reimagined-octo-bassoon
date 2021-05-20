class Calculadora {

  public static void main(String args[]) {
      
    int operation = Integer.parseInt(args[0]);
    int number1 = Integer.parseInt(args[1]);
    int number2 = Integer.parseInt(args[2]);
    System.out.println("Hello world! operation = "+operation);

    if(operation == 1){
        System.out.println("sumando.. "+number1+" + "+number2);
        System.out.println("Respuesta: "+suma(number1,number2));
    }else if(operation == 2){
        System.out.println("restando.. "+number1+" - "+number2);
        System.out.println("Respuesta: "+resta(number1,number2));
    }else if(operation == 3){
        System.out.println("multiplicando.. "+number1+" * "+number2);
        System.out.println("Respuesta: "+multi(number1,number2));
    }else if(operation == 4){
        System.out.println("dividiendo.. "+number1+" / "+number2);
        System.out.println("Respuesta: "+divi(number1,number2));  
    }
  }

  public static int suma(int number1, int number2){
    return number1 + number2;
  }

  public static int resta(int number1, int number2){
    return number1 - number2;
  }

  public static int multi(int number1, int number2){
    return number1 * number2;
  }

   public static double divi(int number1, int number2){
    return number1 / number2;
  }
}