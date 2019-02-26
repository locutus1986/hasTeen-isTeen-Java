// I know that I used duplicate code. It's just wear I'm at right now.

public class TeenNumberChecker {
    public static boolean hasTeen(int x, int y, int z){
        boolean result = false;

        if(x >= 13 && x <=19){
            result = true;
        }

        if(y >= 13 && y <=19){
            result = true;
        }

        if(z >= 13 && z <=19){
            result = true;
        }

        return result;
    }

    public static boolean isTeen(int x){
        boolean result = false;

        if(x >= 13 && x <=19){
            result = true;
        }

        return result;
    }
}
