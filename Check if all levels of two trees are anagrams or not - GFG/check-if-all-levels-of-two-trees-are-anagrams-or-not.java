//{ Driver Code Starts
import java.io.*;
import java.util.*;


class Node
{
    int data;
    Node left;
    Node right;
    
    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
    
    public static Node buildTree(String str)
    {
        // Corner Case
        if(str.length()==0 || str.charAt(0)=='N')
            return null;
        
        // Creating array of Strings from input 
        // String after spliting by space
        String ip[] = str.split(" ");
        
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        
        // Push the root to the queue
        Queue<Node> queue = new LinkedList<>(); 
        queue.add(root);
        
        // Starting from the second element
        int i = 1;
        while(queue.size()>0 && i < ip.length)
        {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N"))
            {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N"))
            {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    
    public static Node inputTree(BufferedReader br) throws IOException
    {
        return buildTree(br.readLine().trim());
    }
    
    public static void inorder(Node root)
    {
        if (root == null)
           return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            Node node1 = Node.inputTree(br);
            
            
            Node node2 = Node.inputTree(br);
            
            Solution obj = new Solution();
            boolean res = obj.areAnagrams(node1, node2);
            
            int _result_val = (res) ? 1 : 0;
            System.out.println(_result_val);
        }
    }
}

// } Driver Code Ends


/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;
    
    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public static boolean areAnagrams(Node node1, Node node2) {

        // code here

        if(node1.data != node2.data) return false;

        Queue<Node> q1 = new LinkedList<>();

        Queue<Node> q2 = new LinkedList<>();

        ArrayList<Integer> list1 = new ArrayList<>();

        ArrayList<Integer> list2 = new ArrayList<>();

        q1.add(node1);

        q2.add(node2);

        int count1 = q1.size(), count2 = q2.size();

        while(!q1.isEmpty() && !q2.isEmpty()) {

            Node temp1 = q1.remove();

            Node temp2 = q2.remove();

            if(temp1.left!=null) {

                q1.add(temp1.left);

                list1.add(temp1.left.data);

            }

            if(temp1.right != null) {

                q1.add(temp1.right);

                list1.add(temp1.right.data);

            }

            if(temp2.left != null) {

                q2.add(temp2.left);

                list2.add(temp2.left.data);

            }

            if(temp2.right != null) {

                q2.add(temp2.right);

                list2.add(temp2.right.data);

            }

            count1--;

            count2--;

            if(count1==0 || count2 == 0) {

                if(count1!=count2) return false;

                count1 = q1.size();

                count2 = q2.size();

                Collections.sort(list1);

                Collections.sort(list2);

                if(!list1.equals(list2)) return false;

                list1 = new ArrayList<>();

                list2 = new ArrayList<>();

            }

        }

        return q1.size() == q2.size();

    }
}
        
