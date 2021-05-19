import java.util.Scanner;

public class Advertisement {

    public static void radioAdvertisement(){
        double rcp=1.33333333333;  //  20/15
        double rcpsbh=70;
        double rcpse=60;
        double rcpsow=35;
        double totalplacementradioadcost=0;
        double crprep=0;
        double ra;
        double srd[]=new double[100];
        double rd[]=new double[100];
        Scanner scan = new Scanner(System.in);
        System.out.print("\t Enter number of advertisements you want: ");
        ra = scan.nextInt();
        for(int i=1;i<=ra;i++){
            System.out.print("\t Enter duration for advertisement "+i+"(in sec): ");
            rd[i]=scan.nextInt();
        }
        for(int i=1;i<=ra;i++){
            srd[i]=rd[i]*rcp;
            crprep=crprep+srd[i];
        }
        System.out.println("\t Radio Advertisement Prepration Cost is : $"+Math.ceil(crprep));
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.print("\t Enter number of radio stations you want to be played on during business hours: ");
        double rsbh = scan.nextInt();
        System.out.print("\t Enter number of weekes you want to be radio station played on during business hours: ");
        double rsbhwk = scan.nextInt();
        System.out.print("\t Enter number of radio stations you want to be played on during evenings: ");
        double rse = scan.nextInt();
        System.out.print("\t Enter number of weekes you want to be radio station played on during evenings: ");
        double rsewk = scan.nextInt();
        System.out.print("\t Enter number of radio stations you want to be played on during overnight and weekends: ");
        double rsow = scan.nextInt();
        System.out.print("\t Enter number of weekes you want to be radio station played on during overnight and weekends: ");
        double rsowwk = scan.nextInt();
        totalplacementradioadcost=totalplacementradioadcost+((rsbhwk*rsbh*rcpsbh)+(rsewk*rse*rcpse)+(rsowwk*rsow*rcpsow));
        System.out.println("\t Radio Advertisement Placement Cost is : $"+Math.ceil(totalplacementradioadcost));
        System.out.println("\t Total Radio Advertisement Cost is : $"+Math.ceil(crprep+totalplacementradioadcost));
        System.out.println("============================================================================================");
        mainMenu();
    }





    public static void televisionAdvertisement(){
        double tbcp=3.666666;
        double tvcp=8.333333;
        double tchecp=400;
        double tcmecp=280;
        double tclecp=150;
        double tspcp=0;
        double tdbcp=0;
        double tdvcp=0;
        double totaltvprepcost=0;
        double totalplacementtvadcost=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("\t Enter duration you want to show images in television advertisement(in sec): ");
        double tdb = scan.nextInt();
        if(tdb<=30 && tdb>0){
            tdbcp=tbcp*30;
        }
        if(tdb>30){
            tdbcp=tbcp*tdb;
        }
        System.out.print("\t Enter duration you want to show filmed footage in television advertisement(in sec): ");
        double tdv = scan.nextInt();
        if(tdv<=30 && tdv>0){
            tdvcp=tvcp*30;
        }
        if(tdv>30){
            tdvcp=tvcp*tdv;
        }
        totaltvprepcost=totaltvprepcost+tdbcp+tdvcp;
        System.out.println("\t Radio Advertisement Prepration Cost is : $"+Math.ceil(totaltvprepcost));
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.print("\t Enter how many channels you want to have high exposure for television advertisement: ");
        double tnche = scan.nextInt();
        System.out.print("\t Enter number of weekes you want high exposure television advertisement: ");
        double rnchewk = scan.nextInt();
        System.out.print("\t Enter how many channels you want to have medium exposure for television advertisement: ");
        double tncme = scan.nextInt();
        System.out.print("\t Enter number of weekes you want high exposure medium advertisement: ");
        double rncmewk = scan.nextInt();
        System.out.print("\t Enter how many channels you want to have low exposure for television advertisement: ");
        double tncle = scan.nextInt();
        System.out.print("\t Enter number of weekes you want low exposure television advertisement: ");
        double rnclewk = scan.nextInt();

        System.out.println("\t Enter whether you want feature in any specific type of programs, such as sports, news, children’s programs.: ");
        System.out.println("\t Press y for YES and n for NO: ");
        System.out.print("\t Enter your choice: ");
        char tspyn = scan.next().charAt(0);
        if(tspyn=='y' || tspyn=='Y' ){
            tspcp=100;
            System.out.print("\t Enter number of weekes you want feature in any specific type of programs: ");
            double rnspwk = scan.nextInt();
            tspcp=tspcp*rnspwk;
        }
        if(tspyn=='n' || tspyn=='N' ){
            tspcp=0;
        }
        totalplacementtvadcost=totalplacementtvadcost+((rnchewk*tnche*tchecp)+(rncmewk*tncme*tcmecp)+(rnclewk*tncle*tclecp)+(tspcp));
        System.out.println("\t Television Advertisement Placement Cost is : $"+Math.ceil(totalplacementtvadcost));
        System.out.println("\t Total Television Advertisement Cost is : $"+Math.ceil(totaltvprepcost+totalplacementtvadcost));
        System.out.println("============================================================================================");
        mainMenu();

    }







