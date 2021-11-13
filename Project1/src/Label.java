public class Label {

    public static void main(String[] args) {

        //Hash code

        Integer x = 5;
        System.out.println(x);
        System.out.println(x.hashCode());

        String s = x + "Aghdbvncq237taeADSG:Q#$:T!3B";
        System.out.println(s.hashCode());
        //Label
        leaveLoop:
        for (int i = 0; i < 10; i++) {
            System.out.println("i " + i);
            for (int j = 0; j < 10; j++) {
                System.out.println("j" + j);
                if (j == 5)
                    break leaveLoop;
            }
        }
        System.out.println("----------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println("i " + i);
            for (int j = 0; j < 10; j++) {
                System.out.println("j" + j);
                if (j == 5)
                    break;
            }
        }
    }
}
