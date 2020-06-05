import java.util.ArrayList;

class Scanner {
    ArrayList<TokenIF> scan(String text) { 
        String [] parts = text.split("(?<=[^0-9])|(?=[^0-9])");
        for(String s : parts) 
            System.out.println(s);
        ArrayList<TokenIF> scan = new ArrayList<>();
        for(String s : parts) {
            if(s.matches("\\s")) {}
            else if(s.matches("\\(")) scan.add(Token.OPEN);
            else if(s.matches("\\)")) scan.add(Token.CLOSE);
            else if(s.matches("\\+")) scan.add(Token.ADD);
            else if(s.matches("-")) scan.add(Token.SUB);
            else if(s.matches("\\d+")) scan.add(new IntToken(s));
            else scan.add(Token.ERROR);
        } 
        scan.add(Token.END);
        return scan;
    }
}
