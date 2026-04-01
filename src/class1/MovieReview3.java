package class1;

public  class MovieReview3 {

    private String title;
    private String review;

    public MovieReview3(String title, String review) {
        this.title = title;
        this.review = review;
    }

    public String getTitle() {
        return title;
    }

    public String getReview() {
        return review;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public void showMovieReview() {
        System.out.println("영화 제목: " + title + ", 리뷰: " + review);
    }
}
