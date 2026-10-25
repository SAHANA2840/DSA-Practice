 class PC{
    public static void main(String[] args) {
        String[] input1 = {"eio"};
        int input2 = 1;

        int max = 0;

        for (int i = 0; i < input2; i++) {
            String s = input1[i].toLowerCase();
            int count = 0;

            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j); //charAt(j)-->

                if (ch != 'a' && ch != 'e' && ch != 'i'
                        && ch != 'o' && ch != 'u') {
                    count++;
                }
            }

            if (count > 0) {
                int permutations = 1;

                for (int j = 1; j <= count; j++) {
                    permutations *= j;
                }

                if (permutations > max) {
                    max = permutations;
                }
            }
        }

        System.out.println(max);
    }
}
