public class Main {

    public static void main(String[] args) {
        boolean wakeUp = getUp(true, 7);
        System.out.println(wakeUp);
    }

    public static boolean getUp(boolean squawking, int currentHour) {
            // currentHour 0 to 23
            switch (currentHour){
                case 1 :
                case 2 :
                case 3 :
                case 4 :
                case 5 :
                case 23 :
                    return true;

                default:
                    return false;
            }
      }


    }

