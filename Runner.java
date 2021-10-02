
import java.util.ArrayList;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author colegilbert
 */
public class Runner {
    public static ArrayList<StateGraph.Vertex> startingPath = new ArrayList<StateGraph.Vertex>(49);
    public static ArrayList<StateGraph.Edge> edgeGraph = new ArrayList<StateGraph.Edge>(49); //for calculating distance of MST
    
    public static final int numAnts = 10;
    public static Tour finalTour;
    //starting MST (or close enough to one)
    private static StateGraph.Vertex a = new StateGraph.Vertex(States.Louisiana);
    private static StateGraph.Vertex b = new StateGraph.Vertex(States.Mississippi);
    private static StateGraph.Vertex c = new StateGraph.Vertex(States.Arkansas);
    private static StateGraph.Vertex d = new StateGraph.Vertex(States.Oklahoma);
    private static StateGraph.Vertex e = new StateGraph.Vertex(States.Kansas);
    private static StateGraph.Vertex f = new StateGraph.Vertex(States.Nebraska);
    
    private static StateGraph.Vertex g = new StateGraph.Vertex(States.Iowa);
    private static StateGraph.Vertex h = new StateGraph.Vertex(States.Missouri);
    private static StateGraph.Vertex i = new StateGraph.Vertex(States.Illinois);
    private static StateGraph.Vertex j = new StateGraph.Vertex(States.Indiana);
    private static StateGraph.Vertex k = new StateGraph.Vertex(States.Kentucky);
    private static StateGraph.Vertex l = new StateGraph.Vertex(States.WestVirginia);
    
    private static StateGraph.Vertex m = new StateGraph.Vertex(States.Ohio);
    private static StateGraph.Vertex n = new StateGraph.Vertex(States.Michigan);
    private static StateGraph.Vertex o = new StateGraph.Vertex(States.Wisconsin);
    
    private static StateGraph.Vertex s = new StateGraph.Vertex(States.Minnesota);
    private static StateGraph.Vertex t = new StateGraph.Vertex(States.SouthDakota);
    private static StateGraph.Vertex u = new StateGraph.Vertex(States.NorthDakota);
    private static StateGraph.Vertex v = new StateGraph.Vertex(States.Wyoming);
    private static StateGraph.Vertex w = new StateGraph.Vertex(States.Colorado);
    private static StateGraph.Vertex x = new StateGraph.Vertex(States.NewMexico);
    
    private static StateGraph.Vertex y = new StateGraph.Vertex(States.Arizona);
    private static StateGraph.Vertex z = new StateGraph.Vertex(States.Utah);
    private static StateGraph.Vertex aa = new StateGraph.Vertex(States.Idaho);
    private static StateGraph.Vertex bb = new StateGraph.Vertex(States.Montana);
    private static StateGraph.Vertex cc = new StateGraph.Vertex(States.Washington);
    private static StateGraph.Vertex dd = new StateGraph.Vertex(States.Oregon);
    
    private static StateGraph.Vertex ee = new StateGraph.Vertex(States.Nevada);
    private static StateGraph.Vertex ff = new StateGraph.Vertex(States.California);
    private static StateGraph.Vertex gg = new StateGraph.Vertex(States.Texas);
    private static StateGraph.Vertex hh = new StateGraph.Vertex(States.Alabama);
    private static StateGraph.Vertex ii = new StateGraph.Vertex(States.Georgia);
    private static StateGraph.Vertex jj = new StateGraph.Vertex(States.SouthCarolina);
    
    private static StateGraph.Vertex kk = new StateGraph.Vertex(States.NorthCarolina);
    private static StateGraph.Vertex ll = new StateGraph.Vertex(States.Virginia);
    private static StateGraph.Vertex mm = new StateGraph.Vertex(States.Maryland);
    private static StateGraph.Vertex nn = new StateGraph.Vertex(States.DistOfColumbia);
    private static StateGraph.Vertex oo = new StateGraph.Vertex(States.Delaware);
    private static StateGraph.Vertex pp = new StateGraph.Vertex(States.NewJersey);
    
