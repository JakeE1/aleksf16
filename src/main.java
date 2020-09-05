import static java.lang.Math.ceil;
// PIZDEC ETO EBALA
public class main {
    public static void main(String[] args) {
       double [] max = new double[8];
        double [] x = new double[8];
        double [] y = new double[8];
        double [][] array = new double[8][8];
        int counter = 0;

        for(int i = 0; i < 8; i++)
        {
            for(int j = 0; j < 8; j++)
            {
                array[i][j] =ceil(Math.random()*9);
            }
        }
        for(int i = 0; i < 8; i++)
        {
            for(int j = 0; j < 8; j++)
            {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }

for(int k = 0; k < 8; k++)
{   int n = 0;
       if (k > 0)
          n = 1;
    for (int i = 0; i < 8; i++)
    {
        for (int j = 0; j < 8; j++)
        {
            if (array[i][j] > max[k])
            {
                for(int a = 0; a < 8; a++)
                {
                    if (array[i][j] == max[a])
                        counter++;
                    else {
                        max[k] = array[i][j];
                        x[k] = i;
                        y[k] = j;
                    }
                }

            }
        }

    }


}



            for(int j = 0; j < 8; j++)
            {
                System.out.print(max[j] + "  ");


            }



    }
}
