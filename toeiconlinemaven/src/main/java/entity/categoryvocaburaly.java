package entity;

import javax.persistence.Entity;

@Entity
public class categoryvocaburaly {
	private String id;
	private String categoryVocaburalyName;
	private String categoryVocaburalyImage;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCategoryVocaburalyName() {
		return categoryVocaburalyName;
	}
	public void setCategoryVocaburalyName(String categoryVocaburalyName) {
		this.categoryVocaburalyName = categoryVocaburalyName;
	}
	public String getCategoryVocaburalyImage() {
		return categoryVocaburalyImage;
	}
	public void setCategoryVocaburalyImage(String categoryVocaburalyImage) {
		this.categoryVocaburalyImage = categoryVocaburalyImage;
	}
	@Override
	public String toString() {
		return "categoryvocaburaly [id=" + id + ", categoryVocaburalyName=" + categoryVocaburalyName
				+ ", categoryVocaburalyImage=" + categoryVocaburalyImage + "]";
	}
	
	

}
