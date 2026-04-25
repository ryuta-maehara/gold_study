package chapter01.q01;

public class q01 {
    public static void main(String[] args) {

        // 8種類のプリミティブ型に対応するラッパークラス
        Byte byteValue = Byte.valueOf((byte) 10);
        Short shortValue = Short.valueOf((short) 100);
        Integer intValue = Integer.valueOf(1000);
        Long longValue = Long.valueOf(10000L);
        Float floatValue = Float.valueOf(1.25f);
        Double doubleValue = Double.valueOf(3.14159);
        Character charValue = Character.valueOf('A');
        Boolean boolValue = Boolean.valueOf(true);

        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Integer: " + intValue);
        System.out.println("Long: " + longValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Character: " + charValue);
        System.out.println("Boolean: " + boolValue);

        // オートボクシングとアンボクシングの例
        Integer boxed = 200;
        int unboxed = boxed;
        System.out.println("unboxed: " + unboxed);

        // 文字列から数値へ変換
        int parsedInt = Integer.parseInt("123");
        double parsedDouble = Double.parseDouble("2.5");
        System.out.println("parsedInt + parsedDouble = " + (parsedInt + parsedDouble));
    }

}
