package entity;

import util.Deliverable;

public class VideoGame implements Deliverable {

    private String title;
    private Double estimatedHours;
    private Boolean delivered;
    private String kind;
    private String company;

    public VideoGame() {
        this.title = "";
        this.estimatedHours = 10.0;
        this.delivered = false;
        this.kind = "";
        this.company = "";
    }

    public VideoGame(String title, Double estimatedHours) {
        this.title = title;
        this.estimatedHours = estimatedHours;
        this.delivered = false;
        this.kind = "";
        this.company = "";
    }

    public VideoGame(String title, Double estimatedHours, String kind, String company) {
        this.title = title;
        this.estimatedHours = estimatedHours;
        this.kind = kind;
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getEstimatedHours() {
        return estimatedHours;
    }

    public void setEstimatedHours(Double estimatedHours) {
        this.estimatedHours = estimatedHours;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "title='" + title + '\'' +
                ", estimatedHours=" + estimatedHours +
                ", delivered=" + delivered +
                ", kind='" + kind + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    @Override
    public void deliver() {
        this.delivered = true;
    }

    @Override
    public void sendBack() {
        this.delivered = false;
    }

    @Override
    public Boolean isDelivered() {
        return this.delivered;
    }

    @Override
    public VideoGame compareTo(Object a) {
        if (((VideoGame) a).estimatedHours > this.estimatedHours) {
            return (VideoGame) a;
        }
        return this;
    }
}
