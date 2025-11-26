package in.kgcoding.Challenge89;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println(concatenate("Priyam"));

        System.out.println(concatenate("Priyam","Jaiswal"));

        System.out.println(concatenate("Student", "of", "IT"));
    }

    public static String concatenate(String... strs){
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(" ");
        }
        return sb.toString();
    }
}
