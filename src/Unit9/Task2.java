package Unit9;

public class Task2 {
    public static void main(String[] args) {
        int i = 3;
        int j = 56;
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        StringBuilder stringBuilder3 = new StringBuilder();
        System.out.println(stringBuilder.append(i).append(" + ").append(j).append(" = ").append(i + j));
        System.out.println(stringBuilder2.append(i).append( " - ").append(j).append(" = ").append("-53"));
        System.out.println(stringBuilder3.append(i).append( " * ").append(j).append(" = ").append("168"));
        System.out.println(stringBuilder.deleteCharAt(7).insert(7,"равно"));
        System.out.println(stringBuilder2.replace(7,8,"равно"));
    }
}
