package Persons;


import Enum.Names;
import Interface.Space;

public abstract class All extends Abstract implements Space {

    All(String name) {
        super(name);
    }

    @Override
    public void po(String n1, String n2) {
        System.out.print(n1+this.name+n2);
    }

    @Override
    public void po(String n, int s) {
        if (s==1) {
            System.out.print(n+this.name);
        } else{
            System.out.print(this.name+n);
        }
    }

    @Override
    public void po(String n1, String n2, Names em) {
        this.name = em.getValue();
        System.out.print(n1 + this.name + n2);
    }
    @Override
    public void po(String n, int s, Names em) {
        this.name=em.getValue();
        if (s==1) {
            System.out.print(n+this.name);
        } else{
            System.out.print(this.name+n);
        }
    }

    @Override
    public String po2(String n1, String n2) {
        return (n1+this.name+n2);
    }

    @Override
    public String po2(String n1, String n2, Names em) {
        this.name=em.getValue();
        return (n1+this.name+n2);
    }
}