package hafta2.classes;

public class ClassesWithAttributes {

	public static void main(String[] args) {
		ProductAttr productAttr = new ProductAttr(1, "Laptop", "Macbook", 5000, 3, "Black");
//		productAttr.setName("Laptop");
//		productAttr.setId(1);
//		productAttr.setDescription("Macbook"); 
//		productAttr.setStockAmount(3);
//		productAttr.setPrice(5000); 
		
		ProductManagerAttr productManagerAttr = new ProductManagerAttr();
		productManagerAttr.Add(productAttr);
		


	}

}
