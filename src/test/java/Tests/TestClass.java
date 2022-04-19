package Tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


    public class TestClass{

        public static void main(String[] args)
        {
            int maxLimits[] = {2, 3, 5, 9};

            ArrayList<Integer> list = new ArrayList<>();
            list.add(3);
            list.add(2);
            list.add(9);
            list.add(2);
            Math.max(1,2);
            Collections.sort(list);
            int time[] = new int[4];

            for(int i = 0; i<4; i++)
            {
                int index = 0;
                for(int j=0; j<list.size(); j++)
                {

                    if (list.get(j) <= maxLimits[i])
                    {
                        time[i] = list.get(j);
                        index = j;
                    }
                }

                list.remove(index);
            }
            System.out.println("Arrays.toString() = " + Arrays.toString(time));
            System.out.println(""+time[0]+time[1]+":"+time[2]+time[3]); 
        }
    }

