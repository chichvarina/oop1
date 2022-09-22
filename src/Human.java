public class Human {
  private String name;
  private String town;
  private int yearOfBirth;

  private String job;

  public Human (String name,String town,int yearOfBirth,String job ){
    this.name=name;
    this.town=town;
    this.yearOfBirth=yearOfBirth;
    this.job=job;
  }

  @Override
  public String toString(){
   return  "Привет! Меня зовут " +name+". Я из города "+town+". Я родился в "+yearOfBirth+ " году. " +
           "Я работаю на должности "+job+". Будем знакомы!";
  }

}
