/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmet
 */
public class Customer extends Person{
     private String startDate;
    private String finishDate;
    private String memberType;
    
    
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
    public String getMemberType() {
        return memberType;
    }

    /**
     * @param seatType the seatType to set
     */
    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }
}
