@SpringBootApplication
public class MyCommandLineRunner implements CommandLineRunner {
   
   @Override
    public void run(String... args) throws Exception {
        System.out.println("Olá, Mundo!");
    }
}
