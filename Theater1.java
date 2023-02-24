 class Theater1 {
    public static void main(String[] args) {
        MovieDetails md = new MovieDetails();
        md.addMovie1("ac04", "Jumbo", "Antony", 300);
        md.addMovie2("bc06", "RRR", "Rajamoli", 500);
        md.getMovie();
    }
}

class MovieDetails {
    private int mPrice1, mPrice2;
    private String mTicket1, mName1, mDirector1, mTicket2, mName2, mDirector2;

    public void addMovie1(String movieTicket, String movieName, String movieDirector, int moviePrice) {
        mTicket1 = movieTicket;
        mName1 = movieName;
        mDirector1 = movieDirector;
        mPrice1 = moviePrice;
    }

    public void addMovie2(String movieTicket, String movieName, String movieDirector, int moviePrice) {
        mTicket2 = movieTicket;
        mName2 = movieName;
        mDirector2 = movieDirector;
        mPrice2 = moviePrice;
    }

    public void getMovie() {
        System.out.println(mTicket1 + " movie name is " + mName1 + " which is directed by " + mDirector1 + " and it costs " + mPrice1 + " rs.");
        System.out.println(mTicket2 + " movie name is " + mName2 + " which is directed by " + mDirector2 + " and it costs " + mPrice2 + " rs.");
    }
}
