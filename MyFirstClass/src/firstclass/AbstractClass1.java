package firstclass;

public abstract class AbstractClass1 {
         int var1;
         String var2;
         
         AbstractClass1(int var1)  {
        	 this.var1 = var1;
         }
         
         abstract void display();
         abstract void display1();
         abstract void display2();
         
         void print() {
        	 System.out.println("Inside print method..");
         }
}
