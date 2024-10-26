public class Computer{
    class Processor{
        String name;
        int num;
        int price;
        public Processor(String name,int num,int price){
            this.name=name;
            this.num=num;
            this.price=price;
        }
        public void getDetails(){
            System.out.println("processor name:"+name);
            System.out.println("processor number:"+num);
            System.out.println("processor price"+price);
            
        }

    }
    public static void main(String[] args) {
        Computer c=new Computer();
        Computer.Processor p=c.new Processor("intel core i5",1223409,70000);
        p.getDetails();
    }
}