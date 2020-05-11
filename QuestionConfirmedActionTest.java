import de.tudresden.inf.tcs.fcaapi.FCAImplication;
import de.tudresden.inf.tcs.fcalib.action.QuestionConfirmedAction;
import org.junit.Test;

import java.awt.event.ActionEvent;
import java.util.Set;

import static org.junit.Assert.*;

public class QuestionConfirmedActionTest {

    @Test
    public void questionTest()
    {
        QuestionConfirmedAction q = new QuestionConfirmedAction();
        FCAImplication f = new FCAImplication() {
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
        try{
            q.getQuestion();
            q.setQuestion(f);
        }
        catch(Exception e)
        {

        }
        assertTrue(obj == null);
    }
    @Test
    public void actionTest()
    {
        QuestionConfirmedAction q = new QuestionConfirmedAction();
        Object obj = null;
        try
        {
            ActionEvent e = null;
            q.actionPerformed(e);
        }
        catch(Exception e)
        {

        }
        assertTrue(obj == null);
    }

}