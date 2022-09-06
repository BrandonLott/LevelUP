package UTIL;

import java.io.IOException;

public class EnterToContinue {
    public void EnterToContinue(){
        System.out.println("\n\t PRESS ENTER TO CONTINUE...");
        try{ System.in.read();}
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
