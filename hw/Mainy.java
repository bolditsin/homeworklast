package homework5;


public class Main{

    public static void main(String[] args)
    {
        Coworker[] arr= new Coworker[5];
        arr[0]= new Coworker("Ivanov Vasiliy Alibabaevich","logist","iva86@mail.ru","89667778822",30000,46);
        arr[1]= new Coworker("Vini Vidi Vici","call service","vvv@mail.ru", "899998887766",20000,25);
        arr[2]= new Coworker("Ivanov Ivan Ivanovich", "courier","iii@mail.ru","87776665544",20000,24);
        arr[3]= new Coworker("Petrov Petr Petrovich","courier","ppp@mail.ru", "96665553322", 20000, 21);
        arr[4]= new Coworker("Sidorov Sidr Sidorovich","courier","sss@mail.ru","87654321122", 20000, 25);

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].age<=40) {
                System.out.println(arr[i]);
            }
        }

        for (int i=0; i < arr.length; i++)
            if (arr[i].age > 40) {
                System.out.println("Сотрудники старше сорока: ");
                System.out.print(arr[i]);
            }
    }

}
