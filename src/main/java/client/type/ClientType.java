package client.type;


public enum ClientType {
     REGULAR, REWARDS;

    public static ClientType getByType(String type) {

        if (type.toUpperCase().equals("REGULAR")) {
            return ClientType.REGULAR;
        }
    return ClientType.REWARDS;
    }


}
