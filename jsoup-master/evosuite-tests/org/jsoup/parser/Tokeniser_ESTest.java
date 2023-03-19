/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 19 02:14:16 GMT 2023
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Token;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Tokeniser_ESTest extends Tokeniser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      ParseErrorList parseErrorList0 = new ParseErrorList(102, 102);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      tokeniser0.error("");
      assertEquals(1, parseErrorList0.size());
      assertFalse(parseErrorList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("W{8urmQUj\"");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      ParseErrorList parseErrorList0 = new ParseErrorList(38, 100);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      TokeniserState tokeniserState0 = TokeniserState.DoctypeSystemIdentifier_doubleQuoted;
      tokeniser0.eofError(tokeniserState0);
      assertEquals(1, parseErrorList0.size());
      assertFalse(parseErrorList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      TokeniserState tokeniserState0 = TokeniserState.ScriptDataDoubleEscapedLessthanSign;
      tokeniser0.eofError(tokeniserState0);
      assertTrue(parseErrorList0.isEmpty());
      assertEquals(0, parseErrorList0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("x|)}-mr");
      CharacterReader characterReader0 = new CharacterReader(stringReader0, 67);
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(67);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      TokeniserState tokeniserState0 = TokeniserState.RawtextEndTagOpen;
      tokeniser0.error(tokeniserState0);
      assertEquals(1, parseErrorList0.size());
      assertFalse(parseErrorList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      TokeniserState tokeniserState0 = TokeniserState.ScriptDataDoubleEscapeEnd;
      tokeniser0.error(tokeniserState0);
      assertEquals(0, parseErrorList0.size());
      assertTrue(parseErrorList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      CharacterReader characterReader0 = new CharacterReader("amp=12;1&gt=1q;3&lt=1o;2&quot=y;0&");
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      boolean boolean0 = tokeniser0.isAppropriateEndTagToken();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("org.jsoup.helper.StringUtil");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, (ParseErrorList) null);
      Token.Tag token_Tag0 = tokeniser0.createTagPending(false);
      assertNotNull(token_Tag0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("&lt;");
      CharacterReader characterReader0 = new CharacterReader(stringReader0, 47);
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(47);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      String string0 = tokeniser0.unescapeEntities(true);
      assertEquals(4, characterReader0.pos());
      assertEquals("<", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.tracking('a');
      CharacterReader characterReader0 = new CharacterReader("amp=12;1&gt=1q;3&lt=1o;2&quot=y;0&");
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      String string0 = tokeniser0.unescapeEntities(false);
      assertEquals(34, characterReader0.pos());
      assertEquals("amp=12;1>=1q;3<=1o;2\"=y;0&", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("W4;d_7i:P9");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      ParseErrorList parseErrorList0 = ParseErrorList.tracking((-3107));
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      tokeniser0.consumeCharacterReference((Character) null, true);
      assertEquals(0, parseErrorList0.size());
      assertTrue(parseErrorList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      CharacterReader characterReader0 = new CharacterReader("amp=12;1&gt=1q;3&lt=1o;2&quot=y;0&");
      characterReader0.advance();
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      int[] intArray0 = tokeniser0.consumeCharacterReference((Character) null, true);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.tracking('a');
      CharacterReader characterReader0 = new CharacterReader("amp=12;1&gt=1q;3&lt=1o;2&quot=y;0&");
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      Character character0 = Character.valueOf('*');
      tokeniser0.consumeCharacterReference(character0, true);
      assertEquals(0, parseErrorList0.size());
      assertTrue(parseErrorList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("#2>o\"kI}?wZ");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      Character character0 = new Character('x');
      tokeniser0.consumeCharacterReference(character0, true);
      assertEquals(2, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("#");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      ParseErrorList parseErrorList0 = new ParseErrorList(0, 13);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      Character character0 = new Character('r');
      tokeniser0.consumeCharacterReference(character0, true);
      assertEquals(1, parseErrorList0.size());
      assertFalse(parseErrorList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("&amp;");
      CharacterReader characterReader0 = new CharacterReader(stringReader0, 355);
      ParseErrorList parseErrorList0 = new ParseErrorList(355, 230);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      Character character0 = Character.valueOf('J');
      int[] intArray0 = tokeniser0.consumeCharacterReference(character0, true);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("W{8urmQUj\"");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      ParseErrorList parseErrorList0 = new ParseErrorList(38, 100);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      Character character0 = new Character('W');
      int[] intArray0 = tokeniser0.consumeCharacterReference(character0, false);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("S:e#&Oe");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, (ParseErrorList) null);
      tokeniser0.unescapeEntities(true);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("W4;d_7i:P9");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      ParseErrorList parseErrorList0 = ParseErrorList.tracking((-3107));
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.newAttribute();
      tokeniser0.emit(token_EndTag0);
      assertTrue(parseErrorList0.isEmpty());
      assertEquals(0, parseErrorList0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser((CharacterReader) null, parseErrorList0);
      Token.EndTag token_EndTag0 = new Token.EndTag();
      tokeniser0.emit(token_EndTag0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("Th>re is an unread token3pending!");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      tokeniser0.read();
      assertEquals(33, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("?>R0z$zqM8>?K2{, P");
      ParseErrorList parseErrorList0 = new ParseErrorList(6, 0);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      tokeniser0.emit("?>R0z$zqM8>?K2{, P");
      tokeniser0.read();
      assertEquals(18, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("S:e#&Oe");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, (ParseErrorList) null);
      char[] charArray0 = new char[3];
      tokeniser0.emit(charArray0);
      tokeniser0.emit(charArray0);
      tokeniser0.emit("S:e#&Oe");
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("attributeNameCharsSorted");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      ParseErrorList parseErrorList0 = new ParseErrorList(0, 102);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      tokeniser0.getState();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("S:e#&Oe");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, (ParseErrorList) null);
      tokeniser0.createDoctypePending();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      ParseErrorList parseErrorList0 = new ParseErrorList(102, 102);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      boolean boolean0 = tokeniser0.currentNodeInHtmlNS();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("S:e#&Oe");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, (ParseErrorList) null);
      tokeniser0.emitCommentPending();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("?>R0z$zqM8>?K2{, P");
      ParseErrorList parseErrorList0 = new ParseErrorList(6, 0);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      tokeniser0.emit('-');
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringReader stringReader0 = new StringReader("peZ3Nx~J");
      CharacterReader characterReader0 = new CharacterReader(stringReader0, 63);
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(63);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      TokeniserState tokeniserState0 = TokeniserState.ScriptDataEscapedEndTagName;
      tokeniser0.advanceTransition(tokeniserState0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringReader stringReader0 = new StringReader("S:e#&Oe");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, (ParseErrorList) null);
      // Undeclared exception!
      try { 
        tokeniser0.emit((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.Tokeniser", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("Th>re is an unread token3pending!");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      TokeniserState tokeniserState0 = TokeniserState.TagOpen;
      tokeniser0.transition(tokeniserState0);
      tokeniser0.read();
      boolean boolean0 = tokeniser0.isAppropriateEndTagToken();
      assertEquals(3, characterReader0.pos());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("6`IOs?@mjf/>TW*");
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, (ParseErrorList) null);
      tokeniser0.createCommentPending();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("RawtextLessthanSign");
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(0);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      tokeniser0.emitDoctypePending();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader("S:e#&Oe");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, (ParseErrorList) null);
      String string0 = tokeniser0.appropriateEndTagName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Lht4eNSAy]");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      tokeniser0.createTempBuffer();
  }
}