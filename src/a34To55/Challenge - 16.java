package a34To55;

class StringManipulation {
    public static void main(String[] args) {
        String firstName = "Prashant";
        String lasName = "Jain";

      //  String fullName = firstName + " " +lasName;
          String fullName = firstName.concat( " ").concat(lasName);

        System.out.println(fullName.toUpperCase());
    }
}
