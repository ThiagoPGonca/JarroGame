import java.util.Scanner;
public class main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        jarro jarro1 = new jarro(4, 0);
        jarro jarro2 = new jarro(3, 0);
        
        while (true){
        System.out.println("informe o que deseja fazer: \n1)Encher\n2)Esvaziar\n3)Transferir\n4)Quantidade\n5)Exit");
        int menu = input.nextInt();
        if (menu ==1){
            System.out.println("Informe o jarro que deseja encher: \n 1) Jarro 1 (4 Litros) \n 2) Jarro 2 (3 Litros)\n");
            int n = input.nextInt();
            if (n==1){
                jarro1.fill();}
            else{
                jarro2.fill();
            }
        }else if(menu == 2){
            System.out.println("Informe o jarro que deseja esvaziar: \n 1) Jarro 1 (4 Litros) \n 2) Jarro 2 (3 Litros)\n");
            int n = input.nextInt();
            if (n==1){
                jarro1.empty();}
            else{
                jarro2.empty();
            }
        }
        else if (menu ==3){
            System.out.println("Deseja transferir do...\n1)Do jarro 1 (4l) -> Jarro 2(3L)\n2)Jarro 2(3L) -> Jarro 1(4L)");
            int n = input.nextInt();
            if(n==1){
                jarro1.transfer(jarro2);
            }else {
              jarro2.transfer(jarro1);
            }
        }else if (menu == 4){
            System.out.println("Quantidade no jarro 1 (4L): ");
            jarro1.getjarro();
            System.out.println("Quantidade no jarro2 (3L): ");
            jarro2.getjarro();
        }
        else if (menu == 5){
            break;
        }
    }
    }
}

