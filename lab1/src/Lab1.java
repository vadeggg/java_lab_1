public class Lab1 {
    public int[] Integers(int value){
        int product=1,summ=0,temp;
            while(value>0){
                temp = value%10;
                product *= temp;
                summ += temp;
                value/=10;
            }
            int[] results = new int[]{product, summ};
        return results;
    }
    public boolean Booleans(int a,int b) {
        if (a % 2 == 0 && b % 2 == 0) {
            return true;
        } else if (a % 2 != 0 && b % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
    public int[] Conditional(int a, int b){
        if(a == b){
            a = 0;
            b = 0;
        }else if(a>b){
            b = a;
        } else{
            a = b;
        }
        int[] result = new int[]{a,b};
        return result;
    }
    public char Cases(char c, int n1, int n2) {
        switch (c){
            case 'N':
                switch (n1+n2){
                    case -2: case 2:
                        c = 'S';
                        break;
                    case 3: case -1:
                        c = 'E';
                        break;
                    case 1:
                        c = 'W';
                        break;

                }
                break;
            case 'S':
                switch (n1+n2){
                    case -2: case 2:
                        c = 'N';
                        break;
                    case 3: case -1:
                        c = 'W';
                        break;
                    case 1:
                        c = 'E';
                        break;
                }
                break;
            case 'W':
                switch (n1+n2){
                    case -2: case 2:
                        c = 'E';
                        break;
                    case 3: case -1:
                        c = 'N';
                        break;
                    case 1:
                        c = 'S';
                        break;
                }
                break;
            case 'E':
                switch (n1+n2) {
                    case -2:
                    case 2:
                        c = 'W';
                        break;
                    case 3:
                    case -1:
                        c = 'S';
                        break;
                    case 1:
                        c = 'N';
                        break;
                }
                break;
        }

        return c;
    }
    public int ForFunc(int n){
        int summ=0;
        for(int i=n;i<=2*n;i++){
            summ+= i*i;
        }
        return summ;
    }
    public int[] WhileFunc(int n){
        int summ=0;
        int temp=0;

        while(summ<=n){
            temp++;
            summ+=temp;
        }

        int[] result = new int[]{summ, temp};
        return result;
    }
}
