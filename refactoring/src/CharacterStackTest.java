import static org.junit.Assert.*;

import java.util.EmptyStackException;

import org.junit.Test;

public class CharacterStackTest {


		@Test
		public void testCharacterStack() {
			CharacterStack teststack= new CharacterStack();
			int expect =20;
			assertEquals(expect, teststack.getMaxSize());
		}

		@Test
		public void testCharacterStackString() {		
			String test = "t";
			CharacterStack teststack= new CharacterStack(test);
			char expect ='t';
			assertEquals(expect,teststack.pop());
		}
		
		@Test(expected = StackOverflowError.class )
		public void testCharacterStackStringEmpty() {
			String test = "tenjfnsknainfnjaisnfjneinfnja";
			CharacterStack teststack= new CharacterStack(test);
		}
		
		@Test(expected = StackOverflowError.class )
		public void testCharacterStackCharEmpty() {
			char test = 'a';
			CharacterStack teststack= new CharacterStack(test);
		}
		
		
		@Test
		public void testCharacterStackChar() {
			char test = 't';
			CharacterStack teststack= new CharacterStack(test);
			assertEquals('t',teststack.pop());
		}

		@Test
		public void testPushChar() {
			CharacterStack teststack= new CharacterStack();
			char test = 't';
			teststack.push(test);
			assertEquals('t', teststack.pop());
		}

		@Test
		public void testPushString() {
			CharacterStack teststack= new CharacterStack();
			String test = "t";
			teststack.push(test);
			assertEquals('t', teststack.pop());
		}

		@Test
		public void testPop() {
			CharacterStack teststack= new CharacterStack();
			String test = "t";
			teststack.push(test);
			assertEquals('t', teststack.pop());
		}
		
		@Test(expected = EmptyStackException.class )
		public void testEmptyStackException() {
			CharacterStack teststack= new CharacterStack();
			assertEquals('t', teststack.pop());
		}

		@Test
		public void testGetSize() {
			CharacterStack teststack= new CharacterStack();
			String test = "t";
			teststack.push(test);
			assertEquals(1, teststack.getSize());
		}

		@Test
		public void testGetMaxSize() {
			CharacterStack teststack= new CharacterStack();
			assertEquals(20, teststack.getMaxSize());
		}


}
