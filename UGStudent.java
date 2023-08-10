class UGStudent extends Student{
    private int semester;
    private String branch;
    public UGStudent(String USN,String name,int semester,String branch){
        super(USN,name);
        this.semester = semester;
        this.branch = branch;
    }
    //Getter and Setter methods for all the variables of a student object are inherited from parent classes
    public String getBranch(){
        return branch;
    }
    public void setBranch(String branch){
        this.branch = branch;
    }
    public int getSemester(){
        return semester;
    }
    public void setSemester(int semester){
        this.semester = semester;
    }
    //Method to print the details of the pg student
    public void printUGDetails() {
        super.printDetails();
        System.out.println("Semester: " + this.semester);
        System.out.println("Branch: " + this.branch);
    }

}