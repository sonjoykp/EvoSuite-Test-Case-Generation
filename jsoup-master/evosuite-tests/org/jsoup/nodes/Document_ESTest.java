/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 19 02:03:00 GMT 2023
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Entities;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Document_ESTest extends Document_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      document_OutputSettings0.indentAmount(1364);
      assertEquals(1364, document_OutputSettings0.indentAmount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      // Undeclared exception!
      try { 
        document_OutputSettings0.indentAmount((-1608));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      document_OutputSettings0.encoder();
      CharsetEncoder charsetEncoder0 = document_OutputSettings0.encoder();
      assertEquals(1, document_OutputSettings0.indentAmount());
      assertNotNull(charsetEncoder0);
      assertFalse(document_OutputSettings0.outline());
      assertTrue(document_OutputSettings0.prettyPrint());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Document document0 = new Document("s");
      Document document1 = document0.normalise();
      Document.OutputSettings document_OutputSettings0 = document1.outputSettings();
      Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.xml;
      document_OutputSettings0.syntax(document_OutputSettings_Syntax0);
      Charset charset0 = Charset.defaultCharset();
      document1.charset(charset0);
      document1.normalise();
      assertEquals(2, document1.childNodeSize());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Document document0 = new Document("s");
      Document.OutputSettings document_OutputSettings0 = document0.outputSettings();
      document_OutputSettings0.syntax((Document.OutputSettings.Syntax) null);
      assertFalse(document0.updateMetaCharsetElement());
      
      Charset charset0 = Charset.defaultCharset();
      document0.charset(charset0);
      assertTrue(document0.updateMetaCharsetElement());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Document document0 = new Document("s");
      assertFalse(document0.updateMetaCharsetElement());
      
      Charset charset0 = Charset.defaultCharset();
      document0.charset(charset0);
      assertTrue(document0.updateMetaCharsetElement());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Document document0 = new Document("s");
      assertFalse(document0.updateMetaCharsetElement());
      
      document0.updateMetaCharsetElement(true);
      document0.normalise();
      Charset charset0 = Charset.defaultCharset();
      document0.charset(charset0);
      assertTrue(document0.updateMetaCharsetElement());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Document document0 = new Document("s");
      document0.appendElement("head");
      document0.normalise();
      assertEquals(1, document0.childNodeSize());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Document document0 = Document.createShell("s");
      document0.tagName("head");
      Charset charset0 = Charset.defaultCharset();
      document0.charset(charset0);
      // Undeclared exception!
      try { 
        document0.normalise();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Document", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Document document0 = new Document("s");
      document0.prependText("");
      document0.normalise();
      assertEquals(2, document0.childNodeSize());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Document document0 = Document.createShell("s");
      document0.prependText("[%s]");
      document0.normalise();
      assertEquals(1, document0.childNodeSize());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Document document0 = Document.createShell("Q-nrkf=ke");
      document0.title("a:>'X85_vvb$D:");
      document0.title("a:>'X85_vvb$D:");
      assertEquals(1, document0.childNodeSize());
      assertEquals("Q-nrkf=ke", document0.location());
      assertEquals("#document", document0.nodeName());
      assertFalse(document0.updateMetaCharsetElement());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Document document0 = Document.createShell("Q-nrkf=ke");
      document0.title("a:>'X85_vvb$D:");
      String string0 = document0.title();
      assertEquals("a:>'X85_vvb$D:", string0);
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals("Q-nrkf=ke", document0.location());
      assertEquals(1, document0.childNodeSize());
      assertEquals("#document", document0.nodeName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Document document0 = Document.createShell("LT'B4V");
      document0.title();
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals("LT'B4V", document0.location());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Document document0 = Document.createShell("");
      document0.location();
      assertFalse(document0.updateMetaCharsetElement());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Document document0 = new Document("F");
      boolean boolean0 = document0.updateMetaCharsetElement();
      assertEquals("F", document0.location());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Document document0 = Document.createShell(":matchText");
      document0.quirksMode();
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals(":matchText", document0.location());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Document document0 = new Document("");
      // Undeclared exception!
      try { 
        document0.text((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Document", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Document document0 = new Document("F");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document document1 = document0.outputSettings(document_OutputSettings0);
      assertEquals(1, document_OutputSettings0.indentAmount());
      assertTrue(document_OutputSettings0.prettyPrint());
      assertFalse(document_OutputSettings0.outline());
      assertFalse(document1.updateMetaCharsetElement());
      assertEquals("F", document1.location());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Document document0 = new Document("WQ");
      document0.createElement("M,Sks*^WU]ByKb");
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals("WQ", document0.location());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Document document0 = new Document("F");
      Document.QuirksMode document_QuirksMode0 = Document.QuirksMode.quirks;
      Document document1 = document0.quirksMode(document_QuirksMode0);
      assertEquals("F", document1.location());
      assertFalse(document1.updateMetaCharsetElement());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      boolean boolean0 = document_OutputSettings0.outline();
      assertEquals(1, document_OutputSettings0.indentAmount());
      assertFalse(boolean0);
      assertTrue(document_OutputSettings0.prettyPrint());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Document document0 = new Document("s");
      Document.OutputSettings document_OutputSettings0 = document0.outputSettings();
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.extended;
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.escapeMode(entities_EscapeMode0);
      assertEquals("s", document0.location());
      assertEquals(1, document_OutputSettings1.indentAmount());
      assertTrue(document_OutputSettings1.prettyPrint());
      assertFalse(document0.updateMetaCharsetElement());
      assertFalse(document_OutputSettings1.outline());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Document document0 = Document.createShell("LT'B4V");
      String string0 = document0.outerHtml();
      assertEquals("LT'B4V", document0.location());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals("<html>\n <head></head>\n <body></body>\n</html>", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.outline(false);
      assertTrue(document_OutputSettings1.prettyPrint());
      assertFalse(document_OutputSettings0.outline());
      assertEquals(1, document_OutputSettings1.indentAmount());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      assertTrue(document_OutputSettings0.prettyPrint());
      
      document_OutputSettings0.prettyPrint(false);
      assertFalse(document_OutputSettings0.prettyPrint());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Document document0 = Document.createShell("s");
      Document document1 = document0.clone();
      assertNotSame(document1, document0);
      assertEquals("s", document1.location());
      assertFalse(document1.updateMetaCharsetElement());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Document document0 = Document.createShell("s");
      Document.OutputSettings document_OutputSettings0 = document0.outputSettings();
      document_OutputSettings0.escapeMode();
      assertEquals("s", document0.location());
      assertFalse(document_OutputSettings0.outline());
      assertEquals(1, document_OutputSettings0.indentAmount());
      assertTrue(document_OutputSettings0.prettyPrint());
      assertFalse(document0.updateMetaCharsetElement());
  }
}