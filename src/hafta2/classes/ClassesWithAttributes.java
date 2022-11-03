package hafta2.classes;

public class ClassesWithAttributes {

	public static void main(String[] args) {
		ProductAttr productAttr = new ProductAttr();
		productAttr.name = "Laptop";
		productAttr.id = 1;
		productAttr.description = "Macbook";
		productAttr.stockAmount = 3;
		productAttr.price = 5000;
		
		ProductManagerAttr productManagerAttr = new ProductManagerAttr();
		productManagerAttr.Add(productAttr);
		


	}

}
