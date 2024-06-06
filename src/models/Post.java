package models;

public class Post {
    private Long uniqueId;
    private String imageUrl;
    private String description;

    public Post(Long uniqueId, String imageUrl, String description) {
        this.uniqueId = uniqueId;
        this.imageUrl = imageUrl;
        this.description = description;
    }

    public Long getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(Long uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Post{" +
                "uniqueId=" + uniqueId +
                ", imageUrl='" + imageUrl + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
