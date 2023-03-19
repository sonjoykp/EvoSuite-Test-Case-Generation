/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 19 02:07:04 GMT 2023
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.DataNode;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DataNode_ESTest extends DataNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DataNode dataNode0 = DataNode.createFromEncoded("Children collection to be inserted must not be null.", "org.jsoup.nodes.Node$OuterHtmlVisitor");
      assertFalse(dataNode0.hasParent());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DataNode dataNode0 = new DataNode("x:K_ogjVl5:'o[a0yn");
      DataNode dataNode1 = dataNode0.setWholeData("NJ8");
      assertEquals("#data", dataNode1.nodeName());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DataNode dataNode0 = new DataNode("m", "m");
      String string0 = dataNode0.toString();
      assertEquals("#data", dataNode0.nodeName());
      assertEquals("m", string0);
  }
}
