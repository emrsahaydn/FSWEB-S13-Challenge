package org.example;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(int id,String fullName,String email,String password,String[] healthplans){
        this.id=id;
        this.fullName=fullName;
        this.email=email;
        this.password=password;
        this.healthPlans = (healthplans == null) ? new String[0] : healthplans;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getFullName(){
        return fullName;
    }
    public void  setFullName(String fullName){
        this.fullName=fullName;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String  email){
        this.email=email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String[] getHealthPlans(){
        return healthPlans;
    }
    public void setHealthPlans(String[] healthplans){
        this.healthPlans=healthplans;
    }

    public void addHealthPlan(int index, String name) {
        if (index < 0 || index >= healthPlans.length) {
            System.out.println("Hata: Geçersiz index. Dizi sınırları dışında: " + index);
        }
        else if (healthPlans[index] == null) {
            healthPlans[index] = name;
            System.out.println(index + " nolu indexe başarıyla eklendi: " + name);
        }
        else {
            System.out.println("Hata: " + index + " nolu index zaten dolu! (Mevcut: " + healthPlans[index] + ")");
        }
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", healthplans=" + java.util.Arrays.toString(healthPlans) +
                '}';
    }
}
