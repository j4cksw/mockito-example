
public class Captcha {

    private IntRandom intRandom;
    private StringRandom stringRandom;

    Captcha(){
        this.intRandom = new IntRandom();
        this.stringRandom = new StringRandom();
    }

    Captcha(IntRandom intRandom, StringRandom stringRandom){
        this.intRandom = intRandom;
        this.stringRandom = stringRandom;
    }


    public String gen() {
        int first = intRandom.random();
        String second = stringRandom.random();
        return Integer.toString(first) + "+" + second;
    }
}
