public class TestPassword {

    public boolean checkPassword(String text){ //Grundgerüst

        boolean test = false;
        char[] chars=text.toCharArray();


        if((text.length() >= 8 && text.length() <=25) //Basis
                &&(text.matches("[a-zA-Z0-9()#$?!%/@]*"))
        ){
            test = true;

        }
        else
        {
            test = false;
        }


        /*
        for (int i = 0; i <chars.length ; i++) {
        //Ganzer String in Array - mit buchstaben!
            if (chars[i] >= 48 && chars[i] <= 57)
            {
                //if ((chars[i] == i) && (chars[i+1] <= i+1))
                test = true;
            }
            else {
                test =false;
                System.out.println("Falsch2!");
                break;
            }
        }*/

        return test;
    }
}
