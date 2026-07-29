 class StudentCustomConcept {
    public int rollNo;
    public String Name;

    @Override
    public String toString() {
        return "StudentCustomConcept{" +
                "rollNo=" + rollNo +
                ", Name='" + Name + '\'' +
                '}';
    }

    public StudentCustomConcept(String name, int rollNo) {
        Name = name;
        this.rollNo = rollNo;
    }
}
