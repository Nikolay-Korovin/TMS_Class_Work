package Unit9;

public class Task1 {
    public static String takeString(String str){
        return str;
    }
    public static void main(String[] args) {
        String str = takeString("I like Java");
        System.out.println(str.charAt(5));
        System.out.println(str.endsWith("va"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("ike"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replace("a","o"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(7,11));
    }
}
