import de.tudresden.inf.tcs.fcalib.FullObject;
import de.tudresden.inf.tcs.fcalib.FullObjectDescription;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.*;

public class FullObjectDescriptionTest {

    @Test
    public void fullObjectAttributeAbsenceTest()
    {
        FullObjectDescription f = new FullObjectDescription();
        Object obj = f.getAttributes();
        String result = String.valueOf(obj);
        assertTrue(result.equals("[]"));
    }
    @Test
    public void fullObjectAttributePresenceTest()
    {
        FullObjectDescription f = new FullObjectDescription();
        HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(1,2,3));
        f.addAttribute(set);
        assertTrue(f.containsAttribute(set));

    }
    @Test
    public void checkParticularAttributePresenceTest()
    {
        FullObjectDescription f = new FullObjectDescription();
        HashSet<Integer> set =  new HashSet<Integer>(Arrays.asList(1,2,3));
        HashSet<Integer> set1 = new HashSet<Integer>(Arrays.asList(5,6,7));
        HashSet<Integer> set2 = new HashSet<Integer>(Arrays.asList(10,11,12));
        HashSet<HashSet> sets = new HashSet<HashSet>();
        sets.add(set);
        sets.add(set1);
        sets.add(set2);
        f.addAttributes(sets);
        assertTrue(f.containsAttribute(set));
    }
    @Test
    public void checkParticularAttributeAbsenceTest()
    {
        FullObjectDescription f = new FullObjectDescription();
        HashSet<Integer> set =  new HashSet<Integer>(Arrays.asList(1,2,3));
        HashSet<Integer> set1 = new HashSet<Integer>(Arrays.asList(5,6,7));
        HashSet<Integer> set2 = new HashSet<Integer>(Arrays.asList(10,11,12));
        HashSet<HashSet> sets = new HashSet<HashSet>();
        sets.add(set);
        sets.add(set1);
        f.addAttributes(sets);
        assertTrue(!f.containsAttribute(set2));
    }
    @Test
    public void checkEntireAttributesPresenceTest()
    {
        FullObjectDescription f = new FullObjectDescription();
        HashSet<Integer> set =  new HashSet<Integer>(Arrays.asList(1,2,3));
        HashSet<Integer> set1 = new HashSet<Integer>(Arrays.asList(5,6,7));
        HashSet<Integer> set2 = new HashSet<Integer>(Arrays.asList(10,11,12));
        HashSet<HashSet> sets = new HashSet<HashSet>();
        sets.add(set);
        sets.add(set1);
        sets.add(set2);
        f.addAttributes(sets);
        assertTrue(f.containsAttributes(sets));
    }
    @Test
    public void checkEntireAttributesAbsenceTest()
    {
        FullObjectDescription f = new FullObjectDescription();
        HashSet<Integer> set =  new HashSet<Integer>(Arrays.asList(1,2,3));
        HashSet<Integer> set1 = new HashSet<Integer>(Arrays.asList(5,6,7));
        HashSet<Integer> set2 = new HashSet<Integer>(Arrays.asList(1000,2000));
        HashSet<Integer> set3 = new HashSet<Integer>(Arrays.asList(5000,3400));
        HashSet<HashSet> sets = new HashSet<HashSet>();
        HashSet<HashSet> sets2 = new HashSet<HashSet>();
        sets.add(set);
        sets.add(set1);
        sets2.add(set2);
        sets2.add(set3);
        f.addAttributes(sets);
        assertTrue(!f.containsAttributes(sets2));
    }
    @Test
    public void removeAttributesTest()
    {
        FullObjectDescription f = new FullObjectDescription();
        HashSet<Integer> set =  new HashSet<Integer>(Arrays.asList(1,2,3));
        HashSet<Integer> set1 = new HashSet<Integer>(Arrays.asList(5,6,7));
        f.addAttribute(set);
        f.addAttribute(set1);
        f.removeAttribute(set);
        assertTrue(!f.containsAttribute(set));
    }
    @Test
    public void cloneAttributeTest()
    {
        FullObjectDescription f = new FullObjectDescription();
        HashSet<Integer> set =  new HashSet<Integer>(Arrays.asList(1,2,3));
        f.addAttribute(set);
        FullObjectDescription t = (FullObjectDescription) f.clone();
        String result = t.toString();
        System.out.println("The Object is" + " " + result);
        assertTrue(result.contains("FullObject"));

    }

}