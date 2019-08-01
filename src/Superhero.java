class SuperHero extends Person {
    private String alterEgo;
    public SuperHero(String name, String alterEgo) {
        super(name);
        this.alterEgo = alterEgo;
    }
    public String getName() {
        return alterEgo;
    }
    public String getSecretIdentity() {
        return super.getName();
    }

    public static void main (String[] args) {
        SuperHero theManOfSteel = new SuperHero("Clark Kent", "Superman");
        theManOfSteel.sayHello();
        System.out.println(theManOfSteel.getName()); // "Superman"
        System.out.println(theManOfSteel.getSecretIdentity()); // "Clark Kent"
    }
}