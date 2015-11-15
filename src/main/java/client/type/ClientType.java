package client.type;

public enum ClientType {

    REWARDS, REGULAR;

    public static ClientType getByType(String type) {

        if (isRewardsClient(type)) {
            return ClientType.REWARDS;
        }

        return ClientType.REGULAR;
    }

    public boolean isRegular() {

        if (this.name().equals(ClientType.REGULAR.name())) {
                return true;
        }else
                return false;
    }

    public static boolean isRewardsClient(String type) {

        if (type.equals(ClientType.REWARDS.name())) {
            return true;
        }
        return false;
    }




}






