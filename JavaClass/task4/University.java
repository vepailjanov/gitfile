package JavaClass.task4;

public class University {
    int Teachers;
    int Students;
    Prices result;

    public String toString(){
        return "--------------------"+
                "Teachers amont : " + Teachers +
                "Students amont : " + Students +
                "POs amont : " + result.POs +
                "Students Paying amont : " + result.StudentsPay +
                "Teachers Paying amont : " + result.TeachersGetPaid ;
    }


}
