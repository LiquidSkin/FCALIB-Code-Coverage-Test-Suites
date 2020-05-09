import de.tudresden.inf.tcs.fcalib.utils.ListSet;
import org.junit.Ignore;
import org.junit.Test;

import javax.print.attribute.IntegerSyntax;

import static org.junit.Assert.*;

import java.util.*;
public class ListSetTest {
    @Test
    public void containsElementTest()
    {
        ListSet<Integer> li = new ListSet<Integer>();
        li.add(1);
        li.add(2);
        li.add(3);
        assertTrue(li.contains(2));
    }

    @Test
    public void notContainsElementTest()
    {
        ListSet<Integer> li = new ListSet<Integer>();
        li.add(1);
        li.add(2);
        li.add(3);
        assertFalse(li.contains(10));

    }
    @Test
    public void listSizeTest()
    {
        ListSet<Integer> li = new ListSet<Integer>();
        li.add(10);
        li.add(20);
        assertTrue(li.size() > 1);
    }

    @Test
    public void changeOrderListTest()
    {
        ListSet<Integer> li = new ListSet<Integer>();
        ListSet<Integer> li2 = new ListSet<Integer>();
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);
        li2.add(10);
        li2.add(20);
        li2.add(30);
        li2.add(40);
        li2.changeOrder();
        assertTrue(li.containsAll(li2));
    }
    @Test
    public void elementIndexTest()
    {
        ListSet<Integer> li = new ListSet<Integer>();
        li.add(10);
        li.add(1000);
        li.add(2000);
        Integer elem = li.getElementAt(1);
        assertTrue(elem == 1000);
    }
    @Test
    public void indexofElementTest()
    {
        ListSet<Integer> li = new ListSet<Integer>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        Integer index = li.getIndexOf(3);
        assertTrue(index == 2);

    }
    @Test
    public void removeElementTest()
    {
        ListSet<Integer> li = new ListSet<Integer>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.remove(1);
        int index = li.getIndexOf(1);
        assertTrue(index == -1);
    }
    @Test
    public void addAllTest()
    {
        ListSet<Integer> li = new ListSet<Integer>();
        ListSet<Integer> li2 = new ListSet<Integer>();
        li2.add(1);
        li2.add(0);
        li.addAll(li2);
        assertTrue(li.contains(1));
    }
    @Test
    public void clearElementsTest()
    {
        ListSet<Integer> li = new ListSet<Integer>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.clear();
        assertTrue(li.isEmpty());
    }
    @Test
    public void emptyListTest()
    {
        ListSet<Integer> li = new ListSet<Integer>();
        assertTrue(li.isEmpty());
    }
    @Test
    public void equalityTest()
    {
        ListSet<Integer> li = new ListSet<Integer>();
        ListSet<Integer> li2 = new ListSet<Integer>();
        assertTrue(li.equals(li2));
    }
    @Test
    public void hasNextIteratorTest()
    {
        ListSet<Integer> li = new ListSet<Integer>();
        li.add(1);
        li.add(2);
        Iterator<Integer> itr = li.iterator();
        assertTrue(itr.hasNext());
    }

    @Test
    public void hasNextTest()
    {
        ListSet<Integer> li = new ListSet<Integer>();
        li.add(1);
        li.add(2);
        Iterator<Integer> itr = li.iterator();
        assertTrue(itr.next() == 1);
    }
    @Test
    public void removeAllTest()
    {
        ListSet<Integer> li = new ListSet<Integer>();
        ListSet<Integer> li2 = new ListSet<Integer>();
        li.add(100);
        li.add(200);
        li.add(300);
        li2.add(200);
        li.removeAll(li2);
        assertTrue(!li.equals(li2));
    }
    @Test
    public void retainAllTest()
    {
        ListSet<Integer> li = new ListSet<Integer>();
        ListSet<Integer> li2 = new ListSet<Integer>();
        li.add(1000);
        li.add(2000);
        li.add(3000);
        li.add(4000);
        li2.add(7000);
        li2.add(5000);
        li.retainAll(li);
        assertTrue(!li.contains(7000));
    }
    @Test
    public void changeOrderTest()
    {
        ListSet<Integer> li = new ListSet<Integer>();
        ListSet<Integer> li2 = new ListSet<Integer>();
        li.add(1000);
        li.add(2000);
        li.add(3000);
        li2.addAll(li);
        li.changeOrder();
        assertTrue(!li.equals(li2));
    }
    @Test
    public void objectToArrayTest()
    {
        ListSet<Integer> li = new ListSet<Integer>();
        li.add(1000);
        li.add(2000);
        li.add(3000);
        Object[] elem  = li.toArray();
        int element = (int) elem[0];
        assertTrue(element == 1000);
    }
    @Test
    public void toStringTest()
    {
        ListSet<Character> li = new ListSet<Character>();
        li.add('a');
        li.add('b');
        li.add('c');
        String str = li.toString();
        assertTrue(str.charAt(2) == 'a');
    }
    @Test
    public void toArrayTest()
    {
        ListSet<Integer> li = new ListSet<Integer>();
        li.add(1000);
        li.add(2000);
        li.add(3000);
        assertArrayEquals(li.toArray(),li.toArray());
    }

    @Test
    public void listSetTest()
    {
        ListSet<Integer> i = new ListSet<>();
        assertTrue(i.isEmpty());
    }
    @Test
    public void removeTest()
    {
        ListSet<Integer> li = new ListSet<Integer>();
        li.add(200);
        li.add(300);
        li.add(400);
        li.remove(200);
        assertTrue(!li.contains(200));
    }
    @Test
    public void containsAllTest()
    {
        ListSet<Integer> li = new ListSet<Integer>();
        ListSet<Integer> li2 = new ListSet<Integer>();
        li.add(200);
        li.add(300);
        li.add(400);
        li2.add(300);
        li2.add(400);
        li2.add(200);
        assertTrue(li.containsAll(li2));
    }


}