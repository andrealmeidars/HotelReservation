package client.type;



public class ClientType {
    boolean isClientRegular = false;



    public void insertTypeClient(String customer) {

        if (customer.equals("Regular")) {
            isClientRegular = true;

        } else {
            isClientRegular = false;
         }
    }

    public boolean returnCustomer(){
        return isClientRegular;

    }
}






