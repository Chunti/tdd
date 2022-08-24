public class GreetingKata {


    public String greet(Object name) {

        String greeting;
        if (name == null){
            greeting = "Hello my friend";
        }
        else if (name instanceof String[]) {
            String[] names = new String[((String[]) name).length];
            for (int i = 0; i < ((String[]) name).length; i++) {
                names[i] = ((String[]) name)[i];
            }
            greeting = "Hello " + names[0] + " and " +names[1];


        }
        else if (isAllUpperCase((CharSequence) name)){
            greeting = "HELLO " + name;
        }
        else{
            greeting = "Hello " + name;
        }

        return greeting;
    }

    public static boolean isAllUpperCase(CharSequence cs) {

        int sz = cs.length();
        for (int i = 0; i < sz; i++) {
            if (Character.isUpperCase(cs.charAt(i)) == false) {
                return false;
            }
        }
        return true;
    }
}
