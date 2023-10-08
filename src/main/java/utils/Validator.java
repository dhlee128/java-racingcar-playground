package utils;

public class Validator {

    public void validCarName(String name) {

        if(name==null || "".equals(name)) {
            throw new IllegalArgumentException(Constants.VALID_CAR_NAME_MESSAGE);
        }

        if(name.length()>5) {
            throw new IllegalArgumentException(Constants.VALID_CAR_NAME_5_MESSAGE);
        }

    }

    public void validCarNameSplit(String fullCarName) {

        if(fullCarName==null || "".equals(fullCarName)) {
            throw new IllegalArgumentException(Constants.VALID_CAR_NAME_MESSAGE);
        }

        if(fullCarName.contains(",")) {
            throw new IllegalArgumentException(Constants.VALID_CAR_NAME_SPLIT_MESSAGE);
        }

    }

    public boolean validCarMoving(int num) {
        if(num<0 || num>9) {
            throw new IllegalArgumentException(Constants.VALID_CAR_MOVING_RANDOM_MESSAGE);
        }

        if(num>=4) return true;

        return false;
    }

}
