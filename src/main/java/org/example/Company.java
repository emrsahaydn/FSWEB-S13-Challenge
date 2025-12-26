package org.example;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id,String name,double giro,String[] developerNames){
        this.id=id;
        this.name=name;
        if(giro<0){
            this.giro=0;
        }else{
            this.giro=giro;
        }
        this.developerNames=developerNames;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getGiro(){
        return giro;
    }
    public void setGiro(double giro){
        if (giro < 0) {
            this.giro = 0;
        } else {
            this.giro = giro;
        }
    }
    public String[] getDeveloperNames(){
        return developerNames;
    }
    public void setDeveloperNames(String[] developerNames){
        this.developerNames=developerNames;
    }

    public void addEmployee(int index, String name){
        if(index<0 || index>=developerNames.length){
            System.out.println("Hata: Geçersiz index. Dizi sınırları dışında: " + index);
        }else if(developerNames[index]==null){
            developerNames[index]=name;
            System.out.println(index + " nolu indexe başarıyla eklendi: " + name);
        }else{
            System.out.println("Hata: " + index + " nolu index zaten dolu! (Mevcut: " + developerNames[index] + ")");
        }
    }
    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + java.util.Arrays.toString(developerNames) +
                '}';
    }
}
