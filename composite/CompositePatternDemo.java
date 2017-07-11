/**
 * PatternType: Structual
 *
 * 用树形结构来组合对象, 用来表达部分及整体之间的关系
 */
public class CompositePatternDemo {
    public static void main(String[] args){
        Employee CEO = new Employee("John", "CEO", 30000);

        Employee headSales = new Employee("Robert", "Head Sale", 20000);
        Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura", "Marketing", 10000);
        Employee clerk2 = new Employee("Bob", "Marketing", 10000);

        Employee sales1 = new Employee("Richard", "Sales", 10000);
        Employee sales2 = new Employee("Robert", "Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(sales1);
        headSales.add(sales2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);


        CEO.showInfo();
//        System.out.println(CEO);

//        for (Employee headEmployee: CEO.getSubordinates()){
//            System.out.println("\t" + headEmployee);
//            for (Employee employee: headEmployee.getSubordinates()){
//                System.out.println("\t\t" + employee);
//            }
//        }
    }
}