    private static StateGraph.Vertex qq = new StateGraph.Vertex(States.Pennsylvania);
    private static StateGraph.Vertex rr = new StateGraph.Vertex(States.NewYork);
    private static StateGraph.Vertex ss = new StateGraph.Vertex(States.Connecticut);
    private static StateGraph.Vertex tt = new StateGraph.Vertex(States.RhodeIsland);
    private static StateGraph.Vertex uu = new StateGraph.Vertex(States.Massachusettes);
    private static StateGraph.Vertex vv = new StateGraph.Vertex(States.NewHampshire);
    private static StateGraph.Vertex ww = new StateGraph.Vertex(States.Maine);
    private static StateGraph.Vertex p = new StateGraph.Vertex(States.Indiana);
    private static StateGraph.Vertex q = new StateGraph.Vertex(States.Tennessee);
    private static StateGraph.Vertex r = new StateGraph.Vertex(States.Florida);
    
    
    private static StateGraph.Edge a1 = new StateGraph.Edge(a, b);
    private static StateGraph.Edge a2 = new StateGraph.Edge(b, c);
    private static StateGraph.Edge a3 = new StateGraph.Edge(c, d);
    private static StateGraph.Edge a4 = new StateGraph.Edge(d, e);
    private static StateGraph.Edge a5 = new StateGraph.Edge(e, f);
    private static StateGraph.Edge a6 = new StateGraph.Edge(f, g);
    private static StateGraph.Edge a7 = new StateGraph.Edge(g, h);

    private static StateGraph.Edge a8 = new StateGraph.Edge(h, i);
    private static StateGraph.Edge a48 = new StateGraph.Edge(i, j);
    private static StateGraph.Edge a9 = new StateGraph.Edge(j, k);
    private static StateGraph.Edge a10 = new StateGraph.Edge(k, l);
    private static StateGraph.Edge a11 = new StateGraph.Edge(l, m);
    private static StateGraph.Edge a12 = new StateGraph.Edge(m, n);
    private static StateGraph.Edge a13 = new StateGraph.Edge(n, o);
    private static StateGraph.Edge a14 = new StateGraph.Edge(o, s);

    
    private static StateGraph.Edge a18 = new StateGraph.Edge(s, t);
    private static StateGraph.Edge a19 = new StateGraph.Edge(t, u);
    private static StateGraph.Edge a20 = new StateGraph.Edge(u, v);
    private static StateGraph.Edge a21 = new StateGraph.Edge(v, w);

    private static StateGraph.Edge a22 = new StateGraph.Edge(w, x);
    private static StateGraph.Edge a23 = new StateGraph.Edge(x, y);
    private static StateGraph.Edge a24 = new StateGraph.Edge(y, z);
    private static StateGraph.Edge a25 = new StateGraph.Edge(z, aa);
    private static StateGraph.Edge a26 = new StateGraph.Edge(aa, bb);
    private static StateGraph.Edge a27 = new StateGraph.Edge(bb, cc);
    private static StateGraph.Edge a28 = new StateGraph.Edge(cc, dd);

    private static StateGraph.Edge a29 = new StateGraph.Edge(dd, ee);
    private static StateGraph.Edge a30 = new StateGraph.Edge(ee, ff);
    private static StateGraph.Edge a31 = new StateGraph.Edge(ff, gg);
    private static StateGraph.Edge a32 = new StateGraph.Edge(gg, hh);
    private static StateGraph.Edge a33 = new StateGraph.Edge(hh, ii);
    private static StateGraph.Edge a34 = new StateGraph.Edge(ii, jj);
    private static StateGraph.Edge a35 = new StateGraph.Edge(jj, kk);

    private static StateGraph.Edge a36 = new StateGraph.Edge(kk, ll);
    private static StateGraph.Edge a37 = new StateGraph.Edge(ll, mm);
    private static StateGraph.Edge a38 = new StateGraph.Edge(mm, nn);
    private static StateGraph.Edge a39 = new StateGraph.Edge(nn, oo);
    private static StateGraph.Edge a40 = new StateGraph.Edge(oo, pp);
    private static StateGraph.Edge a41 = new StateGraph.Edge(pp, qq);
    private static StateGraph.Edge a42 = new StateGraph.Edge(qq, rr);
    
    private static StateGraph.Edge a43 = new StateGraph.Edge(rr, ss);
    private static StateGraph.Edge a44 = new StateGraph.Edge(ss, tt);
    private static StateGraph.Edge a45 = new StateGraph.Edge(tt, uu);
    private static StateGraph.Edge a46 = new StateGraph.Edge(uu, vv);
    private static StateGraph.Edge a47 = new StateGraph.Edge(vv, ww);
    
