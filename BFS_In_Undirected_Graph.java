import java.util.LinkedList;
import java.util.Queue;


public class BFS_In_Undirected_Graph {
LinkedList<Integer>[]adj;
private int E;
private int V;
public BFS_In_Undirected_Graph(int nodes){
	this.E= 0;
	this.V = nodes;
	this.adj = new LinkedList[nodes];
	for(int i=0;i<V;i++){
		adj[i]=new LinkedList<>();
		}
}
public void addedge(int u,int v){
	this.adj[u].add(v);
	this.adj[v].add(u);
	E++;
}
public String toString(){
	StringBuilder sb = new StringBuilder();
	sb.append(V+" Vertices and Edges "+E+"\n");
	for(int i=0;i<V;i++){
		sb.append(V+": ");
		for(int w:adj[i]){
			sb.append(w+" ");
		}
		sb.append("\n");
	}
	return sb.toString();
}
public void BFS(int s){
	boolean[] visited = new boolean[V];
	Queue<Integer> q = new LinkedList<>();
	visited[s] = true;
	q.offer(s);
	while(!q.isEmpty()){
		int u = q.poll();
		System.out.println(u+" is present in the graph ");
		for(int w: adj[u]){
			if(!visited[w]){
				visited[w]= true;
				q.offer(w);
			}
		}
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BFS_In_Undirected_Graph s = new BFS_In_Undirected_Graph(5);
		s.addedge(0,1);
		s.addedge(1,2);
		s.addedge(2, 3);
		s.addedge(2,4);
		s.addedge(3,0);
		System.out.println(s.toString());
		s.BFS(4);}

}
