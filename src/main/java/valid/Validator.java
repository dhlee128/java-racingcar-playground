package valid;

public class Validator {

    public void validCarName(String name) {

        if(name==null || "".equals(name)) {
            throw new IllegalArgumentException("자동차 이름은 필수이다.");
        }

        if(name.length()>5) {
            throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없다.");
        }

    }

    public String[] validCarNameSplit(String fullCarName) {

        if(fullCarName==null || "".equals(fullCarName)) {
            throw new IllegalArgumentException("자동차 이름은 필수이다.");
        }

        String[] carNames = fullCarName.split(",");

        return carNames;
    }

    public boolean validCarMoving(int num) {
        if(num<0 || num>9) {
            throw new IllegalArgumentException("0-9 사이의 숫자이다.");
        }

        if(num>=4) return true;

        return false;
    }

}
