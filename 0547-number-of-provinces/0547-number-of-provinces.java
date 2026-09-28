class Solution{
    public int findCircleNum(int[][] isConnected){
        int n=isConnected.length;
        boolean[] visited=new boolean[n];
        int provinces=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                provinces++;
                bfs(isConnected,visited,i);
            }
        }
        return provinces;
    }
    void bfs(int[][] isConnected,boolean[] visited,int city){
        Queue<Integer> q=new LinkedList<>();
        q.offer(city);
        visited[city]=true;
        while(!q.isEmpty()){
            int curr=q.poll();
            for(int i=0;i<isConnected.length;i++){
                if(isConnected[curr][i]==1&&!visited[i]){
                    visited[i]=true;
                    q.offer(i);
                }
            }
        }
    }
}