/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 19 02:03:29 GMT 2023
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DocumentType_ESTest extends DocumentType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("", "", (String) null, (String) null, "T");
      String string0 = documentType0.outerHtml();
      assertEquals("#doctype", documentType0.nodeName());
      assertEquals("<!doctype>", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("name", "5j>ib<[TVi", "5j>ib<[TVi", "-PfkQFbx", "^-,CIUTk7)} d7,z");
      MockFile mockFile0 = new MockFile((String) null, "#doctype");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      documentType0.outerHtmlHead(mockPrintWriter0, 0, document_OutputSettings0);
      assertEquals("#doctype", documentType0.nodeName());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("[^%s]", "L| @zd&B1,6X8(-DQ", "L| @zd&B1,6X8(-DQ");
      documentType0.setPubSysKey("$<Up_5=RWIMLkuAqc");
      assertEquals("#doctype", documentType0.nodeName());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("name", "5j>ib<[TVi", "5j>ib<[TVi", "-PfkQFbx", "^-,CIUTk7)} d7,z");
      documentType0.wrap("<!DOCTYPE");
      assertEquals("#doctype", documentType0.nodeName());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DocumentType documentType0 = new DocumentType((String) null, (String) null, "SYSTEM", (String) null, "SYSTEM");
      assertEquals("#doctype", documentType0.nodeName());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("", "systemId", "systemId", "|]1VddkY(gd${CFk;w");
      assertEquals("#doctype", documentType0.nodeName());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("", "", "PUBLIC", "PUBLIC");
      StringBuilder stringBuilder0 = new StringBuilder();
      stringBuilder0.append((Object) documentType0);
      assertEquals("<!DOCTYPE \"PUBLIC\">", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DocumentType documentType0 = new DocumentType(",", "$&Nt^S/=W2st,{U<", "");
      Charset charset0 = Charset.defaultCharset();
      byte[] byteArray0 = new byte[6];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0, (int) (byte)0, (int) (byte)0);
      CharBuffer charBuffer0 = charset0.decode(byteBuffer0);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.xml;
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.syntax(document_OutputSettings_Syntax0);
      // Undeclared exception!
      try { 
        documentType0.outerHtmlHead(charBuffer0, (byte)102, document_OutputSettings1);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }
}
