class UnionAndFind{
    private int[] root; // array store parent of node
    UnionAndFind(int size){
        root = new int[size];
        for(int i=0; i<size; i++){
            root[i] = i;
        }
    }
    int find(int x){
        return root[x];
    }
    void union(int x, int y){
        int rootx = find(x);
        int rooty = find(y);
        if(rootx!=rooty){
            for(int i=0; i<root.length; i++){
                if(root[i]==rooty){
                    root[i]=rootx;
                }
            }
        }
    }
    boolean connected(int x, int y){
        return find(x) == find(y);
    }

    public static void main(String[] args) {
        UnionAndFind u = new UnionAndFind(10);
        u.union(1,2);
        u.union(1,2);
        u.union(1,2);
        u.union(1,2);
        u.union(1,2);
    }
}