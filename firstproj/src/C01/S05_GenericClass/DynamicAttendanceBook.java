package C01.S05_GenericClass;

public class DynamicAttendanceBook<T> {
    private T[] students;
    public int count;

    public DynamicAttendanceBook(int size) { // 생성자
        students =  (T[])new Object[size];
        count = 0;
    }

    public int insertStudent(T name) { // 입력
        if(students.length <= count){
            System.out.println("Could not insert : not enough space in this attendancebook");
            return 0;
        } else {
            students[count] = name;
            count++;            
            System.out.printf("The inserted student index is %d\n", count);
            return count;
        }
    }

    public void printStudent() { // 출력
        for (int i = 0; i < count; i++) {
            System.out.printf("%d:%s\n", i+1, students[i].toString());
        }        
    }

    public void deleteStudent(int studentIndex) { // 삭제 (index)
        for (int i = studentIndex-1; i < count; i++) {
            if(i+1 != count){
                students[i] = students[i+1];
            }
        }
        count--;
    }

    public void deleteStudent(T name) { // 삭제 (name)
        for (int i = 0; i < count; i++) {
            if (students[i]==name) {
                deleteStudent(i+1);
                System.out.printf("Succesfuly delete the student ( name == %s )\n", name);
                return;
            }           
        }
        System.out.printf("Does not exist the student ( name == %s )\n", name);
    }
}