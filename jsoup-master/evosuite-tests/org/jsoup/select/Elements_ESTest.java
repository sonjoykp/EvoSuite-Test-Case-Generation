/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 19 02:38:51 GMT 2023
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.PseudoTextElement;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeVisitor;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Elements_ESTest extends Elements_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf("}", parseSettings0);
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "}", attributes0);
      Elements elements0 = formElement0.getElementsMatchingOwnText("");
      List<FormElement> list0 = elements0.forms();
      assertTrue(list0.contains(formElement0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Document document0 = Document.createShell("x");
      Elements elements0 = document0.getAllElements();
      List<FormElement> list0 = elements0.forms();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Elements elements0 = new Elements();
      Element element0 = elements0.last();
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Document document0 = Document.createShell("x");
      Elements elements0 = document0.getAllElements();
      Element element0 = elements0.last();
      assertEquals("body", element0.tagName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Document document0 = Document.createShell("x");
      Elements elements0 = document0.getAllElements();
      Elements elements1 = elements0.prevAll();
      assertEquals(1, elements1.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Document document0 = Document.createShell(" ");
      Elements elements0 = document0.getElementsMatchingText("");
      boolean boolean0 = elements0.is("FYrCm5-|g*");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Document document0 = Document.createShell(" ");
      Elements elements0 = document0.getElementsMatchingText("");
      boolean boolean0 = elements0.is("*");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Elements elements0 = new Elements();
      // Undeclared exception!
      try { 
        elements0.eq((-692));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Document document0 = Document.createShell("x");
      Elements elements0 = document0.getElementsByIndexGreaterThan(80);
      Elements elements1 = elements0.eq(183);
      assertTrue(elements1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Document document0 = Document.createShell("t^h");
      Elements elements0 = document0.getElementsByAttributeValueMatching("t^h", "t^h");
      Elements elements1 = elements0.remove();
      assertEquals(0, elements1.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Document document0 = Document.createShell("x");
      Elements elements0 = document0.getAllElements();
      // Undeclared exception!
      try { 
        elements0.remove();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Document document0 = new Document("");
      Elements elements0 = document0.getElementsContainingText("");
      Elements elements1 = elements0.empty();
      assertEquals(1, elements1.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Document document0 = Document.createShell("92*y%6@d7g4&BRCW");
      Elements elements0 = document0.getElementsByAttributeStarting("92*y%6@d7g4&BRCW");
      Elements elements1 = elements0.unwrap();
      assertTrue(elements1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Element[] elementArray0 = new Element[3];
      Elements elements0 = new Elements(elementArray0);
      // Undeclared exception!
      try { 
        elements0.unwrap();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.select.Elements", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Document document0 = Document.createShell("t^h");
      Elements elements0 = document0.getElementsByAttributeValueMatching("t^h", "t^h");
      Elements elements1 = elements0.wrap("t^h");
      assertSame(elements0, elements1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Element element0 = new Element("math");
      Elements elements0 = element0.getAllElements();
      // Undeclared exception!
      try { 
        elements0.wrap("org.jsoup.select.StructuralEvaluator$Parent");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Element element0 = new Element("ky0H|i7@.=(xS~i7Y");
      Elements elements0 = element0.siblingElements();
      Elements elements1 = elements0.after("M#;c0.bT=mx<)7Xyp");
      assertEquals(0, elements1.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Document document0 = Document.createShell("x");
      Elements elements0 = document0.getAllElements();
      // Undeclared exception!
      try { 
        elements0.after("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Tag tag0 = Tag.valueOf("org.jsoup.select.Elements");
      Attributes attributes0 = new Attributes();
      PseudoTextElement pseudoTextElement0 = new PseudoTextElement(tag0, "org.jsoup.select.Elements", attributes0);
      Elements elements0 = pseudoTextElement0.getElementsByIndexLessThan(0);
      Elements elements1 = elements0.before("o UO -VDC:AW6x");
      assertSame(elements1, elements0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Document document0 = new Document("a_Eu");
      Elements elements0 = document0.getElementsContainingOwnText((String) null);
      // Undeclared exception!
      try { 
        elements0.before((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Document document0 = Document.createShell("92*y%6@d7g4&BRCW");
      Elements elements0 = document0.getAllElements();
      elements0.prepend("92*y%6@d7g4&BRCW");
      assertEquals(2, document0.childNodeSize());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Tag tag0 = Tag.valueOf(")h<Ce%L}qC a8A:9");
      Element element0 = new Element(tag0, ")h<Ce%L}qC a8A:9");
      Elements elements0 = element0.getElementsByAttributeValueNot(")h<Ce%L}qC a8A:9", ")h<Ce%L}qC a8A:9");
      Elements elements1 = elements0.html("");
      assertFalse(elements1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Element element0 = new Element("ky0H|i7@.=(xS~i7Y");
      Elements elements0 = element0.siblingElements();
      Elements elements1 = elements0.tagName("ky0H|i7@.=(xS~i7Y");
      assertTrue(elements1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Element[] elementArray0 = new Element[1];
      Elements elements0 = new Elements(elementArray0);
      // Undeclared exception!
      try { 
        elements0.tagName("(z4z{\"kMCi");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.select.Elements", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Tag tag0 = Tag.valueOf(")h<Ce%L}qC a8A:9");
      Element element0 = new Element(tag0, ")h<Ce%L}qC a8A:9");
      Elements elements0 = element0.getElementsByAttributeValueNot(")h<Ce%L}qC a8A:9", ")h<Ce%L}qC a8A:9");
      elements0.addAll((Collection<? extends Element>) elements0);
      String string0 = elements0.outerHtml();
      assertEquals("<)h<Ce%L}qC a8A:9></)h<Ce%L}qC a8A:9>\n<)h<Ce%L}qC a8A:9></)h<Ce%L}qC a8A:9>", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Tag tag0 = Tag.valueOf(")h<Ce%L}qC a8A:9");
      Element element0 = new Element(tag0, ")h<Ce%L}qC a8A:9");
      Elements elements0 = element0.getElementsByAttributeValueNot(")h<Ce%L}qC a8A:9", ")h<Ce%L}qC a8A:9");
      Elements elements1 = elements0.append("link");
      elements1.addAll((Collection<? extends Element>) elements0);
      String string0 = elements1.html();
      assertEquals(1, element0.childNodeSize());
      assertEquals("link\nlink", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Document document0 = new Document("");
      document0.normalise();
      Elements elements0 = document0.children();
      elements0.append("7");
      List<String> list0 = elements0.eachText();
      assertTrue(list0.contains("7"));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Document document0 = Document.createShell("92*y%6@d7g4&BRCW");
      Elements elements0 = document0.getAllElements();
      List<String> list0 = elements0.eachText();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Document document0 = new Document("");
      document0.normalise();
      Elements elements0 = document0.children();
      Elements elements1 = elements0.append("(2J'M9+UD#[ao^sl");
      boolean boolean0 = elements1.hasText();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Document document0 = new Document("");
      Document document1 = document0.normalise();
      Elements elements0 = document1.children();
      boolean boolean0 = elements0.hasText();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Document document0 = new Document("a_Eu");
      document0.normalise();
      Element element0 = document0.text("a_Eu");
      Elements elements0 = element0.getElementsContainingOwnText((String) null);
      String string0 = elements0.text();
      assertEquals("a_Eu a_Eu  a_Eu", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Document document0 = Document.createShell("x");
      Elements elements0 = document0.getAllElements();
      Elements elements1 = elements0.val("x");
      assertSame(elements1, elements0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Document document0 = new Document("");
      Elements elements0 = document0.getElementsContainingOwnText("");
      String string0 = elements0.val();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Document document0 = Document.createShell("novalidate");
      Elements elements0 = document0.getElementsMatchingText("nnchgpYG");
      String string0 = elements0.val();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Element[] elementArray0 = new Element[1];
      Document document0 = Document.createShell("(z4z{\"kMCi");
      elementArray0[0] = (Element) document0;
      Elements elements0 = new Elements(elementArray0);
      Elements elements1 = elements0.addClass("(z4z{\"kMCi");
      elements1.addClass("(z4z{\"kMCi");
      boolean boolean0 = elements0.hasClass("(z4z{\"kMCi");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Document document0 = Document.createShell("92*y%r6@_d7g4&BRCW");
      Elements elements0 = document0.getAllElements();
      boolean boolean0 = elements0.hasClass("92*y%r6@_d7g4&BRCW");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Tag tag0 = Tag.valueOf("p");
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "<!--", attributes0);
      Elements elements0 = formElement0.getElementsMatchingOwnText("");
      elements0.toggleClass("I");
      assertEquals(1, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Tag tag0 = Tag.valueOf(")h<Ce%L}qC a8A:9");
      Element element0 = new Element(tag0, ")h<Ce%L}qC a8A:9");
      Elements elements0 = element0.getElementsByAttributeValueNot(")h<Ce%L}qC a8A:9", ")h<Ce%L}qC a8A:9");
      Elements elements1 = elements0.removeClass("link");
      assertSame(elements0, elements1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Document document0 = new Document("@MHdCc.");
      Document document1 = document0.normalise();
      Elements elements0 = document1.getElementsByIndexGreaterThan(0);
      Elements elements1 = elements0.removeAttr("sm`Sq2%");
      assertFalse(elements1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Document document0 = Document.createShell("92*y%r6@_d7g4&BRCW");
      Elements elements0 = document0.getAllElements();
      document0.attr("", "i*@lDi(sZ~");
      List<String> list0 = elements0.eachAttr("");
      assertTrue(list0.contains("i*@lDi(sZ~"));
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Document document0 = Document.createShell("x");
      Elements elements0 = document0.getAllElements();
      elements0.attr("", "x");
      boolean boolean0 = elements0.hasAttr("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Tag tag0 = Tag.valueOf(")h<Ce%L}qC a8A:9");
      Element element0 = new Element(tag0, ")h<Ce%L}qC a8A:9");
      Elements elements0 = element0.getElementsByAttributeValueNot(")h<Ce%L}qC a8A:9", ")h<Ce%L}qC a8A:9");
      boolean boolean0 = elements0.hasAttr("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf("H2Gd:sMQ?Q", parseSettings0);
      Element element0 = new Element(tag0, "H2Gd:sMQ?Q");
      Element element1 = element0.attr("eof", "H2Gd:sMQ?Q");
      Elements elements0 = element0.getElementsContainingText("<pp");
      elements0.add(element1);
      String string0 = elements0.attr("eof");
      assertEquals("H2Gd:sMQ?Q", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Tag tag0 = Tag.valueOf(")h<Ce%L}qC a8A:9");
      Element element0 = new Element(tag0, ")h<Ce%L}qC a8A:9");
      Elements elements0 = element0.getElementsByAttributeValueNot(")h<Ce%L}qC a8A:9", ")h<Ce%L}qC a8A:9");
      String string0 = elements0.attr("bdo");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf("}", parseSettings0);
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "}", attributes0);
      Elements elements0 = formElement0.getElementsMatchingOwnText("");
      Elements elements1 = elements0.clone();
      assertNotSame(elements1, elements0);
      assertFalse(elements1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Element element0 = new Element("ky0H|i7@.=(xS~i7Y");
      Elements elements0 = element0.siblingElements();
      Elements elements1 = elements0.next();
      assertNotSame(elements1, elements0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Document document0 = new Document("QZq77*` &3:#*C\u0004");
      Elements elements0 = document0.getElementsByIndexGreaterThan(1910);
      String string0 = elements0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Document document0 = Document.createShell("x");
      Elements elements0 = document0.getAllElements();
      Elements elements1 = elements0.prev("x");
      assertTrue(elements1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Tag tag0 = Tag.valueOf("org.jsoup.select.Collector$Accumulator");
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "org.jsoup.select.Collector$Accumulator", attributes0);
      Elements elements0 = formElement0.elements();
      // Undeclared exception!
      try { 
        elements0.not("org.jsoup.select.Collector$Accumulator");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse query 'org.jsoup.select.Collector$Accumulator': unexpected token at '$Accumulator'
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Tag tag0 = Tag.valueOf("5PlyJDF1Y");
      Element element0 = new Element(tag0, "org.jsoup.select.Elements");
      Elements elements0 = element0.parents();
      NodeVisitor nodeVisitor0 = mock(NodeVisitor.class, new ViolatedAssumptionAnswer());
      Elements elements1 = elements0.traverse(nodeVisitor0);
      assertEquals(0, elements1.size());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Document document0 = Document.createShell("x");
      Elements elements0 = document0.getAllElements();
      // Undeclared exception!
      try { 
        elements0.select("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Document document0 = Document.createShell("x");
      Elements elements0 = document0.getAllElements();
      Elements elements1 = elements0.parents();
      assertEquals(1, elements1.size());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Document document0 = new Document("org.jsoup.select.Elements");
      Elements elements0 = document0.getElementsContainingOwnText("");
      Elements elements1 = elements0.nextAll();
      Element element0 = elements1.first();
      assertNull(element0);
      assertNotSame(elements0, elements1);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Document document0 = new Document("");
      Elements elements0 = document0.children();
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      Elements elements1 = elements0.filter(nodeFilter0);
      assertEquals(0, elements1.size());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Document document0 = Document.createShell("T");
      Elements elements0 = document0.siblingElements();
      // Undeclared exception!
      try { 
        elements0.prevAll("B@IuptcFy2");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse query 'B@IuptcFy2': unexpected token at '@IuptcFy2'
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Document document0 = new Document("");
      Elements elements0 = document0.getElementsContainingOwnText("");
      Elements elements1 = elements0.prev();
      assertTrue(elements1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Document document0 = Document.createShell("dF5PJ_");
      Elements elements0 = document0.getElementsByAttributeValueEnding("dF5PJ_", "Nm/l/g1j[MTZRYDI");
      Elements elements1 = elements0.next("dF5PJ_");
      assertNotSame(elements1, elements0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Document document0 = Document.createShell("AfterBody");
      Elements elements0 = document0.getElementsByClass("AfterBody");
      Elements elements1 = elements0.nextAll("tS");
      assertNotSame(elements1, elements0);
  }
}
