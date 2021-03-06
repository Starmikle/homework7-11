package homework7;

public class Torso extends RobotPart {
    private int defence;

    public Torso(Robot robot, String name, int valueLevel) {
        super(robot, name);
        this.robotLevel = valueLevel;
        this.defence = 5;
    }


    public void getDamage(int value) {
        int tmp = value / defence;
        this.structureHealth -= tmp;
        System.out.println(this.nameParts + " get damage " + tmp + " point(s)");
    }

}
