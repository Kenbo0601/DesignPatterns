import java.util.*;

class Editor {
    Stack<CommandIF> history = new Stack<>();
    StringBuffer buffer = new StringBuffer("Hello world!");
    CommandIF [] command = {
        new Insert(3,'*'),
        new Delete(6),
        new History(),
        new Delete(7),
        new Undo(),
        new Undo(),
    };

    void simulate() {
        System.out.println(buffer);
        for(CommandIF c : command) {
            if (c instanceof Undo) {
                CommandIF last = history.pop();
                last.undo(buffer);
            } else if (c instanceof History) {
                for(Enumeration e = history.elements(); e.hasMoreElements(); )
                    System.out.println(e.nextElement());
            } else {
                c.execute(buffer);
                history.push(c);
            }
            System.out.println(buffer);            
        }
    }
}
