package Abstract;

import Fiqures.Figure;
import Fiqures.SayMyName;

public abstract class AbstractTestClass extends  Number implements  Figure , SayMyName {

    int number = 10;

    void saySomething(){

    }

    abstract void say();

}
