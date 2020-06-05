enum TKN {
    INT,
    ADD,
    SUB,
    OPEN,
    CLOSE,
    END,
    ERROR,
}

abstract class TokenIF {
    TKN tkn;
    TokenIF(TKN tkn) { this.tkn = tkn; }
    abstract String getValue();
}

class IntToken extends TokenIF {
    String value;
    IntToken(String value) {
        super(TKN.INT);
        this.value = value;
    }
    String getValue() { return value; }
}

class Token extends TokenIF {
    Token(TKN tkn) { super(tkn); }
    String getValue() { throw new UnsupportedOperationException(); }
    static final Token ADD = new Token(TKN.ADD);
    static final Token SUB = new Token(TKN.SUB);
    static final Token OPEN = new Token(TKN.OPEN);
    static final Token CLOSE = new Token(TKN.CLOSE);
    static final Token END = new Token(TKN.END);
    static final Token ERROR = new Token(TKN.ERROR);
}
