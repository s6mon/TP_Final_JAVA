/* Generated By:JavaCC: Do not edit this line. Reader.java */
package reader;

import Circuit.*;

public class Reader extends ReaderUtilities implements ReaderConstants {
        public _Circuit read() throws Exception {return DEF_CIRCUIT(); }

/*int DEF_CIRCUIT() : {
  final public void NB_CONNEXION_IN_OUT() throws ParseException {
    jj_consume_token(PARO);
    jj_consume_token(NUM);
    jj_consume_token(VIRGULE);
    jj_consume_token(NUM);
    jj_consume_token(PARF);
  }

  final public int DEF_COMPOSITE() throws ParseException {
    jj_consume_token(CADO);
    jj_consume_token(NUM);
    jj_consume_token(PIPE);
    NB_CONNEXION_IN_OUT();
    jj_consume_token(CROO);
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case DIESE:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      INFO_CONNEXION();
    }
    label_2:
    while (true) {
      DEF_COMPOSANT();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case CADO:
        ;
        break;
      default:
        jj_la1[1] = jj_gen;
        break label_2;
      }
    }
    jj_consume_token(CROF);
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case FLECHE:
        ;
        break;
      default:
        jj_la1[2] = jj_gen;
        break label_3;
      }
      jj_consume_token(FLECHE);
      label_4:
      while (true) {
        INFO_CONNEXION();
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case DIESE:
          ;
          break;
        default:
          jj_la1[3] = jj_gen;
          break label_4;
        }
      }
    }
  }

  final public int DEF_COMPOSANT() throws ParseException {
    jj_consume_token(CADO);
    jj_consume_token(NUM);
    jj_consume_token(PIPE);
    jj_consume_token(COMPOSANT);
    NB_CONNEXION_IN_OUT();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ETAT_ITR:
    case ETAT_LED:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ETAT_ITR:
        jj_consume_token(ETAT_ITR);
        break;
      case ETAT_LED:
        jj_consume_token(ETAT_LED);
        break;
      default:
        jj_la1[4] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    default:
      jj_la1[5] = jj_gen;
      ;
    }
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case FLECHE:
        ;
        break;
      default:
        jj_la1[6] = jj_gen;
        break label_5;
      }
      jj_consume_token(FLECHE);
      label_6:
      while (true) {
        INFO_CONNEXION();
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case DIESE:
          ;
          break;
        default:
          jj_la1[7] = jj_gen;
          break label_6;
        }
      }
    }
    jj_consume_token(CADF);
  }

  final public void INFO_CONNEXION() throws ParseException {
    jj_consume_token(DIESE);
    jj_consume_token(NUM);
    jj_consume_token(PARO);
    jj_consume_token(NUM);
    jj_consume_token(DIESE);
    jj_consume_token(NUM);
    label_7:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case VIRGULE:
        ;
        break;
      default:
        jj_la1[8] = jj_gen;
        break label_7;
      }
      jj_consume_token(VIRGULE);
      jj_consume_token(NUM);
      jj_consume_token(DIESE);
      jj_consume_token(NUM);
    }
  }

  /** Generated Token Manager. */
  public ReaderTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[9];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x800,0x200,0x1000,0x800,0x300000,0x300000,0x1000,0x800,0x2000,};
   }

  /** Constructor with InputStream. */
  public Reader(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Reader(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new ReaderTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 9; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 9; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Reader(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new ReaderTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 9; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 9; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Reader(ReaderTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 9; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(ReaderTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 9; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[27];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 9; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 27; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}