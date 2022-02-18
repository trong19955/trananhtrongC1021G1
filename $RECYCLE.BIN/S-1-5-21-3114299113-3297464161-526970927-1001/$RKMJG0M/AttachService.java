package model;

public class AttachService {
    private int AttachServiceId;
    private String AttachServiceName;
    private double AttachServiceCost;
    private String AttachServiceUnit;
    private String attachServiceStatus;

    public AttachService() {
    }

    public AttachService(int attachServiceId, String attachServiceName, double attachServiceCost, String attachServiceUnit, String attachServiceStatus) {
        AttachServiceId = attachServiceId;
        AttachServiceName = attachServiceName;
        AttachServiceCost = attachServiceCost;
        AttachServiceUnit = attachServiceUnit;
        this.attachServiceStatus = attachServiceStatus;
    }

    public int getAttachServiceId() {
        return AttachServiceId;
    }

    public void setAttachServiceId(int attachServiceId) {
        AttachServiceId = attachServiceId;
    }

    public String getAttachServiceName() {
        return AttachServiceName;
    }

    public void setAttachServiceName(String attachServiceName) {
        AttachServiceName = attachServiceName;
    }

    public double getAttachServiceCost() {
        return AttachServiceCost;
    }

    public void setAttachServiceCost(double attachServiceCost) {
        AttachServiceCost = attachServiceCost;
    }

    public String getAttachServiceUnit() {
        return AttachServiceUnit;
    }

    public void setAttachServiceUnit(String attachServiceUnit) {
        AttachServiceUnit = attachServiceUnit;
    }

    public String getAttachServiceStatus() {
        return attachServiceStatus;
    }

    public void setAttachServiceStatus(String attachServiceStatus) {
        this.attachServiceStatus = attachServiceStatus;
    }
}
