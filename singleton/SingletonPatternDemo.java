/**
 * PatterType: Creation
**/
public class SingletonPatternDemo {
    public static void main(String[] args){
        SingleObject obj = SingleObject.getInstance();

        obj.showMessage();
    }
}
