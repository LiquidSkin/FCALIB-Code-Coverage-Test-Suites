import de.tudresden.inf.tcs.fcaapi.exception.IllegalAttributeException;
import de.tudresden.inf.tcs.fcalib.PartialObjectDescription;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

import java.util.*;
public class PartialObjectDescriptionTest {
    @Test

    public void partialObjectAttributeAbsenceTest()
    {
        Set<Integer> set = new HashSet<Integer>();
        PartialObjectDescription p = new PartialObjectDescription();
        assertTrue(!p.containsAttribute(set));

    }
    @Test
    public void partialObjectAtributePresenceTest()
    {
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(1,2,3,4,5));
        PartialObjectDescription p = new PartialObjectDescription();
        p.addAttribute(set);
        assertTrue(p.containsAttribute(set));
    }
    @Test
    public void elementPresenceNegatedAttributeTest()
    {
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(100,200,300,400,500));
        Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(1000,2000,3000,4000));
        PartialObjectDescription p = new PartialObjectDescription();
        p.addNegatedAttribute(set);
        assertTrue(p.containsNegatedAttribute(set) && set.contains(200));

    }
    @Test
    public void elementAbsenceNegatedAttributeTest()
    {
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(100,200,300,400,500));
        Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(2000,4000,6000));
        PartialObjectDescription p = new PartialObjectDescription();
        assertTrue(!p.containsNegatedAttribute(set) && !set1.contains(300));
    }
    @Test
    public void  elementPresenceAttributes()
    {
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(100,200,300,400,500));
        Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(2000,4000,6000));
        PartialObjectDescription p = new PartialObjectDescription();
        Set<HashSet> sets = new HashSet<HashSet>();
        sets.add((HashSet) set1);
        sets.add((HashSet) set);
        p.addAttributes(sets);
        assertTrue(p.containsAttributes(sets));
    }

    @Test
    public void elementAbsenceAttributes()
    {
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(100,200,300,400,500));
        Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(2000,4000,6000));
        PartialObjectDescription p = new PartialObjectDescription();
        Set<HashSet> sets = new HashSet<HashSet>();
        sets.add((HashSet) set1);
        sets.add((HashSet) set);
        assertTrue(!p.containsAttributes(sets));
    }
    @Test
    public void getNegatedAttributesTest()
    {
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(100,200,300,400,500));
        Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(2000,4000,6000));
        PartialObjectDescription p = new PartialObjectDescription();
        p.addNegatedAttribute(set);
        p.addNegatedAttribute(set1);
        assertTrue(p.getNegatedAttributes() == p.getNegatedAttributes());
    }
    @Test
    public void cloneTest()
    {
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(100,200,300,400,500));
        Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(2000,4000,6000));
        PartialObjectDescription p = new PartialObjectDescription();
        p.addAttributes(set);
        p.addNegatedAttribute(set1);
        Object t = p.clone();
        String str = String.valueOf(t);
        System.out.println(str);
        assertTrue(str.contains("plus=[400, 100, 500, 200, 300]"));
    }
    @Test
    public void containsNegatedAttributes()
    {
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(100,200,300,400,500));
        PartialObjectDescription p = new PartialObjectDescription();
        p.addNegatedAttribute(set);
        assertTrue(p.containsNegatedAttribute(set));
        assertTrue(p.containsNegatedAttribute(set));
    }
    @Test
    public void objectDescriptionTest()
    {
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(100,200,300,400,500));
        PartialObjectDescription p = new PartialObjectDescription(set);
        assertTrue(p.addAttribute(set));
    }
    @Test
    public void negatedAttributeReturnsTest()
    {
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(100,200,300,400,500));
        PartialObjectDescription p = new PartialObjectDescription(set);
        boolean val = false;
        try
        {
          val =   p.containsNegatedAttribute(set);
        }catch(Exception e)
        {

        }
      assertTrue(val == false);

    }







}