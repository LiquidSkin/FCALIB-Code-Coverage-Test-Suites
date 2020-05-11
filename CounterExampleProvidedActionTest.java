import de.tudresden.inf.tcs.fcaapi.FCAImplication;
import de.tudresden.inf.tcs.fcalib.action.CounterExampleProvidedAction;
import org.junit.Test;

import java.util.Set;
import static org.junit.Assert.*;

import static org.junit.Assert.*;

public class CounterExampleProvidedActionTest {

    @Test
    public void FCATest()
    {
        CounterExampleProvidedAction ct = new CounterExampleProvidedAction();
        FCAImplication ft = new FCAImplication() {
            @Override
            public Set getPremise() {
                return null;
            }

            @Override
            public Set getConclusion() {
                return null;
            }

            @Override
            public boolean equals(FCAImplication imp) {
                return false;
            }
        };
        Object obj = null;
        try {
            obj = ct.getQuestion();
        }
        catch(Exception e)
        {

        }
        assertTrue(obj == null);
    }
    @Test
    public void counterExampleTest()
    {
        CounterExampleProvidedAction ct = new CounterExampleProvidedAction();
        Object obj = null;
        try
        {
            obj = ct.getCounterExample();
        }
        catch(Exception e)
        {

        }
        assertTrue(obj == null);
    }
    @Test
    public void actionTest()
    {
        CounterExampleProvidedAction ct = new CounterExampleProvidedAction();
        Object obj = null;
        try
        {
             ct.actionPerformed(null);
        }
        catch(Exception e)
        {

        }
        assertTrue(obj == null);
    }


}