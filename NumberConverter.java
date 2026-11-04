import java.util.*;

class NumberConverter{

    public static void clearConsole(){ 
        try{
            String os=System.getProperty("os.name"); 
            if(os.contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }else{
                System.out.print("\033[H\033[2J"); 
                System.out.flush();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        L1:do{
            clearConsole();
            System.out.println("\n\n\n\t\t\t\t\t __   ______             __");                
            System.out.println("\t\t\t\t\t|  \\ /      \\           |  \\");                
            System.out.println("\t\t\t\t\t \\$$|  $$$$$$\\  ______  | $$  _______");      
            System.out.println("\t\t\t\t\t|  \\| $$   \\$$ |      \\ | $$ /       \\");      
            System.out.println("\t\t\t\t\t| $$| $$        \\$$$$$$\\| $$|  $$$$$$$");      
            System.out.println("\t\t\t\t\t| $$| $$   __  /      $$| $$| $$");            
            System.out.println("\t\t\t\t\t| $$| $$__/  \\|  $$$$$$$| $$| $$_____");       
            System.out.println("\t\t\t\t\t| $$ \\$$    $$ \\$$    $$| $$ \\$$     \\");      
            System.out.println("\t\t\t\t\t \\$$  \\$$$$$$   \\$$$$$$$ \\$$  \\$$$$$$$");      
                                                        
            System.out.println("\n   _   _                       _                        _____                                         _");                 
            System.out.println("  | \\ | |                     | |                      / ____|                                       | |");                
            System.out.println("  |  \\| |  _   _   _ __ ___   | |__     ___   _ __    | |        ___    _ __   __   __   ___   _ __  | |_    ___   _ __"); 
            System.out.println("  | . ` | | | | | | '_ ` _ \\  | '_ \\   / _ \\ | '__|   | |       / _ \\  | '_ \\  \\ \\ / /  / _ \\ | '__| | __|  / _ \\ | '__|");
            System.out.println("  | |\\  | | |_| | | | | | | | | |_) | |  __/ | |      | |____  | (_) | | | | |  \\ V /  |  __/ | |    | |_  |  __/ | |");   
            System.out.println("  |_| \\_|  \\__,_| |_| |_| |_| |_.__/   \\___| |_|       \\_____|  \\___/  |_| |_|   \\_/    \\___| |_|     \\__|  \\___| |_|");   
            System.out.println("\n===========================================================================================================================");                                                                                                                            
            
            System.out.println("\n\n\n\t[01] Decimal Converter");
            System.out.println("\n\t[02] Binary Converter");
            System.out.println("\n\t[03] Octal Converter");
            System.out.println("\n\t[04] Hexadecimal Converter");
            System.out.println("\n\t[05] Roman Number Converter");

            System.out.print("\n\nEnter Option -> ");
            int option=input.nextInt();

            switch(option){
                case 1: // Decimal Converter
                    L2:do{
                        clearConsole();
                        System.out.println("+-------------------------------------------+");
                        System.out.println("|            Decimal Converter              |");
                        System.out.println("+-------------------------------------------+");
                        System.out.print("\n\nEnter an Decimal number: ");
                        int decimal=input.nextInt();
                        int temp=decimal;
                        if(decimal>=0){
                            do{
                                int num=temp%10;
                                temp/=10;
                                if(num>9){
                                    System.out.println("\tInvalid input...");
                                    System.out.print("\nDo you want to input number again (Y/N) -> ");
                                    char c=input.next().charAt(0);
                                    if(c=='Y'||c=='y'){
                                        clearConsole();
                                        continue L2;
                                    }else if(c=='N'||c=='n'){
                                        clearConsole();
                                        continue L1;
                                    }
                                }
                            }while(temp>0);
                        }else{
                            System.out.println("\tInvalid input...");
                            System.out.print("\nDo you want to input number again (Y/N) -> ");
                            char c=input.next().charAt(0);
                            if(c=='Y'||c=='y'){
                                clearConsole();
                                continue L2;
                            }else if(c=='N'||c=='n'){
                                clearConsole();
                                continue L1;
                            }
                        }

                        // Decimal to Binary
                        int binary=0;
                        int base=1;
                        int temp2=decimal;
                        while(temp2>0){
                            binary=binary+(temp2%2)*base;
                            temp2=temp2/2;
                            base=base*10;
                        }
                        System.out.println("\n\tBinary number: "+binary);

                        // Decimal to Octal
                        int octal=0;
                        int base1=1;
                        int temp3=decimal;
                        while(temp3>0){
                            octal=octal+(temp3%8)*base1;
                            temp3=temp3/8;
                            base1=base1*10;
                        }
                        System.out.println("\tOctal number: "+octal);

                        // Decimal to Hexadecimal
                        int temp4=decimal;
                        String hex="";
                        while(temp4>0){
                            int rem=temp4%16;
                            if(rem<10){
                                hex=rem+hex;
                            }else{
                                hex=(char)(rem+55)+hex;
                            }
                            temp4=temp4/16;
                        }
                        System.out.println("\tHexadecimal number: "+hex);

                        System.out.print("\n\nDo you want to go to homepage (Y/N)-> ");
                        char c=input.next().charAt(0);
                        if(c=='Y'||c=='y'){
                            clearConsole();
                            continue L1;
                        }else{
                            break L1;
                        }  
                    }while(true);

                case 2: // Binary Converter
                    L3:do{
                        clearConsole();
                        System.out.println("+-------------------------------------------+");
                        System.out.println("|            Binary Converter               |");
                        System.out.println("+-------------------------------------------+");
                        System.out.print("\n\nEnter an Binary number: ");
                        int binaryNumber=input.nextInt();
                        int temp=binaryNumber;
                        if(binaryNumber>=0){
                            do{
                                int num=temp%10;
                                temp/=10;
                                if(num>1){
                                    System.out.println("\tInvalid input...");
                                    System.out.print("\nDo you want to input number again (Y/N) -> ");
                                    char c=input.next().charAt(0);
                                    if(c=='Y'||c=='y'){
                                        clearConsole();
                                        continue L3;
                                    }else if(c=='N'||c=='n'){
                                        clearConsole();
                                        continue L1;
                                    }
                                }
                            }while(temp>0);
                        }else{
                            System.out.println("\tInvalid input...");
                            System.out.print("\nDo you want to input number again (Y/N) -> ");
                            char c=input.next().charAt(0);
                            if(c=='Y'||c=='y'){
                                clearConsole();
                                continue L3;
                            }else if(c=='N'||c=='n'){
                                clearConsole();
                                continue L1;
                            }
                        }

                        // Binary to Decimal
                        int decimal=0;
                        int base1=1;
                        int tempBin=binaryNumber;
                        while(tempBin>0){
                            int rem=tempBin%10;
                            decimal=decimal+rem*base1;
                            base1=base1*2;
                            tempBin=tempBin/10;
                        }
                        System.out.println("\n\tDecimal Number: "+decimal);

                        // Binary to Octal
                        int octal=0;
                        int base2=1;
                        int temp3=decimal;
                        while(temp3>0){
                            octal=octal+(temp3%8)*base2;
                            temp3=temp3/8;
                            base2=base2*10;
                        }
                        System.out.println("\tOctal number: "+octal);

                        // Binary to Hexadecimal
                        int temp4=decimal;
                        String hex="";
                        while(temp4>0){
                            int rem=temp4%16;
                            if(rem<10){
                                hex=rem+hex;
                            }else{
                                hex=(char)(rem+55)+hex;
                            }
                            temp4=temp4/16;
                        }
                        System.out.println("\tHexadecimal number: "+hex);

                        System.out.print("\n\nDo you want to go to homepage (Y/N)-> ");
                        char c=input.next().charAt(0);
                        if(c=='Y'||c=='y'){
                            clearConsole();
                            continue L1;
                        }else{
                            break L1;
                        }
                    }while(true);

                case 3: // Octal Converter
                    L4:do{
                        clearConsole();
                        System.out.println("+-------------------------------------------+");
                        System.out.println("|              Octal Converter              |");
                        System.out.println("+-------------------------------------------+");
                        System.out.print("\n\nEnter an Octal number: ");
                        int octal=input.nextInt();
                        int temp=octal;
                        if(octal>=0){
                            do{
                                int num=temp%10;
                                temp/=10;
                                if(num>7){
                                    System.out.println("\tInvalid input...");
                                    System.out.print("\nDo you want to input number again (Y/N) -> ");
                                    char c=input.next().charAt(0);
                                    if(c=='Y'||c=='y'){
                                        clearConsole();
                                        continue L4;
                                    }else if(c=='N'||c=='n'){
                                        clearConsole();
                                        continue L1;
                                    }
                                }
                            }while(temp>0);
                        }else{
                            System.out.println("\tInvalid input...");
                            System.out.print("\nDo you want to input number again (Y/N) -> ");
                            char c=input.next().charAt(0);
                            if(c=='Y'||c=='y'){
                                clearConsole();
                                continue L4;
                            }else if(c=='N'||c=='n'){
                                clearConsole();
                                continue L1;
                            }
                        }

                        // Octal to Decimal
                        int decimal=0;
                        int base=1;
                        int tempOct=octal;
                        while(tempOct>0){
                            int rem=tempOct%10;
                            decimal=decimal+rem*base;
                            base=base*8;
                            tempOct=tempOct/10;
                        }
                        System.out.println("\n\tDecimal Number: "+decimal);

                        // Octal to Binary
                        int temp2=decimal;
                        String binary="";
                        while(temp2>0){
                            int remainder=temp2%2;
                            binary=remainder+binary;
                            temp2/=2;
                        }
                        System.out.println("\tBinary Number: "+binary);

                        // Octal to Hexadecimal
                        int tempHex=decimal;
                        String hex="";
                        while(tempHex>0){
                            int rem=tempHex%16;
                            if(rem<10){
                                hex=rem+hex;
                            }else{
                                hex=(char)(rem+55)+hex;
                            }
                            tempHex/=16;
                        }
                        System.out.println("\tHexadecimal Number: "+hex);

                        System.out.print("\n\nDo you want to go to homepage (Y/N)-> ");
                        char c=input.next().charAt(0);
                        if(c=='Y'||c=='y'){
                            clearConsole();
                            continue L1;
                        }else{
                            break L1;
                        }
                    }while(true);

                case 4: // Hexadecimal Converter
                    L5:do{
                        clearConsole();
                        System.out.println("+-------------------------------------------+");
                        System.out.println("|            HexaDecimal Converter          |");
                        System.out.println("+-------------------------------------------+");
                        System.out.print("\n\nEnter an HexaDecimal number: ");
                        String hexStr=input.next();

                        // Simple Validation loop
                        boolean isValid=true;
                        for(int i=0;i<hexStr.length();i++){
                            char ch=hexStr.charAt(i);
                            if(!((ch>='0'&&ch<='9')||(ch>='A'&&ch<='F')||(ch>='a'&&ch<='f'))){
                                isValid=false;
                            }
                        }

                        if(!isValid){
                            System.out.println("\tInvalid input...");
                            System.out.print("\nDo you want to input number again (Y/N) -> ");
                            char c=input.next().charAt(0);
                            if(c=='Y'||c=='y'){
                                clearConsole();
                                continue L5;
                            }else if(c=='N'||c=='n'){
                                clearConsole();
                                continue L1;
                            }
                        }

                        // Hexadecimal to Decimal
                        int decimal=0;
                        int basePower=1;
                        for(int i=hexStr.length()-1;i>=0;i--){
                            char ch=hexStr.charAt(i);
                            int digit=0;
                            if(ch>='0'&&ch<='9'){
                                digit=ch-'0';
                            }else if(ch>='A'&&ch<='F'){
                                digit=ch-'A'+10;
                            }else if(ch>='a'&&ch<='f'){
                                digit=ch-'a'+10;
                            }
                            decimal=decimal+digit*basePower;
                            basePower=basePower*16;
                        }
                        System.out.println("\n\tDecimal Number: "+decimal);

                        // Hexadecimal to Binary
                        int temp2=decimal;
                        String binary="";
                        while(temp2>0){
                            int remainder=temp2%2;
                            binary=remainder+binary;
                            temp2/=2;
                        }
                        System.out.println("\tBinary Number: "+binary);

                        // Hexadecimal to Octal
                        int temp3=decimal;
                        String octal="";
                        while(temp3>0){
                            int remainder=temp3%8;
                            octal=remainder+octal;
                            temp3/=8;
                        }
                        System.out.println("\tOctal Number: "+octal);

                        System.out.print("\n\nDo you want to go to homepage (Y/N)-> ");
                        char c=input.next().charAt(0);
                        if(c=='Y'||c=='y'){
                            clearConsole();
                            continue L1;
                        }else{
                            break L1;
                        }
                    }while(true);

                case 5: // Roman Number Converter
                    clearConsole();
                    System.out.println("+--------------------------------------------------------------+");
                    System.out.println("|                     Roman Number Converter                   |");
                    System.out.println("+--------------------------------------------------------------+");
                    System.out.println("\n\n\t[01] Decimal Number to Roman Number Converter");
                    System.out.println("\n\t[02] Roman Number to Decimal Number Converter");
                    System.out.print("\n\nEnter an option -> ");
                    int option2=input.nextInt();

                    switch(option2){
                        case 1: // Decimal to Roman
                            L6:do{
                                clearConsole();
                                System.out.println("+------------------------------------------------------------------+");
                                System.out.println("|            Decimal Number to Roman Number Converter              |");
                                System.out.println("+------------------------------------------------------------------+");
                                System.out.print("\n\nEnter an Decimal number: ");
                                int num=input.nextInt();

                                if(num<=0){
                                    System.out.println("\tInvalid input...");
                                    System.out.print("\nDo you want to input number again (Y/N) -> ");
                                    char c=input.next().charAt(0);
                                    if(c=='Y'||c=='y'){
                                        clearConsole();
                                        continue L6;
                                    }else if(c=='N'||c=='n'){
                                        clearConsole();
                                        continue L1;
                                    }
                                }

                                String roman="";
                                while(num>=1000){ roman=roman+"M"; num=num-1000; }
                                while(num>=900) { roman=roman+"CM"; num=num-900; }
                                while(num>=500) { roman=roman+"D"; num=num-500; }
                                while(num>=400) { roman=roman+"CD"; num=num-400; }
                                while(num>=100) { roman=roman+"C"; num=num-100; }
                                while(num>=90)  { roman=roman+"XC"; num=num-90; }
                                while(num>=50)  { roman=roman+"L"; num=num-50; }
                                while(num>=40)  { roman=roman+"XL"; num=num-40; }
                                while(num>=10)  { roman=roman+"X"; num=num-10; }
                                while(num>=9)   { roman=roman+"IX"; num=num-9; }
                                while(num>=5)   { roman=roman+"V"; num=num-5; }
                                while(num>=4)   { roman=roman+"IV"; num=num-4; }
                                while(num>=1)   { roman=roman+"I"; num=num-1; }

                                System.out.println("\n\tRoman numeral: "+roman);

                                System.out.print("\n\nDo you want to go to homepage (Y/N)-> ");
                                char c=input.next().charAt(0);
                                if(c=='Y'||c=='y'){
                                    clearConsole();
                                    continue L1;
                                }else{
                                    break L1;
                                }
                            }while(true);

                        case 2: // Roman to Decimal
                            L7:do{
                                clearConsole();
                                System.out.println("+------------------------------------------------------------------+");
                                System.out.println("|            Roman Number to Decimal Number Converter              |");
                                System.out.println("+------------------------------------------------------------------+");
                                System.out.print("\n\nEnter an Roman number: ");
                                String romanStr=input.next();

                                int decimal=0;
                                for(int i=0;i<romanStr.length();i++){
                                    char ch=romanStr.charAt(i);
                                    if(ch=='M'||ch=='m'){
                                        decimal=decimal+1000;
                                    }else if(ch=='D'||ch=='d'){
                                        decimal=decimal+500;
                                    }else if(ch=='C'||ch=='c'){
                                        if(i<romanStr.length()-1&&(romanStr.charAt(i+1)=='D'||romanStr.charAt(i+1)=='d'||romanStr.charAt(i+1)=='M'||romanStr.charAt(i+1)=='m')){
                                            decimal=decimal-100;
                                        }else{
                                            decimal=decimal+100;
                                        }
                                    }else if(ch=='L'||ch=='l'){
                                        decimal=decimal+50;
                                    }else if(ch=='X'||ch=='x'){
                                        if(i<romanStr.length()-1&&(romanStr.charAt(i+1)=='L'||romanStr.charAt(i+1)=='l'||romanStr.charAt(i+1)=='C'||romanStr.charAt(i+1)=='c'||romanStr.charAt(i+1)=='M'||romanStr.charAt(i+1)=='m')){
                                            decimal=decimal-10;
                                        }else{
                                            decimal=decimal+10;
                                        }
                                    }else if(ch=='V'||ch=='v'){
                                        decimal=decimal+5;
                                    }else if(ch=='I'||ch=='i'){
                                        if(i<romanStr.length()-1&&(romanStr.charAt(i+1)=='V'||romanStr.charAt(i+1)=='v'||romanStr.charAt(i+1)=='X'||romanStr.charAt(i+1)=='x'||romanStr.charAt(i+1)=='L'||romanStr.charAt(i+1)=='l'||romanStr.charAt(i+1)=='C'||romanStr.charAt(i+1)=='c'||romanStr.charAt(i+1)=='D'||romanStr.charAt(i+1)=='d'||romanStr.charAt(i+1)=='M'||romanStr.charAt(i+1)=='m')){
                                            decimal=decimal-1;
                                        }else{
                                            decimal=decimal+1;
                                        }
                                    }
                                }
                                System.out.println("\n\tDecimal number: "+decimal);

                                System.out.print("\n\nDo you want to go to homepage (Y/N)-> ");
                                char c=input.next().charAt(0);
                                if(c=='Y'||c=='y'){
                                    clearConsole();
                                    continue L1;
                                }else{
                                    break L1;
                                }
                            }while(true);
                    }
            }
        }while(true);
    }
}
