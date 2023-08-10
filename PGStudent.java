class PGStudent extends Student{
    private String specialization;
    final private String UGDegree;
    public PGStudent(String USN,String name,String specialization,String UGDegree){
        super(USN,name);
        this.specialization = specialization;
        this.UGDegree = UGDegree;
    }
    //Getter and Setter methods for all the variables of a student object are inherited from parent classes
    public String getSpecialization(){
        return specialization;
    }
    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }
    public String getUGDegree(){
        return UGDegree;
    }
    /*public void setUGDegree(String UGDegree){
        this.UGDegree = UGDegree;
    }*/
    public void printPGDetails() {
    super.printDetails();
    System.out.println("Specialization: " + this.specialization);
    System.out.println("UGDegree: " + this.UGDegree);
    }
    
}