package functionalinterface;
interface Shravani
{
    String name(String str);
}
interface Cooking
{
    void cook();
}
interface Multiply
{
    int Multiply(int a, int b);
}
public class LambdaEx {
    public static void main(String[] args) {
        Shravani S=(s) -> "Hi my name is shravani "+s;
        Cooking C=() -> System.out.println(" shravani is cooking....");
        Multiply M=(a,b)-> a*b;
        System.out.println(S.name("chikki"));
        C.cook();
       System.out.println( M.Multiply(5,6));
    }
}
