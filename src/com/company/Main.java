package com.company;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> myListInt = new MyList<>();
        myListInt.add(52);
        myListInt.add(15);
        myListInt.add(-10);
        myListInt.add(-24);
        myListInt.add(45);


        System.out.println(myListInt.toString());
        System.out.println(myListInt.highest());
        System.out.println(myListInt.lowest());

        MyList<String> myListStr = new MyList<>();
        myListStr.add("AAA");
        myListStr.add("ZZZ");
        myListStr.add("WWW");
        myListStr.add("PPP");
        myListStr.add("OOO");

        System.out.println(myListStr.toString());
        System.out.println(myListStr.highest());
        System.out.println(myListStr.lowest());

        MyList<Character> myListChar = new MyList<>();
        myListChar.add('c');
        myListChar.add('k');
        myListChar.add('e');
        myListChar.add('w');
        myListChar.add('l');

        System.out.println(myListChar.toString());
        System.out.println(myListChar.highest());
        System.out.println(myListChar.lowest());
    }
}


