package entity;

import util.Deliverable;

public class Serie implements Deliverable {

    private String title;
    private Integer numberOfSeasons;
    private Boolean delivered;
    private String kind;
    private String creator;

    public Serie() {
        this.title = "";
        this.numberOfSeasons = 3;
        this.delivered = false;
        this.kind = "";
        this.creator = "";
    }

    public Serie(String title, String creator) {
        this.title = title;
        this.numberOfSeasons = 3;
        this.delivered = false;
        this.kind = "";
        this.creator = creator;
    }

    public Serie(String title, Integer numberOfSeasons, String kind, String creator) {
        this.title = title;
        this.numberOfSeasons = numberOfSeasons;
        this.kind = kind;
        this.creator = creator;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(Integer numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "title='" + title + '\'' +
                ", numberOfSeasons=" + numberOfSeasons +
                ", delivered=" + delivered +
                ", kind='" + kind + '\'' +
                ", creator='" + creator + '\'' +
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
    public Serie compareTo(Object a) {
        if (((Serie) a).numberOfSeasons > this.numberOfSeasons) {
            return (Serie) a;
        }
        return this;
    }
}
