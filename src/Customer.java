/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Customer extends Person{
    private String startDate;
    private String finishDate;
    private String subScription;
    private String amount;
    
    
    
    public float bodyMassIndex(Person p){
        float indeks;
        indeks=(p.getWeight()/(p.getHeight()*p.getHeight()));
        return indeks;
    }

    /**
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the finishDate
     */
    public String getFinishDate() {
        return finishDate;
    }

    /**
     * @param finishDate the finishDate to set
     */
    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }

    /**
     * @return the seatType
     */
    

    /**
     * @return the subScription
     */
    public String getSubScription() {
        return subScription;
    }

    /**
     * @param subScription the subScription to set
     */
    public void setSubScription(String subScription) {
        this.subScription = subScription;
    }

    /**
     * @return the amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }
}
