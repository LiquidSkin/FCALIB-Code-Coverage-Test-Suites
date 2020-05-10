import de.tudresden.inf.tcs.fcaapi.FCAImplication;
import de.tudresden.inf.tcs.fcalib.FullObject;
import de.tudresden.inf.tcs.fcalib.PartialObject;
import de.tudresden.inf.tcs.fcalib.PartialObjectDescription;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class PartialObjectTest {

    @Test
    public void PartialObjectPresenceTestWithIdentifier()
    {
        int id = 1;
        PartialObject p = new PartialObject(id);
        Object res = p.getIdentifier();
        int i = (Integer) res;
        assertTrue(i == 1);

    }
    @Test
    public void PartialObjectPresenceWithIdentifiers()
    {
        PartialObjectDescription<String> pt = new PartialObjectDescription<String>();
        PartialObjectDescription<String> pt1 = new PartialObjectDescription<String>();
        HashSet<PartialObjectDescription> set = new HashSet<PartialObjectDescription>();
        HashSet<PartialObjectDescription> set1 = new HashSet<PartialObjectDescription>();
        pt.addAttribute("Soft and Smooth");
        pt.addAttribute("Haste and Waste");

        pt1.addNegatedAttribute("Negative attribute");
        pt1.addNegatedAttribute("Small Negated Attribute");

        set.add(pt);

        int id = 10;
        PartialObject p = new PartialObject(id,set);
        assertTrue(set.contains(pt));

    }
    @Test
    public void partialObjectPresenceWithNegatedAttributes()
    {
        PartialObjectDescription<String> pt = new PartialObjectDescription<String>();
        PartialObjectDescription<String> pt1 = new PartialObjectDescription<String>();
        HashSet<PartialObjectDescription> set = new HashSet<PartialObjectDescription>();
        HashSet<PartialObjectDescription> set1 = new HashSet<PartialObjectDescription>();
        pt.addAttribute("Soft and Smooth");
        pt.addAttribute("Haste and Waste");

        pt1.addNegatedAttribute("Negative attribute");
        pt1.addNegatedAttribute("Small Negated Attribute");
        set.add(pt);
        set1.add(pt1);
        int id = 10;
        PartialObject p = new PartialObject(id,set,set1);
        assertTrue(set1.contains(pt1));


    }


    @Test
    public void AttributeNamePresenceTest()
    {
        int id = 1;
        PartialObject p = new PartialObject(id);
        p.setName("SampleAttribute");
        String res = p.getName();
        assertTrue(res.equals("SampleAttribute"));
    }
    @Test
    public void AttributeDescriptorTest()
    {
        PartialObjectDescription<String> pt = new PartialObjectDescription<String>();
        HashSet<PartialObjectDescription> set = new HashSet<PartialObjectDescription>();
        pt.addAttribute("Soft and Smooth");
        pt.addAttribute("Haste and Waste");
        set.add(pt);
        int id = 10;
        PartialObject p = new PartialObject(id,set);
        Object ob = p.getDescription();
        String res = ob.toString();
        assertTrue(res.contains("Haste and Waste"));

    }
    @Test
    public void testPartialImplication()
    {
        FCAImplication impl = new FCAImplication() {
            @Override
            public Set getPremise() {
                return new HashSet<Integer>(Arrays.asList(1,2,3,4));
            }

            @Override
            public Set getConclusion() {
                return new HashSet<Integer>(Arrays.asList(10,20,30));
            }

            @Override
            public boolean equals(FCAImplication imp) {
                return false;
            }
        };
        HashSet<HashSet> set = new HashSet<HashSet>();
        set.add((HashSet) impl.getPremise());
        set.add((HashSet) impl.getConclusion());
        int id = 10;
        PartialObject fd = new PartialObject(10, set);
        assertTrue(fd.respects(impl));
    }
    @Test
    public void testRefuteImplication()
    {
        FCAImplication impl = new FCAImplication() {
            @Override
            public Set getPremise() {
                return new HashSet<Integer>(Arrays.asList(1,2,3,4));
            }

            @Override
            public Set getConclusion() {
                return new HashSet<Integer>(Arrays.asList(10,20,30));
            }

            @Override
            public boolean equals(FCAImplication imp) {
                return false;
            }
        };
        HashSet<HashSet> set = new HashSet<HashSet>();
        HashSet<Integer> setOne = new HashSet<Integer>();
        setOne.add(20000);
        setOne.add(40000);
        set.add(setOne);
        int id = 10;
        PartialObject fd = new PartialObject(10, set);
        assertTrue(!fd.refutes(impl));

    }
    @Test
    public void StringTest()
    {
        HashSet<Object> set = new HashSet<Object>();
        set.add("sampleName");
        set.add("This is a sample description");
        int id = 1;
        PartialObject f = new PartialObject(1,set);
        String result = f.toString();
        assertTrue(result.contains("sampleName"));
    }

}