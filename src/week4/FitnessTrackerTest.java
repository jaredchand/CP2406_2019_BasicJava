package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FitnessTrackerTest {

    @Test
    void getActivity() {
        FitnessTracker fitnessTracker = new FitnessTracker();
        assertEquals(fitnessTracker.getActivity(), "running");
    }

    @Test
    void setActivity() {
        FitnessTracker fitnessTracker = new FitnessTracker();
        fitnessTracker.setActivity("walking");
        assertEquals(fitnessTracker.getActivity(), "walking");
    }

    @Test
    void getMinutes() {
        FitnessTracker fitnessTracker = new FitnessTracker();
        assertEquals(fitnessTracker.getMinutes(), 0);
    }

    @Test
    void setMinutes() {
        FitnessTracker fitnessTracker = new FitnessTracker();
        fitnessTracker.setMinutes(1);
        assertEquals(fitnessTracker.getMinutes(), 1);
    }

    @Test
    void getDate() {
        FitnessTracker fitnessTracker = new FitnessTracker();
        assertEquals(fitnessTracker.getDate(), "01/01/2019");
    }

    @Test
    void setDate() {
        FitnessTracker fitnessTracker = new FitnessTracker();
        fitnessTracker.setDate("02/02/2019");
        assertEquals(fitnessTracker.getDate(), "02/02/2019");
    }

    @Test
    void testConstructor() {
        FitnessTracker fitnessTracker = new FitnessTracker("swimming", 60, "01/12/2020");
        assertEquals(fitnessTracker.getDate(), "01/12/2020");
        assertEquals(fitnessTracker.getMinutes(), 60);
        assertEquals(fitnessTracker.getActivity(), "swimming");

    }
}
