public class Movie {
    private String title;
    private int year;
    private double score;

    public Movie(String title,int year,double score)
    {
        this.title=title;
        this.year=year;
        setScore(score);
    }

    public String getTitle(){
        return title;
    }
    
    public void setTitle(string title)
    {
        this.title=title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year){
        this.year=year;
    }

    public double getScore()
    {
        return score;
    }

    public void setScore(double newScore)
    {
        if(0.0 <= newScore && newScore <= 10.0)
            this.score=newScore;
        else if(newScore > 10.0)
            this.score= 10.0;
        else    
            this.score=0.0;
    }

    @Override
    public String toString(){
        return title+ ","+year+ ","+score;
    }
}