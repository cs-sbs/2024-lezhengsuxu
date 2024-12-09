package Person;

import BookRack.BookRack;
import Operation.IOperation;

public abstract class User {
    protected String name;
    protected IOperation[] iOperations;
    public abstract int menu();
    
    public User(String name) {
        this.name = name;
    }
    public void doOperation(int choice, BookRack bookRack) {
        IOperation ioperation = iOperations[choice];
        ioperation.work(bookRack);
    }
}
