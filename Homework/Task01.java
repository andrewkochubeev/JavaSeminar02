package Homework;

/**
 * Task01
 */
public class Task01 {

    public static void main(String[] args) {
        String sqlString = "select * from students where ";
        // String jsonFilter =  {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
        StringBuilder sb = new StringBuilder(sqlString);
        sb.append("\"name\" = \"Ivanov\" ");
        sb.append("and \"country\" = \"Russia\" ");
        sb.append("and \"city\" = \"Moscow\"");
        System.out.println(sb.toString());

    }
}