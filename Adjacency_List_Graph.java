import java.util.LinkedList;


public class Adjacency_List_Graph {
LinkedList <Integer>[]adj;
private int V;
private int E;
public Adjacency_List_Graph(int nodes){
	
	this.E =0;
	this.V = nodes;
	this.adj = new LinkedList[nodes];
	for(int i=0;i<V;i++){
		adj[i]=new LinkedList<>();
	}
}
public void Addedge(int u,int v){
	adj[u].add(v);
	adj[v].add(u);
	E++;
}
public String toString(){
	StringBuilder s = new StringBuilder();
	s.append(V+" Vertices and "+E+" Edges"+"\n");
	for(int i=0;i<V;i++){
		s.append(V+": ");
		for(int w:adj[i]){
			s.append(w+" ");
		}
		s.append("\n");
	}
	return s.toString();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adjacency_List_Graph s = new Adjacency_List_Graph(4);
		s.Addedge(0,1);
		s.Addedge(1,2);
		s.Addedge(2,3);
		s.Addedge(3,0);
		System.out.print(s.toString());
		}

}
