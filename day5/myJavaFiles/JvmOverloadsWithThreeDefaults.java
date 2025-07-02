package day5.myJavaFiles;

import day5.myKotlinFiles.JvmOverloadsWithThreeDefaultsKt;

public class JvmOverloadsWithThreeDefaults {
    public static void main(String[] args){
        JvmOverloadsWithThreeDefaultsKt.printDetails();
        JvmOverloadsWithThreeDefaultsKt.printDetails("Rushi");
        JvmOverloadsWithThreeDefaultsKt.printDetails("Rushi",18);
    }
}
