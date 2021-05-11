class Move {
    public static void moveRobot(Robot robot, int toX, int toY) {
        int dx = toX - robot.getX();
        int dy = toY - robot.getY();
        if ((robot.getDirection() == Direction.UP) || (robot.getDirection() == Direction.DOWN)) {
            if (robot.getDirection() == Direction.UP) {
                if (dy < 0) {
                    robot.turnLeft();
                    robot.turnLeft();
                }
            } else if (dy > 0) {
                robot.turnLeft();
                robot.turnLeft();
            }
            if (dy < 0) {
                dy = dy * (-1);
            }
            for (int i = 0; i < dy; i++) {
                robot.stepForward();
            }
            robot.turnLeft();
            dy = 0;
        }
        if ((robot.getDirection() == Direction.LEFT) || (robot.getDirection() == Direction.RIGHT)) {
            if (robot.getDirection() == Direction.LEFT) {
                if (dx > 0) {
                    robot.turnLeft();
                    robot.turnLeft();
                }
            } else if (dx < 0) {
                robot.turnLeft();
                robot.turnLeft();
            }
            if (dx < 0) {
                dx = dx * (-1);
            }
            for (int i = 0; i < dx; i++) {
                robot.stepForward();
            }
            robot.turnLeft();
        }
        if ((robot.getDirection() == Direction.UP) || (robot.getDirection() == Direction.DOWN)) {
            if (robot.getDirection() == Direction.UP) {
                if (dy < 0) {
                    robot.turnLeft();
                    robot.turnLeft();
                }
            } else if (dy > 0) {
                robot.turnLeft();
                robot.turnLeft();
            }
            if (dy < 0) {
                dy = dy * (-1);
            }
            for (int i = 0; i < dy; i++) {
                robot.stepForward();
            }
        }
    }
}


enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        switch (this) {
            case UP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            default:
                throw new IllegalStateException();
        }
    }

    public Direction turnRight() {
        switch (this) {
            case UP:
                return RIGHT;
            case DOWN:
                return LEFT;
            case LEFT:
                return UP;
            case RIGHT:
                return DOWN;
            default:
                throw new IllegalStateException();
        }
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }
}

class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void stepForward() {
        x += direction.dx();
        y += direction.dy();
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}