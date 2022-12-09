
package neu.edu.csye6200.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student extends Person{
    private int stuId;
    private int age;//monthly age
    private String fatherName;
    private String motherName;
    private String address;
    private long phoneNum;
    private List<Immunization> immunizations;
    
     public Student(){
        
    }
            
            
    public Student(String firstName, String lastName,Date registerTime,int stuId, int age, String fatherName, String motherName, String address, long phoneNum) {
        this.stuId = stuId;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.registerTime = registerTime;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.address = address;
        this.phoneNum = phoneNum;
        immunizations =  new ArrayList<>();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhooneNum(long phooneNum) {
        this.phoneNum = phooneNum;
    }
    
    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public List<Immunization> getImmunizations() {
        return immunizations;
    }

    public void setImmunizations(List<Immunization> immunizations) {
        this.immunizations = immunizations;
    }
    
    public String toString(){
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(registerTime);
       return  firstName + "," + lastName +","+date+","+stuId+","+ age+ "," + fatherName +","+ motherName + "," + address +","+ phoneNum;
    }

}
