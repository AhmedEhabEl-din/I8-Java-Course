package Super;

public class Thing extends BigThing{

    public void sayFromSuper(){
        super.say();
    }

    @Override
    public void say(){
        System.out.println("Hello from thing");
    }
}
