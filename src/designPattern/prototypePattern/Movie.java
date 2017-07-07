package designPattern.prototypePattern;

public class Movie implements PrototypeCapable{
	
	private String movieName;

	@Override
	public Movie clone() throws CloneNotSupportedException{
		System.out.println("Cloning movie...");	
		return (Movie) super.clone();
	}
	
	/**
	 * @return the movieName
	 */
	public String getMovieName() {
		return movieName;
	}

	/**
	 * @param movieName the movieName to set
	 */
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + "]";
	}
	
	
	
}
