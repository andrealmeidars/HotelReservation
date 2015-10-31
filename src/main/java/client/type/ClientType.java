package client.type;


import java.util.Scanner;

public class ClientType {
    //private String typeClient;





    public String returnTypeClient() {

        System.out.println(" Choose the Type of Customer:");
        System.out.println(" Options:  1 = Regular  ");

        Scanner clientType = new Scanner(System.in);
        String optionClient = clientType.nextLine();

        if (optionClient.equals("1")){
            return "Regular";
         } 

        return  "erro";
    }






}
