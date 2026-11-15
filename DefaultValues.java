public class DefaultValues{
    byte defaultByte;
    short defaultShort;
    int defaultInt;
    long defaultLong; 
    float defaultFloat;
    double defaultDouble;
    char defaultChar;
    boolean defaultBoolean;
    
    public static void main(String[] args){
        DefaultValues instance = new DefaultValues();

    
        System.out.println("Default value of byte: " + instance.defaultByte);
        System.out.println("Default value of short: " + instance.defaultShort);
        System.out.println("Default value of int: " + instance.defaultInt);
        System.out.println("Default value of long: " + instance.defaultLong);
        System.out.println("Default value of float: " + instance.defaultFloat);
        System.out.println("Default value of double: " + instance.defaultDouble);
        System.out.println("Default value of char: '" + instance.defaultChar + "'");
        System.out.println("Default value of boolean: " + instance.defaultBoolean);
    }
}
