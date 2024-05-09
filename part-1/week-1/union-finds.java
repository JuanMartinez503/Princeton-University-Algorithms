
// steps for developing a usable algorithm
// 1.  model the problem
// 2.  find an algorithm to solve it
// 3.  fast enough? fits in memory?
// 4.  if not, figure out why
// 5.  find a way to address the problem
// 6.  iterate until satisfied



// dynamic connectivity
// given a set of N objects
// union command:  connect two objects
// find/query command:  is there a path connecting the two objects?

// Applications involve manipulating objects of all types
// following example
// 1. Pixels in a digital photo
// 2. Computers in a network
// 3. Friends in a social network
// 4. Transistors in a computer chip
// 5. Elements in a mathematical set
// 6. Variable names in a Fortran program
// 7. Metallic sites in a composite system

// when programming, convenient to name objects 0 to N-1
// use integers as array index
// suppress details not relevant to union-find

// Modeling the connections
// we assume "is connected to" is an equivalence relation:
// 1.  Reflexive:  p is connected to p
// 2.  Symmetric:  if p is connected to q, then q is connected to p
// 3.  Transitive:  if p is connected to q and q is connected to r, then p is connected to r

// connected components are maximal sets of objects that are mutually connected
// find query is to check if two objects are in the same component
// union command is to replace components containing two objects with their union

// Union-find data type (API)
// Goal:  design efficient data structure for union-find
// 1.  Number of objects N can be huge
// 2.  Number of operations M can be huge
// 3.  Find queries and union commands may be intermixed
/* public class UF
 * UF(int N) - initialize union-find data structure with N objects (0 to N-1)
 * void union(int p, int q) - add connection between p and q
 * boolean connected(int p, int q) - are p and q in the same component?
 * int find(int p) - component identifier for p (0 to N-1)
 * int count() - number of components
 */

 //Dynamic connectivity client
    // read in number of objects N from standard input
    // repeat
    // read in pair of integers from standard input
    // if they are not yet connected, connect them and print out pair

    /*
     * public static void main(String[] args){
     * int N = StdIn.readInt();
     * UF uf = new UF(N);
     * while(!StdIn.isEmpty()){
     * int p = StdIn.readInt();
     * int q = StdIn.readInt();
     * if(!uf.connected(p, q)){
     * uf.union(p, q);
     * StdOut.println(p + " " + q);}
     */