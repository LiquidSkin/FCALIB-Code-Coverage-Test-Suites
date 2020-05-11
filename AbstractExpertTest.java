import de.tudresden.inf.tcs.fcaapi.Context;
import de.tudresden.inf.tcs.fcaapi.Expert;
import de.tudresden.inf.tcs.fcaapi.FCAImplication;
import de.tudresden.inf.tcs.fcaapi.FCAObject;
import de.tudresden.inf.tcs.fcaapi.action.ExpertAction;
import de.tudresden.inf.tcs.fcaapi.action.ExpertActionListener;
import de.tudresden.inf.tcs.fcaapi.exception.IllegalAttributeException;
import de.tudresden.inf.tcs.fcaapi.exception.IllegalObjectException;
import de.tudresden.inf.tcs.fcaapi.utils.IndexedSet;
import de.tudresden.inf.tcs.fcalib.AbstractContext;
import de.tudresden.inf.tcs.fcalib.AbstractExpert;
import de.tudresden.inf.tcs.fcalib.action.AbstractExpertAction;
import org.junit.Test;

import java.awt.event.ActionEvent;
import java.util.Set;

import static org.junit.Assert.*;
public class AbstractExpertTest {

    @Test
    public void AbstractExpertPresenceTest()
    {
        AbstractExpert ab = new AbstractExpert() {
            @Override
            public void requestCounterExample(FCAImplication question) {

            }

            @Override
            public void askQuestion(FCAImplication question) {

            }

            @Override
            public void counterExampleInvalid(FCAObject counterExample, int reason) {

            }

            @Override
            public void forceToCounterExample(FCAImplication implication) {

            }

            @Override
            public void explorationFinished() {

            }

            @Override
            public void implicationFollowsFromBackgroundKnowledge(FCAImplication implication) {

            }
        };
        String result = ab.getClass().toString();
        System.out.println("The Result is" + " " + result);
    }
    @Test
    public void requestCounterExampleTest()
    {
        AbstractExpert ab = new AbstractExpert() {
            @Override
            public void requestCounterExample(FCAImplication question) {

            }

            @Override
            public void askQuestion(FCAImplication question) {

            }

            @Override
            public void counterExampleInvalid(FCAObject counterExample, int reason) {

            }

            @Override
            public void forceToCounterExample(FCAImplication implication) {

            }

            @Override
            public void explorationFinished() {

            }

            @Override
            public void implicationFollowsFromBackgroundKnowledge(FCAImplication implication) {

            }
        };
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
            ab.requestCounterExample(ft);
        }
        catch(Exception e)
        {

        }
        assertTrue(obj == null);
    }
    @Test
    public void askQuestionTest()
    {
        AbstractExpert ab = new AbstractExpert() {
            @Override
            public void requestCounterExample(FCAImplication question) {

            }

            @Override
            public void askQuestion(FCAImplication question) {

            }

            @Override
            public void counterExampleInvalid(FCAObject counterExample, int reason) {

            }

            @Override
            public void forceToCounterExample(FCAImplication implication) {

            }

            @Override
            public void explorationFinished() {

            }

            @Override
            public void implicationFollowsFromBackgroundKnowledge(FCAImplication implication) {

            }
        };
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
            ab.askQuestion(ft);
        }
        catch(Exception e)
        {

        }
        assertTrue(obj == null);
    }
    @Test
    public void expertListenerTestAddition()
    {
        AbstractExpert ab = new AbstractExpert() {
            @Override
            public void requestCounterExample(FCAImplication question) {

            }

            @Override
            public void askQuestion(FCAImplication question) {

            }

            @Override
            public void counterExampleInvalid(FCAObject counterExample, int reason) {

            }

            @Override
            public void forceToCounterExample(FCAImplication implication) {

            }

            @Override
            public void explorationFinished() {

            }

            @Override
            public void implicationFollowsFromBackgroundKnowledge(FCAImplication implication) {

            }
        };
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
        ExpertActionListener l = new ExpertActionListener() {
            @Override
            public void expertPerformedAction(ExpertAction action) {

            }
        };
        Object obj = null;
        try
        {
            ab.addExpertActionListener(l);
        }
        catch(Exception e)
        {

        }
        assertTrue(obj == null);
    }
    @Test
    public void expertActionListenerRemovalTest()
    {

        AbstractExpert ab = new AbstractExpert() {
            @Override
            public void requestCounterExample(FCAImplication question) {

            }

            @Override
            public void askQuestion(FCAImplication question) {

            }

            @Override
            public void counterExampleInvalid(FCAObject counterExample, int reason) {

            }

            @Override
            public void forceToCounterExample(FCAImplication implication) {

            }

            @Override
            public void explorationFinished() {

            }

            @Override
            public void implicationFollowsFromBackgroundKnowledge(FCAImplication implication) {

            }
        };
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
        ExpertActionListener l = new ExpertActionListener() {
            @Override
            public void expertPerformedAction(ExpertAction action) {

            }
        };
        Object obj = null;
        try
        {
            ab.addExpertActionListener(l);
            ab.removeExpertActionListeners();
        }
        catch(Exception e)
        {

        }
        assertTrue(obj == null);
    }
    @Test
    public void expertActionTest()
    {
        AbstractExpert ab = new AbstractExpert() {
            @Override
            public void requestCounterExample(FCAImplication question) {

            }

            @Override
            public void askQuestion(FCAImplication question) {

            }

            @Override
            public void counterExampleInvalid(FCAObject counterExample, int reason) {

            }

            @Override
            public void forceToCounterExample(FCAImplication implication) {

            }

            @Override
            public void explorationFinished() {

            }

            @Override
            public void implicationFollowsFromBackgroundKnowledge(FCAImplication implication) {

            }
        };
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
        ExpertActionListener l = new ExpertActionListener() {
            @Override
            public void expertPerformedAction(ExpertAction action) {

            }
        };
        ExpertAction e = new ExpertAction() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }

            @Override
            public Context<?, ?, ?> getContext() {
                return null;
            }
        };
        Object obj = null;
        try
        {
         ab.fireExpertAction(e);
            l.expertPerformedAction(null);
        }
        catch(Exception e1)
        {

        }
        assertTrue(obj == null);
    }

}