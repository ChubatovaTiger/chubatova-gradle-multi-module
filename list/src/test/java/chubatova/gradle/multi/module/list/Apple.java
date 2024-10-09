package chubatova.gradle.multi.module.list;

import org.junit.jupiter.api.Test;
import java.lang.*;

import static org.junit.jupiter.api.Assertions.*;

class Apple {
    @Test void testConstructor() {
        LinkedList list = new LinkedList();
        try
        {
            //Thread.sleep(8);
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {
            // this part is executed when an exception (in this example InterruptedException) occurs
        }
        assertEquals(0, list.size());
    }

    @Test void testAdd() {
        LinkedList list = new LinkedList();
        try
        {
            //Thread.sleep(9);
            Thread.sleep(200);
        }
        catch(InterruptedException e)
        {
            // this part is executed when an exception (in this example InterruptedException) occurs
        }

        list.add("one");
        assertEquals(1, list.size());
        assertEquals("one", list.get(0));

        list.add("two");
        assertEquals(2, list.size());
        assertEquals("two", list.get(1));
    }

    @Test void testAppleRemove() {
        LinkedList list = new LinkedList();

        list.add("one");
        list.add("two");
        assertTrue(list.remove("one"));

        assertEquals(1, list.size());
        assertEquals("two", list.get(0));

        assertTrue(list.remove("two"));
        assertEquals(0, list.size());
    }

    @Test public void testAppleRemoveMissing() {
        LinkedList list = new LinkedList();
        try
        {
            //Thread.sleep(9);
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {
            // this part is executed when an exception (in this example InterruptedException) occurs
        }

        list.add("one");
        list.add("two");
        assertFalse(list.remove("three"));
        assertEquals(2, list.size());
    }
}
