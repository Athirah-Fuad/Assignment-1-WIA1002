// WIA/WIB1002 Data Structures
// part of Graphs implementation using List
class Vertex<T extends Comparable<T>, N extends Comparable <N>> {
   T vertexInfo;
   int indeg;
   int outdeg;
   int dive;
   int StartTime;
   int lunchperiod;
   Vertex<T,N> nextVertex;
   Edge<T,N> firstEdge;
    
   public Vertex() {
      vertexInfo=null;
      indeg=0;
      outdeg=0;
      nextVertex = null;
      firstEdge = null;
   }
	
   public Vertex(T vInfo, Vertex<T,N> next) {
      vertexInfo = vInfo;
      indeg=0;
      outdeg=0;
      nextVertex = next;
      firstEdge = null;
   }	
   public Vertex(T vInfo, Vertex<T,N> next,int dive,int StartTime,int lunchperiod) {
      vertexInfo = vInfo;
      indeg=0;
      outdeg=0;
      nextVertex = next;
      firstEdge = null;
      this.dive=dive;
      this.StartTime=StartTime;
      this.lunchperiod=lunchperiod;
   }	

}

