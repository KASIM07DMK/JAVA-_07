public class StringBufferExample{
    public static void main(String[]args){
        StringBuffer sb = new StringBuffer("Hello, World!");
        sb.delete(5,7);
        System.out.println("After Deleting Characters:" +sb);
        sb.deleteCharAt(5);
        System.out.println("After Removing Characters:" +sb);
    }
}