class Ex3_10 {

    public static void main(String[] args) {

        int ON = 1;
        int lightSwitch = 1;

        int machine = lightSwitch;

        machine = machine ^ lightSwitch;
        System.out.println("machine is " + ((machine & ON) == ON ? "ON" : "OFF"));

        machine = machine ^ lightSwitch;
        System.out.println("machine is " + ((machine & ON) == ON ? "ON" : "OFF"));

        machine = machine ^ lightSwitch;
        System.out.println("machine is " + ((machine & ON) == ON ? "ON" : "OFF"));

    }

}
