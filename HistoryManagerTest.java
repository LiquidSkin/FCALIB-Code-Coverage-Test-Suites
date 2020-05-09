import de.tudresden.inf.tcs.fcaapi.Context;
import de.tudresden.inf.tcs.fcaapi.change.ContextChange;
import de.tudresden.inf.tcs.fcalib.change.HistoryManager;
import org.junit.Test;

import javax.swing.plaf.basic.BasicScrollPaneUI;

import static org.junit.Assert.*;

public class HistoryManagerTest {
    @Test
    public void elementAbsenceTest()
    {
        HistoryManager h = new HistoryManager();
        assertTrue(h.isEmpty());
    }
    @Test
    public void elementPresenceTest()
    {
        HistoryManager h = new HistoryManager();
        ContextChange<Integer> c = new ContextChange<Integer>() {
            @Override
            public void undo() {

            }

            @Override
            public int getType() {
                return 0;
            }
        };
        h.add(c);
        assertTrue(!h.isEmpty());

    }
    @Test
    public void TestUndoLastPresence()
    {
        HistoryManager h = new HistoryManager();
        ContextChange<Integer> c1 = new ContextChange<Integer>() {
            @Override
            public void undo() {

            }

            @Override
            public int getType() {
                return 0;
            }
        };
        ContextChange<Integer> c2 = new ContextChange<Integer>() {
            @Override
            public void undo() {

            }

            @Override
            public int getType() {
                return 0;
            }
        };
        h.add(c1);
        h.add(c2);
        h.undoLast();
        assertTrue(!h.isEmpty());

    }
    @Test
    public void undoLastAbsence()
    {
        HistoryManager h = new HistoryManager();
        ContextChange<Integer> c2 = new ContextChange<Integer>() {
            @Override
            public void undo() {

            }

            @Override
            public int getType() {
                return 0;
            }
        };
        h.push(c2);
        h.undoLast();
        assertTrue(h.isEmpty());
    }
    @Test
    public void pushTest()
    {
        HistoryManager h = new HistoryManager();
        ContextChange<Integer> c = new ContextChange<Integer>() {
            @Override
            public void undo() {

            }

            @Override
            public int getType() {
                return 0;
            }
        };
        h.push(c);
        assertTrue(!h.isEmpty());
    }
    @Test
    public void undoTest()
    {
        HistoryManager h = new HistoryManager();
        ContextChange<Integer> c = new ContextChange<Integer>() {
            @Override
            public void undo() {

            }

            @Override
            public int getType() {
                return 0;
            }
        };
        h.push(c);
        h.undo(c);
        assertTrue(h.isEmpty());
    }
   @Test
    public void undoLastNTest()
    {
        HistoryManager h = new HistoryManager();
        ContextChange<Integer> c = new ContextChange<Integer>() {
            @Override
            public void undo() {

            }

            @Override
            public int getType() {
                return 0;
            }
        };
        ContextChange<Integer> c1 = new ContextChange<Integer>() {
            @Override
            public void undo() {

            }

            @Override
            public int getType() {
                return 0;
            }
        };
        ContextChange<Integer> c2 = new ContextChange<Integer>() {
            @Override
            public void undo() {

            }

            @Override
            public int getType() {
                return 0;
            }
        };
        h.add(c1);
        h.add(c2);
        h.add(c);
        h.undoLastN(2);
        assertTrue(!h.isEmpty());
    }
    @Test
    public void undoAllTest()
    {

        HistoryManager h = new HistoryManager();
        ContextChange<Integer> c = new ContextChange<Integer>() {
            @Override
            public void undo() {

            }

            @Override
            public int getType() {
                return 0;
            }
        };
        ContextChange<Integer> c1 = new ContextChange<Integer>() {
            @Override
            public void undo() {

            }

            @Override
            public int getType() {
                return 0;
            }
        };
        h.undoAll();
        assertTrue(h.isEmpty());
    }


}