package employee;

import java.util.*;
import Component.DateTime;
public class Experience extends Employee {
    int expyear;
    ArrayList<String> proSkill;
    public Experience(){}
    public Experience(int expyear, ArrayList<String> proSkill) {
        this.expyear = expyear;
        this.proSkill = proSkill;
    }
    public Experience(String id, String fullname , String phone , String email, DateTime birthday , ArrayList<Certificate> certificates , int expyear , ArrayList<String> proskill)
    {
        super(id, fullname, phone, email, birthday, certificates);
        this.expyear = expyear;
        this.proSkill = proSkill;
    }
    public int getExpyear() {
        return this.expyear;
    }

    public void setExpyear(int expyear) {
        this.expyear = expyear;
    }

    public ArrayList<String> getProSkill() {
        return this.proSkill;
    }

    public void setProSkill(ArrayList<String> proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "{" +
            " expyear='" + getExpyear() + "'" +
            ", proSkill='" + getProSkill() + "'" +
            "}";
    }

}
