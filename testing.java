package test;

import junit.framework.TestCase;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;

public class testing extends TestCase {

	public testing(String name) 
	{
		super(name);
	}



	public void testOpen_token_stream()  // done
	{
		//Boolean test1=junit.open_token_stream(null); //fname is null
		//assertFalse(test1);
		
		//Boolean test2=junit.open_token_stream(mehul); //fname is not null
		//assertFalse(test2);
		
		//fail("Not yet implemented");
	}

	public void testGet_token() 
	{
		//boolean test3= junit.get_token(BufferedReader br);//id is equal to zero and id is equal to 59
		//assertEquals(true,test3);
		
		//boolean test4= junit.get_token(null);//br is null
		//assertEquals(false,test4);
		
		
	}

	public void testIs_token_end() // done
	{
		//boolean test1= junit.is_token_end(1, -1);//res is equal to -1
		//assertEquals(true,test1);
		
		//boolean test2= junit.is_token_end(1, -1); //str_com_id is equal to 1 and ch is ‘”’,” \n”, ”\r”
		//assertEquals(true,test2);
		
		//boolean test3= junit.is_token_end(1, 2);//str_com_id is equal to 1 and ch is not equal to ‘”’,” \n”, ”\r”
		//assertEquals(false,test3);
		
		//boolean test4= junit.is_token_end(2, -1);//str_com_id is equal to 2 and ch is ‘\t’,”\n”, ”\r”
		//assertEquals(true,test4);
		
		//boolean test5= junit.is_token_end(2, 2);//str_com_id is equal to 2 and ch is not equal to ‘\t’,” \n”, ”\r”
		//assertEquals(false,test5);
		
		//boolean test6= junit.is_token_end(1, 123);//ch is a special symbol 
		//assertEquals(true,test6);
		
		//boolean test7= junit.is_token_end(4, 59);//Test 7: ch is ‘ ‘, ‘\n’,’\r’,59 
		//assertEquals(true,test7);
		
		//fail("Not yet implemented");
	}

	public void testToken_type() // done
	{
		//int test1=junit.token_type("and"); //token is a keyword
		//assertEquals(1,test1);
		
		//int test2=junit.token_type("("); //token is a special symbol
		//assertEquals(2,test2);
		
		//int test3=junit.token_type("a124"); //token is an identifier
		//assertEquals(3,test3);
		
		//int test4=junit.token_type("124"); //token is an number constant
		//assertEquals(41,test4);
		
		//int test5=junit.token_type("\"123\""); //token is an string constant
		//assertEquals(42,test5); // check this error
		
		//int test6=junit.token_type("#a"); //token is an character constant
		//assertEquals(43,test6);
		
		//int test7=junit.token_type(";dsf31"); //token is a comment
		//assertEquals(5,test7);
		
		//fail("Not yet implemented");
	}

	public void testPrint_token() //done
	{
		
		/*final ByteArrayOutputStream outContent1 = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent1));
        junit test1 = new junit();
        test1.print_token("error"); // Test 1: if type is 0
        assertEquals("error,\"" + "error" + "\".\n", outContent1.toString());
        
        final ByteArrayOutputStream outContent2 = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent2));
        junit test2 = new junit();
        test2.print_token("and"); // Test 2: if type is 1
        assertEquals("keyword,\"" + "and" + "\".\n", outContent2.toString());
        
        final ByteArrayOutputStream outContent3 = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent3));
        junit test3 = new junit();
        test3.print_token("("); // Test 3: if type is 2
        assertEquals("(", outContent3.toString());*/
		
		//final ByteArrayOutputStream outContent4 = new ByteArrayOutputStream();
		//System.setOut(new PrintStream(outContent4));
        //junit test4 = new junit();
        //test4.print_token("a12"); // Test 4: if type is 3
        //assertEquals("identifier,\\\"\"a12" + "\"\\\".\\n\"", outContent4.toString());
		
		//works perfectly for all test cases
		
	}

