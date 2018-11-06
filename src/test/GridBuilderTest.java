<<<<<<< HEAD
package src.test;

import src.main.Grid;
import src.main.GridBuilder;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

public class GridBuilderTest {

        @Test
        public void testBuildGrid() {
            //given
            GridBuilder gridBuilder = new GridBuilder(2, 2);
            Grid grid= gridBuilder.getGrid();

            //then
            assertNotNull(gridBuilder.getGrid().getGrid());
            assertEquals(0,gridBuilder.getGrid().getGrid()[0][0].getId());
            assertEquals(1,gridBuilder.getGrid().getGrid()[0][1].getId());
            assertEquals(2,gridBuilder.getGrid().getGrid()[1][0].getId());
            assertEquals(3,gridBuilder.getGrid().getGrid()[1][1].getId());

        }

    }


=======
//package test;
//
//import main.Grid;
//import main.GridBuilder;
//import org.junit.jupiter.api.Test;
//
//
//import static junit.framework.TestCase.assertNotNull;
//import static org.junit.Assert.assertEquals;
//
//public class GridBuilderTest {
//
//        @Test
//        public void testBuildGrid() {
//            //given
//            GridBuilder gridBuilder = new GridBuilder(2, 2);
//            Grid grid= gridBuilder.getGrid();
//
//            //then
//            assertNotNull(gridBuilder.getGrid().getGrid());
//            assertEquals(0,gridBuilder.getGrid().getGrid()[0][0].getId());
//            assertEquals(1,gridBuilder.getGrid().getGrid()[0][1].getId());
//            assertEquals(2,gridBuilder.getGrid().getGrid()[1][0].getId());
//            assertEquals(3,gridBuilder.getGrid().getGrid()[1][1].getId());
//
//        }
//
//    }
//
//
>>>>>>> 73715f37979eba63125b870e7fc1c62576f96f18
