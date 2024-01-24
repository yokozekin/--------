public class SystenaEmployee {
    private String name;
    private String employeeNumber;
    String job;

    public SystenaEmployee(String name, String employeeNumber ,String job) {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.job = job;
        }

    public void operation(){
        System.out.println(job +"業務が中心です");
    }

    }