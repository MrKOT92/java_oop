 public abstract class School {
  private  String title;
  public abstract void teach(Person person);

   public School(String title) {
     this.title = title;
   }

   public String getTitle() {
     return title;
   }

   @Override
   public String toString() {
     return "School{" +
         "title='" + title + '\'' +
         '}';
   }
 }