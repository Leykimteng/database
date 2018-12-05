package data;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner s = new Scanner(System.in);
//        student s1 = new student();
//        System.out.println("Enter ID And Name: ");
//        s1.setId(s.nextInt());
//        s1.setName(s.next());
//        System.out.println(s1.toString());
        
//        database.insert(s1);
//        ArrayList<student> arr = new ArrayList();
//        arr.add(s1);
//        arr.add(new student(1,"kimteng"));
//        arr.add(new student(2,"Chayrith"));
//        arr.add(new student(3,"Sopheak"));
//        database.insertmulti(arr);

//          student st = database.viewData(1);
//          System.out.println(st.toString());
          
        int i[] = {1,2,3,5,12,23};
        student st[] = database.viewmulti(i);
        for(int j=0;j<i.length;j++){
        System.out.println(st[j]);
        }
    }
}
