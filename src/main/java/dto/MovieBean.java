package dto;

import java.util.Arrays;

public class MovieBean {
private int movieid;
private String moviename;
private double movieprice;
private double movierating;
private String moviegenere;
private String movielanguage;
private byte[] movieimage;
public int getMovieid() {
	return movieid;
}
public void setMovieid(int movieid) {
	this.movieid = movieid;
}
public String getMoviename() {
	return moviename;
}
public void setMoviename(String moviename) {
	this.moviename = moviename;
}
public double getMovieprice() {
	return movieprice;
}
public void setMovieprice(double movieprice) {
	this.movieprice = movieprice;
}
public double getMovierating() {
	return movierating;
}
public void setMovierating(double movierating) {
	this.movierating = movierating;
}
public String getMoviegenere() {
	return moviegenere;
}
public void setMoviegenere(String moviegenere) {
	this.moviegenere = moviegenere;
}
public String getMovielanguage() {
	return movielanguage;
}
public void setMovielanguage(String movielanguage) {
	this.movielanguage = movielanguage;
}
public byte[] getMovieimage() {
	return movieimage;
}
@Override
public String toString() {
	return "MovieBean [movieid=" + movieid + ", moviename=" + moviename + ", movieprice=" + movieprice
			+ ", movierating=" + movierating + ", moviegenere=" + moviegenere + ", movielanguage=" + movielanguage
			+ ", movieimage=" + Arrays.toString(movieimage) + "]";
}
public void setMovieimage(byte[] movieimage) {
	this.movieimage = movieimage;
}
}
