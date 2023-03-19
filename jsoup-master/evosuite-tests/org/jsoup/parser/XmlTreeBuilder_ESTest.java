/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 19 02:24:23 GMT 2023
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedReader;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Node;
import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Token;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XmlTreeBuilder_ESTest extends XmlTreeBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      xmlTreeBuilder0.parse("J:t", "J:t");
      xmlTreeBuilder0.processStartTag("J:t");
      xmlTreeBuilder0.processStartTag("<");
      boolean boolean0 = xmlTreeBuilder0.processEndTag("J:t");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      xmlTreeBuilder0.parse("J:t", "J:t");
      boolean boolean0 = xmlTreeBuilder0.processEndTag("J:t");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      Token.CData token_CData0 = new Token.CData("[\"RUW;");
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.insert(token_CData0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.TreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      Token.Comment token_Comment0 = new Token.Comment();
      token_Comment0.bogus = true;
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.insert(token_Comment0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.TreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      Token.Comment token_Comment0 = new Token.Comment();
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.insert(token_Comment0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.TreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      CharacterReader characterReader0 = new CharacterReader(" <%s>");
      ParseErrorList parseErrorList0 = new ParseErrorList(0, 1802);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      Token.StartTag token_StartTag0 = tokeniser0.startPending;
      Token.Tag token_Tag0 = token_StartTag0.reset();
      Token.TokenType token_TokenType0 = Token.TokenType.Doctype;
      token_Tag0.type = token_TokenType0;
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.process(token_Tag0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jsoup.parser.Token$StartTag cannot be cast to org.jsoup.parser.Token$Doctype
         //
         verifyException("org.jsoup.parser.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      PipedReader pipedReader0 = new PipedReader();
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.parse(pipedReader0, ">bqg}28;Y=");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.insert((Token.Doctype) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.XmlTreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      ParseErrorList parseErrorList0 = new ParseErrorList(0, 1802);
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      List<Node> list0 = xmlTreeBuilder0.parseFragment("", "", parseErrorList0, parseSettings0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.parse("hApSPChP<?^y", "hApSPChP<?^y");
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
