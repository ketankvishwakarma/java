package org.example.fp.code_01;

public class InitilizerBlock {

    {
        String a = "10";
        System.out.println(a+" --> "+System.identityHashCode(a));
    }
    public InitilizerBlock(){
        System.out.println("From constructor");
    }
    {
        String b = "10";
        System.out.println(b+" --> "+System.identityHashCode(b));
    }
}

class Demo{
    public static void main(String[] args) {
    var a = new InitilizerBlock();
    var b = new InitilizerBlock();
    }

}