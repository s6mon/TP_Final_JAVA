/* Generated By:JavaCC: Do not edit this line. ReaderTokenManager.java */
package reader;
import Circuit.*;

/** Token Manager. */
public class ReaderTokenManager implements ReaderConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x1000000L) != 0L)
            return 24;
         if ((active0 & 0x400000L) != 0L)
            return 59;
         return -1;
      case 1:
         if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 1;
            return 58;
         }
         if ((active0 & 0x1000000L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 1;
            return 63;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 35:
         return jjStopAtPos(0, 11);
      case 40:
         return jjStopAtPos(0, 5);
      case 41:
         return jjStopAtPos(0, 6);
      case 44:
         return jjStopAtPos(0, 13);
      case 45:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 60:
         return jjStopAtPos(0, 9);
      case 62:
         return jjStopAtPos(0, 10);
      case 76:
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 79:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 91:
         return jjStopAtPos(0, 7);
      case 93:
         return jjStopAtPos(0, 8);
      case 124:
         return jjStopAtPos(0, 16);
      default :
         return jjMoveNfa_0(1, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 62:
         if ((active0 & 0x1000L) != 0L)
            return jjStopAtPos(1, 12);
         break;
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 100:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(2, 15, 2);
         break;
      case 120:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(2, 15, 2);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 63;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 24:
               case 2:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 15)
                     kind = 15;
                  jjCheckNAdd(2);
                  break;
               case 1:
               case 0:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 14)
                     kind = 14;
                  jjCheckNAdd(0);
                  break;
               case 63:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 15)
                     kind = 15;
                  jjCheckNAdd(2);
                  break;
               case 58:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 15)
                     kind = 15;
                  jjCheckNAdd(2);
                  break;
               case 59:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 15)
                     kind = 15;
                  jjCheckNAdd(2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 24:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 15)
                        kind = 15;
                     jjCheckNAdd(2);
                  }
                  if (curChar == 101)
                     jjCheckNAdd(25);
                  if (curChar == 101)
                     jjCheckNAdd(23);
                  break;
               case 1:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAdd(2);
                  if (curChar == 79)
                     jjAddStates(0, 3);
                  else if (curChar == 71)
                     jjAddStates(4, 6);
                  else if (curChar == 86)
                     jjAddStates(7, 9);
                  else if (curChar == 73)
                     jjAddStates(10, 12);
                  else if (curChar == 69)
                     jjAddStates(13, 15);
                  else if (curChar == 78)
                     jjAddStates(16, 18);
                  else if (curChar == 76)
                     jjAddStates(19, 20);
                  else if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 20;
                  else if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 14;
                  else if (curChar == 98)
                     jjstateSet[jjnewStateCnt++] = 8;
                  else if (curChar == 104)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 63:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 15)
                        kind = 15;
                     jjCheckNAdd(2);
                  }
                  if (curChar == 100)
                  {
                     if (kind > 23)
                        kind = 23;
                  }
                  if (curChar == 100)
                  {
                     if (kind > 19)
                        kind = 19;
                  }
                  break;
               case 58:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 15)
                        kind = 15;
                     jjCheckNAdd(2);
                  }
                  if (curChar == 120)
                  {
                     if (kind > 19)
                        kind = 19;
                  }
                  break;
               case 59:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 15)
                        kind = 15;
                     jjCheckNAdd(2);
                  }
                  if (curChar == 117)
                  {
                     if (kind > 26)
                        kind = 26;
                  }
                  if (curChar == 117)
                  {
                     if (kind > 23)
                        kind = 23;
                  }
                  if (curChar == 117)
                  {
                     if (kind > 19)
                        kind = 19;
                  }
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 58;
                  break;
               case 2:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 15)
                     kind = 15;
                  jjCheckNAdd(2);
                  break;
               case 3:
                  if (curChar == 116 && kind > 20)
                     kind = 20;
                  break;
               case 4:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 5:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 6:
                  if (curChar == 104)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 7:
                  if (curChar == 115 && kind > 20)
                     kind = 20;
                  break;
               case 8:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 9:
                  if (curChar == 98)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  if (curChar == 116 && kind > 21)
                     kind = 21;
                  break;
               case 11:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 13:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 14:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 15:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 16:
                  if (curChar == 101 && kind > 21)
                     kind = 21;
                  break;
               case 17:
                  if (curChar == 109)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 18:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 19:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 20:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 21:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 22:
                  if (curChar == 76)
                     jjAddStates(19, 20);
                  break;
               case 23:
                  if (curChar == 100 && kind > 19)
                     kind = 19;
                  break;
               case 25:
                  if (curChar == 100 && kind > 23)
                     kind = 23;
                  break;
               case 26:
                  if (curChar == 101)
                     jjCheckNAdd(25);
                  break;
               case 27:
                  if (curChar == 78)
                     jjAddStates(16, 18);
                  break;
               case 28:
                  if (curChar == 110 && kind > 19)
                     kind = 19;
                  break;
               case 29:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 30:
                  if (curChar == 110 && kind > 23)
                     kind = 23;
                  break;
               case 31:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 32:
                  if (curChar == 110 && kind > 26)
                     kind = 26;
                  break;
               case 33:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 32;
                  break;
               case 34:
                  if (curChar == 69)
                     jjAddStates(13, 15);
                  break;
               case 35:
                  if (curChar == 116 && kind > 19)
                     kind = 19;
                  break;
               case 36:
                  if (curChar == 116 && kind > 23)
                     kind = 23;
                  break;
               case 37:
                  if (curChar == 116 && kind > 26)
                     kind = 26;
                  break;
               case 38:
                  if (curChar == 73)
                     jjAddStates(10, 12);
                  break;
               case 39:
                  if (curChar == 114 && kind > 19)
                     kind = 19;
                  break;
               case 40:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 39;
                  break;
               case 41:
                  if (curChar == 114 && kind > 23)
                     kind = 23;
                  break;
               case 42:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 41;
                  break;
               case 43:
                  if (curChar == 114 && kind > 25)
                     kind = 25;
                  break;
               case 44:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 43;
                  break;
               case 45:
                  if (curChar == 86)
                     jjAddStates(7, 9);
                  break;
               case 46:
                  if (curChar == 99 && kind > 19)
                     kind = 19;
                  break;
               case 47:
                  if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 46;
                  break;
               case 48:
                  if (curChar == 99 && kind > 23)
                     kind = 23;
                  break;
               case 49:
                  if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 48;
                  break;
               case 50:
                  if (curChar == 99 && kind > 25)
                     kind = 25;
                  break;
               case 51:
                  if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 50;
                  break;
               case 52:
                  if (curChar == 71)
                     jjAddStates(4, 6);
                  break;
               case 53:
                  if (curChar == 110)
                     jjCheckNAdd(23);
                  break;
               case 54:
                  if (curChar == 110)
                     jjCheckNAdd(25);
                  break;
               case 55:
                  if (curChar == 100 && kind > 25)
                     kind = 25;
                  break;
               case 56:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 55;
                  break;
               case 57:
                  if (curChar == 79)
                     jjAddStates(0, 3);
                  break;
               case 60:
                  if (curChar == 117 && kind > 19)
                     kind = 19;
                  break;
               case 61:
                  if (curChar == 117 && kind > 23)
                     kind = 23;
                  break;
               case 62:
                  if (curChar == 117 && kind > 26)
                     kind = 26;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 63 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   59, 60, 61, 62, 53, 54, 56, 47, 49, 51, 40, 42, 44, 35, 36, 37, 
   29, 31, 33, 24, 26, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\50", "\51", "\133", "\135", "\74", "\76", "\43", 
"\55\76", "\54", null, null, "\174", null, null, null, null, null, "\117\165\170", null, 
"\114\145\144", null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x7f9ffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[63];
private final int[] jjstateSet = new int[126];
protected char curChar;
/** Constructor. */
public ReaderTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public ReaderTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 63; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
