public class IteratorPatternDemo {

   public static void main(String[] args) {
       PositionService positionService = new PositionService();
       positionService.add(new Position(5,6));
       positionService.add(new Position(15,16));
       positionService.add(new Position(25,26));
       positionService.add(new Position(35,36));
       positionService.add(new Position(45,46));

       System.out.println("Position Iterator test:");
       MyIterator positionIterator = positionService.getIterator();
       while(positionIterator.hasMore()){
           System.out.println(positionIterator.next());
       }

       StudentService studentService = new StudentService();
       studentService.add(new Student("Abdelmalik GHOUBIR","2ND YEAR",1));
       studentService.add(new Student("Youssef Kaidi","2ND YEAR",2));
       studentService.add(new Student("Hammadi I3an3an","1ST YEAR",3));

       MyIterator studentIterator = studentService.getIterator();
       System.out.println("\nStudent Iterator test:");
       while(studentIterator.hasMore()){
           System.out.println(studentIterator.next());
       }
   }
}