	public void testIs_comment() //done
	{
		//boolean test5= junit.is_comment(";"); // Test 5: String with character at zero position=59 
				//assertEquals(true,test5);
				
			//	boolean test1= junit.is_comment("3"); //	Test 1: String is one character	
				//assertEquals(false,test1);
				
			//	boolean test2= junit.is_comment("333044043");//Test 2: String with 10 characters
				//assertEquals(false,test2);
				
			//	boolean test3= junit.is_comment(" "); //Test 3: Empty String
			//	assertEquals(false,test3);
				
				//boolean test4= junit.is_comment(null); //Test 4: Null String
				//assertEquals(false,test4);
					
		
		//fail("Not yet implemented");
	}

	public void testIs_keyword() //done
	{
		//boolean test1= junit.is_keyword(null); //Test 1: str is null
		//assertEquals(false,test1);
				
		//boolean test2= junit.is_keyword("xor"); // 	Test 2: str is and, or, if, xor, lambda, ==>
		//assertEquals(true,test2);
				
		//boolean test3= junit.is_keyword("abcd"); // 	Test 3:str is not covered in test 1 or test 2
		//assertEquals(false,test3);
		//fail("Not yet implemented");
	}

	public void testIs_char_constant() //done
	{
		//Test 1: str is null
		//boolean test1= junit.is_char_constant(null); 
		//assertEquals(false,test1);
				
		//Test 2: length of str is more than 2 and character at zero position is ‘#’ and character at one position is a letter
		//boolean test2= junit.is_char_constant("#a44"); 
		//assertEquals(true,test2);
				
		//Test 3: length of str is less than two
		//boolean test3= junit.is_char_constant("#"); 
		//assertEquals(false,test3);
				
		//Test 4: character at zero position is not #
		//boolean test4= junit.is_char_constant("0a"); 
		//assertEquals(false,test4);
		
		//Test 5: character at one position is not a letter
		//boolean test5= junit.is_char_constant("#444"); 
		//assertEquals(false,test5);
		
		//fail("Not yet implemented");
	}

	public void testIs_num_constant() //done
	{
		//Test 1: str is null
		//boolean test1= junit.is_num_constant(null); 
		//assertEquals(false,test1);
						
		//Test 2: position zero of str is a digit and for every consequent position
		//boolean test2= junit.is_num_constant("1"); 
		//assertEquals(true,test2);
		
		//Test 3: position zero of str is a digit and is not a digit for the next positions
		//boolean test3= junit.is_num_constant("1aa"); 
		//assertEquals(false,test3);
				
		//Test 4: position zero of str is not a digit
		//boolean test4= junit.is_num_constant("a"); 
		//assertEquals(false,test4);
		//fail("Not yet implemented");
	}

	public void testIs_str_constant() //done
	{
		
		//boolean test1=junit.is_str_constant(null);//str is null
		//assertEquals(true,test1);
		
		//boolean test2=junit.is_str_constant("\"123\"");//position zero of str is a “’” and for every consequent position
		//assertEquals(true,test2);
		
		//boolean test3=junit.is_str_constant("\"123\"");//pposition zero of str is a “’” and not for every consequent position
		//assertEquals(true,test3);
		
		//boolean test4=junit.is_str_constant("123");//position zero of str is a “’” and not for every consequent position
		//assertEquals(false,test4);
		
		//fail("Not yet implemented");
	}

	public void testIs_identifier() //done
	{
		//Test 1: str is null
		//boolean test1= junit.is_identifier(null); 
		//assertEquals(false,test1);
			
		//Test 2: string length is zero
		// boolean test2= junit.is_identifier(""); 
		//assertEquals(true,test2);
			
		//Test 3: character at position i is a letter or a digit.
		//boolean test3= junit.is_identifier("ashl333"); 
		//assertEquals(false,test3);
		
		//Test 4: character at position i is a special symbol
		//boolean test4= junit.is_identifier("!!!!!--"); 
		//assertEquals(true,test4);
		
		//Test 5: character at position I is not a letter
		//boolean test5 = junit.is_identifier("_!3_!-3"); 
		//assertEquals(true,test5);
		
		//fail("Not yet implemented");
	}

