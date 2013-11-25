package edu.asu.nlp.reviewsummarizer.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by arun on 11/22/13.
 */
@Entity
@Table(name = "reviews", schema = "", catalog = "amazonreviews")
public class Review {
    private int reviewId;
    private String memberId;
    private String productId;
    private String date;
    private Integer helpfulFeedbacks;
    private Integer totalFeedbacks;
    private BigDecimal rating;
    private String title;
    private String body;


    public Review(){
        this("");
    }
    public Review(String reviewString){
        String[] review=reviewString.split("\\t");
        if(review.length==8){
            this.setMemberId(review[0]);
            this.setProductId(review[1]);
            this.setDate(review[2]);
            this.setHelpfulFeedbacks(Integer.parseInt(review[3]));
            this.setTotalFeedbacks(Integer.parseInt(review[4]));
            this.setRating(new BigDecimal(Double.parseDouble(review[5])));
            this.setTitle(review[6]);
            this.setBody(review[7]);
        }


    }

    @Id
    @Column(name = "review_id")
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    @Basic
    @Column(name = "member_id")
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    @Basic
    @Column(name = "product_id")
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "date")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Basic
    @Column(name = "helpful_feedbacks")
    public Integer getHelpfulFeedbacks() {
        return helpfulFeedbacks;
    }

    public void setHelpfulFeedbacks(Integer helpfulFeedbacks) {
        this.helpfulFeedbacks = helpfulFeedbacks;
    }

    @Basic
    @Column(name = "total_feedbacks")
    public Integer getTotalFeedbacks() {
        return totalFeedbacks;
    }

    public void setTotalFeedbacks(Integer totalFeedbacks) {
        this.totalFeedbacks = totalFeedbacks;
    }

    @Basic
    @Column(name = "rating")
    public BigDecimal getRating() {
        return rating;
    }

    public void setRating(BigDecimal rating) {
        this.rating = rating;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Review review = (Review) o;

        if (reviewId != review.reviewId) return false;
        if (body != null ? !body.equals(review.body) : review.body != null) return false;
        if (date != null ? !date.equals(review.date) : review.date != null) return false;
        if (helpfulFeedbacks != null ? !helpfulFeedbacks.equals(review.helpfulFeedbacks) : review.helpfulFeedbacks != null)
            return false;
        if (memberId != null ? !memberId.equals(review.memberId) : review.memberId != null) return false;
        if (productId != null ? !productId.equals(review.productId) : review.productId != null) return false;
        if (rating != null ? !rating.equals(review.rating) : review.rating != null) return false;
        if (title != null ? !title.equals(review.title) : review.title != null) return false;
        if (totalFeedbacks != null ? !totalFeedbacks.equals(review.totalFeedbacks) : review.totalFeedbacks != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = reviewId;
        result = 31 * result + (memberId != null ? memberId.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (helpfulFeedbacks != null ? helpfulFeedbacks.hashCode() : 0);
        result = 31 * result + (totalFeedbacks != null ? totalFeedbacks.hashCode() : 0);
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (body != null ? body.hashCode() : 0);
        return result;
    }
}