    public static void newspaperAdvertisement(){
        double nbcp=1.35;
        double ngcp=0;
        double nbwfccp=2.20;
        double nppcp=0;

        double totalplacementnewsadcost=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("\t Enter dimension of advertisement in newspaper (in centimeters)-> ");
        System.out.print("\t Enter height of advertisement : ");
        double nh = scan.nextDouble();
        System.out.print("\t Enter width of advertisement : ");
        double nw = scan.nextDouble();
        double nar= nh*nw;
        double naecp=nar*nbcp;
        System.out.println("\t Enter whether graphic design work is needed ");
        System.out.println("\t Press y for YES and n for NO: ");
        System.out.print("\t Enter your choice: ");
        char ngw = scan.next().charAt(0);
        if(ngw=='y' || ngw=='Y' ){
            ngcp=20;
        }
        if(ngw=='n' || ngw=='N' ){
            ngcp=0;
        }
        System.out.println("\t Enter 1 for plain black-and-white advertisements ");
        System.out.println("\t Enter 2 for full-colour advertisements ");
        System.out.print("\t Enter your choice::");
        int choicen = scan.nextInt();
        if(choicen==1){
            nbwfccp=2.20*nar;
        }
        if(choicen==2){
            nbwfccp=4.80*nar;
        }
        System.out.println("\t Enter whether advertisement is needed to appear in a prominent place within the newspaper");
        System.out.println("\t Press y for YES and n for NO: ");
        System.out.print("\t Enter your choice: ");
        char npp = scan.next().charAt(0);
        if(npp=='y' || npp=='Y' ){
            nppcp=10;
        }
        if(npp=='n' || npp=='N' ){
            nppcp=0;
        }
        System.out.print("\t Enter number of newspapers you want in advertisement: ");
        double nn = scan.nextDouble();
        totalplacementnewsadcost=totalplacementnewsadcost+(nn*(naecp+ngcp+nbwfccp+nppcp));
        System.out.println("\t Total Newspaper Advertisement Cost is : $"+Math.ceil(totalplacementnewsadcost));
        System.out.println("============================================================================================");
        mainMenu();
    }





    public static void mainMenu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\t Enter 1 for Radio and Spotify advertising campaigns ");
        System.out.println("\t Enter 2 for Television advertising campaigns ");
        System.out.println("\t Enter 3 for Newspaper advertising campaigns ");
        System.out.println("\t Enter 0 to EXIT: ");
        System.out.print("\t Enter your choice::");
        int choice = scan.nextInt();
        System.out.println();


        switch(choice){
            case 1: System.out.println("\t\tWelcome to Radio and Spotify advertising campaigns");
                System.out.println();
                radioAdvertisement();
                break;
            case 2: System.out.println("\t\tWelcome to Television advertising campaigns");
                System.out.println();
                televisionAdvertisement();
                break;
            case 3: System.out.println("\t\tWelcome to Newspaper advertising campaigns");
                System.out.println();
                newspaperAdvertisement();
                break;
            case 0: System.out.println("Thanks for using our services. Visit again!!!");
                System.exit(0);
                break;
            default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
                mainMenu();
        }
    }



    public static void main(String[] args){
        System.out.println();
        System.out.println("\t\tWelcome to Advertising Agency Services\n");
        mainMenu();

    }
}
