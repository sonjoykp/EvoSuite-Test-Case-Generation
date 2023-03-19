/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 19 02:35:14 GMT 2023
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.jsoup.select.Collector;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Collector_ESTest extends Collector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Evaluator.IsEmpty evaluator_IsEmpty0 = new Evaluator.IsEmpty();
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      Tag tag0 = Tag.valueOf("z12[R5l'=<Va", parseSettings0);
      CDataNode cDataNode0 = new CDataNode("q|c\"g>c6a\"@&AMoD");
      Attributes attributes0 = cDataNode0.attributes();
      Element element0 = new Element(tag0, "_}$W@g=", attributes0);
      Element element1 = Collector.findFirst(evaluator_IsEmpty0, element0);
      assertEquals("_}$W@g=", element1.baseUri());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Evaluator.AttributeWithValueStarting evaluator_AttributeWithValueStarting0 = new Evaluator.AttributeWithValueStarting("zttchw; !` ZE", "zttchw; !` ZE");
      Document document0 = new Document("zttchw; !` ZE");
      Document document1 = document0.normalise();
      Element element0 = document1.text("");
      Element element1 = Collector.findFirst(evaluator_AttributeWithValueStarting0, element0);
      assertNull(element1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Document document0 = new Document("zttchw; !` ZE");
      Document document1 = document0.normalise();
      document1.text("");
      Elements elements0 = document1.getElementsMatchingText("");
      assertFalse(elements0.isEmpty());
  }
}
