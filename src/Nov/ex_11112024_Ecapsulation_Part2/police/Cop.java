package Nov.ex_11112024_Ecapsulation_Part2.police;

public class Cop {

    private int gun;
    public String iCard;

    public Cop(int gun){
        this.gun = gun;
    }

    protected void canIShoot(){
        System.out.println("Yes, You can!!");
    }






}



