  ##                     **Dijkstra's Algorithm**
   My implementation of [*Dijkstra's Algorithm*](https://en.wikipedia.org/wiki/Dijkstra%27s_algorithm)

Dijkstra's algorithm is an algorithm for finding the shortest paths between nodes in a graph.
The algorithm exists in many variants. Dijkstra's original variant found the shortest path between two nodes, but a more common variant fixes a single node as the "source" node and finds shortest paths from the source to all other nodes in the graph, producing a shortest-path tree.

A widely used application of shortest path algorithms is network [*routing protocols*](https://en.wikipedia.org/wiki/Routing_protocol "Routing protocol"), most notably [*IS-IS*](https://en.wikipedia.org/wiki/IS-IS "IS-IS") (Intermediate System to Intermediate System) and Open Shortest Path First ([*OSPF*](https://en.wikipedia.org/wiki/OSPF "OSPF")). It is also employed as a [*subroutine*](https://en.wikipedia.org/wiki/Subroutine "Subroutine") in other algorithms such as [*Johnson's*](https://en.wikipedia.org/wiki/Johnson%27s_algorithm "Johnson's algorithm").


While the original algorithm uses a min-priority queue and runs in O((|E| + |v|) log|V|)
time ![{\displaystyle \Theta ((|V|+|E|)\log |V|)}](https://wikimedia.org/api/rest_v1/media/math/render/svg/624a1b853e0887e908644cf58bdcd77a8cedd76b) (where |V| ![|V|](https://wikimedia.org/api/rest_v1/media/math/render/svg/9ddcffc28643ac01a14dd0fb32c3157859e365a7) is the number of nodes and |E| ![|E|](https://wikimedia.org/api/rest_v1/media/math/render/svg/d8c2b9637808cf805d411190b4ae017dbd4ef8d8) is the number of edges), it can also be implemented in O(|V|²) ![{\displaystyle \Theta (|V|^{2})}](https://wikimedia.org/api/rest_v1/media/math/render/svg/5dbb38dcf2365c1dbf786871f4014dd1a2762df7) using an array.

A proposed variant of this algorithm, using a Fibonacci heap min priority queue to optimize the running time to![{\displaystyle \Theta (|E|+|V|\log |V|)}](https://wikimedia.org/api/rest_v1/media/math/render/svg/e22162be85d06b346f3b7f7aad9746da0c1019c9).
This is asymptotically the fastest known single-source shortest-path algorithm for arbitrary directed graphs with unbounded non-negative weights.


![Dijkstra Animation.gif](https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/Dijkstra_Animation.gif/220px-Dijkstra_Animation.gif)

*Dijkstra's algorithm to find the shortest path between `a` and `b`. It picks the unvisited vertex with the lowest distance, calculates the distance through it to each unvisited neighbor, and updates the neighbor's distance if smaller. Mark visited (set to red) when done with neighbors.*

![](https://upload.wikimedia.org/wikipedia/commons/thumb/e/e4/DijkstraDemo.gif/220px-DijkstraDemo.gif)

*A demo of Dijkstra's algorithm based on Euclidean distance. Red lines are the shortest path covering, i.e., connecting `u` and `prev[u]`. Blue lines indicate where relaxing happens, i.e., connecting `v` with a node `u` in `Q`, which gives a shorter path from the source to `v`.*


## **Pseudocode (array variant)**

>
    function Dijkstra(_Graph_, _source_):
   				     create vertex set Q    
               for each vertex _v_ in _Graph_: 		
               dist[_v_] ← INFINITY 		
               prev[_v_] ← UNDEFINED                
   					   add _v_ to _Q_                     
   						 dist[_source_] ← 0                       
    
     while _Q_ is not empty:
         _u_ ← vertex in _Q_ with min dist[u]   
                                            
         remove _u_ from _Q_
        
         **for each** neighbor _v_ of _u_ still in _Q_:
             _alt_ ← dist[_u_] + length(_u_, _v_)
             **if** _alt_ < dist[_v_]:              
                 dist[_v_] ← _alt_
                 prev[_v_] ← _u_
     **return** dist[], prev[]

## **Pseudocode (original -PQ variant)**

>
    **function** Dijkstra(_Graph_, _source_):
      dist[_source_] ← 0            _// Initialization_

      create vertex priority queue Q

      **for each** vertex _v_ in _Graph_:          
          **if** _v_ ≠ _source_
              dist[_v_] ← INFINITY  _// Unknown distance from source to v_
              prev[_v_] ← UNDEFINED  _// Predecessor of v_

         _Q_.add_with_priority(_v_, dist[_v_])


     **while** _Q_ is not empty:   _// The main loop_
         _u_ ← _Q_.extract_min()   _// Remove and return best vertex_
         **for each** neighbor _v_ of _u_:  _// only v that are still in Q_
             _alt_ ← dist[_u_] + length(_u_, _v_)
             **if** _alt_ < dist[_v_]
                 dist[_v_] ← _alt_
                 prev[_v_] ← _u_
                 _Q_.decrease_priority(_v_, _alt_)

     **return** dist, prev
     
     
  ## ~ Happy Learning
