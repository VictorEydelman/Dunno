package Persons;

import Interface.people;

public abstract class Alper extends All implements people {
    Alper(String name) {
        super(name);
    }
    @Override
    public void in(String n1, String n2, int s, String r1){
        if (s==0) {
            System.out.print(this.name+n1+r1+n2);
        } else {
            System.out.print(n1 + r1+this.name+ n2);
        }
    }

}