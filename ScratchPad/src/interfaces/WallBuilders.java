
package interfaces;

import java.util.ArrayList;

public class WallBuilders {

    interface WallBuilder {
        void buildWall();
    }

    static class WorkerRobot implements WallBuilder {

        @Override
        public void buildWall() {
        }
    }

    static class GuardRobot implements WallBuilder {

        @Override
        public void buildWall() {
        }
    }

    static class WateringCan {
    }

    public static void main(String[] args) {
        ArrayList robots = new ArrayList();
        robots.add(new WorkerRobot());
        robots.add(new GuardRobot());
        robots.add(new WateringCan());

        for (Object robot : robots) {
            if (robot instanceof  WallBuilder) {
                WallBuilder builder = (WallBuilder) robot;
                builder.buildWall();
            }
        }
    }

}
