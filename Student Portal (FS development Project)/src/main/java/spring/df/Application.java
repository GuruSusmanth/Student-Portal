package spring.df;
Import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Application {
	public static void main(String[] args) {
		
		// object created by programmer
	//	Fresher f = new Fresher();
	//	f.getSkilled();
	//	f.giveInterviews();
		// object created by spring
		
        AnnotationConfigApplicationContext context =
		new ClasspathXmlApplicationContext("SpringConfig.class");
        Fresher f= (fresher) context.getBean("fresh");
        f.getSkilled();
        f.giveInterviews();
	}
}
