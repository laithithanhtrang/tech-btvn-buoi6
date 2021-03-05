
class Tester extends Staff {
    public int numBug;

    public Tester(String id, String name, String email, int salary, int numBug) {
        super(id, name, email, salary);
        this.numBug= numBug;
    }
	public Tester() {

    }
    public float getNumBug() {
        return numBug;
    }

    public void setNumBug(int numBug) {
        this.numBug = numBug;
    }
	public void salaryTester() {
        System.out.println("Luong cua Tester la: " + (this.getSalary() + this.numBug * 50000));
    }
 
}

