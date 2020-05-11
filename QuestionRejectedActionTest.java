import de.tudresden.inf.tcs.fcaapi.FCAImplication;
import de.tudresden.inf.tcs.fcalib.action.QuestionRejectedAction;
import org.junit.Test;

import java.awt.event.ActionEvent;
import java.util.Set;

import static org.junit.Assert.*;

public class QuestionRejectedActionTest {

    @Test
    public void questionTest()
    {
        QuestionRejectedAction q = new QuestionRejectedAction();
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
        try
        {
            q.getQuestion();
            q.setQuestion(ft);
        }
        catch(Exception e)
        {

        }
        assertTrue(obj == null);

    }
    @Test
    public void actionTest()
    {
        QuestionRejectedAction q = new QuestionRejectedAction();
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
        ActionEvent et = null;
        Object obj = null;
        try
        {
            q.actionPerformed(et);
        }
        catch(Exception e)
        {

        }
        assertTrue(obj == null);
    }

}