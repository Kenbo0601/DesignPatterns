import java.util.ArrayList;

class Parser {
    ArrayList<TokenIF> scan;
    int index;
    TokenIF current;
    void error(String message) { 
        System.out.println(message); 
        System.exit(1);
    }
    void getNext() { 
        current = scan.get(index++);
    }

    Expr parse(ArrayList<TokenIF> scan) {
        this.scan = scan;
        index = 0;
        getNext();
        Expr expr = expr();
        if(current.tkn == TKN.END)
            return expr;
        else {
            error("Unexpected token " + current);
            return null;
        }
    }

    Expr expr() {
        Expr left = term();
        while(current.tkn == TKN.ADD || current.tkn == TKN.SUB) {
            TokenIF token = current;
            getNext();
            Expr right = term();
            switch(token.tkn) {
                case ADD:
                    left = new Add(left,right);
                    break;
                case SUB:
                    left = new Sub(left,right);
                    break;
            }
        }
        return left;
    }

    Expr term() {
        if(current.tkn == TKN.INT) {
            int value = Integer.parseInt(current.getValue());
            getNext();
            return new Int(value);
        }
        else if(current.tkn == TKN.OPEN) {
            getNext();
            Expr expr = expr();
            if(current.tkn == TKN.CLOSE) {
                getNext();
                return expr;
            }
            else {
                error("Expected \")\" but found " + current.tkn);
                return null;
            }
        }
        else {
            error("Expected \" (\" but found " + current.tkn);
            return null;
        }
    }
}
