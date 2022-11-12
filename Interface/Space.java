package Interface;

import Enum.Names;

public interface Space {
    public void po(String n1, String n2);
    public void po(String n, int s);
    public void po(String n1, String n2,Names em);
    public void po(String n, int s,Names em);
    public String po2(String n1,String n2);
    public String po2(String n1, String n2, Names em);
}