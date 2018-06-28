
public class Heap_Stack {
	public void chuVi() {
		System.out.println("chu vi");
	}
	
	public static void xinChao(Heap_Stack heap) {
		String s = "xin chao";
		System.out.println(s);
		heap.chuVi();
	}
	
	public static void main(String[] args) {
		int x = 10;
		System.out.println(x);
		Heap_Stack heap = new Heap_Stack();
		xinChao(heap);
	}

}
