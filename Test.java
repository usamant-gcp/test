class Test {
    public void HelloWorld() {
        System.out.println("Export name");
    }

    public void run() {
        int numLines = 7;
        for (int i = 0; i < numLines; ++i) {
            System.out.println(N[i] + "\t" + A[i] + "\t" + S[i]);
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.run();
    }

    private String[] N = {
            "N   N",
            "NN  N",
            "N N N",
            "N  NN",
            "N   N",
            "N   N",
            "N   N"
    };

    private String[] S = {
            " SSS ",
            "S   S",
            "S    ",
            " SSS ",
            "    S",
            "S   S",
            " SSS "

    };

    private String[] A = {
            "  A  ",
            " A A ",
            "A   A",
            "AAAAA",
            "A   A",
            "A   A",
            "A   A"
    };
};