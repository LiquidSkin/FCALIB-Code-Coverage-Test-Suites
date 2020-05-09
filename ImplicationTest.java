import de.tudresden.inf.tcs.fcalib.Implication;
import org.junit.Test;
import java.util.*;

import static org.junit.Assert.*;

public class ImplicationTest {

    @Test
    public void testImplicationContainsElement()
    {
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(1,2,3));
        Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(4,5,6));
        Implication i = new Implication(set,set1);
        assertTrue(i == i);
        assertTrue(set.contains(1));

    }
    @Test
    public void testImplicationDoesNotContainsElement()
    {
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> set1 = new HashSet<Integer>();
        Implication i = new Implication(set,set1);
        assertTrue(set.isEmpty());
        assertTrue(set1.isEmpty());

    }
    @Test
    public void presenceOfElementInPremiseAndConclusion()
    {
        Set<Integer> premise = new HashSet<Integer>(Arrays.asList(10,20,30));
        Set<Integer> conclusion = new HashSet<Integer>(Arrays.asList(100,200,300));
        Implication i = new Implication(premise,conclusion);
        assertTrue(premise.contains(20) && conclusion.contains(100));
    }
    @Test
    public void firstElementInPremiseAndConclusion()
    {
        Set<String> premise = new LinkedHashSet<String>(Arrays.asList("the", "fox", "is", "here"));
        Set<String> conclusion = new LinkedHashSet<String>(Arrays.asList("I", "am" , "here", "just"));
        Implication i = new Implication(premise,conclusion);
        Iterator<String> itr = premise.iterator();
        Iterator<String> itr1 = conclusion.iterator();
        assertTrue(itr.next() == "the");
        assertTrue(itr1.next() == "I");


    }
    @Test
    public void getPremiseTest()
    {
        Set<Integer> premise = new LinkedHashSet<Integer>(Arrays.asList(10,20,30,40));
        Set<Integer> conclusion = new LinkedHashSet<Integer>(Arrays.asList(100,150,200,300,400));
        Implication it = new Implication(premise,conclusion);
        Set<Integer> set = it.getPremise();
        assertTrue(premise.equals(set));

    }
    @Test
    public void getConclusionTest()
    {
        Set<Integer> premise = new LinkedHashSet<Integer>(Arrays.asList(10,20,30,40));
        Set<Integer> conclusion = new LinkedHashSet<Integer>(Arrays.asList(100,150,200,300,400));
        Implication it = new Implication(premise,conclusion);
        Set<Integer> set = it.getConclusion();
        assertTrue(conclusion.equals(set));

    }
    @Test
    public void equalsTest()
    {
        Set<Integer> premise = new LinkedHashSet<Integer>(Arrays.asList(10,20,30,40));
        Set<Integer> conclusion = new LinkedHashSet<Integer>(Arrays.asList(100,150,200,300,400));
        Implication it = new Implication(premise,conclusion);
        Implication it1 = new Implication(premise,conclusion);
        assertTrue(it.equals(it1));
    }
    @Test
    public void stringTest()
    {
        Set<Integer> premise = new LinkedHashSet<Integer>(Arrays.asList(10,20,30,40));
        Set<Integer> conclusion = new LinkedHashSet<Integer>(Arrays.asList(100,150,200,300,400));
        Implication it = new Implication(premise,conclusion);
        String result = it.toString();
        assertTrue(!result.isEmpty());

    }
    @Test
    public void implicationTest()
    {
        Implication i = new Implication();
        assertTrue(i.getConclusion().isEmpty());
    }




}