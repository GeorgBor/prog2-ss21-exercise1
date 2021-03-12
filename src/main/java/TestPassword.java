public class TestPassword {

    public boolean checkPassword(String text){ //Grundgerüst

        boolean test;
        if((text.length() >= 8 && text.length() <=25)
                &&(text.matches("[a-zA-Z]*"))
                &&(text.matches("[0-9]*"))
                //&&(text.matches("[()#$?!%/@]"))
        ){

            test = true;
        }
        else
        {
            test = false;
        }

        /*
        if (extendValues(text)==false){
            System.out.println("Test Falsch");
        }*/
        return test;
    }
    public boolean extendValues(String text){ //ERweiterung

        boolean test = false;
        char[] pass = text.toCharArray();

        for (int i = 0; i < pass.length ; i++) {

            if ((pass[i] > 47 && pass[i] <58)&&(pass[i+1] > 47 && pass[i+1] <58)
                    &&(pass[i] == pass[i+2] )){
                test = true;

            }
            else
            {
                test = false;
            }
            /*
            if (pass[i+1]>=46 && pass[i+1] <=57 &&(i+1<pass.length-1)){
                if ((pass[i] == (pass[i+1]+1))&&((pass[i+2]+1) ==(pass[i+2]+1))){

                    test = true;
                }
            }*/
        }
        return  test;
    }
}
