/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 19 01:57:18 GMT 2023
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LeafNode_ESTest extends LeafNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TextNode textNode0 = new TextNode("3z2m=qmD\"aG");
      String string0 = textNode0.attr("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.LeafNode", "org.jsoup.nodes.LeafNode");
      assertEquals("#doctype", documentType0.nodeName());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode((String) null);
      cDataNode0.setBaseUri("");
      assertEquals(0, cDataNode0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      XmlDeclaration xmlDeclaration0 = new XmlDeclaration("", "", false);
      String string0 = xmlDeclaration0.absUrl("org.jsoup.nodes.LeafNode");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("vtfWy!)HwJ%}Qg6Se44");
      TextNode textNode1 = textNode0.text("`[BqW)SkH]bDmY/");
      assertFalse(textNode1.hasParent());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("value");
      Comment comment0 = new Comment("org.jsoup.nodes.LeafNode", "name");
      cDataNode0.parentNode = (Node) comment0;
      // Undeclared exception!
      try { 
        cDataNode0.wrap("value");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Leaf Nodes do not have child nodes.
         //
         verifyException("org.jsoup.nodes.LeafNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      XmlDeclaration xmlDeclaration0 = new XmlDeclaration("", "", false);
      Node node0 = xmlDeclaration0.removeAttr("#declaration");
      assertSame(node0, xmlDeclaration0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("9'");
      boolean boolean0 = cDataNode0.isBlank();
      assertFalse(boolean0);
  }
}