package bai3.entity;

public abstract class Certificate {
    String certificatedID;
    String certificateName;
    String certificateRank;
    int certificatedDate;

    public Certificate(String certificatedID, String certificateName, String certificateRank, int certificatedDate) {
        this.certificatedID = certificatedID;
        this.certificateName = certificateName;
        this.certificateRank = certificateRank;
        this.certificatedDate = certificatedDate;
    }

    public Certificate() {

    }

    public String getCertificatedID() {
        return certificatedID;
    }

    public void setCertificatedID(String certificatedID) {
        this.certificatedID = certificatedID;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "certificatedID='" + certificatedID + '\'' +
                ", certificateName='" + certificateName + '\'' +
                ", certificateRank='" + certificateRank + '\'' +
                ", certificatedDate=" + certificatedDate +
                '}';
    }
}