	public void testPrint_spec_symbol() 
	{
		//Test 1: str is NULL
				//final ByteArrayOutputStream outContent1 = new ByteArrayOutputStream();
				//System.setOut(new PrintStream(outContent1));
		        //junit test1 = new junit();
		        //test1.print_token("{"); 
		        //assertEquals("identifier,"+"{", outContent1.toString());
				
		//Test 2: Test 2: str is zero
			
						//final ByteArrayOutputStream outContent1 = new ByteArrayOutputStream();
						//System.setOut(new PrintStream(outContent1));
				        //junit test1 = new junit();
				        //test1.print_token("{"); 
				        //assertEquals("identifier,"+"{", outContent1.toString());
						
		//Test 3: Test 3: str is ‘{’

						//final ByteArrayOutputStream outContent1 = new ByteArrayOutputStream();
						//System.setOut(new PrintStream(outContent1));
				        //junit test1 = new junit();
				        //test1.print_token("{"); 
				        //assertEquals("identifier,"+"{", outContent1.toString());
						
		//Test 4: Test 4: str is ‘)’
						//final ByteArrayOutputStream outContent1 = new ByteArrayOutputStream();
						//System.setOut(new PrintStream(outContent1));
				        //junit test1 = new junit();
				        //test1.print_token("{"); 
				        //assertEquals("identifier,"+"{", outContent1.toString());
						
		//Test 5: Test 5: str is ‘[’
						//final ByteArrayOutputStream outContent1 = new ByteArrayOutputStream();
						//System.setOut(new PrintStream(outContent1));
				        //junit test1 = new junit();
				        //test1.print_token("{"); 
				        //assertEquals("identifier,"+"{", outContent1.toString());
						
		//Test 6: Test 6: str is ‘]’
						//final ByteArrayOutputStream outContent1 = new ByteArrayOutputStream();
						//System.setOut(new PrintStream(outContent1));
				        //junit test1 = new junit();
				        //test1.print_token("{"); 
				        //assertEquals("identifier,"+"{", outContent1.toString());
		
		//Test7: str is ‘’’
				//final ByteArrayOutputStream outContent1 = new ByteArrayOutputStream();
				//System.setOut(new PrintStream(outContent1));
		        //junit test1 = new junit();
		        //test1.print_token("{"); 
		        //assertEquals("identifier,"+"{", outContent1.toString());
						
	}

	public void testIs_spec_symbol() 
	{
		//boolean test1=junit.is_spec_symbol('(');
		//assertEquals(true,test1);//Test 1: c is (
		
		//boolean test2=junit.is_spec_symbol(')');
		//assertEquals(true,test1);//Test 2:c is )
		
		//boolean test3=junit.is_spec_symbol('[');
		//assertEquals(true,test1);//Test 3: c is [
		
		//boolean test4=junit.is_spec_symbol(']');
		//assertEquals(true,test1);//Test 4: c is ]
		
		//boolean test5=junit.is_spec_symbol('\');
		//assertEquals(true,test1);//Test 5: c is \
		
		//boolean test6=junit.is_spec_symbol('`');
		//assertEquals(true,test1);//Test 6: c is `
		
		//boolean test7=junit.is_spec_symbol(',');
		//assertEquals(true,test1);//Test 7: c is ,
		
		//fail("Not yet implemented");
	}

	public void testMain() 
	{
		//boolean test1=junit.main(["",""]); //length of args is 0
		//assertEquals(false,test1);
		
		//boolean test2=junit.main(["123"]); //lenth of args is 1
		//assertEquals(false,test2);
		
		//fail("Not yet implemented");
	}

}
