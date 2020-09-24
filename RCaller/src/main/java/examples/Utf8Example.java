package examples;
import com.github.rcaller.rstuff.RCaller;
import com.github.rcaller.rstuff.RCode;

public class Utf8Example {
    public static String[] characterConv() {
        RCode code = RCode.create();
        RCaller caller = RCaller.create();

        caller.setRCode(code);

        code.addRCode("s = intToUtf8(500:550)");
        caller.runAndReturnResult("s");

        return caller.getParser().getAsStringArray("s");

    }

    public static void main(String[] args) {
        String s = "ǴǵǶǷǸǹǺǻǼǽǾǿȀȁȂȃȄȅȆȇȈȉȊȋȌȍȎȏȐȑȒȓȔȕȖȗȘșȚțȜȝȞȟȠȡȢȣȤȥȦ";
        String[] result = characterConv();
        System.out.println(result[0]);
        System.out.println(s);
        if (result[0].equals(s)) {
            System.out.println("Test completed");
        } else {
            System.out.println("Test incompleted");
            System.exit(1);
        }
    }
}
