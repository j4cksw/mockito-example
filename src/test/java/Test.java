import org.junit.Assert;
import org.mockito.Mock;
import org.mockito.Mockito;

public class Test {

    @org.junit.Test
    public void TestCallRandom(){
        IntRandom i = Mockito.mock(IntRandom.class);
        StringRandom s = Mockito.mock(StringRandom.class);

       Captcha captcha = new Captcha(i, s);

       captcha.gen();

        Mockito.verify(i).random();
        Mockito.verify(s).random();
    }

    @org.junit.Test
    public void TestResult(){
        IntRandom i = Mockito.mock(IntRandom.class);
        Mockito.when(i.random()).thenReturn(1);

        StringRandom s = Mockito.mock(StringRandom.class);
        Mockito.when(s.random()).thenReturn("One");

        Captcha captcha = new Captcha(i, s);

        String result = captcha.gen();

        Assert.assertEquals(result, "1+One");
    }
}
