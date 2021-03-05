
class Dev extends Staff {
    public Float overTime;

    public Dev(String id, String name, String email, int salary, float overTime) {
        super(id, name, email, salary);
        this.overTime = overTime;
    }
	public Dev() {

    }
    public float getOverTime() {
        return overTime;
    }

    public void setOverTime(float overTime) {
        this.overTime = overTime;
    }
	public void salaryDev() {
        System.out.println("Luong cua Dev la: " + (this.getSalary() + this.overTime * 200000));
    }
 
}
