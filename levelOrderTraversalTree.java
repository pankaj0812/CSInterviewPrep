
class GfG
{
    void levelOrder(Node node) 
    {
        if(node==null)
            return;
        Queue<Node> q = new LinkedList<Node>();
        
        q.add(node);
        while(!q.isEmpty()){
            Node s = q.poll();
            System.out.print(s.data+" ");
            
            if(s.left!=null)
                q.add(s.left);
            if(s.right!=null)
                q.add(s.right);
            
        }
    }
}
