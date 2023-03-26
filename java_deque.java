import java.util.*;
    public class test 
    {
        private static Deque<Integer> deque = new ArrayDeque<Integer>();
        
        public static void main(String[] args) 
        {
            Scanner in = new Scanner(System.in);

            int n = in.nextInt();
            int m = in.nextInt();
            int max=0;
            
            for (int i = 0; i < n && max<m; i++)
            {
                int num=in.nextInt();
                deque.addLast(num);  
                
                if (deque.size()==m)
                {
                    int uniqNum=checkUniqueNumber(deque);
                    deque.removeFirst();
                    
                    if (uniqNum>max)
                    {
                        max=uniqNum;
                    }
                }
                        
            }
            
            System.out.println(max);
        }
        
        private static int checkUniqueNumber(Deque<Integer> deque)
        {
            
            return new HashSet<Integer>(deque).size();
        }
    }