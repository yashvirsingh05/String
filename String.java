class String1 {
    public static void main(String[] agrs) {
        //CharAt method
        String n = "howtodojava";
        char c = n.charAt(0);
        System.out.println(c);
        for (int i = 0; i < n.length(); i++) {
            c = n.charAt(i);

            System.out.print(c + " ");
        }
        System.out.println(" ");
        // concat method
        {
            System.out.println(n.concat(" good programe"));
        }
        // CompareTOIgnoreCase method

        {
            String a = "howtodojavaprograme";
            System.out.println(n.compareToIgnoreCase(a));
        }
        //index Of method
        {
            System.out.println(n.indexOf('j'));
        }
        // replace method
        {
            System.out.println(n.replace('j', 'J'));
            System.out.println(n.replaceAll(n, "javabest"));
        }
    }
}