    private static StateGraph.Edge a15 = new StateGraph.Edge(ww, p);
    private static StateGraph.Edge a16 = new StateGraph.Edge(p, q);
    private static StateGraph.Edge a17 = new StateGraph.Edge(q, r);
    private static StateGraph.Edge a49 = new StateGraph.Edge(r, a);

    
    public static void main(String[] args) {
        startingPath.add(a);
        startingPath.add(b);
        startingPath.add(c);
        startingPath.add(d);
        startingPath.add(e);
        startingPath.add(f);
        
        startingPath.add(g);
        startingPath.add(h);
        startingPath.add(i);
        startingPath.add(j);
        startingPath.add(k);
        startingPath.add(l);

        startingPath.add(m);
        startingPath.add(n);
        startingPath.add(o);

        startingPath.add(s);
        startingPath.add(t);
        startingPath.add(u);
        startingPath.add(v);
        startingPath.add(w);
        startingPath.add(x);

        startingPath.add(y);
        startingPath.add(z);
        startingPath.add(aa);
        startingPath.add(bb);
        startingPath.add(cc);
        startingPath.add(dd);

        startingPath.add(ee);
        startingPath.add(ff);
        startingPath.add(gg);
        startingPath.add(hh);
        startingPath.add(ii);
        startingPath.add(jj);

        startingPath.add(kk);
        startingPath.add(ll);
        startingPath.add(mm);
        startingPath.add(nn);
        startingPath.add(oo);
        startingPath.add(pp);

        startingPath.add(qq);
        startingPath.add(rr);
        startingPath.add(ss);
        startingPath.add(tt);
        startingPath.add(uu);
        startingPath.add(vv);
        startingPath.add(ww);
        startingPath.add(p);
        startingPath.add(q);
        startingPath.add(r);
        
        //for length
        edgeGraph.add(a1);
        edgeGraph.add(a2);
        edgeGraph.add(a3);
        edgeGraph.add(a4);
        edgeGraph.add(a5);
        edgeGraph.add(a6);
        edgeGraph.add(a7);

        edgeGraph.add(a8);
        edgeGraph.add(a48);
        edgeGraph.add(a9);
        edgeGraph.add(a10);
        edgeGraph.add(a11);
        edgeGraph.add(a12);
        edgeGraph.add(a13);
        edgeGraph.add(a14);

        
        edgeGraph.add(a18);
        edgeGraph.add(a19);
        edgeGraph.add(a20);
        edgeGraph.add(a21);

        edgeGraph.add(a22);
        edgeGraph.add(a23);
        edgeGraph.add(a24);
        edgeGraph.add(a25);
        edgeGraph.add(a26);
        edgeGraph.add(a27);
        edgeGraph.add(a28);

        edgeGraph.add(a29);
        edgeGraph.add(a30);
        edgeGraph.add(a31);
        edgeGraph.add(a32);
        edgeGraph.add(a33);
        edgeGraph.add(a34);
        edgeGraph.add(a35);
        
        edgeGraph.add(a36);
        edgeGraph.add(a37);
        edgeGraph.add(a38);
        edgeGraph.add(a39);
        edgeGraph.add(a40);
        edgeGraph.add(a41);
        edgeGraph.add(a42);

        edgeGraph.add(a43);
        edgeGraph.add(a44);
        edgeGraph.add(a45);
        edgeGraph.add(a46);
        edgeGraph.add(a47);
        edgeGraph.add(a15);
        edgeGraph.add(a16);
        edgeGraph.add(a17);
        edgeGraph.add(a49);
        
        
        double netDistance = 0.0;
        State[] states = new State[edgeGraph.size()];
        for(int i = 0; i < edgeGraph.size(); i++){
            netDistance += edgeGraph.get(i).length();
            states[i] = startingPath.get(i).state();
        }
        finalTour = new Tour(states, netDistance);
        System.out.println(finalTour);
        AntColonyOptimization aco = new AntColonyOptimization(startingPath);
        
//        for(int i = 0; i < numAnts; i++){
//            Ant a = new Ant(aco, i);
//            a.send();
//            if(a.getTrail().getLength() < finalTour.getLength()){
//                finalTour = a.getTrail();
//            }
//        }
//    }

}
}
