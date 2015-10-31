package client.type;


import java.util.Scanner;



public class ClientType {


public String returnTypeClient() throws NullPointerException{

        System.out.println(" Choose the Type of Customer:");
        System.out.println(" Options:  1 = Regular  - 2 = Premium ");

        Scanner clientType = new Scanner(System.in);
        String optionClient = clientType.nextLine();

        if (optionClient.equals("1")){
              return "Regular";
         } else if(optionClient.equals("2")) {
              return "Premium";
        } else

            throw new NullPointerException();


          //return "";

    }






}
