package ch01;

public class VIPCustomer extends Customer {
    private int agentID;
    double salesRatio;

    public int getAgentID() {
        return agentID;
    }

    public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }


}
