/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 19 01:54:45 GMT 2023
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedWriter;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Attributes_ESTest extends Attributes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("'.[oNKY*f&r!", "Split offset must be not be negative");
      Attributes attributes1 = attributes0.put(attribute0);
      Attributes attributes2 = attributes1.clone();
      boolean boolean0 = attributes2.equals(attributes1);
      assertEquals(1, attributes0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("org.jsoup.nodes.Attributes$1", "org.jsoup.nodes.Attributes$1");
      attributes0.put(attribute0);
      Attributes attributes1 = new Attributes();
      boolean boolean0 = attributes0.equals(attributes1);
      assertEquals(1, attributes0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      boolean boolean0 = attributes0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      boolean boolean0 = attributes0.equals(attributes0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      boolean boolean0 = attributes0.equals("k/MS{Qc0M@$6Y7Sv$?");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("CfFuh&h#-s~iHj", "k/MS{Qc0M@$6Y7Sv$?", attributes0);
      attributes0.put("LaF", true);
      PipedWriter pipedWriter0 = new PipedWriter();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(pipedWriter0, false);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.xml;
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.syntax(document_OutputSettings_Syntax0);
      attribute0.parent.html((Appendable) mockPrintWriter0, document_OutputSettings1);
      assertEquals(1, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.put("TCZ`mAK*OXd3,)~X|", true);
      String string0 = attributes1.html();
      assertEquals(1, attributes0.size());
      assertEquals(" TCZ`mAK*OXd3,)~X|", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.putIgnoreCase("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes");
      attributes0.html();
      assertEquals(1, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.put("", true);
      // Undeclared exception!
      try { 
        attributes0.asList();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.put("xhtml", "xhtml");
      List<Attribute> list0 = attributes1.asList();
      assertEquals(1, attributes0.size());
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.addAll(attributes0);
      assertEquals(0, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.put("", true);
      boolean boolean0 = attributes0.hasKeyIgnoreCase("");
      assertEquals(1, attributes0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      boolean boolean0 = attributes0.hasKeyIgnoreCase("k/MS{Qc0M@$6Y7Sv$?");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.put("xml", true);
      boolean boolean0 = attributes0.hasKey("xml");
      assertEquals(1, attributes0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      boolean boolean0 = attributes0.hasKey("SfS");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.removeIgnoreCase("data-");
      assertEquals(0, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.put("", "");
      assertEquals(1, attributes0.size());
      
      attributes1.removeIgnoreCase("");
      assertEquals(0, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.put(" =2O~0g=\"=2O~0g\"", false);
      assertEquals(0, attributes1.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.put("G cD%; ~2Sl:", "G cD%; ~2Sl:");
      attributes0.normalize();
      attributes0.putIgnoreCase("G cD%; ~2Sl:", "extended");
      assertEquals(1, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.put("G cD%; ~2Sl:", "G cD%; ~2Sl:");
      attributes0.putIgnoreCase("G cD%; ~2Sl:", "extended");
      assertEquals(1, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      String string0 = attributes0.getIgnoreCase("charset");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("nowrap", "nowrap", attributes0);
      String string0 = attribute0.setValue("nowrap");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.putIgnoreCase("=2O~0g", "=2O~0g");
      attributes0.get("=2O~0g");
      assertEquals(1, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = Attributes.checkNotNull((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("CfFuh&h#-s~iHj", "k/MS{Qc0M@$6Y7Sv$?", attributes0);
      Attributes attributes1 = attributes0.put(attribute0);
      String string0 = attributes1.getIgnoreCase("CfFuh&h#-s~iHj");
      assertEquals(1, attributes0.size());
      assertEquals("k/MS{Qc0M@$6Y7Sv$?", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.put("xhtml", "xhtml");
      Attributes attributes2 = attributes1.put("", true);
      attributes2.putIgnoreCase("org.jsoup.nodes.Attributes$Dataset$EntrySet", "");
      attributes2.clone();
      attributes2.remove("");
      Attribute attribute0 = new Attribute("N-q:8DeETb'2mZ", "", attributes2);
      attributes2.put(attribute0);
      attributes2.addAll(attributes1);
      assertEquals(3, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.putIgnoreCase("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes");
      Attribute attribute0 = new Attribute("CfFuh&h#-s~iHj", "k/MS{Qc0M@$6Y7Sv$?", attributes0);
      attributes0.put(attribute0);
      Attributes attributes1 = attributes0.put("LaF", true);
      attributes1.addAll(attributes1);
      assertEquals(3, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.hashCode();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.clone();
      boolean boolean0 = attributes0.equals(attributes1);
      assertNotSame(attributes1, attributes0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Map<String, String> map0 = attributes0.dataset();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      String string0 = attributes0.toString();
      assertEquals("", string0);
  }
}