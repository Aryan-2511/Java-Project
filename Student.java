class Student{
    private String USN;
    private String name;
    public Student(String USN,String name){
        this.USN = USN;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getUSN(){
        return USN;
    }
    public void setUSN(String USN){
        this.USN = USN;
    }
    public void printDetails() {
    System.out.println("Name: " + this.name);
    System.out.println("USN: " + this.USN);
}
}
