package employee;

public class Certificate {
    String cerID,cerName,cerRank;

    public Certificate() {
    }

    public Certificate(String cerID, String cerName, String cerRank) {
        this.cerID = cerID;
        this.cerName = cerName;
        this.cerRank = cerRank;
    }

    public String getCerID() {
        return this.cerID;
    }

    public void setCerID(String cerID) {
        this.cerID = cerID;
    }

    public String getCerName() {
        return this.cerName;
    }

    public void setCerName(String cerName) {
        this.cerName = cerName;
    }

    public String getCerRank() {
        return this.cerRank;
    }

    public void setCerRank(String cerRank) {
        this.cerRank = cerRank;
    }
    @Override
    public String toString() {
        return "{" +
            " cerID='" + getCerID() + "'" +
            ", cerName='" + getCerName() + "'" +
            ", cerRank='" + getCerRank() + "'" +
            "}";
    }
}
