//any object with reference =>garbage
//

public class GarbageColl {
    GarbageColl ref=null;

    GarbageColl getGarbageCollector(){
        return new GarbageColl();
    }
    static void print(){
        // String s=new String("pqr");

        GarbageColl obj1=new GarbageColl();
        GarbageColl obj2=new GarbageColl();
        GarbageColl obj3=new GarbageColl();
        obj1.ref=obj2;
        obj2.ref=obj3;
        obj3.ref=obj1;

    }
    public static void main(String[] args) {
        

Runtime r=Runtime.getRuntime();
        System.out.println("max memory :"+(r.maxMemory()/(1024*1024)));
        // System.out.println("Total memo :" +(r.totalMemory()/(1024))+"KB");
        // System.out.println("free memo :" +(r.freeMemory()/(1024))+"KB");


        // String str=new String("abc");
        // str=null;

        // String str=new String("abc");
        // str=new String("bcd");

        // print();

        //singleton=>single object
        //not with new 
        //getRuntime()=>factory=>a method that can return object of its own type
        // Runtime runtime=Runtime.getRuntime();

        // long freeMem=runtime.freeMemory();
        // long totalMem=runtime.totalMemory();
        // long usedMem=totalMem-freeMem;
        // System.out.println("used memory before object creation :  "+usedMem);
        // String s=null;
        // for(int i=0;i<10000;i++){
        //     s=new String("abc"+i);
        // }
        // freeMem=runtime.freeMemory();
        // long usedMem1=totalMem-freeMem;
        // System.out.println("used memo after object creation : "+usedMem1);
        // System.out.println("total bytes used:: "+(usedMem1-usedMem));

        // runtime.gc();
        // freeMem=runtime.freeMemory();
        // totalMem=runtime.totalMemory();
        // usedMem=totalMem-freeMem;
        // System.out.println("used memo after gc used : "+usedMem);
    }
}
