package sayHelloExtend;

public class European extends BasePerson {
    public European(String name) {
        super(name);
    }


    @Override
    public String getName() {
        return null;
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}