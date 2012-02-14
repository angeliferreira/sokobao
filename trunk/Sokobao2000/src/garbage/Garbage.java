package garbage;


public class Garbage {

	public static void main(String[] args) {
		
		StringBuffer a = new StringBuffer("AABBCCDDEE");
		a.replace(4, 5, "W");
		System.out.println(a);
//		for (int i = 0; i < a.length(); i++) {
//			System.out.println(a.charAt(i));
//		}
//		
//		int[][] array = new int[2][2];
//		
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array.length; j++) {
//				array[i][j] = i + j;
//			}
//		}
//		
////		for (int i = 0; i < array.length; i++) {
////			System.out.println(new String("{" + array[i][0] + " " + array[i][1] + "}"));
////		}
//		
//		List list = new ArrayList();
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array.length; j++) {
//				list.add(array[i][j]);
//			}
//		}
//		
//		System.out.println(list.get(0));
		
//		System.out.println();		

	}

}
