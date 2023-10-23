public class centralBank {

    int getRateofInterest (){
        return 2;
    }
}
class BOC{
    int getRateofInterest (){
        return 8;
    }
}
class HNB{
    int getRateofInterest (){
        return 6;
    }
}
class NSB{
    int getRateofInterest (){
        return 7;
    }
}

class testOverride{
    public static void main(String[] args) {
        BOC b = new BOC();
        HNB h = new HNB();
        NSB n = new NSB();
        System.out.println("BOC rate of interest : " + b.getRateofInterest());
        System.out.println("HNB rate of interest : " + h.getRateofInterest());
        System.out.println("NSB rate of interest : " + n.getRateofInterest());

    }

}
