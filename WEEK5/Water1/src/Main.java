public static void main(String[] args) throws IOException {
    Customer[] customers = new Customer[]{
            new Customer("홍길동", "1365", '1'),
            new Customer("이대한", "5678", '4'),
            new Customer("이수도", "3333", '3'),
            new Customer("김천지", "4444", '5'),
            new Customer("정밀도", "5234", '1'),
            new Customer("정확한", "5567", '2'),
            new Customer("이수한", "3473", '2'),
            new Customer("김천도", "4564", '5'),
            new Customer("정확도", "5895", '3'),
            new Customer("김이천", "5523", '1')};
    WaterOffice office = new WaterOffice(customers);
    office.inputData();
    office.display();
}