package test3;

public class Student {
    private String fullName;
    private String groupNumber;
    private int[] balls;

    public Student(String fullname, String groupNumber, int[] balls){
        this.fullName = fullname;
        this.groupNumber = groupNumber;
        this.balls = balls;
    }

    
    public String getFullname(){
        return fullName;
    }

    public String getGroupNumber(){
        return groupNumber;
    }

    public int[] getBall(){
        return balls;
    }

    public boolean hasExcelentBall(){
        for(int ball : balls){
            if(ball < 9){
                return false;
            }
        }return true;
    }
}

class Test{
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("ivan ivan ivanovich", "group 1", new int[]{9,10,9,10,10});
        students[1] = new Student("oleg oleg olegovich", "group 2", new int[]{10,10,10,10,10});
        students[2] = new Student("mary mariam marikov", "group 3", new int[]{4,5,6,7,8,6,7});
        students[3] = new Student("oskar uald oskarov", "group 4", new int[]{6,5,6,7,4,6,8});
        students[4] = new Student("aksanna aks osikov", "group 5", new int[]{9,5,6,7,8,6,8});
        students[5] = new Student("Сидорова Юлия Сергеевна", "group 6", new int[]{9, 9, 10, 9, 9});
        students[6] = new Student("Николаев Николай Николаевич", "group 3", new int[]{10, 8, 10, 7, 10});
        students[7] = new Student("Иванова Ольга Васильевна", "group 2", new int[]{9, 9, 9, 10, 9});
        students[8] = new Student("Петрова Анастасия Ивановна", "group 1", new int[]{10, 5, 10, 6, 10});
        students[9] = new Student("Петров Петр Петрович", "group 5", new int[]{8, 9, 10, 9, 10});
        System.out.println("Студенты оценками 9 или 10:");

        for(Student student : students){
            if(student.hasExcelentBall()){
                System.out.println("Фамилия и инициалы: " + student.getFullname());
                System.out.println("Номер группы: "+ student.getGroupNumber());
                System.out.println();
            }
        }
    }
}