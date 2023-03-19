/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 19 02:39:35 GMT 2023
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator;
import org.jsoup.select.StructuralEvaluator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StructuralEvaluator_ESTest extends StructuralEvaluator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Evaluator.IsLastOfType evaluator_IsLastOfType0 = new Evaluator.IsLastOfType();
      StructuralEvaluator.ImmediatePreviousSibling structuralEvaluator_ImmediatePreviousSibling0 = new StructuralEvaluator.ImmediatePreviousSibling(evaluator_IsLastOfType0);
      StructuralEvaluator.Has structuralEvaluator_Has0 = new StructuralEvaluator.Has(structuralEvaluator_ImmediatePreviousSibling0);
      Document document0 = Document.createShell("MF;;.U 2yq{L.2'S0b");
      boolean boolean0 = structuralEvaluator_Has0.matches(document0, document0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Evaluator.IsFirstOfType evaluator_IsFirstOfType0 = new Evaluator.IsFirstOfType();
      StructuralEvaluator.ImmediatePreviousSibling structuralEvaluator_ImmediatePreviousSibling0 = new StructuralEvaluator.ImmediatePreviousSibling(evaluator_IsFirstOfType0);
      Document document0 = new Document("");
      boolean boolean0 = structuralEvaluator_ImmediatePreviousSibling0.matches(document0, document0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Evaluator.IndexEquals evaluator_IndexEquals0 = new Evaluator.IndexEquals(0);
      Document document0 = Document.createShell("");
      Element element0 = document0.body();
      StructuralEvaluator.PreviousSibling structuralEvaluator_PreviousSibling0 = new StructuralEvaluator.PreviousSibling(evaluator_IndexEquals0);
      boolean boolean0 = structuralEvaluator_PreviousSibling0.matches((Element) null, element0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Evaluator.IndexEquals evaluator_IndexEquals0 = new Evaluator.IndexEquals((-35));
      StructuralEvaluator.PreviousSibling structuralEvaluator_PreviousSibling0 = new StructuralEvaluator.PreviousSibling(evaluator_IndexEquals0);
      Document document0 = Document.createShell("8u_\"Y0YvbqKyv");
      Element element0 = document0.body();
      boolean boolean0 = structuralEvaluator_PreviousSibling0.matches((Element) null, element0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StructuralEvaluator.Root structuralEvaluator_Root0 = new StructuralEvaluator.Root();
      Document document0 = Document.createShell("");
      StructuralEvaluator.Not structuralEvaluator_Not0 = new StructuralEvaluator.Not(structuralEvaluator_Root0);
      StructuralEvaluator.PreviousSibling structuralEvaluator_PreviousSibling0 = new StructuralEvaluator.PreviousSibling(structuralEvaluator_Not0);
      boolean boolean0 = structuralEvaluator_PreviousSibling0.matches(document0, document0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StructuralEvaluator.Root structuralEvaluator_Root0 = new StructuralEvaluator.Root();
      Document document0 = Document.createShell("LF");
      StructuralEvaluator.ImmediateParent structuralEvaluator_ImmediateParent0 = new StructuralEvaluator.ImmediateParent(structuralEvaluator_Root0);
      StructuralEvaluator.Has structuralEvaluator_Has0 = new StructuralEvaluator.Has(structuralEvaluator_ImmediateParent0);
      boolean boolean0 = structuralEvaluator_Has0.matches(document0, document0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Evaluator.AttributeWithValueEnding evaluator_AttributeWithValueEnding0 = new Evaluator.AttributeWithValueEnding("7q$'#+'h3;`", "GIigpvlu.");
      StructuralEvaluator.ImmediateParent structuralEvaluator_ImmediateParent0 = new StructuralEvaluator.ImmediateParent(evaluator_AttributeWithValueEnding0);
      Document document0 = Document.createShell("o k2c4/Q.R)4HZ");
      Element element0 = document0.createElement("7q$'#+'h3;`");
      boolean boolean0 = structuralEvaluator_ImmediateParent0.matches(element0, document0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Evaluator.IndexGreaterThan evaluator_IndexGreaterThan0 = new Evaluator.IndexGreaterThan(0);
      StructuralEvaluator.PreviousSibling structuralEvaluator_PreviousSibling0 = new StructuralEvaluator.PreviousSibling(evaluator_IndexGreaterThan0);
      StructuralEvaluator.ImmediateParent structuralEvaluator_ImmediateParent0 = new StructuralEvaluator.ImmediateParent(structuralEvaluator_PreviousSibling0.evaluator);
      boolean boolean0 = structuralEvaluator_ImmediateParent0.matches((Element) null, (Element) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Evaluator.IsNthLastOfType evaluator_IsNthLastOfType0 = new Evaluator.IsNthLastOfType(177, 177);
      StructuralEvaluator.ImmediatePreviousSibling structuralEvaluator_ImmediatePreviousSibling0 = new StructuralEvaluator.ImmediatePreviousSibling(evaluator_IsNthLastOfType0);
      StructuralEvaluator.Has structuralEvaluator_Has0 = new StructuralEvaluator.Has(structuralEvaluator_ImmediatePreviousSibling0);
      StructuralEvaluator.Parent structuralEvaluator_Parent0 = new StructuralEvaluator.Parent(structuralEvaluator_Has0);
      Document document0 = Document.createShell("e:06T");
      Element element0 = document0.body();
      boolean boolean0 = structuralEvaluator_Parent0.matches(document0, element0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StructuralEvaluator.Root structuralEvaluator_Root0 = new StructuralEvaluator.Root();
      Document document0 = Document.createShell("");
      StructuralEvaluator.Not structuralEvaluator_Not0 = new StructuralEvaluator.Not(structuralEvaluator_Root0);
      StructuralEvaluator.Parent structuralEvaluator_Parent0 = new StructuralEvaluator.Parent(structuralEvaluator_Not0);
      boolean boolean0 = structuralEvaluator_Parent0.matches(document0, document0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Evaluator.AttributeWithValueEnding evaluator_AttributeWithValueEnding0 = new Evaluator.AttributeWithValueEnding("7q$'#+'h3;`", "GIigpvlu.");
      StructuralEvaluator.ImmediateParent structuralEvaluator_ImmediateParent0 = new StructuralEvaluator.ImmediateParent(evaluator_AttributeWithValueEnding0);
      Document document0 = Document.createShell("o k2c4/Q.R)4HZ");
      StructuralEvaluator.Has structuralEvaluator_Has0 = new StructuralEvaluator.Has(structuralEvaluator_ImmediateParent0);
      boolean boolean0 = structuralEvaluator_Has0.matches(document0, document0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StructuralEvaluator.Root structuralEvaluator_Root0 = new StructuralEvaluator.Root();
      Document document0 = Document.createShell("");
      StructuralEvaluator.Not structuralEvaluator_Not0 = new StructuralEvaluator.Not(structuralEvaluator_Root0);
      StructuralEvaluator.Parent structuralEvaluator_Parent0 = new StructuralEvaluator.Parent(structuralEvaluator_Not0);
      StructuralEvaluator.Has structuralEvaluator_Has0 = new StructuralEvaluator.Has(structuralEvaluator_Parent0);
      boolean boolean0 = structuralEvaluator_Has0.matches(document0, document0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StructuralEvaluator.PreviousSibling structuralEvaluator_PreviousSibling0 = new StructuralEvaluator.PreviousSibling((Evaluator) null);
      StructuralEvaluator.ImmediateParent structuralEvaluator_ImmediateParent0 = new StructuralEvaluator.ImmediateParent(structuralEvaluator_PreviousSibling0);
      String string0 = structuralEvaluator_ImmediateParent0.toString();
      assertEquals(":ImmediateParent:prev*null", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StructuralEvaluator.Root structuralEvaluator_Root0 = new StructuralEvaluator.Root();
      StructuralEvaluator.Not structuralEvaluator_Not0 = new StructuralEvaluator.Not(structuralEvaluator_Root0);
      StructuralEvaluator.Parent structuralEvaluator_Parent0 = new StructuralEvaluator.Parent(structuralEvaluator_Not0);
      StructuralEvaluator.Has structuralEvaluator_Has0 = new StructuralEvaluator.Has(structuralEvaluator_Parent0);
      StructuralEvaluator.ImmediatePreviousSibling structuralEvaluator_ImmediatePreviousSibling0 = new StructuralEvaluator.ImmediatePreviousSibling(structuralEvaluator_Parent0);
      structuralEvaluator_ImmediatePreviousSibling0.evaluator = (Evaluator) structuralEvaluator_Has0;
      String string0 = structuralEvaluator_ImmediatePreviousSibling0.toString();
      assertNotNull(string0);
  }
}
