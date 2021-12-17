package polymorphism;

public class Father extends Person {
          private String job;
	


         public Father(String name, int age, String job) {
	    super(name,age);
	    this.job=job;
}
      public void showPerson() {
	     super.showPerson();		
	     System.out.println(" 직업:" + job);
}

		
	
}



