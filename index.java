enum School
{
   Classes, Grades, Students;
}
/**
 * index
 */
public class index {

    public static void main(String[] args) {
        School school = School.Grades;
        System.out.println(school);
        System.out.println(school.ordinal());
        School[] arraySchool = School.values();
        for(School array : arraySchool){
            System.out.println(array + " " + array.ordinal());
        }
    }
}