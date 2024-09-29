class Hamming {

    private String s1;
    private String s2;

    public Hamming(String s1,String s2) 
    {
        this.s1=s1;
        this.s2=s2;
    }

    
    public int getDistance() {
        if (s1.length() != s2.length()) {
            return -1;
        }

        int distance = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                distance++;
            }
        }

        return distance;
    }

    public static void main(String[] args) {
        Hamming hamming=new Hamming("toned","roses");
        int diff = hamming.getDistance();
        if (diff == -1) {
            System.out.println("A két sztringnek azonos hosszúságúnak kell lennie.");
        } else {
            System.out.println("A Hamming-távolság: " + diff);
        }
    }
}
